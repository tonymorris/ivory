package com.ambiata.ivory.cli

import com.ambiata.mundane.control._
import com.ambiata.ivory.data.Identifier
import com.ambiata.ivory.storage.metadata._
import com.ambiata.ivory.storage.repository._
import com.nicta.scoobi.Scoobi._
import scalaz._, Scalaz._, effect._

object catDictionary extends IvoryApp {

  case class CliArguments(repo: String, name: Option[String] = None)

  val parser = new scopt.OptionParser[CliArguments]("cat-dictionary") {
    head("""
           |Print dictionary as text to standard out, delimited by '|'.
           |""".stripMargin)

    help("help") text "shows this usage text"
    opt[String]('r', "repo")        action { (x, c) => c.copy(repo = x) }           required()             text
      s"Ivory repository to create. If the path starts with 's3://' we assume that this is a S3 repository"
    opt[String]('n', "name")        action { (x, c) => c.copy(name = Some(x)) }           optional()       text
      s"For displaying the contents of an older dictionary"
  }

  val cmd = new IvoryCmd[CliArguments](parser, CliArguments(""), HadoopCmd { conf => {
    case CliArguments(repo, nameOpt) =>
      for {
        repo <- ResultT.fromDisjunction[IO, Repository](Repository.fromUri(repo, conf).leftMap(\&/.This(_)))
        store = DictionaryThriftStorage(repo)
        dictionary <- nameOpt.flatMap(Identifier.parse) match {
          case Some(iid) => store.loadFromId(iid).flatMap(ResultT.fromOption(_, s"Dictionary '$iid' could not be found"))
          case None      => store.load
        }
      } yield List(
        DictionaryTextStorageV2.delimitedString(dictionary)
      )
  }
  })
}
