/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package backtype.storm.generated;

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
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-7-27")
public class NimbusSummary implements org.apache.thrift.TBase<NimbusSummary, NimbusSummary._Fields>, java.io.Serializable, Cloneable, Comparable<NimbusSummary> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("NimbusSummary");

  private static final org.apache.thrift.protocol.TField NIMBUS_MASTER_FIELD_DESC = new org.apache.thrift.protocol.TField("nimbus_master", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField NIMBUS_SLAVES_FIELD_DESC = new org.apache.thrift.protocol.TField("nimbus_slaves", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField SUPERVISOR_NUM_FIELD_DESC = new org.apache.thrift.protocol.TField("supervisor_num", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField TOTAL_PORT_NUM_FIELD_DESC = new org.apache.thrift.protocol.TField("total_port_num", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField USED_PORT_NUM_FIELD_DESC = new org.apache.thrift.protocol.TField("used_port_num", org.apache.thrift.protocol.TType.I32, (short)5);
  private static final org.apache.thrift.protocol.TField FREE_PORT_NUM_FIELD_DESC = new org.apache.thrift.protocol.TField("free_port_num", org.apache.thrift.protocol.TType.I32, (short)6);
  private static final org.apache.thrift.protocol.TField VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("version", org.apache.thrift.protocol.TType.STRING, (short)7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new NimbusSummaryStandardSchemeFactory());
    schemes.put(TupleScheme.class, new NimbusSummaryTupleSchemeFactory());
  }

  private NimbusStat nimbus_master; // required
  private List<NimbusStat> nimbus_slaves; // required
  private int supervisor_num; // required
  private int total_port_num; // required
  private int used_port_num; // required
  private int free_port_num; // required
  private String version; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NIMBUS_MASTER((short)1, "nimbus_master"),
    NIMBUS_SLAVES((short)2, "nimbus_slaves"),
    SUPERVISOR_NUM((short)3, "supervisor_num"),
    TOTAL_PORT_NUM((short)4, "total_port_num"),
    USED_PORT_NUM((short)5, "used_port_num"),
    FREE_PORT_NUM((short)6, "free_port_num"),
    VERSION((short)7, "version");

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
        case 1: // NIMBUS_MASTER
          return NIMBUS_MASTER;
        case 2: // NIMBUS_SLAVES
          return NIMBUS_SLAVES;
        case 3: // SUPERVISOR_NUM
          return SUPERVISOR_NUM;
        case 4: // TOTAL_PORT_NUM
          return TOTAL_PORT_NUM;
        case 5: // USED_PORT_NUM
          return USED_PORT_NUM;
        case 6: // FREE_PORT_NUM
          return FREE_PORT_NUM;
        case 7: // VERSION
          return VERSION;
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
  private static final int __SUPERVISOR_NUM_ISSET_ID = 0;
  private static final int __TOTAL_PORT_NUM_ISSET_ID = 1;
  private static final int __USED_PORT_NUM_ISSET_ID = 2;
  private static final int __FREE_PORT_NUM_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NIMBUS_MASTER, new org.apache.thrift.meta_data.FieldMetaData("nimbus_master", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, NimbusStat.class)));
    tmpMap.put(_Fields.NIMBUS_SLAVES, new org.apache.thrift.meta_data.FieldMetaData("nimbus_slaves", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, NimbusStat.class))));
    tmpMap.put(_Fields.SUPERVISOR_NUM, new org.apache.thrift.meta_data.FieldMetaData("supervisor_num", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.TOTAL_PORT_NUM, new org.apache.thrift.meta_data.FieldMetaData("total_port_num", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.USED_PORT_NUM, new org.apache.thrift.meta_data.FieldMetaData("used_port_num", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.FREE_PORT_NUM, new org.apache.thrift.meta_data.FieldMetaData("free_port_num", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.VERSION, new org.apache.thrift.meta_data.FieldMetaData("version", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(NimbusSummary.class, metaDataMap);
  }

  public NimbusSummary() {
  }

  public NimbusSummary(
    NimbusStat nimbus_master,
    List<NimbusStat> nimbus_slaves,
    int supervisor_num,
    int total_port_num,
    int used_port_num,
    int free_port_num,
    String version)
  {
    this();
    this.nimbus_master = nimbus_master;
    this.nimbus_slaves = nimbus_slaves;
    this.supervisor_num = supervisor_num;
    set_supervisor_num_isSet(true);
    this.total_port_num = total_port_num;
    set_total_port_num_isSet(true);
    this.used_port_num = used_port_num;
    set_used_port_num_isSet(true);
    this.free_port_num = free_port_num;
    set_free_port_num_isSet(true);
    this.version = version;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public NimbusSummary(NimbusSummary other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.is_set_nimbus_master()) {
      this.nimbus_master = new NimbusStat(other.nimbus_master);
    }
    if (other.is_set_nimbus_slaves()) {
      List<NimbusStat> __this__nimbus_slaves = new ArrayList<NimbusStat>(other.nimbus_slaves.size());
      for (NimbusStat other_element : other.nimbus_slaves) {
        __this__nimbus_slaves.add(new NimbusStat(other_element));
      }
      this.nimbus_slaves = __this__nimbus_slaves;
    }
    this.supervisor_num = other.supervisor_num;
    this.total_port_num = other.total_port_num;
    this.used_port_num = other.used_port_num;
    this.free_port_num = other.free_port_num;
    if (other.is_set_version()) {
      this.version = other.version;
    }
  }

  public NimbusSummary deepCopy() {
    return new NimbusSummary(this);
  }

  @Override
  public void clear() {
    this.nimbus_master = null;
    this.nimbus_slaves = null;
    set_supervisor_num_isSet(false);
    this.supervisor_num = 0;
    set_total_port_num_isSet(false);
    this.total_port_num = 0;
    set_used_port_num_isSet(false);
    this.used_port_num = 0;
    set_free_port_num_isSet(false);
    this.free_port_num = 0;
    this.version = null;
  }

  public NimbusStat get_nimbus_master() {
    return this.nimbus_master;
  }

  public void set_nimbus_master(NimbusStat nimbus_master) {
    this.nimbus_master = nimbus_master;
  }

  public void unset_nimbus_master() {
    this.nimbus_master = null;
  }

  /** Returns true if field nimbus_master is set (has been assigned a value) and false otherwise */
  public boolean is_set_nimbus_master() {
    return this.nimbus_master != null;
  }

  public void set_nimbus_master_isSet(boolean value) {
    if (!value) {
      this.nimbus_master = null;
    }
  }

  public int get_nimbus_slaves_size() {
    return (this.nimbus_slaves == null) ? 0 : this.nimbus_slaves.size();
  }

  public java.util.Iterator<NimbusStat> get_nimbus_slaves_iterator() {
    return (this.nimbus_slaves == null) ? null : this.nimbus_slaves.iterator();
  }

  public void add_to_nimbus_slaves(NimbusStat elem) {
    if (this.nimbus_slaves == null) {
      this.nimbus_slaves = new ArrayList<NimbusStat>();
    }
    this.nimbus_slaves.add(elem);
  }

  public List<NimbusStat> get_nimbus_slaves() {
    return this.nimbus_slaves;
  }

  public void set_nimbus_slaves(List<NimbusStat> nimbus_slaves) {
    this.nimbus_slaves = nimbus_slaves;
  }

  public void unset_nimbus_slaves() {
    this.nimbus_slaves = null;
  }

  /** Returns true if field nimbus_slaves is set (has been assigned a value) and false otherwise */
  public boolean is_set_nimbus_slaves() {
    return this.nimbus_slaves != null;
  }

  public void set_nimbus_slaves_isSet(boolean value) {
    if (!value) {
      this.nimbus_slaves = null;
    }
  }

  public int get_supervisor_num() {
    return this.supervisor_num;
  }

  public void set_supervisor_num(int supervisor_num) {
    this.supervisor_num = supervisor_num;
    set_supervisor_num_isSet(true);
  }

  public void unset_supervisor_num() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SUPERVISOR_NUM_ISSET_ID);
  }

  /** Returns true if field supervisor_num is set (has been assigned a value) and false otherwise */
  public boolean is_set_supervisor_num() {
    return EncodingUtils.testBit(__isset_bitfield, __SUPERVISOR_NUM_ISSET_ID);
  }

  public void set_supervisor_num_isSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SUPERVISOR_NUM_ISSET_ID, value);
  }

  public int get_total_port_num() {
    return this.total_port_num;
  }

  public void set_total_port_num(int total_port_num) {
    this.total_port_num = total_port_num;
    set_total_port_num_isSet(true);
  }

  public void unset_total_port_num() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TOTAL_PORT_NUM_ISSET_ID);
  }

  /** Returns true if field total_port_num is set (has been assigned a value) and false otherwise */
  public boolean is_set_total_port_num() {
    return EncodingUtils.testBit(__isset_bitfield, __TOTAL_PORT_NUM_ISSET_ID);
  }

  public void set_total_port_num_isSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TOTAL_PORT_NUM_ISSET_ID, value);
  }

  public int get_used_port_num() {
    return this.used_port_num;
  }

  public void set_used_port_num(int used_port_num) {
    this.used_port_num = used_port_num;
    set_used_port_num_isSet(true);
  }

  public void unset_used_port_num() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __USED_PORT_NUM_ISSET_ID);
  }

  /** Returns true if field used_port_num is set (has been assigned a value) and false otherwise */
  public boolean is_set_used_port_num() {
    return EncodingUtils.testBit(__isset_bitfield, __USED_PORT_NUM_ISSET_ID);
  }

  public void set_used_port_num_isSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __USED_PORT_NUM_ISSET_ID, value);
  }

  public int get_free_port_num() {
    return this.free_port_num;
  }

  public void set_free_port_num(int free_port_num) {
    this.free_port_num = free_port_num;
    set_free_port_num_isSet(true);
  }

  public void unset_free_port_num() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __FREE_PORT_NUM_ISSET_ID);
  }

  /** Returns true if field free_port_num is set (has been assigned a value) and false otherwise */
  public boolean is_set_free_port_num() {
    return EncodingUtils.testBit(__isset_bitfield, __FREE_PORT_NUM_ISSET_ID);
  }

  public void set_free_port_num_isSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __FREE_PORT_NUM_ISSET_ID, value);
  }

  public String get_version() {
    return this.version;
  }

  public void set_version(String version) {
    this.version = version;
  }

  public void unset_version() {
    this.version = null;
  }

  /** Returns true if field version is set (has been assigned a value) and false otherwise */
  public boolean is_set_version() {
    return this.version != null;
  }

  public void set_version_isSet(boolean value) {
    if (!value) {
      this.version = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case NIMBUS_MASTER:
      if (value == null) {
        unset_nimbus_master();
      } else {
        set_nimbus_master((NimbusStat)value);
      }
      break;

    case NIMBUS_SLAVES:
      if (value == null) {
        unset_nimbus_slaves();
      } else {
        set_nimbus_slaves((List<NimbusStat>)value);
      }
      break;

    case SUPERVISOR_NUM:
      if (value == null) {
        unset_supervisor_num();
      } else {
        set_supervisor_num((Integer)value);
      }
      break;

    case TOTAL_PORT_NUM:
      if (value == null) {
        unset_total_port_num();
      } else {
        set_total_port_num((Integer)value);
      }
      break;

    case USED_PORT_NUM:
      if (value == null) {
        unset_used_port_num();
      } else {
        set_used_port_num((Integer)value);
      }
      break;

    case FREE_PORT_NUM:
      if (value == null) {
        unset_free_port_num();
      } else {
        set_free_port_num((Integer)value);
      }
      break;

    case VERSION:
      if (value == null) {
        unset_version();
      } else {
        set_version((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case NIMBUS_MASTER:
      return get_nimbus_master();

    case NIMBUS_SLAVES:
      return get_nimbus_slaves();

    case SUPERVISOR_NUM:
      return Integer.valueOf(get_supervisor_num());

    case TOTAL_PORT_NUM:
      return Integer.valueOf(get_total_port_num());

    case USED_PORT_NUM:
      return Integer.valueOf(get_used_port_num());

    case FREE_PORT_NUM:
      return Integer.valueOf(get_free_port_num());

    case VERSION:
      return get_version();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case NIMBUS_MASTER:
      return is_set_nimbus_master();
    case NIMBUS_SLAVES:
      return is_set_nimbus_slaves();
    case SUPERVISOR_NUM:
      return is_set_supervisor_num();
    case TOTAL_PORT_NUM:
      return is_set_total_port_num();
    case USED_PORT_NUM:
      return is_set_used_port_num();
    case FREE_PORT_NUM:
      return is_set_free_port_num();
    case VERSION:
      return is_set_version();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof NimbusSummary)
      return this.equals((NimbusSummary)that);
    return false;
  }

  public boolean equals(NimbusSummary that) {
    if (that == null)
      return false;

    boolean this_present_nimbus_master = true && this.is_set_nimbus_master();
    boolean that_present_nimbus_master = true && that.is_set_nimbus_master();
    if (this_present_nimbus_master || that_present_nimbus_master) {
      if (!(this_present_nimbus_master && that_present_nimbus_master))
        return false;
      if (!this.nimbus_master.equals(that.nimbus_master))
        return false;
    }

    boolean this_present_nimbus_slaves = true && this.is_set_nimbus_slaves();
    boolean that_present_nimbus_slaves = true && that.is_set_nimbus_slaves();
    if (this_present_nimbus_slaves || that_present_nimbus_slaves) {
      if (!(this_present_nimbus_slaves && that_present_nimbus_slaves))
        return false;
      if (!this.nimbus_slaves.equals(that.nimbus_slaves))
        return false;
    }

    boolean this_present_supervisor_num = true;
    boolean that_present_supervisor_num = true;
    if (this_present_supervisor_num || that_present_supervisor_num) {
      if (!(this_present_supervisor_num && that_present_supervisor_num))
        return false;
      if (this.supervisor_num != that.supervisor_num)
        return false;
    }

    boolean this_present_total_port_num = true;
    boolean that_present_total_port_num = true;
    if (this_present_total_port_num || that_present_total_port_num) {
      if (!(this_present_total_port_num && that_present_total_port_num))
        return false;
      if (this.total_port_num != that.total_port_num)
        return false;
    }

    boolean this_present_used_port_num = true;
    boolean that_present_used_port_num = true;
    if (this_present_used_port_num || that_present_used_port_num) {
      if (!(this_present_used_port_num && that_present_used_port_num))
        return false;
      if (this.used_port_num != that.used_port_num)
        return false;
    }

    boolean this_present_free_port_num = true;
    boolean that_present_free_port_num = true;
    if (this_present_free_port_num || that_present_free_port_num) {
      if (!(this_present_free_port_num && that_present_free_port_num))
        return false;
      if (this.free_port_num != that.free_port_num)
        return false;
    }

    boolean this_present_version = true && this.is_set_version();
    boolean that_present_version = true && that.is_set_version();
    if (this_present_version || that_present_version) {
      if (!(this_present_version && that_present_version))
        return false;
      if (!this.version.equals(that.version))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_nimbus_master = true && (is_set_nimbus_master());
    list.add(present_nimbus_master);
    if (present_nimbus_master)
      list.add(nimbus_master);

    boolean present_nimbus_slaves = true && (is_set_nimbus_slaves());
    list.add(present_nimbus_slaves);
    if (present_nimbus_slaves)
      list.add(nimbus_slaves);

    boolean present_supervisor_num = true;
    list.add(present_supervisor_num);
    if (present_supervisor_num)
      list.add(supervisor_num);

    boolean present_total_port_num = true;
    list.add(present_total_port_num);
    if (present_total_port_num)
      list.add(total_port_num);

    boolean present_used_port_num = true;
    list.add(present_used_port_num);
    if (present_used_port_num)
      list.add(used_port_num);

    boolean present_free_port_num = true;
    list.add(present_free_port_num);
    if (present_free_port_num)
      list.add(free_port_num);

    boolean present_version = true && (is_set_version());
    list.add(present_version);
    if (present_version)
      list.add(version);

    return list.hashCode();
  }

  @Override
  public int compareTo(NimbusSummary other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(is_set_nimbus_master()).compareTo(other.is_set_nimbus_master());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_nimbus_master()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nimbus_master, other.nimbus_master);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_nimbus_slaves()).compareTo(other.is_set_nimbus_slaves());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_nimbus_slaves()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nimbus_slaves, other.nimbus_slaves);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_supervisor_num()).compareTo(other.is_set_supervisor_num());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_supervisor_num()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.supervisor_num, other.supervisor_num);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_total_port_num()).compareTo(other.is_set_total_port_num());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_total_port_num()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.total_port_num, other.total_port_num);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_used_port_num()).compareTo(other.is_set_used_port_num());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_used_port_num()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.used_port_num, other.used_port_num);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_free_port_num()).compareTo(other.is_set_free_port_num());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_free_port_num()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.free_port_num, other.free_port_num);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_version()).compareTo(other.is_set_version());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_version()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.version, other.version);
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
    StringBuilder sb = new StringBuilder("NimbusSummary(");
    boolean first = true;

    sb.append("nimbus_master:");
    if (this.nimbus_master == null) {
      sb.append("null");
    } else {
      sb.append(this.nimbus_master);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("nimbus_slaves:");
    if (this.nimbus_slaves == null) {
      sb.append("null");
    } else {
      sb.append(this.nimbus_slaves);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("supervisor_num:");
    sb.append(this.supervisor_num);
    first = false;
    if (!first) sb.append(", ");
    sb.append("total_port_num:");
    sb.append(this.total_port_num);
    first = false;
    if (!first) sb.append(", ");
    sb.append("used_port_num:");
    sb.append(this.used_port_num);
    first = false;
    if (!first) sb.append(", ");
    sb.append("free_port_num:");
    sb.append(this.free_port_num);
    first = false;
    if (!first) sb.append(", ");
    sb.append("version:");
    if (this.version == null) {
      sb.append("null");
    } else {
      sb.append(this.version);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!is_set_nimbus_master()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'nimbus_master' is unset! Struct:" + toString());
    }

    if (!is_set_nimbus_slaves()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'nimbus_slaves' is unset! Struct:" + toString());
    }

    if (!is_set_supervisor_num()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'supervisor_num' is unset! Struct:" + toString());
    }

    if (!is_set_total_port_num()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'total_port_num' is unset! Struct:" + toString());
    }

    if (!is_set_used_port_num()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'used_port_num' is unset! Struct:" + toString());
    }

    if (!is_set_free_port_num()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'free_port_num' is unset! Struct:" + toString());
    }

    if (!is_set_version()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'version' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
    if (nimbus_master != null) {
      nimbus_master.validate();
    }
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

  private static class NimbusSummaryStandardSchemeFactory implements SchemeFactory {
    public NimbusSummaryStandardScheme getScheme() {
      return new NimbusSummaryStandardScheme();
    }
  }

  private static class NimbusSummaryStandardScheme extends StandardScheme<NimbusSummary> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, NimbusSummary struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NIMBUS_MASTER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.nimbus_master = new NimbusStat();
              struct.nimbus_master.read(iprot);
              struct.set_nimbus_master_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NIMBUS_SLAVES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list74 = iprot.readListBegin();
                struct.nimbus_slaves = new ArrayList<NimbusStat>(_list74.size);
                NimbusStat _elem75;
                for (int _i76 = 0; _i76 < _list74.size; ++_i76)
                {
                  _elem75 = new NimbusStat();
                  _elem75.read(iprot);
                  struct.nimbus_slaves.add(_elem75);
                }
                iprot.readListEnd();
              }
              struct.set_nimbus_slaves_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SUPERVISOR_NUM
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.supervisor_num = iprot.readI32();
              struct.set_supervisor_num_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TOTAL_PORT_NUM
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.total_port_num = iprot.readI32();
              struct.set_total_port_num_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // USED_PORT_NUM
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.used_port_num = iprot.readI32();
              struct.set_used_port_num_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // FREE_PORT_NUM
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.free_port_num = iprot.readI32();
              struct.set_free_port_num_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.version = iprot.readString();
              struct.set_version_isSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, NimbusSummary struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.nimbus_master != null) {
        oprot.writeFieldBegin(NIMBUS_MASTER_FIELD_DESC);
        struct.nimbus_master.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.nimbus_slaves != null) {
        oprot.writeFieldBegin(NIMBUS_SLAVES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.nimbus_slaves.size()));
          for (NimbusStat _iter77 : struct.nimbus_slaves)
          {
            _iter77.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(SUPERVISOR_NUM_FIELD_DESC);
      oprot.writeI32(struct.supervisor_num);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(TOTAL_PORT_NUM_FIELD_DESC);
      oprot.writeI32(struct.total_port_num);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(USED_PORT_NUM_FIELD_DESC);
      oprot.writeI32(struct.used_port_num);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(FREE_PORT_NUM_FIELD_DESC);
      oprot.writeI32(struct.free_port_num);
      oprot.writeFieldEnd();
      if (struct.version != null) {
        oprot.writeFieldBegin(VERSION_FIELD_DESC);
        oprot.writeString(struct.version);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class NimbusSummaryTupleSchemeFactory implements SchemeFactory {
    public NimbusSummaryTupleScheme getScheme() {
      return new NimbusSummaryTupleScheme();
    }
  }

  private static class NimbusSummaryTupleScheme extends TupleScheme<NimbusSummary> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, NimbusSummary struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.nimbus_master.write(oprot);
      {
        oprot.writeI32(struct.nimbus_slaves.size());
        for (NimbusStat _iter78 : struct.nimbus_slaves)
        {
          _iter78.write(oprot);
        }
      }
      oprot.writeI32(struct.supervisor_num);
      oprot.writeI32(struct.total_port_num);
      oprot.writeI32(struct.used_port_num);
      oprot.writeI32(struct.free_port_num);
      oprot.writeString(struct.version);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, NimbusSummary struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.nimbus_master = new NimbusStat();
      struct.nimbus_master.read(iprot);
      struct.set_nimbus_master_isSet(true);
      {
        org.apache.thrift.protocol.TList _list79 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.nimbus_slaves = new ArrayList<NimbusStat>(_list79.size);
        NimbusStat _elem80;
        for (int _i81 = 0; _i81 < _list79.size; ++_i81)
        {
          _elem80 = new NimbusStat();
          _elem80.read(iprot);
          struct.nimbus_slaves.add(_elem80);
        }
      }
      struct.set_nimbus_slaves_isSet(true);
      struct.supervisor_num = iprot.readI32();
      struct.set_supervisor_num_isSet(true);
      struct.total_port_num = iprot.readI32();
      struct.set_total_port_num_isSet(true);
      struct.used_port_num = iprot.readI32();
      struct.set_used_port_num_isSet(true);
      struct.free_port_num = iprot.readI32();
      struct.set_free_port_num_isSet(true);
      struct.version = iprot.readString();
      struct.set_version_isSet(true);
    }
  }

}

