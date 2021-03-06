/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.ambiata.ivory.core.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ThriftDictionaryFeatureMeta implements org.apache.thrift.TBase<ThriftDictionaryFeatureMeta, ThriftDictionaryFeatureMeta._Fields>, java.io.Serializable, Cloneable, Comparable<ThriftDictionaryFeatureMeta> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ThriftDictionaryFeatureMeta");

  private static final org.apache.thrift.protocol.TField ENCODING_FIELD_DESC = new org.apache.thrift.protocol.TField("encoding", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("type", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField DESC_FIELD_DESC = new org.apache.thrift.protocol.TField("desc", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField TOMBSTONE_VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("tombstoneValue", org.apache.thrift.protocol.TType.LIST, (short)4);
  private static final org.apache.thrift.protocol.TField VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("value", org.apache.thrift.protocol.TType.STRUCT, (short)5);
  private static final org.apache.thrift.protocol.TField MODE_FIELD_DESC = new org.apache.thrift.protocol.TField("mode", org.apache.thrift.protocol.TType.I32, (short)6);
  private static final org.apache.thrift.protocol.TField MODE_V2_FIELD_DESC = new org.apache.thrift.protocol.TField("modeV2", org.apache.thrift.protocol.TType.STRUCT, (short)7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ThriftDictionaryFeatureMetaStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ThriftDictionaryFeatureMetaTupleSchemeFactory());
  }

  /**
   * 
   * @see ThriftDictionaryEncoding
   */
  public ThriftDictionaryEncoding encoding; // required
  /**
   * 
   * @see ThriftDictionaryType
   */
  public ThriftDictionaryType type; // optional
  public String desc; // required
  public List<String> tombstoneValue; // required
  public ThriftDictionaryFeatureValue value; // optional
  /**
   * 
   * @see ThriftDictionaryMode
   */
  public ThriftDictionaryMode mode; // optional
  public ThriftDictionaryModeV2 modeV2; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see ThriftDictionaryEncoding
     */
    ENCODING((short)1, "encoding"),
    /**
     * 
     * @see ThriftDictionaryType
     */
    TYPE((short)2, "type"),
    DESC((short)3, "desc"),
    TOMBSTONE_VALUE((short)4, "tombstoneValue"),
    VALUE((short)5, "value"),
    /**
     * 
     * @see ThriftDictionaryMode
     */
    MODE((short)6, "mode"),
    MODE_V2((short)7, "modeV2");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ENCODING
          return ENCODING;
        case 2: // TYPE
          return TYPE;
        case 3: // DESC
          return DESC;
        case 4: // TOMBSTONE_VALUE
          return TOMBSTONE_VALUE;
        case 5: // VALUE
          return VALUE;
        case 6: // MODE
          return MODE;
        case 7: // MODE_V2
          return MODE_V2;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private _Fields optionals[] = {_Fields.TYPE,_Fields.VALUE,_Fields.MODE,_Fields.MODE_V2};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ENCODING, new org.apache.thrift.meta_data.FieldMetaData("encoding", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, ThriftDictionaryEncoding.class)));
    tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData("type", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, ThriftDictionaryType.class)));
    tmpMap.put(_Fields.DESC, new org.apache.thrift.meta_data.FieldMetaData("desc", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TOMBSTONE_VALUE, new org.apache.thrift.meta_data.FieldMetaData("tombstoneValue", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.VALUE, new org.apache.thrift.meta_data.FieldMetaData("value", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ThriftDictionaryFeatureValue.class)));
    tmpMap.put(_Fields.MODE, new org.apache.thrift.meta_data.FieldMetaData("mode", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, ThriftDictionaryMode.class)));
    tmpMap.put(_Fields.MODE_V2, new org.apache.thrift.meta_data.FieldMetaData("modeV2", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ThriftDictionaryModeV2.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ThriftDictionaryFeatureMeta.class, metaDataMap);
  }

  public ThriftDictionaryFeatureMeta() {
  }

  public ThriftDictionaryFeatureMeta(
    ThriftDictionaryEncoding encoding,
    String desc,
    List<String> tombstoneValue)
  {
    this();
    this.encoding = encoding;
    this.desc = desc;
    this.tombstoneValue = tombstoneValue;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ThriftDictionaryFeatureMeta(ThriftDictionaryFeatureMeta other) {
    if (other.isSetEncoding()) {
      this.encoding = other.encoding;
    }
    if (other.isSetType()) {
      this.type = other.type;
    }
    if (other.isSetDesc()) {
      this.desc = other.desc;
    }
    if (other.isSetTombstoneValue()) {
      List<String> __this__tombstoneValue = new ArrayList<String>(other.tombstoneValue);
      this.tombstoneValue = __this__tombstoneValue;
    }
    if (other.isSetValue()) {
      this.value = new ThriftDictionaryFeatureValue(other.value);
    }
    if (other.isSetMode()) {
      this.mode = other.mode;
    }
    if (other.isSetModeV2()) {
      this.modeV2 = new ThriftDictionaryModeV2(other.modeV2);
    }
  }

  public ThriftDictionaryFeatureMeta deepCopy() {
    return new ThriftDictionaryFeatureMeta(this);
  }

  @Override
  public void clear() {
    this.encoding = null;
    this.type = null;
    this.desc = null;
    this.tombstoneValue = null;
    this.value = null;
    this.mode = null;
    this.modeV2 = null;
  }

  /**
   * 
   * @see ThriftDictionaryEncoding
   */
  public ThriftDictionaryEncoding getEncoding() {
    return this.encoding;
  }

  /**
   * 
   * @see ThriftDictionaryEncoding
   */
  public ThriftDictionaryFeatureMeta setEncoding(ThriftDictionaryEncoding encoding) {
    this.encoding = encoding;
    return this;
  }

  public void unsetEncoding() {
    this.encoding = null;
  }

  /** Returns true if field encoding is set (has been assigned a value) and false otherwise */
  public boolean isSetEncoding() {
    return this.encoding != null;
  }

  public void setEncodingIsSet(boolean value) {
    if (!value) {
      this.encoding = null;
    }
  }

  /**
   * 
   * @see ThriftDictionaryType
   */
  public ThriftDictionaryType getType() {
    return this.type;
  }

  /**
   * 
   * @see ThriftDictionaryType
   */
  public ThriftDictionaryFeatureMeta setType(ThriftDictionaryType type) {
    this.type = type;
    return this;
  }

  public void unsetType() {
    this.type = null;
  }

  /** Returns true if field type is set (has been assigned a value) and false otherwise */
  public boolean isSetType() {
    return this.type != null;
  }

  public void setTypeIsSet(boolean value) {
    if (!value) {
      this.type = null;
    }
  }

  public String getDesc() {
    return this.desc;
  }

  public ThriftDictionaryFeatureMeta setDesc(String desc) {
    this.desc = desc;
    return this;
  }

  public void unsetDesc() {
    this.desc = null;
  }

  /** Returns true if field desc is set (has been assigned a value) and false otherwise */
  public boolean isSetDesc() {
    return this.desc != null;
  }

  public void setDescIsSet(boolean value) {
    if (!value) {
      this.desc = null;
    }
  }

  public int getTombstoneValueSize() {
    return (this.tombstoneValue == null) ? 0 : this.tombstoneValue.size();
  }

  public java.util.Iterator<String> getTombstoneValueIterator() {
    return (this.tombstoneValue == null) ? null : this.tombstoneValue.iterator();
  }

  public void addToTombstoneValue(String elem) {
    if (this.tombstoneValue == null) {
      this.tombstoneValue = new ArrayList<String>();
    }
    this.tombstoneValue.add(elem);
  }

  public List<String> getTombstoneValue() {
    return this.tombstoneValue;
  }

  public ThriftDictionaryFeatureMeta setTombstoneValue(List<String> tombstoneValue) {
    this.tombstoneValue = tombstoneValue;
    return this;
  }

  public void unsetTombstoneValue() {
    this.tombstoneValue = null;
  }

  /** Returns true if field tombstoneValue is set (has been assigned a value) and false otherwise */
  public boolean isSetTombstoneValue() {
    return this.tombstoneValue != null;
  }

  public void setTombstoneValueIsSet(boolean value) {
    if (!value) {
      this.tombstoneValue = null;
    }
  }

  public ThriftDictionaryFeatureValue getValue() {
    return this.value;
  }

  public ThriftDictionaryFeatureMeta setValue(ThriftDictionaryFeatureValue value) {
    this.value = value;
    return this;
  }

  public void unsetValue() {
    this.value = null;
  }

  /** Returns true if field value is set (has been assigned a value) and false otherwise */
  public boolean isSetValue() {
    return this.value != null;
  }

  public void setValueIsSet(boolean value) {
    if (!value) {
      this.value = null;
    }
  }

  /**
   * 
   * @see ThriftDictionaryMode
   */
  public ThriftDictionaryMode getMode() {
    return this.mode;
  }

  /**
   * 
   * @see ThriftDictionaryMode
   */
  public ThriftDictionaryFeatureMeta setMode(ThriftDictionaryMode mode) {
    this.mode = mode;
    return this;
  }

  public void unsetMode() {
    this.mode = null;
  }

  /** Returns true if field mode is set (has been assigned a value) and false otherwise */
  public boolean isSetMode() {
    return this.mode != null;
  }

  public void setModeIsSet(boolean value) {
    if (!value) {
      this.mode = null;
    }
  }

  public ThriftDictionaryModeV2 getModeV2() {
    return this.modeV2;
  }

  public ThriftDictionaryFeatureMeta setModeV2(ThriftDictionaryModeV2 modeV2) {
    this.modeV2 = modeV2;
    return this;
  }

  public void unsetModeV2() {
    this.modeV2 = null;
  }

  /** Returns true if field modeV2 is set (has been assigned a value) and false otherwise */
  public boolean isSetModeV2() {
    return this.modeV2 != null;
  }

  public void setModeV2IsSet(boolean value) {
    if (!value) {
      this.modeV2 = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ENCODING:
      if (value == null) {
        unsetEncoding();
      } else {
        setEncoding((ThriftDictionaryEncoding)value);
      }
      break;

    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((ThriftDictionaryType)value);
      }
      break;

    case DESC:
      if (value == null) {
        unsetDesc();
      } else {
        setDesc((String)value);
      }
      break;

    case TOMBSTONE_VALUE:
      if (value == null) {
        unsetTombstoneValue();
      } else {
        setTombstoneValue((List<String>)value);
      }
      break;

    case VALUE:
      if (value == null) {
        unsetValue();
      } else {
        setValue((ThriftDictionaryFeatureValue)value);
      }
      break;

    case MODE:
      if (value == null) {
        unsetMode();
      } else {
        setMode((ThriftDictionaryMode)value);
      }
      break;

    case MODE_V2:
      if (value == null) {
        unsetModeV2();
      } else {
        setModeV2((ThriftDictionaryModeV2)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ENCODING:
      return getEncoding();

    case TYPE:
      return getType();

    case DESC:
      return getDesc();

    case TOMBSTONE_VALUE:
      return getTombstoneValue();

    case VALUE:
      return getValue();

    case MODE:
      return getMode();

    case MODE_V2:
      return getModeV2();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ENCODING:
      return isSetEncoding();
    case TYPE:
      return isSetType();
    case DESC:
      return isSetDesc();
    case TOMBSTONE_VALUE:
      return isSetTombstoneValue();
    case VALUE:
      return isSetValue();
    case MODE:
      return isSetMode();
    case MODE_V2:
      return isSetModeV2();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ThriftDictionaryFeatureMeta)
      return this.equals((ThriftDictionaryFeatureMeta)that);
    return false;
  }

  public boolean equals(ThriftDictionaryFeatureMeta that) {
    if (that == null)
      return false;

    boolean this_present_encoding = true && this.isSetEncoding();
    boolean that_present_encoding = true && that.isSetEncoding();
    if (this_present_encoding || that_present_encoding) {
      if (!(this_present_encoding && that_present_encoding))
        return false;
      if (!this.encoding.equals(that.encoding))
        return false;
    }

    boolean this_present_type = true && this.isSetType();
    boolean that_present_type = true && that.isSetType();
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (!this.type.equals(that.type))
        return false;
    }

    boolean this_present_desc = true && this.isSetDesc();
    boolean that_present_desc = true && that.isSetDesc();
    if (this_present_desc || that_present_desc) {
      if (!(this_present_desc && that_present_desc))
        return false;
      if (!this.desc.equals(that.desc))
        return false;
    }

    boolean this_present_tombstoneValue = true && this.isSetTombstoneValue();
    boolean that_present_tombstoneValue = true && that.isSetTombstoneValue();
    if (this_present_tombstoneValue || that_present_tombstoneValue) {
      if (!(this_present_tombstoneValue && that_present_tombstoneValue))
        return false;
      if (!this.tombstoneValue.equals(that.tombstoneValue))
        return false;
    }

    boolean this_present_value = true && this.isSetValue();
    boolean that_present_value = true && that.isSetValue();
    if (this_present_value || that_present_value) {
      if (!(this_present_value && that_present_value))
        return false;
      if (!this.value.equals(that.value))
        return false;
    }

    boolean this_present_mode = true && this.isSetMode();
    boolean that_present_mode = true && that.isSetMode();
    if (this_present_mode || that_present_mode) {
      if (!(this_present_mode && that_present_mode))
        return false;
      if (!this.mode.equals(that.mode))
        return false;
    }

    boolean this_present_modeV2 = true && this.isSetModeV2();
    boolean that_present_modeV2 = true && that.isSetModeV2();
    if (this_present_modeV2 || that_present_modeV2) {
      if (!(this_present_modeV2 && that_present_modeV2))
        return false;
      if (!this.modeV2.equals(that.modeV2))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(ThriftDictionaryFeatureMeta other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetEncoding()).compareTo(other.isSetEncoding());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEncoding()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.encoding, other.encoding);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetType()).compareTo(other.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.type, other.type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDesc()).compareTo(other.isSetDesc());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDesc()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.desc, other.desc);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTombstoneValue()).compareTo(other.isSetTombstoneValue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTombstoneValue()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tombstoneValue, other.tombstoneValue);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetValue()).compareTo(other.isSetValue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetValue()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.value, other.value);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMode()).compareTo(other.isSetMode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mode, other.mode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetModeV2()).compareTo(other.isSetModeV2());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetModeV2()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.modeV2, other.modeV2);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ThriftDictionaryFeatureMeta(");
    boolean first = true;

    sb.append("encoding:");
    if (this.encoding == null) {
      sb.append("null");
    } else {
      sb.append(this.encoding);
    }
    first = false;
    if (isSetType()) {
      if (!first) sb.append(", ");
      sb.append("type:");
      if (this.type == null) {
        sb.append("null");
      } else {
        sb.append(this.type);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("desc:");
    if (this.desc == null) {
      sb.append("null");
    } else {
      sb.append(this.desc);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("tombstoneValue:");
    if (this.tombstoneValue == null) {
      sb.append("null");
    } else {
      sb.append(this.tombstoneValue);
    }
    first = false;
    if (isSetValue()) {
      if (!first) sb.append(", ");
      sb.append("value:");
      if (this.value == null) {
        sb.append("null");
      } else {
        sb.append(this.value);
      }
      first = false;
    }
    if (isSetMode()) {
      if (!first) sb.append(", ");
      sb.append("mode:");
      if (this.mode == null) {
        sb.append("null");
      } else {
        sb.append(this.mode);
      }
      first = false;
    }
    if (isSetModeV2()) {
      if (!first) sb.append(", ");
      sb.append("modeV2:");
      if (this.modeV2 == null) {
        sb.append("null");
      } else {
        sb.append(this.modeV2);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ThriftDictionaryFeatureMetaStandardSchemeFactory implements SchemeFactory {
    public ThriftDictionaryFeatureMetaStandardScheme getScheme() {
      return new ThriftDictionaryFeatureMetaStandardScheme();
    }
  }

  private static class ThriftDictionaryFeatureMetaStandardScheme extends StandardScheme<ThriftDictionaryFeatureMeta> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ThriftDictionaryFeatureMeta struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ENCODING
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.encoding = ThriftDictionaryEncoding.findByValue(iprot.readI32());
              struct.setEncodingIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.type = ThriftDictionaryType.findByValue(iprot.readI32());
              struct.setTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // DESC
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.desc = iprot.readString();
              struct.setDescIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TOMBSTONE_VALUE
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list34 = iprot.readListBegin();
                struct.tombstoneValue = new ArrayList<String>(_list34.size);
                for (int _i35 = 0; _i35 < _list34.size; ++_i35)
                {
                  String _elem36;
                  _elem36 = iprot.readString();
                  struct.tombstoneValue.add(_elem36);
                }
                iprot.readListEnd();
              }
              struct.setTombstoneValueIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // VALUE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.value = new ThriftDictionaryFeatureValue();
              struct.value.read(iprot);
              struct.setValueIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // MODE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.mode = ThriftDictionaryMode.findByValue(iprot.readI32());
              struct.setModeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // MODE_V2
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.modeV2 = new ThriftDictionaryModeV2();
              struct.modeV2.read(iprot);
              struct.setModeV2IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ThriftDictionaryFeatureMeta struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.encoding != null) {
        oprot.writeFieldBegin(ENCODING_FIELD_DESC);
        oprot.writeI32(struct.encoding.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.type != null) {
        if (struct.isSetType()) {
          oprot.writeFieldBegin(TYPE_FIELD_DESC);
          oprot.writeI32(struct.type.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.desc != null) {
        oprot.writeFieldBegin(DESC_FIELD_DESC);
        oprot.writeString(struct.desc);
        oprot.writeFieldEnd();
      }
      if (struct.tombstoneValue != null) {
        oprot.writeFieldBegin(TOMBSTONE_VALUE_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.tombstoneValue.size()));
          for (String _iter37 : struct.tombstoneValue)
          {
            oprot.writeString(_iter37);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.value != null) {
        if (struct.isSetValue()) {
          oprot.writeFieldBegin(VALUE_FIELD_DESC);
          struct.value.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.mode != null) {
        if (struct.isSetMode()) {
          oprot.writeFieldBegin(MODE_FIELD_DESC);
          oprot.writeI32(struct.mode.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.modeV2 != null) {
        if (struct.isSetModeV2()) {
          oprot.writeFieldBegin(MODE_V2_FIELD_DESC);
          struct.modeV2.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ThriftDictionaryFeatureMetaTupleSchemeFactory implements SchemeFactory {
    public ThriftDictionaryFeatureMetaTupleScheme getScheme() {
      return new ThriftDictionaryFeatureMetaTupleScheme();
    }
  }

  private static class ThriftDictionaryFeatureMetaTupleScheme extends TupleScheme<ThriftDictionaryFeatureMeta> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ThriftDictionaryFeatureMeta struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetEncoding()) {
        optionals.set(0);
      }
      if (struct.isSetType()) {
        optionals.set(1);
      }
      if (struct.isSetDesc()) {
        optionals.set(2);
      }
      if (struct.isSetTombstoneValue()) {
        optionals.set(3);
      }
      if (struct.isSetValue()) {
        optionals.set(4);
      }
      if (struct.isSetMode()) {
        optionals.set(5);
      }
      if (struct.isSetModeV2()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetEncoding()) {
        oprot.writeI32(struct.encoding.getValue());
      }
      if (struct.isSetType()) {
        oprot.writeI32(struct.type.getValue());
      }
      if (struct.isSetDesc()) {
        oprot.writeString(struct.desc);
      }
      if (struct.isSetTombstoneValue()) {
        {
          oprot.writeI32(struct.tombstoneValue.size());
          for (String _iter38 : struct.tombstoneValue)
          {
            oprot.writeString(_iter38);
          }
        }
      }
      if (struct.isSetValue()) {
        struct.value.write(oprot);
      }
      if (struct.isSetMode()) {
        oprot.writeI32(struct.mode.getValue());
      }
      if (struct.isSetModeV2()) {
        struct.modeV2.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ThriftDictionaryFeatureMeta struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.encoding = ThriftDictionaryEncoding.findByValue(iprot.readI32());
        struct.setEncodingIsSet(true);
      }
      if (incoming.get(1)) {
        struct.type = ThriftDictionaryType.findByValue(iprot.readI32());
        struct.setTypeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.desc = iprot.readString();
        struct.setDescIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TList _list39 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.tombstoneValue = new ArrayList<String>(_list39.size);
          for (int _i40 = 0; _i40 < _list39.size; ++_i40)
          {
            String _elem41;
            _elem41 = iprot.readString();
            struct.tombstoneValue.add(_elem41);
          }
        }
        struct.setTombstoneValueIsSet(true);
      }
      if (incoming.get(4)) {
        struct.value = new ThriftDictionaryFeatureValue();
        struct.value.read(iprot);
        struct.setValueIsSet(true);
      }
      if (incoming.get(5)) {
        struct.mode = ThriftDictionaryMode.findByValue(iprot.readI32());
        struct.setModeIsSet(true);
      }
      if (incoming.get(6)) {
        struct.modeV2 = new ThriftDictionaryModeV2();
        struct.modeV2.read(iprot);
        struct.setModeV2IsSet(true);
      }
    }
  }

}

