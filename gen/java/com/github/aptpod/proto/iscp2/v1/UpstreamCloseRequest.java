// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: iscp2/v1/upstream.proto

package com.github.aptpod.proto.iscp2.v1;

/**
 * Protobuf type {@code iscp2.v1.UpstreamCloseRequest}
 */
public final class UpstreamCloseRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:iscp2.v1.UpstreamCloseRequest)
    UpstreamCloseRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpstreamCloseRequest.newBuilder() to construct.
  private UpstreamCloseRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpstreamCloseRequest() {
    streamId_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpstreamCloseRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.aptpod.proto.iscp2.v1.UpstreamProto.internal_static_iscp2_v1_UpstreamCloseRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.aptpod.proto.iscp2.v1.UpstreamProto.internal_static_iscp2_v1_UpstreamCloseRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.aptpod.proto.iscp2.v1.UpstreamCloseRequest.class, com.github.aptpod.proto.iscp2.v1.UpstreamCloseRequest.Builder.class);
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

  public static final int TOTAL_DATA_POINTS_FIELD_NUMBER = 3;
  private long totalDataPoints_ = 0L;
  /**
   * <code>uint64 total_data_points = 3 [json_name = "totalDataPoints"];</code>
   * @return The totalDataPoints.
   */
  @java.lang.Override
  public long getTotalDataPoints() {
    return totalDataPoints_;
  }

  public static final int FINAL_SEQUENCE_NUMBER_FIELD_NUMBER = 4;
  private int finalSequenceNumber_ = 0;
  /**
   * <code>uint32 final_sequence_number = 4 [json_name = "finalSequenceNumber"];</code>
   * @return The finalSequenceNumber.
   */
  @java.lang.Override
  public int getFinalSequenceNumber() {
    return finalSequenceNumber_;
  }

  public static final int EXTENSION_FIELDS_FIELD_NUMBER = 5;
  private com.github.aptpod.proto.iscp2.v1.extensions.UpstreamCloseRequestExtensionFields extensionFields_;
  /**
   * <code>.iscp2.v1.extensions.UpstreamCloseRequestExtensionFields extension_fields = 5 [json_name = "extensionFields"];</code>
   * @return Whether the extensionFields field is set.
   */
  @java.lang.Override
  public boolean hasExtensionFields() {
    return extensionFields_ != null;
  }
  /**
   * <code>.iscp2.v1.extensions.UpstreamCloseRequestExtensionFields extension_fields = 5 [json_name = "extensionFields"];</code>
   * @return The extensionFields.
   */
  @java.lang.Override
  public com.github.aptpod.proto.iscp2.v1.extensions.UpstreamCloseRequestExtensionFields getExtensionFields() {
    return extensionFields_ == null ? com.github.aptpod.proto.iscp2.v1.extensions.UpstreamCloseRequestExtensionFields.getDefaultInstance() : extensionFields_;
  }
  /**
   * <code>.iscp2.v1.extensions.UpstreamCloseRequestExtensionFields extension_fields = 5 [json_name = "extensionFields"];</code>
   */
  @java.lang.Override
  public com.github.aptpod.proto.iscp2.v1.extensions.UpstreamCloseRequestExtensionFieldsOrBuilder getExtensionFieldsOrBuilder() {
    return extensionFields_ == null ? com.github.aptpod.proto.iscp2.v1.extensions.UpstreamCloseRequestExtensionFields.getDefaultInstance() : extensionFields_;
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
    if (totalDataPoints_ != 0L) {
      output.writeUInt64(3, totalDataPoints_);
    }
    if (finalSequenceNumber_ != 0) {
      output.writeUInt32(4, finalSequenceNumber_);
    }
    if (extensionFields_ != null) {
      output.writeMessage(5, getExtensionFields());
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
    if (totalDataPoints_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(3, totalDataPoints_);
    }
    if (finalSequenceNumber_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(4, finalSequenceNumber_);
    }
    if (extensionFields_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getExtensionFields());
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
    if (!(obj instanceof com.github.aptpod.proto.iscp2.v1.UpstreamCloseRequest)) {
      return super.equals(obj);
    }
    com.github.aptpod.proto.iscp2.v1.UpstreamCloseRequest other = (com.github.aptpod.proto.iscp2.v1.UpstreamCloseRequest) obj;

    if (getRequestId()
        != other.getRequestId()) return false;
    if (!getStreamId()
        .equals(other.getStreamId())) return false;
    if (getTotalDataPoints()
        != other.getTotalDataPoints()) return false;
    if (getFinalSequenceNumber()
        != other.getFinalSequenceNumber()) return false;
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
    hash = (37 * hash) + TOTAL_DATA_POINTS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTotalDataPoints());
    hash = (37 * hash) + FINAL_SEQUENCE_NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getFinalSequenceNumber();
    if (hasExtensionFields()) {
      hash = (37 * hash) + EXTENSION_FIELDS_FIELD_NUMBER;
      hash = (53 * hash) + getExtensionFields().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.aptpod.proto.iscp2.v1.UpstreamCloseRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.aptpod.proto.iscp2.v1.UpstreamCloseRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.aptpod.proto.iscp2.v1.UpstreamCloseRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.aptpod.proto.iscp2.v1.UpstreamCloseRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.aptpod.proto.iscp2.v1.UpstreamCloseRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.aptpod.proto.iscp2.v1.UpstreamCloseRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.aptpod.proto.iscp2.v1.UpstreamCloseRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.aptpod.proto.iscp2.v1.UpstreamCloseRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.github.aptpod.proto.iscp2.v1.UpstreamCloseRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.github.aptpod.proto.iscp2.v1.UpstreamCloseRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.aptpod.proto.iscp2.v1.UpstreamCloseRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.aptpod.proto.iscp2.v1.UpstreamCloseRequest parseFrom(
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
  public static Builder newBuilder(com.github.aptpod.proto.iscp2.v1.UpstreamCloseRequest prototype) {
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
   * Protobuf type {@code iscp2.v1.UpstreamCloseRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:iscp2.v1.UpstreamCloseRequest)
      com.github.aptpod.proto.iscp2.v1.UpstreamCloseRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.aptpod.proto.iscp2.v1.UpstreamProto.internal_static_iscp2_v1_UpstreamCloseRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.aptpod.proto.iscp2.v1.UpstreamProto.internal_static_iscp2_v1_UpstreamCloseRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.aptpod.proto.iscp2.v1.UpstreamCloseRequest.class, com.github.aptpod.proto.iscp2.v1.UpstreamCloseRequest.Builder.class);
    }

    // Construct using com.github.aptpod.proto.iscp2.v1.UpstreamCloseRequest.newBuilder()
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
      totalDataPoints_ = 0L;
      finalSequenceNumber_ = 0;
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
      return com.github.aptpod.proto.iscp2.v1.UpstreamProto.internal_static_iscp2_v1_UpstreamCloseRequest_descriptor;
    }

    @java.lang.Override
    public com.github.aptpod.proto.iscp2.v1.UpstreamCloseRequest getDefaultInstanceForType() {
      return com.github.aptpod.proto.iscp2.v1.UpstreamCloseRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.aptpod.proto.iscp2.v1.UpstreamCloseRequest build() {
      com.github.aptpod.proto.iscp2.v1.UpstreamCloseRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.aptpod.proto.iscp2.v1.UpstreamCloseRequest buildPartial() {
      com.github.aptpod.proto.iscp2.v1.UpstreamCloseRequest result = new com.github.aptpod.proto.iscp2.v1.UpstreamCloseRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.github.aptpod.proto.iscp2.v1.UpstreamCloseRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.requestId_ = requestId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.streamId_ = streamId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.totalDataPoints_ = totalDataPoints_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.finalSequenceNumber_ = finalSequenceNumber_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
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
      if (other instanceof com.github.aptpod.proto.iscp2.v1.UpstreamCloseRequest) {
        return mergeFrom((com.github.aptpod.proto.iscp2.v1.UpstreamCloseRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.aptpod.proto.iscp2.v1.UpstreamCloseRequest other) {
      if (other == com.github.aptpod.proto.iscp2.v1.UpstreamCloseRequest.getDefaultInstance()) return this;
      if (other.getRequestId() != 0) {
        setRequestId(other.getRequestId());
      }
      if (other.getStreamId() != com.google.protobuf.ByteString.EMPTY) {
        setStreamId(other.getStreamId());
      }
      if (other.getTotalDataPoints() != 0L) {
        setTotalDataPoints(other.getTotalDataPoints());
      }
      if (other.getFinalSequenceNumber() != 0) {
        setFinalSequenceNumber(other.getFinalSequenceNumber());
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
              totalDataPoints_ = input.readUInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              finalSequenceNumber_ = input.readUInt32();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 42: {
              input.readMessage(
                  getExtensionFieldsFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000010;
              break;
            } // case 42
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

    private long totalDataPoints_ ;
    /**
     * <code>uint64 total_data_points = 3 [json_name = "totalDataPoints"];</code>
     * @return The totalDataPoints.
     */
    @java.lang.Override
    public long getTotalDataPoints() {
      return totalDataPoints_;
    }
    /**
     * <code>uint64 total_data_points = 3 [json_name = "totalDataPoints"];</code>
     * @param value The totalDataPoints to set.
     * @return This builder for chaining.
     */
    public Builder setTotalDataPoints(long value) {

      totalDataPoints_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 total_data_points = 3 [json_name = "totalDataPoints"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTotalDataPoints() {
      bitField0_ = (bitField0_ & ~0x00000004);
      totalDataPoints_ = 0L;
      onChanged();
      return this;
    }

    private int finalSequenceNumber_ ;
    /**
     * <code>uint32 final_sequence_number = 4 [json_name = "finalSequenceNumber"];</code>
     * @return The finalSequenceNumber.
     */
    @java.lang.Override
    public int getFinalSequenceNumber() {
      return finalSequenceNumber_;
    }
    /**
     * <code>uint32 final_sequence_number = 4 [json_name = "finalSequenceNumber"];</code>
     * @param value The finalSequenceNumber to set.
     * @return This builder for chaining.
     */
    public Builder setFinalSequenceNumber(int value) {

      finalSequenceNumber_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 final_sequence_number = 4 [json_name = "finalSequenceNumber"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFinalSequenceNumber() {
      bitField0_ = (bitField0_ & ~0x00000008);
      finalSequenceNumber_ = 0;
      onChanged();
      return this;
    }

    private com.github.aptpod.proto.iscp2.v1.extensions.UpstreamCloseRequestExtensionFields extensionFields_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.github.aptpod.proto.iscp2.v1.extensions.UpstreamCloseRequestExtensionFields, com.github.aptpod.proto.iscp2.v1.extensions.UpstreamCloseRequestExtensionFields.Builder, com.github.aptpod.proto.iscp2.v1.extensions.UpstreamCloseRequestExtensionFieldsOrBuilder> extensionFieldsBuilder_;
    /**
     * <code>.iscp2.v1.extensions.UpstreamCloseRequestExtensionFields extension_fields = 5 [json_name = "extensionFields"];</code>
     * @return Whether the extensionFields field is set.
     */
    public boolean hasExtensionFields() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <code>.iscp2.v1.extensions.UpstreamCloseRequestExtensionFields extension_fields = 5 [json_name = "extensionFields"];</code>
     * @return The extensionFields.
     */
    public com.github.aptpod.proto.iscp2.v1.extensions.UpstreamCloseRequestExtensionFields getExtensionFields() {
      if (extensionFieldsBuilder_ == null) {
        return extensionFields_ == null ? com.github.aptpod.proto.iscp2.v1.extensions.UpstreamCloseRequestExtensionFields.getDefaultInstance() : extensionFields_;
      } else {
        return extensionFieldsBuilder_.getMessage();
      }
    }
    /**
     * <code>.iscp2.v1.extensions.UpstreamCloseRequestExtensionFields extension_fields = 5 [json_name = "extensionFields"];</code>
     */
    public Builder setExtensionFields(com.github.aptpod.proto.iscp2.v1.extensions.UpstreamCloseRequestExtensionFields value) {
      if (extensionFieldsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        extensionFields_ = value;
      } else {
        extensionFieldsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>.iscp2.v1.extensions.UpstreamCloseRequestExtensionFields extension_fields = 5 [json_name = "extensionFields"];</code>
     */
    public Builder setExtensionFields(
        com.github.aptpod.proto.iscp2.v1.extensions.UpstreamCloseRequestExtensionFields.Builder builderForValue) {
      if (extensionFieldsBuilder_ == null) {
        extensionFields_ = builderForValue.build();
      } else {
        extensionFieldsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>.iscp2.v1.extensions.UpstreamCloseRequestExtensionFields extension_fields = 5 [json_name = "extensionFields"];</code>
     */
    public Builder mergeExtensionFields(com.github.aptpod.proto.iscp2.v1.extensions.UpstreamCloseRequestExtensionFields value) {
      if (extensionFieldsBuilder_ == null) {
        if (((bitField0_ & 0x00000010) != 0) &&
          extensionFields_ != null &&
          extensionFields_ != com.github.aptpod.proto.iscp2.v1.extensions.UpstreamCloseRequestExtensionFields.getDefaultInstance()) {
          getExtensionFieldsBuilder().mergeFrom(value);
        } else {
          extensionFields_ = value;
        }
      } else {
        extensionFieldsBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>.iscp2.v1.extensions.UpstreamCloseRequestExtensionFields extension_fields = 5 [json_name = "extensionFields"];</code>
     */
    public Builder clearExtensionFields() {
      bitField0_ = (bitField0_ & ~0x00000010);
      extensionFields_ = null;
      if (extensionFieldsBuilder_ != null) {
        extensionFieldsBuilder_.dispose();
        extensionFieldsBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.iscp2.v1.extensions.UpstreamCloseRequestExtensionFields extension_fields = 5 [json_name = "extensionFields"];</code>
     */
    public com.github.aptpod.proto.iscp2.v1.extensions.UpstreamCloseRequestExtensionFields.Builder getExtensionFieldsBuilder() {
      bitField0_ |= 0x00000010;
      onChanged();
      return getExtensionFieldsFieldBuilder().getBuilder();
    }
    /**
     * <code>.iscp2.v1.extensions.UpstreamCloseRequestExtensionFields extension_fields = 5 [json_name = "extensionFields"];</code>
     */
    public com.github.aptpod.proto.iscp2.v1.extensions.UpstreamCloseRequestExtensionFieldsOrBuilder getExtensionFieldsOrBuilder() {
      if (extensionFieldsBuilder_ != null) {
        return extensionFieldsBuilder_.getMessageOrBuilder();
      } else {
        return extensionFields_ == null ?
            com.github.aptpod.proto.iscp2.v1.extensions.UpstreamCloseRequestExtensionFields.getDefaultInstance() : extensionFields_;
      }
    }
    /**
     * <code>.iscp2.v1.extensions.UpstreamCloseRequestExtensionFields extension_fields = 5 [json_name = "extensionFields"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.github.aptpod.proto.iscp2.v1.extensions.UpstreamCloseRequestExtensionFields, com.github.aptpod.proto.iscp2.v1.extensions.UpstreamCloseRequestExtensionFields.Builder, com.github.aptpod.proto.iscp2.v1.extensions.UpstreamCloseRequestExtensionFieldsOrBuilder> 
        getExtensionFieldsFieldBuilder() {
      if (extensionFieldsBuilder_ == null) {
        extensionFieldsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.github.aptpod.proto.iscp2.v1.extensions.UpstreamCloseRequestExtensionFields, com.github.aptpod.proto.iscp2.v1.extensions.UpstreamCloseRequestExtensionFields.Builder, com.github.aptpod.proto.iscp2.v1.extensions.UpstreamCloseRequestExtensionFieldsOrBuilder>(
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


    // @@protoc_insertion_point(builder_scope:iscp2.v1.UpstreamCloseRequest)
  }

  // @@protoc_insertion_point(class_scope:iscp2.v1.UpstreamCloseRequest)
  private static final com.github.aptpod.proto.iscp2.v1.UpstreamCloseRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.aptpod.proto.iscp2.v1.UpstreamCloseRequest();
  }

  public static com.github.aptpod.proto.iscp2.v1.UpstreamCloseRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpstreamCloseRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpstreamCloseRequest>() {
    @java.lang.Override
    public UpstreamCloseRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpstreamCloseRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpstreamCloseRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.aptpod.proto.iscp2.v1.UpstreamCloseRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

