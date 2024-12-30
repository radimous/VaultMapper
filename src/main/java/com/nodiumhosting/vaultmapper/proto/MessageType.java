// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: VaultMapperProtocol/vaultmapper.proto
// Protobuf Java Version: 4.29.1

package com.nodiumhosting.vaultmapper.proto;

/**
 * Protobuf enum {@code MessageType}
 */
public enum MessageType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>VAULT = 0;</code>
   */
  VAULT(0),
  /**
   * <code>VAULT_PLAYER = 1;</code>
   */
  VAULT_PLAYER(1),
  /**
   * <code>VAULT_CELL = 2;</code>
   */
  VAULT_CELL(2),
  /**
   * <code>PLAYER_DISCONNECT = 3;</code>
   */
  PLAYER_DISCONNECT(3),
  /**
   * <code>TOAST = 4;</code>
   */
  TOAST(4),
  UNRECOGNIZED(-1),
  ;

  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 1,
      /* suffix= */ "",
      MessageType.class.getName());
  }
  /**
   * <code>VAULT = 0;</code>
   */
  public static final int VAULT_VALUE = 0;
  /**
   * <code>VAULT_PLAYER = 1;</code>
   */
  public static final int VAULT_PLAYER_VALUE = 1;
  /**
   * <code>VAULT_CELL = 2;</code>
   */
  public static final int VAULT_CELL_VALUE = 2;
  /**
   * <code>PLAYER_DISCONNECT = 3;</code>
   */
  public static final int PLAYER_DISCONNECT_VALUE = 3;
  /**
   * <code>TOAST = 4;</code>
   */
  public static final int TOAST_VALUE = 4;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static MessageType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static MessageType forNumber(int value) {
    switch (value) {
      case 0: return VAULT;
      case 1: return VAULT_PLAYER;
      case 2: return VAULT_CELL;
      case 3: return PLAYER_DISCONNECT;
      case 4: return TOAST;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<MessageType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      MessageType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<MessageType>() {
          public MessageType findValueByNumber(int number) {
            return MessageType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.nodiumhosting.vaultmapper.proto.VaultMapperProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final MessageType[] VALUES = values();

  public static MessageType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private MessageType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:MessageType)
}

