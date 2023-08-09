// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: iscp2/v1/extensions/connection.proto

package com.github.aptpod.proto.iscp2.v1.extensions;

/**
 * Protobuf type {@code iscp2.v1.extensions.IntdashExtensionFields}
 */
public final class IntdashExtensionFields extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:iscp2.v1.extensions.IntdashExtensionFields)
    IntdashExtensionFieldsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use IntdashExtensionFields.newBuilder() to construct.
  private IntdashExtensionFields(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private IntdashExtensionFields() {
    projectUuid_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new IntdashExtensionFields();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.aptpod.proto.iscp2.v1.extensions.ConnectionProto.internal_static_iscp2_v1_extensions_IntdashExtensionFields_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.aptpod.proto.iscp2.v1.extensions.ConnectionProto.internal_static_iscp2_v1_extensions_IntdashExtensionFields_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.aptpod.proto.iscp2.v1.extensions.IntdashExtensionFields.class, com.github.aptpod.proto.iscp2.v1.extensions.IntdashExtensionFields.Builder.class);
  }

  public static final int PROJECT_UUID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object projectUuid_ = "";
  /**
   * <code>string project_uuid = 1 [json_name = "projectUuid"];</code>
   * @return The projectUuid.
   */
  @java.lang.Override
  public java.lang.String getProjectUuid() {
    java.lang.Object ref = projectUuid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      projectUuid_ = s;
      return s;
    }
  }
  /**
   * <code>string project_uuid = 1 [json_name = "projectUuid"];</code>
   * @return The bytes for projectUuid.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getProjectUuidBytes() {
    java.lang.Object ref = projectUuid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      projectUuid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(projectUuid_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, projectUuid_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(projectUuid_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, projectUuid_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.github.aptpod.proto.iscp2.v1.extensions.IntdashExtensionFields)) {
      return super.equals(obj);
    }
    com.github.aptpod.proto.iscp2.v1.extensions.IntdashExtensionFields other = (com.github.aptpod.proto.iscp2.v1.extensions.IntdashExtensionFields) obj;

    if (!getProjectUuid()
        .equals(other.getProjectUuid())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PROJECT_UUID_FIELD_NUMBER;
    hash = (53 * hash) + getProjectUuid().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.aptpod.proto.iscp2.v1.extensions.IntdashExtensionFields parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.aptpod.proto.iscp2.v1.extensions.IntdashExtensionFields parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.aptpod.proto.iscp2.v1.extensions.IntdashExtensionFields parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.aptpod.proto.iscp2.v1.extensions.IntdashExtensionFields parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.aptpod.proto.iscp2.v1.extensions.IntdashExtensionFields parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.aptpod.proto.iscp2.v1.extensions.IntdashExtensionFields parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.aptpod.proto.iscp2.v1.extensions.IntdashExtensionFields parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.aptpod.proto.iscp2.v1.extensions.IntdashExtensionFields parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.github.aptpod.proto.iscp2.v1.extensions.IntdashExtensionFields parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.github.aptpod.proto.iscp2.v1.extensions.IntdashExtensionFields parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.aptpod.proto.iscp2.v1.extensions.IntdashExtensionFields parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.aptpod.proto.iscp2.v1.extensions.IntdashExtensionFields parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.github.aptpod.proto.iscp2.v1.extensions.IntdashExtensionFields prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code iscp2.v1.extensions.IntdashExtensionFields}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:iscp2.v1.extensions.IntdashExtensionFields)
      com.github.aptpod.proto.iscp2.v1.extensions.IntdashExtensionFieldsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.aptpod.proto.iscp2.v1.extensions.ConnectionProto.internal_static_iscp2_v1_extensions_IntdashExtensionFields_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.aptpod.proto.iscp2.v1.extensions.ConnectionProto.internal_static_iscp2_v1_extensions_IntdashExtensionFields_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.aptpod.proto.iscp2.v1.extensions.IntdashExtensionFields.class, com.github.aptpod.proto.iscp2.v1.extensions.IntdashExtensionFields.Builder.class);
    }

    // Construct using com.github.aptpod.proto.iscp2.v1.extensions.IntdashExtensionFields.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      projectUuid_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.aptpod.proto.iscp2.v1.extensions.ConnectionProto.internal_static_iscp2_v1_extensions_IntdashExtensionFields_descriptor;
    }

    @java.lang.Override
    public com.github.aptpod.proto.iscp2.v1.extensions.IntdashExtensionFields getDefaultInstanceForType() {
      return com.github.aptpod.proto.iscp2.v1.extensions.IntdashExtensionFields.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.aptpod.proto.iscp2.v1.extensions.IntdashExtensionFields build() {
      com.github.aptpod.proto.iscp2.v1.extensions.IntdashExtensionFields result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.aptpod.proto.iscp2.v1.extensions.IntdashExtensionFields buildPartial() {
      com.github.aptpod.proto.iscp2.v1.extensions.IntdashExtensionFields result = new com.github.aptpod.proto.iscp2.v1.extensions.IntdashExtensionFields(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.github.aptpod.proto.iscp2.v1.extensions.IntdashExtensionFields result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.projectUuid_ = projectUuid_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.github.aptpod.proto.iscp2.v1.extensions.IntdashExtensionFields) {
        return mergeFrom((com.github.aptpod.proto.iscp2.v1.extensions.IntdashExtensionFields)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.aptpod.proto.iscp2.v1.extensions.IntdashExtensionFields other) {
      if (other == com.github.aptpod.proto.iscp2.v1.extensions.IntdashExtensionFields.getDefaultInstance()) return this;
      if (!other.getProjectUuid().isEmpty()) {
        projectUuid_ = other.projectUuid_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              projectUuid_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.lang.Object projectUuid_ = "";
    /**
     * <code>string project_uuid = 1 [json_name = "projectUuid"];</code>
     * @return The projectUuid.
     */
    public java.lang.String getProjectUuid() {
      java.lang.Object ref = projectUuid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        projectUuid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string project_uuid = 1 [json_name = "projectUuid"];</code>
     * @return The bytes for projectUuid.
     */
    public com.google.protobuf.ByteString
        getProjectUuidBytes() {
      java.lang.Object ref = projectUuid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        projectUuid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string project_uuid = 1 [json_name = "projectUuid"];</code>
     * @param value The projectUuid to set.
     * @return This builder for chaining.
     */
    public Builder setProjectUuid(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      projectUuid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string project_uuid = 1 [json_name = "projectUuid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearProjectUuid() {
      projectUuid_ = getDefaultInstance().getProjectUuid();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string project_uuid = 1 [json_name = "projectUuid"];</code>
     * @param value The bytes for projectUuid to set.
     * @return This builder for chaining.
     */
    public Builder setProjectUuidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      projectUuid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:iscp2.v1.extensions.IntdashExtensionFields)
  }

  // @@protoc_insertion_point(class_scope:iscp2.v1.extensions.IntdashExtensionFields)
  private static final com.github.aptpod.proto.iscp2.v1.extensions.IntdashExtensionFields DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.aptpod.proto.iscp2.v1.extensions.IntdashExtensionFields();
  }

  public static com.github.aptpod.proto.iscp2.v1.extensions.IntdashExtensionFields getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IntdashExtensionFields>
      PARSER = new com.google.protobuf.AbstractParser<IntdashExtensionFields>() {
    @java.lang.Override
    public IntdashExtensionFields parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<IntdashExtensionFields> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IntdashExtensionFields> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.aptpod.proto.iscp2.v1.extensions.IntdashExtensionFields getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
