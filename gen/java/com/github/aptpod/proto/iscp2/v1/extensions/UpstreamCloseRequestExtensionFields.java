// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: iscp2/v1/extensions/upstream.proto

package com.github.aptpod.proto.iscp2.v1.extensions;

/**
 * Protobuf type {@code iscp2.v1.extensions.UpstreamCloseRequestExtensionFields}
 */
public final class UpstreamCloseRequestExtensionFields extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:iscp2.v1.extensions.UpstreamCloseRequestExtensionFields)
    UpstreamCloseRequestExtensionFieldsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpstreamCloseRequestExtensionFields.newBuilder() to construct.
  private UpstreamCloseRequestExtensionFields(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpstreamCloseRequestExtensionFields() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpstreamCloseRequestExtensionFields();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.aptpod.proto.iscp2.v1.extensions.UpstreamProto.internal_static_iscp2_v1_extensions_UpstreamCloseRequestExtensionFields_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.aptpod.proto.iscp2.v1.extensions.UpstreamProto.internal_static_iscp2_v1_extensions_UpstreamCloseRequestExtensionFields_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.aptpod.proto.iscp2.v1.extensions.UpstreamCloseRequestExtensionFields.class, com.github.aptpod.proto.iscp2.v1.extensions.UpstreamCloseRequestExtensionFields.Builder.class);
  }

  public static final int CLOSE_SESSION_FIELD_NUMBER = 1;
  private boolean closeSession_ = false;
  /**
   * <code>bool close_session = 1 [json_name = "closeSession"];</code>
   * @return The closeSession.
   */
  @java.lang.Override
  public boolean getCloseSession() {
    return closeSession_;
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
    if (closeSession_ != false) {
      output.writeBool(1, closeSession_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (closeSession_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, closeSession_);
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
    if (!(obj instanceof com.github.aptpod.proto.iscp2.v1.extensions.UpstreamCloseRequestExtensionFields)) {
      return super.equals(obj);
    }
    com.github.aptpod.proto.iscp2.v1.extensions.UpstreamCloseRequestExtensionFields other = (com.github.aptpod.proto.iscp2.v1.extensions.UpstreamCloseRequestExtensionFields) obj;

    if (getCloseSession()
        != other.getCloseSession()) return false;
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
    hash = (37 * hash) + CLOSE_SESSION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getCloseSession());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.aptpod.proto.iscp2.v1.extensions.UpstreamCloseRequestExtensionFields parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.aptpod.proto.iscp2.v1.extensions.UpstreamCloseRequestExtensionFields parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.aptpod.proto.iscp2.v1.extensions.UpstreamCloseRequestExtensionFields parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.aptpod.proto.iscp2.v1.extensions.UpstreamCloseRequestExtensionFields parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.aptpod.proto.iscp2.v1.extensions.UpstreamCloseRequestExtensionFields parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.aptpod.proto.iscp2.v1.extensions.UpstreamCloseRequestExtensionFields parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.aptpod.proto.iscp2.v1.extensions.UpstreamCloseRequestExtensionFields parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.aptpod.proto.iscp2.v1.extensions.UpstreamCloseRequestExtensionFields parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.github.aptpod.proto.iscp2.v1.extensions.UpstreamCloseRequestExtensionFields parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.github.aptpod.proto.iscp2.v1.extensions.UpstreamCloseRequestExtensionFields parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.aptpod.proto.iscp2.v1.extensions.UpstreamCloseRequestExtensionFields parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.aptpod.proto.iscp2.v1.extensions.UpstreamCloseRequestExtensionFields parseFrom(
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
  public static Builder newBuilder(com.github.aptpod.proto.iscp2.v1.extensions.UpstreamCloseRequestExtensionFields prototype) {
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
   * Protobuf type {@code iscp2.v1.extensions.UpstreamCloseRequestExtensionFields}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:iscp2.v1.extensions.UpstreamCloseRequestExtensionFields)
      com.github.aptpod.proto.iscp2.v1.extensions.UpstreamCloseRequestExtensionFieldsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.aptpod.proto.iscp2.v1.extensions.UpstreamProto.internal_static_iscp2_v1_extensions_UpstreamCloseRequestExtensionFields_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.aptpod.proto.iscp2.v1.extensions.UpstreamProto.internal_static_iscp2_v1_extensions_UpstreamCloseRequestExtensionFields_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.aptpod.proto.iscp2.v1.extensions.UpstreamCloseRequestExtensionFields.class, com.github.aptpod.proto.iscp2.v1.extensions.UpstreamCloseRequestExtensionFields.Builder.class);
    }

    // Construct using com.github.aptpod.proto.iscp2.v1.extensions.UpstreamCloseRequestExtensionFields.newBuilder()
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
      closeSession_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.aptpod.proto.iscp2.v1.extensions.UpstreamProto.internal_static_iscp2_v1_extensions_UpstreamCloseRequestExtensionFields_descriptor;
    }

    @java.lang.Override
    public com.github.aptpod.proto.iscp2.v1.extensions.UpstreamCloseRequestExtensionFields getDefaultInstanceForType() {
      return com.github.aptpod.proto.iscp2.v1.extensions.UpstreamCloseRequestExtensionFields.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.aptpod.proto.iscp2.v1.extensions.UpstreamCloseRequestExtensionFields build() {
      com.github.aptpod.proto.iscp2.v1.extensions.UpstreamCloseRequestExtensionFields result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.aptpod.proto.iscp2.v1.extensions.UpstreamCloseRequestExtensionFields buildPartial() {
      com.github.aptpod.proto.iscp2.v1.extensions.UpstreamCloseRequestExtensionFields result = new com.github.aptpod.proto.iscp2.v1.extensions.UpstreamCloseRequestExtensionFields(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.github.aptpod.proto.iscp2.v1.extensions.UpstreamCloseRequestExtensionFields result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.closeSession_ = closeSession_;
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
      if (other instanceof com.github.aptpod.proto.iscp2.v1.extensions.UpstreamCloseRequestExtensionFields) {
        return mergeFrom((com.github.aptpod.proto.iscp2.v1.extensions.UpstreamCloseRequestExtensionFields)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.aptpod.proto.iscp2.v1.extensions.UpstreamCloseRequestExtensionFields other) {
      if (other == com.github.aptpod.proto.iscp2.v1.extensions.UpstreamCloseRequestExtensionFields.getDefaultInstance()) return this;
      if (other.getCloseSession() != false) {
        setCloseSession(other.getCloseSession());
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
            case 8: {
              closeSession_ = input.readBool();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
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

    private boolean closeSession_ ;
    /**
     * <code>bool close_session = 1 [json_name = "closeSession"];</code>
     * @return The closeSession.
     */
    @java.lang.Override
    public boolean getCloseSession() {
      return closeSession_;
    }
    /**
     * <code>bool close_session = 1 [json_name = "closeSession"];</code>
     * @param value The closeSession to set.
     * @return This builder for chaining.
     */
    public Builder setCloseSession(boolean value) {

      closeSession_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>bool close_session = 1 [json_name = "closeSession"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCloseSession() {
      bitField0_ = (bitField0_ & ~0x00000001);
      closeSession_ = false;
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


    // @@protoc_insertion_point(builder_scope:iscp2.v1.extensions.UpstreamCloseRequestExtensionFields)
  }

  // @@protoc_insertion_point(class_scope:iscp2.v1.extensions.UpstreamCloseRequestExtensionFields)
  private static final com.github.aptpod.proto.iscp2.v1.extensions.UpstreamCloseRequestExtensionFields DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.aptpod.proto.iscp2.v1.extensions.UpstreamCloseRequestExtensionFields();
  }

  public static com.github.aptpod.proto.iscp2.v1.extensions.UpstreamCloseRequestExtensionFields getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpstreamCloseRequestExtensionFields>
      PARSER = new com.google.protobuf.AbstractParser<UpstreamCloseRequestExtensionFields>() {
    @java.lang.Override
    public UpstreamCloseRequestExtensionFields parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpstreamCloseRequestExtensionFields> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpstreamCloseRequestExtensionFields> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.aptpod.proto.iscp2.v1.extensions.UpstreamCloseRequestExtensionFields getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

