/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package FCMP;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
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

public class Address implements org.apache.thrift.TBase<Address, Address._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Address");

  private static final org.apache.thrift.protocol.TField BUREAU_CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("bureauCode", org.apache.thrift.protocol.TType.BYTE, (short)1);
  private static final org.apache.thrift.protocol.TField NODE_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("nodeType", org.apache.thrift.protocol.TType.BYTE, (short)2);
  private static final org.apache.thrift.protocol.TField NODE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("nodeId", org.apache.thrift.protocol.TType.I16, (short)3);
  private static final org.apache.thrift.protocol.TField DEV_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("devType", org.apache.thrift.protocol.TType.BYTE, (short)4);
  private static final org.apache.thrift.protocol.TField DEV_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("devId", org.apache.thrift.protocol.TType.I16, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new AddressStandardSchemeFactory());
    schemes.put(TupleScheme.class, new AddressTupleSchemeFactory());
  }

  public byte bureauCode; // required
  public byte nodeType; // required
  public short nodeId; // required
  public byte devType; // required
  public short devId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BUREAU_CODE((short)1, "bureauCode"),
    NODE_TYPE((short)2, "nodeType"),
    NODE_ID((short)3, "nodeId"),
    DEV_TYPE((short)4, "devType"),
    DEV_ID((short)5, "devId");

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
        case 1: // BUREAU_CODE
          return BUREAU_CODE;
        case 2: // NODE_TYPE
          return NODE_TYPE;
        case 3: // NODE_ID
          return NODE_ID;
        case 4: // DEV_TYPE
          return DEV_TYPE;
        case 5: // DEV_ID
          return DEV_ID;
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
  private static final int __BUREAUCODE_ISSET_ID = 0;
  private static final int __NODETYPE_ISSET_ID = 1;
  private static final int __NODEID_ISSET_ID = 2;
  private static final int __DEVTYPE_ISSET_ID = 3;
  private static final int __DEVID_ISSET_ID = 4;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.BUREAU_CODE, new org.apache.thrift.meta_data.FieldMetaData("bureauCode", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields.NODE_TYPE, new org.apache.thrift.meta_data.FieldMetaData("nodeType", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields.NODE_ID, new org.apache.thrift.meta_data.FieldMetaData("nodeId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    tmpMap.put(_Fields.DEV_TYPE, new org.apache.thrift.meta_data.FieldMetaData("devType", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields.DEV_ID, new org.apache.thrift.meta_data.FieldMetaData("devId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Address.class, metaDataMap);
  }

  public Address() {
  }

  public Address(
    byte bureauCode,
    byte nodeType,
    short nodeId,
    byte devType,
    short devId)
  {
    this();
    this.bureauCode = bureauCode;
    setBureauCodeIsSet(true);
    this.nodeType = nodeType;
    setNodeTypeIsSet(true);
    this.nodeId = nodeId;
    setNodeIdIsSet(true);
    this.devType = devType;
    setDevTypeIsSet(true);
    this.devId = devId;
    setDevIdIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Address(Address other) {
    __isset_bitfield = other.__isset_bitfield;
    this.bureauCode = other.bureauCode;
    this.nodeType = other.nodeType;
    this.nodeId = other.nodeId;
    this.devType = other.devType;
    this.devId = other.devId;
  }

  public Address deepCopy() {
    return new Address(this);
  }

  @Override
  public void clear() {
    setBureauCodeIsSet(false);
    this.bureauCode = 0;
    setNodeTypeIsSet(false);
    this.nodeType = 0;
    setNodeIdIsSet(false);
    this.nodeId = 0;
    setDevTypeIsSet(false);
    this.devType = 0;
    setDevIdIsSet(false);
    this.devId = 0;
  }

  public byte getBureauCode() {
    return this.bureauCode;
  }

  public Address setBureauCode(byte bureauCode) {
    this.bureauCode = bureauCode;
    setBureauCodeIsSet(true);
    return this;
  }

  public void unsetBureauCode() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __BUREAUCODE_ISSET_ID);
  }

  /** Returns true if field bureauCode is set (has been assigned a value) and false otherwise */
  public boolean isSetBureauCode() {
    return EncodingUtils.testBit(__isset_bitfield, __BUREAUCODE_ISSET_ID);
  }

  public void setBureauCodeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __BUREAUCODE_ISSET_ID, value);
  }

  public byte getNodeType() {
    return this.nodeType;
  }

  public Address setNodeType(byte nodeType) {
    this.nodeType = nodeType;
    setNodeTypeIsSet(true);
    return this;
  }

  public void unsetNodeType() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __NODETYPE_ISSET_ID);
  }

  /** Returns true if field nodeType is set (has been assigned a value) and false otherwise */
  public boolean isSetNodeType() {
    return EncodingUtils.testBit(__isset_bitfield, __NODETYPE_ISSET_ID);
  }

  public void setNodeTypeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __NODETYPE_ISSET_ID, value);
  }

  public short getNodeId() {
    return this.nodeId;
  }

  public Address setNodeId(short nodeId) {
    this.nodeId = nodeId;
    setNodeIdIsSet(true);
    return this;
  }

  public void unsetNodeId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __NODEID_ISSET_ID);
  }

  /** Returns true if field nodeId is set (has been assigned a value) and false otherwise */
  public boolean isSetNodeId() {
    return EncodingUtils.testBit(__isset_bitfield, __NODEID_ISSET_ID);
  }

  public void setNodeIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __NODEID_ISSET_ID, value);
  }

  public byte getDevType() {
    return this.devType;
  }

  public Address setDevType(byte devType) {
    this.devType = devType;
    setDevTypeIsSet(true);
    return this;
  }

  public void unsetDevType() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __DEVTYPE_ISSET_ID);
  }

  /** Returns true if field devType is set (has been assigned a value) and false otherwise */
  public boolean isSetDevType() {
    return EncodingUtils.testBit(__isset_bitfield, __DEVTYPE_ISSET_ID);
  }

  public void setDevTypeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __DEVTYPE_ISSET_ID, value);
  }

  public short getDevId() {
    return this.devId;
  }

  public Address setDevId(short devId) {
    this.devId = devId;
    setDevIdIsSet(true);
    return this;
  }

  public void unsetDevId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __DEVID_ISSET_ID);
  }

  /** Returns true if field devId is set (has been assigned a value) and false otherwise */
  public boolean isSetDevId() {
    return EncodingUtils.testBit(__isset_bitfield, __DEVID_ISSET_ID);
  }

  public void setDevIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __DEVID_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case BUREAU_CODE:
      if (value == null) {
        unsetBureauCode();
      } else {
        setBureauCode((Byte)value);
      }
      break;

    case NODE_TYPE:
      if (value == null) {
        unsetNodeType();
      } else {
        setNodeType((Byte)value);
      }
      break;

    case NODE_ID:
      if (value == null) {
        unsetNodeId();
      } else {
        setNodeId((Short)value);
      }
      break;

    case DEV_TYPE:
      if (value == null) {
        unsetDevType();
      } else {
        setDevType((Byte)value);
      }
      break;

    case DEV_ID:
      if (value == null) {
        unsetDevId();
      } else {
        setDevId((Short)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case BUREAU_CODE:
      return Byte.valueOf(getBureauCode());

    case NODE_TYPE:
      return Byte.valueOf(getNodeType());

    case NODE_ID:
      return Short.valueOf(getNodeId());

    case DEV_TYPE:
      return Byte.valueOf(getDevType());

    case DEV_ID:
      return Short.valueOf(getDevId());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case BUREAU_CODE:
      return isSetBureauCode();
    case NODE_TYPE:
      return isSetNodeType();
    case NODE_ID:
      return isSetNodeId();
    case DEV_TYPE:
      return isSetDevType();
    case DEV_ID:
      return isSetDevId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Address)
      return this.equals((Address)that);
    return false;
  }

  public boolean equals(Address that) {
    if (that == null)
      return false;

    boolean this_present_bureauCode = true;
    boolean that_present_bureauCode = true;
    if (this_present_bureauCode || that_present_bureauCode) {
      if (!(this_present_bureauCode && that_present_bureauCode))
        return false;
      if (this.bureauCode != that.bureauCode)
        return false;
    }

    boolean this_present_nodeType = true;
    boolean that_present_nodeType = true;
    if (this_present_nodeType || that_present_nodeType) {
      if (!(this_present_nodeType && that_present_nodeType))
        return false;
      if (this.nodeType != that.nodeType)
        return false;
    }

    boolean this_present_nodeId = true;
    boolean that_present_nodeId = true;
    if (this_present_nodeId || that_present_nodeId) {
      if (!(this_present_nodeId && that_present_nodeId))
        return false;
      if (this.nodeId != that.nodeId)
        return false;
    }

    boolean this_present_devType = true;
    boolean that_present_devType = true;
    if (this_present_devType || that_present_devType) {
      if (!(this_present_devType && that_present_devType))
        return false;
      if (this.devType != that.devType)
        return false;
    }

    boolean this_present_devId = true;
    boolean that_present_devId = true;
    if (this_present_devId || that_present_devId) {
      if (!(this_present_devId && that_present_devId))
        return false;
      if (this.devId != that.devId)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(Address other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    Address typedOther = (Address)other;

    lastComparison = Boolean.valueOf(isSetBureauCode()).compareTo(typedOther.isSetBureauCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBureauCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.bureauCode, typedOther.bureauCode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNodeType()).compareTo(typedOther.isSetNodeType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNodeType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nodeType, typedOther.nodeType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNodeId()).compareTo(typedOther.isSetNodeId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNodeId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nodeId, typedOther.nodeId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDevType()).compareTo(typedOther.isSetDevType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDevType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.devType, typedOther.devType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDevId()).compareTo(typedOther.isSetDevId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDevId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.devId, typedOther.devId);
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
    StringBuilder sb = new StringBuilder("Address(");
    boolean first = true;

    sb.append("bureauCode:");
    sb.append(this.bureauCode);
    first = false;
    if (!first) sb.append(", ");
    sb.append("nodeType:");
    sb.append(this.nodeType);
    first = false;
    if (!first) sb.append(", ");
    sb.append("nodeId:");
    sb.append(this.nodeId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("devType:");
    sb.append(this.devType);
    first = false;
    if (!first) sb.append(", ");
    sb.append("devId:");
    sb.append(this.devId);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'bureauCode' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'nodeType' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'nodeId' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'devType' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'devId' because it's a primitive and you chose the non-beans generator.
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class AddressStandardSchemeFactory implements SchemeFactory {
    public AddressStandardScheme getScheme() {
      return new AddressStandardScheme();
    }
  }

  private static class AddressStandardScheme extends StandardScheme<Address> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Address struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // BUREAU_CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.bureauCode = iprot.readByte();
              struct.setBureauCodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NODE_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.nodeType = iprot.readByte();
              struct.setNodeTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // NODE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.nodeId = iprot.readI16();
              struct.setNodeIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // DEV_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.devType = iprot.readByte();
              struct.setDevTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // DEV_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.devId = iprot.readI16();
              struct.setDevIdIsSet(true);
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
      if (!struct.isSetBureauCode()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'bureauCode' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetNodeType()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'nodeType' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetNodeId()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'nodeId' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetDevType()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'devType' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetDevId()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'devId' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Address struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(BUREAU_CODE_FIELD_DESC);
      oprot.writeByte(struct.bureauCode);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(NODE_TYPE_FIELD_DESC);
      oprot.writeByte(struct.nodeType);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(NODE_ID_FIELD_DESC);
      oprot.writeI16(struct.nodeId);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(DEV_TYPE_FIELD_DESC);
      oprot.writeByte(struct.devType);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(DEV_ID_FIELD_DESC);
      oprot.writeI16(struct.devId);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AddressTupleSchemeFactory implements SchemeFactory {
    public AddressTupleScheme getScheme() {
      return new AddressTupleScheme();
    }
  }

  private static class AddressTupleScheme extends TupleScheme<Address> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Address struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeByte(struct.bureauCode);
      oprot.writeByte(struct.nodeType);
      oprot.writeI16(struct.nodeId);
      oprot.writeByte(struct.devType);
      oprot.writeI16(struct.devId);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Address struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.bureauCode = iprot.readByte();
      struct.setBureauCodeIsSet(true);
      struct.nodeType = iprot.readByte();
      struct.setNodeTypeIsSet(true);
      struct.nodeId = iprot.readI16();
      struct.setNodeIdIsSet(true);
      struct.devType = iprot.readByte();
      struct.setDevTypeIsSet(true);
      struct.devId = iprot.readI16();
      struct.setDevIdIsSet(true);
    }
  }

}

