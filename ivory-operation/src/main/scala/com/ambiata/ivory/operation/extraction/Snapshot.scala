package com.ambiata.ivory.operation.extraction

import scalaz.{DList => _, _}, Scalaz._, effect._
import scala.math.{Ordering => SOrdering}
import org.joda.time.LocalDate
import org.apache.hadoop.fs.{Path}
import org.apache.hadoop.io.compress._
import com.ambiata.mundane.control._
import com.ambiata.mundane.io._

import com.ambiata.ivory.core._, IvorySyntax._
import com.ambiata.ivory.storage.legacy._
import com.ambiata.ivory.storage.repository._
import com.ambiata.ivory.storage.fact._
import com.ambiata.ivory.storage.metadata._, Metadata._
import com.ambiata.ivory.storage.store._
import com.ambiata.poacher.hdfs._
import com.ambiata.poacher.scoobi._
import MemoryConversions._

case class Snapshot(repo: Repository, store: FeatureStoreId, entities: Option[ReferenceIO], snapshot: Date, output: ReferenceIO, incremental: Option[(SnapshotId, SnapshotMeta)], codec: Option[CompressionCodec]) {
  def run: ResultTIO[Unit] = for {
    hr  <- repo match {
      case h: HdfsRepository => ResultT.ok[IO, HdfsRepository](h)
      case _                 => ResultT.fail[IO, HdfsRepository]("Snapshot only works on HDFS repositories at this stage.")
    }
    out <- output match {
      case Reference(HdfsStore(_, root), p) => ResultT.ok[IO, Path]((root </> p).toHdfs)
      case _                                => ResultT.fail[IO, Path](s"Snapshot output path must be on hdfs, got '${output}'")
    }
    d   <- dictionaryFromIvory(repo)
    s   <- storeFromIvory(repo, store)
    es  <- entities.traverseU(_.run(store => store.linesUtf8.read))
    in  <- incremental.traverseU({ case (id, sm) => for {
            _ <- ResultT.ok[IO, Unit]({
                   println(s"Previous store was '${sm.store}'")
                   println(s"Previous date was '${sm.date.string("-")}'")
                 })
            s <- storeFromIvory(repo, sm.store)
          } yield (repo.snapshot(id).toHdfs, s, sm) })
    _   <- job(hr, s, in, out, codec).run(hr.conf)
    _   <- DictionaryTextStorageV2.toStore(output </> FilePath(".dictionary"), d)
    _   <- SnapshotMeta(snapshot, store).toReference(output </> SnapshotMeta.fname)
  } yield ()

  def job(repo: HdfsRepository, store: FeatureStore, incremental: Option[(Path, FeatureStore, SnapshotMeta)], outputPath: Path, codec: Option[CompressionCodec]): Hdfs[Unit] = for {
    conf  <- Hdfs.configuration
    globs <- Hdfs.fromResultTIO(Snapshot.storePaths(repo, store, snapshot, incremental))
    paths  = globs.flatMap(_.value.paths.map(_.toHdfs)) ++ incremental.map(_._1).toList
    size  <- paths.traverse(Hdfs.size).map(_.sum)
    _     = println(s"Total input size: ${size}")
    reducers = size.toBytes.value / 2.gb.toBytes.value + 1 // one reducer per 2GB of input
    _     = println(s"Number of reducers: ${reducers}")
    _     <- Hdfs.safe(SnapshotJob.run(conf, reducers.toInt, snapshot, globs, outputPath, incremental.map(_._1), codec))
  } yield ()
}

object Snapshot {
  val SnapshotName: String = "ivory-incremental-snapshot"

  def takeSnapshot(repo: Repository, date: Date, incremental: Boolean, codec: Option[CompressionCodec]): ResultTIO[(FeatureStoreId, SnapshotId)] =
    fatrepo.ExtractLatestWorkflow.onStore(repo, extractLatest(codec), date, incremental)

  /** This is exposed through the external API */
  def snapshot(repoPath: Path, date: Date, incremental: Boolean, codec: Option[CompressionCodec]): ScoobiAction[Path] = for {
    sc   <- ScoobiAction.scoobiConfiguration
    repo <- Repository.fromHdfsPath(repoPath.toString.toFilePath, sc).pure[ScoobiAction]
    snap <- ScoobiAction.fromResultTIO(takeSnapshot(repo, date, incremental, codec).map(res => repo.snapshot(res._2).toHdfs))
  } yield snap

  def extractLatest(codec: Option[CompressionCodec])(repo: Repository, store: FeatureStoreId, date: Date, output: ReferenceIO, incremental: Option[(SnapshotId, SnapshotMeta)]): ResultTIO[Unit] =
    Snapshot(repo, store, None, date, output, incremental, codec).run

  def storePaths(repo: Repository, store: FeatureStore, latestDate: Date, incremental: Option[(Path, FeatureStore, SnapshotMeta)]): ResultTIO[List[Prioritized[FactsetGlob]]] =
    incremental match {
      case None =>
        StoreGlob.before(repo, store, latestDate).map(_.globs)
      case Some((p, s, sm)) => for {
        // read facts from already processed store from the last snapshot date to the latest date
        o <- StoreGlob.between(repo, s, sm.date, latestDate).map(_.globs)
        sd = store diff s
        _  = println(s"Reading factsets '${sd.factsets}' up to '${latestDate}'")
        // read factsets which haven't been seen up until the 'latest' date
        n <- StoreGlob.before(repo, sd, latestDate).map(_.globs)
      } yield o ++ n
    }
}