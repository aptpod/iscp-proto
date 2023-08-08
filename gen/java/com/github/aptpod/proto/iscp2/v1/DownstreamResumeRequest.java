// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: iscp2/v1/downstream.proto

package com.github.aptpod.proto.iscp2.v1;

/**
 * Protobuf type {@code iscp2.v1.DownstreamResumeRequest}
 */
public final class DownstreamResumeRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:iscp2.v1.DownstreamResumeRequest)
    DownstreamResumeRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DownstreamResumeRequest.newBuilder() to construct.
  private DownstreamResumeRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DownstreamResumeRequest() {
    streamId_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DownstreamResumeRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.aptpod.proto.iscp2.v1.DownstreamProto.internal_static_iscp2_v1_DownstreamResumeRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.aptpod.proto.iscp2.v1.DownstreamProto.internal_static_iscp2_v1_DownstreamResumeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.aptpod.proto.iscp2.v1.DownstreamResumeRequest.class, com.github.aptpod.proto.iscp2.v1.DownstreamResumeRequest.Builder.class);
  }

  public static final int REQUEST_ID_FIELD_NUMBER = 1;
  private int requestId_ = 0;
  /**
   * <code>uint32 request_id = 1 [json_name = "requestId"];</code>
   * @return The requestId.
   */
  @java.lang.Override
  public int getRequestId() {
    return requestId_;
  }

  public static final int STREAM_ID_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString streamId_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes stream_id = 2 [json_name = "streamId"];</code>
   * @return The streamId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getStreamId() {
    return streamId_;
  }

  public static final int DESIRED_STREAM_ID_ALIAS_FIELD_NUMBER = 3;
  private int desiredStreamIdAlias_ = 0;
  /**
   * <code>uint32 desired_stream_id_alias = 3 [json_name = "desiredStreamIdAlias"];</code>
   * @return The desiredStreamIdAlias.
   */
  @java.lang.Override
  public int getDesiredStreamIdAlias() {
    return desiredStreamIdAlias_;
  }

  public static final int EXTENSION_FIELDS_FIELD_NUMBER = 4;
  private com.github.aptpod.proto.iscp2.v1.extensions.DownstreamResumeRequestExtensionFields extensionFields_;
  /**
   * <code>.iscp2.v1.extensions.DownstreamResumeRequestExtensionFields extension_fields = 4 [json_name = "extensionFields"];</code>
   * @return Whether the extensionFields field is set.
   */
  @java.lang.Override
  public boolean hasExtensionFields() {
    return extensionFields_ != null;
  }
  /**
   * <code>.iscp2.v1.extensions.DownstreamResumeRequestExtensionFields extension_fields = 4 [json_name = "extensionFields"];</code>
   * @return The extensionFields.
   */
  @java.lang.Override
  public com.github.aptpod.proto.iscp2.v1.extensions.DownstreamResumeRequestExtensionFields getExtensionFields() {
    return extensionFields_ == null ? com.github.aptpod.proto.iscp2.v1.extensions.DownstreamResumeRequestExtensionFields.getDefaultInstance() : extensionFields_;
  }
  /**
   * <code>.iscp2.v1.extensions.DownstreamResumeRequestExtensionFields extension_fields = 4 [json_name = "extensionFields"];</code>
   */
  @java.lang.Override
  public com.github.aptpod.proto.iscp2.v1.extensions.DownstreamResumeRequestExtensionFieldsOrBuilder getExtensionFieldsOrBuilder() {
    return extensionFields_ == null ? com.github.aptpod.proto.iscp2.v1.extensions.DownstreamResumeRequestExtensionFields.getDefaultInstance() : extensionFields_;
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
    if (requestId_ != 0) {
      output.writeUInt32(1, requestId_);
    }
    if (!streamId_.isEmpty()) {
      output.writeBytes(2, streamId_);
    }
    if (desiredStreamIdAlias_ != 0) {
      output.writeUInt32(3, desiredStreamIdAlias_);
    }
    if (extensionFields_ != null) {
      output.writeMessage(4, getExtensionFields());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (requestId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, requestId_);
    }
    if (!streamId_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, streamId_);
    }
    if (desiredStreamIdAlias_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, desiredStreamIdAlias_);
    }
    if (extensionFields_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getExtensionFields());
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
    if (!(obj instanceof com.github.aptpod.proto.iscp2.v1.DownstreamResumeRequest)) {
      return super.equals(obj);
    }
    com.github.aptpod.proto.iscp2.v1.DownstreamResumeRequest other = (com.github.aptpod.proto.iscp2.v1.DownstreamResumeRequest) obj;

    if (getRequestId()
        != other.getRequestId()) return false;
    if (!getStreamId()
        .equals(other.getStreamId())) return false;
    if (getDesiredStreamIdAlias()
        != other.getDesiredStreamIdAlias()) return false;
    if (hasExtensionFields() != other.hasExtensionFields()) return false;
    if (hasExtensionFields()) {
      if (!getExtensionFields()
          .equals(other.getExtensionFields())) return false;
    }
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
    hash = (37 * hash) + REQUEST_ID_FIELD_NUMBER;
    hash = (53 * hash) + getRequestId();
    hash = (37 * hash) + STREAM_ID_FIELD_NUMBER;
    hash = (53 * hash) + getStreamId().hashCode();
    hash = (37 * hash) + DESIRED_STREAM_ID_ALIAS_FIELD_NUMBER;
    hash = (53 * hash) + getDesiredStreamIdAlias();
    if (hasExtensionFields()) {
      hash = (37 * hash) + EXTENSION_FIELDS_FIELD_NUMBER;
      hash = (53 * hash) + getExtensionFields().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.aptpod.proto.iscp2.v1.DownstreamResumeRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.aptpod.proto.iscp2.v1.DownstreamResumeRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.aptpod.proto.iscp2.v1.DownstreamResumeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.aptpod.proto.iscp2.v1.DownstreamResumeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.aptpod.proto.iscp2.v1.DownstreamResumeRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.aptpod.proto.iscp2.v1.DownstreamResumeRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.aptpod.proto.iscp2.v1.DownstreamResumeRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.aptpod.proto.iscp2.v1.DownstreamResumeRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.github.aptpod.proto.iscp2.v1.DownstreamResumeRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.github.aptpod.proto.iscp2.v1.DownstreamResumeRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.aptpod.proto.iscp2.v1.DownstreamResumeRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.aptpod.proto.iscp2.v1.DownstreamResumeRequest parseFrom(
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
  public static Builder newBuilder(com.github.aptpod.proto.iscp2.v1.DownstreamResumeRequest prototype) {
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
   * Protobuf type {@code iscp2.v1.DownstreamResumeRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:iscp2.v1.DownstreamResumeRequest)
      com.github.aptpod.proto.iscp2.v1.DownstreamResumeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.aptpod.proto.iscp2.v1.DownstreamProto.internal_static_iscp2_v1_DownstreamResumeRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.aptpod.proto.iscp2.v1.DownstreamProto.internal_static_iscp2_v1_DownstreamResumeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.aptpod.proto.iscp2.v1.DownstreamResumeRequest.class, com.github.aptpod.proto.iscp2.v1.DownstreamResumeRequest.Builder.class);
    }

    // Construct using com.github.aptpod.proto.iscp2.v1.DownstreamResumeRequest.newBuilder()
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
      requestId_ = 0;
      streamId_ = com.google.protobuf.ByteString.EMPTY;
      desiredStreamIdAlias_ = 0;
      extensionFields_ = null;
      if (extensionFieldsBuilder_ != null) {
        extensionFieldsBuilder_.dispose();
        extensionFieldsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.aptpod.proto.iscp2.v1.DownstreamProto.internal_static_iscp2_v1_DownstreamResumeRequest_descriptor;
    }

    @java.lang.Override
    public com.github.aptpod.proto.iscp2.v1.DownstreamResumeRequest getDefaultInstanceForType() {
      return com.github.aptpod.proto.iscp2.v1.DownstreamResumeRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.aptpod.proto.iscp2.v1.DownstreamResumeRequest build() {
      com.github.aptpod.proto.iscp2.v1.DownstreamResumeRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.aptpod.proto.iscp2.v1.DownstreamResumeRequest buildPartial() {
      com.github.aptpod.proto.iscp2.v1.DownstreamResumeRequest result = new com.github.aptpod.proto.iscp2.v1.DownstreamResumeRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.github.aptpod.proto.iscp2.v1.DownstreamResumeRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.requestId_ = requestId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.streamId_ = streamId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.desiredStreamIdAlias_ = desiredStreamIdAlias_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.extensionFields_ = extensionFieldsBuilder_ == null
            ? extensionFields_
            : extensionFieldsBuilder_.build();
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
      if (other instanceof com.github.aptpod.proto.iscp2.v1.DownstreamResumeRequest) {
        return mergeFrom((com.github.aptpod.proto.iscp2.v1.DownstreamResumeRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.aptpod.proto.iscp2.v1.DownstreamResumeRequest other) {
      if (other == com.github.aptpod.proto.iscp2.v1.DownstreamResumeRequest.getDefaultInstance()) return this;
      if (other.getRequestId() != 0) {
        setRequestId(other.getRequestId());
      }
      if (other.getStreamId() != com.google.protobuf.ByteString.EMPTY) {
        setStreamId(other.getStreamId());
      }
      if (other.getDesiredStreamIdAlias() != 0) {
        setDesiredStreamIdAlias(other.getDesiredStreamIdAlias());
      }
      if (other.hasExtensionFields()) {
        mergeExtensionFields(other.getExtensionFields());
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
              requestId_ = input.readUInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              streamId_ = input.readBytes();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              desiredStreamIdAlias_ = input.readUInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 34: {
              input.readMessage(
                  getExtensionFieldsFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000008;
              break;
            } // case 34
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

    private int requestId_ ;
    /**
     * <code>uint32 request_id = 1 [json_name = "requestId"];</code>
     * @return The requestId.
     */
    @java.lang.Override
    public int getRequestId() {
      return requestId_;
    }
    /**
     * <code>uint32 request_id = 1 [json_name = "requestId"];</code>
     * @param value The requestId to set.
     * @return This builder for chaining.
     */
    public Builder setRequestId(int value) {

      requestId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 request_id = 1 [json_name = "requestId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRequestId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      requestId_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString streamId_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes stream_id = 2 [json_name = "streamId"];</code>
     * @return The streamId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getStreamId() {
      return streamId_;
    }
    /**
     * <code>bytes stream_id = 2 [json_name = "streamId"];</code>
     * @param value The streamId to set.
     * @return This builder for chaining.
     */
    public Builder setStreamId(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      streamId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>bytes stream_id = 2 [json_name = "streamId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearStreamId() {
      bitField0_ = (bitField0_ & ~0x00000002);
      streamId_ = getDefaultInstance().getStreamId();
      onChanged();
      return this;
    }

    private int desiredStreamIdAlias_ ;
    /**
     * <code>uint32 desired_stream_id_alias = 3 [json_name = "desiredStreamIdAlias"];</code>
     * @return The desiredStreamIdAlias.
     */
    @java.lang.Override
    public int getDesiredStreamIdAlias() {
      return desiredStreamIdAlias_;
    }
    /**
     * <code>uint32 desired_stream_id_alias = 3 [json_name = "desiredStreamIdAlias"];</code>
     * @param value The desiredStreamIdAlias to set.
     * @return This builder for chaining.
     */
    public Builder setDesiredStreamIdAlias(int value) {

      desiredStreamIdAlias_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 desired_stream_id_alias = 3 [json_name = "desiredStreamIdAlias"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDesiredStreamIdAlias() {
      bitField0_ = (bitField0_ & ~0x00000004);
      desiredStreamIdAlias_ = 0;
      onChanged();
      return this;
    }

    private com.github.aptpod.proto.iscp2.v1.extensions.DownstreamResumeRequestExtensionFields extensionFields_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.github.aptpod.proto.iscp2.v1.extensions.DownstreamResumeRequestExtensionFields, com.github.aptpod.proto.iscp2.v1.extensions.DownstreamResumeRequestExtensionFields.Builder, com.github.aptpod.proto.iscp2.v1.extensions.DownstreamResumeRequestExtensionFieldsOrBuilder> extensionFieldsBuilder_;
    /**
     * <code>.iscp2.v1.extensions.DownstreamResumeRequestExtensionFields extension_fields = 4 [json_name = "extensionFields"];</code>
     * @return Whether the extensionFields field is set.
     */
    public boolean hasExtensionFields() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>.iscp2.v1.extensions.DownstreamResumeRequestExtensionFields extension_fields = 4 [json_name = "extensionFields"];</code>
     * @return The extensionFields.
     */
    public com.github.aptpod.proto.iscp2.v1.extensions.DownstreamResumeRequestExtensionFields getExtensionFields() {
      if (extensionFieldsBuilder_ == null) {
        return extensionFields_ == null ? com.github.aptpod.proto.iscp2.v1.extensions.DownstreamResumeRequestExtensionFields.getDefaultInstance() : extensionFields_;
      } else {
        return extensionFieldsBuilder_.getMessage();
      }
    }
    /**
     * <code>.iscp2.v1.extensions.DownstreamResumeRequestExtensionFields extension_fields = 4 [json_name = "extensionFields"];</code>
     */
    public Builder setExtensionFields(com.github.aptpod.proto.iscp2.v1.extensions.DownstreamResumeRequestExtensionFields value) {
      if (extensionFieldsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        extensionFields_ = value;
      } else {
        extensionFieldsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.iscp2.v1.extensions.DownstreamResumeRequestExtensionFields extension_fields = 4 [json_name = "extensionFields"];</code>
     */
    public Builder setExtensionFields(
        com.github.aptpod.proto.iscp2.v1.extensions.DownstreamResumeRequestExtensionFields.Builder builderForValue) {
      if (extensionFieldsBuilder_ == null) {
        extensionFields_ = builderForValue.build();
      } else {
        extensionFieldsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.iscp2.v1.extensions.DownstreamResumeRequestExtensionFields extension_fields = 4 [json_name = "extensionFields"];</code>
     */
    public Builder mergeExtensionFields(com.github.aptpod.proto.iscp2.v1.extensions.DownstreamResumeRequestExtensionFields value) {
      if (extensionFieldsBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          extensionFields_ != null &&
          extensionFields_ != com.github.aptpod.proto.iscp2.v1.extensions.DownstreamResumeRequestExtensionFields.getDefaultInstance()) {
          getExtensionFieldsBuilder().mergeFrom(value);
        } else {
          extensionFields_ = value;
        }
      } else {
        extensionFieldsBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.iscp2.v1.extensions.DownstreamResumeRequestExtensionFields extension_fields = 4 [json_name = "extensionFields"];</code>
     */
    public Builder clearExtensionFields() {
      bitField0_ = (bitField0_ & ~0x00000008);
      extensionFields_ = null;
      if (extensionFieldsBuilder_ != null) {
        extensionFieldsBuilder_.dispose();
        extensionFieldsBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.iscp2.v1.extensions.DownstreamResumeRequestExtensionFields extension_fields = 4 [json_name = "extensionFields"];</code>
     */
    public com.github.aptpod.proto.iscp2.v1.extensions.DownstreamResumeRequestExtensionFields.Builder getExtensionFieldsBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getExtensionFieldsFieldBuilder().getBuilder();
    }
    /**
     * <code>.iscp2.v1.extensions.DownstreamResumeRequestExtensionFields extension_fields = 4 [json_name = "extensionFields"];</code>
     */
    public com.github.aptpod.proto.iscp2.v1.extensions.DownstreamResumeRequestExtensionFieldsOrBuilder getExtensionFieldsOrBuilder() {
      if (extensionFieldsBuilder_ != null) {
        return extensionFieldsBuilder_.getMessageOrBuilder();
      } else {
        return extensionFields_ == null ?
            com.github.aptpod.proto.iscp2.v1.extensions.DownstreamResumeRequestExtensionFields.getDefaultInstance() : extensionFields_;
      }
    }
    /**
     * <code>.iscp2.v1.extensions.DownstreamResumeRequestExtensionFields extension_fields = 4 [json_name = "extensionFields"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.github.aptpod.proto.iscp2.v1.extensions.DownstreamResumeRequestExtensionFields, com.github.aptpod.proto.iscp2.v1.extensions.DownstreamResumeRequestExtensionFields.Builder, com.github.aptpod.proto.iscp2.v1.extensions.DownstreamResumeRequestExtensionFieldsOrBuilder> 
        getExtensionFieldsFieldBuilder() {
      if (extensionFieldsBuilder_ == null) {
        extensionFieldsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.github.aptpod.proto.iscp2.v1.extensions.DownstreamResumeRequestExtensionFields, com.github.aptpod.proto.iscp2.v1.extensions.DownstreamResumeRequestExtensionFields.Builder, com.github.aptpod.proto.iscp2.v1.extensions.DownstreamResumeRequestExtensionFieldsOrBuilder>(
                getExtensionFields(),
                getParentForChildren(),
                isClean());
        extensionFields_ = null;
      }
      return extensionFieldsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:iscp2.v1.DownstreamResumeRequest)
  }

  // @@protoc_insertion_point(class_scope:iscp2.v1.DownstreamResumeRequest)
  private static final com.github.aptpod.proto.iscp2.v1.DownstreamResumeRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.aptpod.proto.iscp2.v1.DownstreamResumeRequest();
  }

  public static com.github.aptpod.proto.iscp2.v1.DownstreamResumeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DownstreamResumeRequest>
      PARSER = new com.google.protobuf.AbstractParser<DownstreamResumeRequest>() {
    @java.lang.Override
    public DownstreamResumeRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<DownstreamResumeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DownstreamResumeRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.aptpod.proto.iscp2.v1.DownstreamResumeRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

