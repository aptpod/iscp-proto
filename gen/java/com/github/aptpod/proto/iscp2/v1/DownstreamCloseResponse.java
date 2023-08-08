// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: iscp2/v1/downstream.proto

package com.github.aptpod.proto.iscp2.v1;

/**
 * Protobuf type {@code iscp2.v1.DownstreamCloseResponse}
 */
public final class DownstreamCloseResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:iscp2.v1.DownstreamCloseResponse)
    DownstreamCloseResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DownstreamCloseResponse.newBuilder() to construct.
  private DownstreamCloseResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DownstreamCloseResponse() {
    resultCode_ = 0;
    resultString_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DownstreamCloseResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.aptpod.proto.iscp2.v1.DownstreamProto.internal_static_iscp2_v1_DownstreamCloseResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.aptpod.proto.iscp2.v1.DownstreamProto.internal_static_iscp2_v1_DownstreamCloseResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.aptpod.proto.iscp2.v1.DownstreamCloseResponse.class, com.github.aptpod.proto.iscp2.v1.DownstreamCloseResponse.Builder.class);
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

  public static final int RESULT_CODE_FIELD_NUMBER = 2;
  private int resultCode_ = 0;
  /**
   * <code>.iscp2.v1.ResultCode result_code = 2 [json_name = "resultCode"];</code>
   * @return The enum numeric value on the wire for resultCode.
   */
  @java.lang.Override public int getResultCodeValue() {
    return resultCode_;
  }
  /**
   * <code>.iscp2.v1.ResultCode result_code = 2 [json_name = "resultCode"];</code>
   * @return The resultCode.
   */
  @java.lang.Override public com.github.aptpod.proto.iscp2.v1.ResultCode getResultCode() {
    com.github.aptpod.proto.iscp2.v1.ResultCode result = com.github.aptpod.proto.iscp2.v1.ResultCode.forNumber(resultCode_);
    return result == null ? com.github.aptpod.proto.iscp2.v1.ResultCode.UNRECOGNIZED : result;
  }

  public static final int RESULT_STRING_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object resultString_ = "";
  /**
   * <code>string result_string = 3 [json_name = "resultString"];</code>
   * @return The resultString.
   */
  @java.lang.Override
  public java.lang.String getResultString() {
    java.lang.Object ref = resultString_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resultString_ = s;
      return s;
    }
  }
  /**
   * <code>string result_string = 3 [json_name = "resultString"];</code>
   * @return The bytes for resultString.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getResultStringBytes() {
    java.lang.Object ref = resultString_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      resultString_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EXTENSION_FIELDS_FIELD_NUMBER = 4;
  private com.github.aptpod.proto.iscp2.v1.extensions.DownstreamCloseResponseExtensionFields extensionFields_;
  /**
   * <code>.iscp2.v1.extensions.DownstreamCloseResponseExtensionFields extension_fields = 4 [json_name = "extensionFields"];</code>
   * @return Whether the extensionFields field is set.
   */
  @java.lang.Override
  public boolean hasExtensionFields() {
    return extensionFields_ != null;
  }
  /**
   * <code>.iscp2.v1.extensions.DownstreamCloseResponseExtensionFields extension_fields = 4 [json_name = "extensionFields"];</code>
   * @return The extensionFields.
   */
  @java.lang.Override
  public com.github.aptpod.proto.iscp2.v1.extensions.DownstreamCloseResponseExtensionFields getExtensionFields() {
    return extensionFields_ == null ? com.github.aptpod.proto.iscp2.v1.extensions.DownstreamCloseResponseExtensionFields.getDefaultInstance() : extensionFields_;
  }
  /**
   * <code>.iscp2.v1.extensions.DownstreamCloseResponseExtensionFields extension_fields = 4 [json_name = "extensionFields"];</code>
   */
  @java.lang.Override
  public com.github.aptpod.proto.iscp2.v1.extensions.DownstreamCloseResponseExtensionFieldsOrBuilder getExtensionFieldsOrBuilder() {
    return extensionFields_ == null ? com.github.aptpod.proto.iscp2.v1.extensions.DownstreamCloseResponseExtensionFields.getDefaultInstance() : extensionFields_;
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
    if (resultCode_ != com.github.aptpod.proto.iscp2.v1.ResultCode.SUCCEEDED.getNumber()) {
      output.writeEnum(2, resultCode_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resultString_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, resultString_);
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
    if (resultCode_ != com.github.aptpod.proto.iscp2.v1.ResultCode.SUCCEEDED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, resultCode_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resultString_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, resultString_);
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
    if (!(obj instanceof com.github.aptpod.proto.iscp2.v1.DownstreamCloseResponse)) {
      return super.equals(obj);
    }
    com.github.aptpod.proto.iscp2.v1.DownstreamCloseResponse other = (com.github.aptpod.proto.iscp2.v1.DownstreamCloseResponse) obj;

    if (getRequestId()
        != other.getRequestId()) return false;
    if (resultCode_ != other.resultCode_) return false;
    if (!getResultString()
        .equals(other.getResultString())) return false;
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
    hash = (37 * hash) + RESULT_CODE_FIELD_NUMBER;
    hash = (53 * hash) + resultCode_;
    hash = (37 * hash) + RESULT_STRING_FIELD_NUMBER;
    hash = (53 * hash) + getResultString().hashCode();
    if (hasExtensionFields()) {
      hash = (37 * hash) + EXTENSION_FIELDS_FIELD_NUMBER;
      hash = (53 * hash) + getExtensionFields().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.aptpod.proto.iscp2.v1.DownstreamCloseResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.aptpod.proto.iscp2.v1.DownstreamCloseResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.aptpod.proto.iscp2.v1.DownstreamCloseResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.aptpod.proto.iscp2.v1.DownstreamCloseResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.aptpod.proto.iscp2.v1.DownstreamCloseResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.aptpod.proto.iscp2.v1.DownstreamCloseResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.aptpod.proto.iscp2.v1.DownstreamCloseResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.aptpod.proto.iscp2.v1.DownstreamCloseResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.github.aptpod.proto.iscp2.v1.DownstreamCloseResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.github.aptpod.proto.iscp2.v1.DownstreamCloseResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.aptpod.proto.iscp2.v1.DownstreamCloseResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.aptpod.proto.iscp2.v1.DownstreamCloseResponse parseFrom(
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
  public static Builder newBuilder(com.github.aptpod.proto.iscp2.v1.DownstreamCloseResponse prototype) {
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
   * Protobuf type {@code iscp2.v1.DownstreamCloseResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:iscp2.v1.DownstreamCloseResponse)
      com.github.aptpod.proto.iscp2.v1.DownstreamCloseResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.aptpod.proto.iscp2.v1.DownstreamProto.internal_static_iscp2_v1_DownstreamCloseResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.aptpod.proto.iscp2.v1.DownstreamProto.internal_static_iscp2_v1_DownstreamCloseResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.aptpod.proto.iscp2.v1.DownstreamCloseResponse.class, com.github.aptpod.proto.iscp2.v1.DownstreamCloseResponse.Builder.class);
    }

    // Construct using com.github.aptpod.proto.iscp2.v1.DownstreamCloseResponse.newBuilder()
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
      resultCode_ = 0;
      resultString_ = "";
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
      return com.github.aptpod.proto.iscp2.v1.DownstreamProto.internal_static_iscp2_v1_DownstreamCloseResponse_descriptor;
    }

    @java.lang.Override
    public com.github.aptpod.proto.iscp2.v1.DownstreamCloseResponse getDefaultInstanceForType() {
      return com.github.aptpod.proto.iscp2.v1.DownstreamCloseResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.aptpod.proto.iscp2.v1.DownstreamCloseResponse build() {
      com.github.aptpod.proto.iscp2.v1.DownstreamCloseResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.aptpod.proto.iscp2.v1.DownstreamCloseResponse buildPartial() {
      com.github.aptpod.proto.iscp2.v1.DownstreamCloseResponse result = new com.github.aptpod.proto.iscp2.v1.DownstreamCloseResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.github.aptpod.proto.iscp2.v1.DownstreamCloseResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.requestId_ = requestId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.resultCode_ = resultCode_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.resultString_ = resultString_;
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
      if (other instanceof com.github.aptpod.proto.iscp2.v1.DownstreamCloseResponse) {
        return mergeFrom((com.github.aptpod.proto.iscp2.v1.DownstreamCloseResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.aptpod.proto.iscp2.v1.DownstreamCloseResponse other) {
      if (other == com.github.aptpod.proto.iscp2.v1.DownstreamCloseResponse.getDefaultInstance()) return this;
      if (other.getRequestId() != 0) {
        setRequestId(other.getRequestId());
      }
      if (other.resultCode_ != 0) {
        setResultCodeValue(other.getResultCodeValue());
      }
      if (!other.getResultString().isEmpty()) {
        resultString_ = other.resultString_;
        bitField0_ |= 0x00000004;
        onChanged();
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
            case 16: {
              resultCode_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              resultString_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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

    private int resultCode_ = 0;
    /**
     * <code>.iscp2.v1.ResultCode result_code = 2 [json_name = "resultCode"];</code>
     * @return The enum numeric value on the wire for resultCode.
     */
    @java.lang.Override public int getResultCodeValue() {
      return resultCode_;
    }
    /**
     * <code>.iscp2.v1.ResultCode result_code = 2 [json_name = "resultCode"];</code>
     * @param value The enum numeric value on the wire for resultCode to set.
     * @return This builder for chaining.
     */
    public Builder setResultCodeValue(int value) {
      resultCode_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.iscp2.v1.ResultCode result_code = 2 [json_name = "resultCode"];</code>
     * @return The resultCode.
     */
    @java.lang.Override
    public com.github.aptpod.proto.iscp2.v1.ResultCode getResultCode() {
      com.github.aptpod.proto.iscp2.v1.ResultCode result = com.github.aptpod.proto.iscp2.v1.ResultCode.forNumber(resultCode_);
      return result == null ? com.github.aptpod.proto.iscp2.v1.ResultCode.UNRECOGNIZED : result;
    }
    /**
     * <code>.iscp2.v1.ResultCode result_code = 2 [json_name = "resultCode"];</code>
     * @param value The resultCode to set.
     * @return This builder for chaining.
     */
    public Builder setResultCode(com.github.aptpod.proto.iscp2.v1.ResultCode value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      resultCode_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.iscp2.v1.ResultCode result_code = 2 [json_name = "resultCode"];</code>
     * @return This builder for chaining.
     */
    public Builder clearResultCode() {
      bitField0_ = (bitField0_ & ~0x00000002);
      resultCode_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object resultString_ = "";
    /**
     * <code>string result_string = 3 [json_name = "resultString"];</code>
     * @return The resultString.
     */
    public java.lang.String getResultString() {
      java.lang.Object ref = resultString_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resultString_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string result_string = 3 [json_name = "resultString"];</code>
     * @return The bytes for resultString.
     */
    public com.google.protobuf.ByteString
        getResultStringBytes() {
      java.lang.Object ref = resultString_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        resultString_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string result_string = 3 [json_name = "resultString"];</code>
     * @param value The resultString to set.
     * @return This builder for chaining.
     */
    public Builder setResultString(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      resultString_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string result_string = 3 [json_name = "resultString"];</code>
     * @return This builder for chaining.
     */
    public Builder clearResultString() {
      resultString_ = getDefaultInstance().getResultString();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string result_string = 3 [json_name = "resultString"];</code>
     * @param value The bytes for resultString to set.
     * @return This builder for chaining.
     */
    public Builder setResultStringBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      resultString_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private com.github.aptpod.proto.iscp2.v1.extensions.DownstreamCloseResponseExtensionFields extensionFields_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.github.aptpod.proto.iscp2.v1.extensions.DownstreamCloseResponseExtensionFields, com.github.aptpod.proto.iscp2.v1.extensions.DownstreamCloseResponseExtensionFields.Builder, com.github.aptpod.proto.iscp2.v1.extensions.DownstreamCloseResponseExtensionFieldsOrBuilder> extensionFieldsBuilder_;
    /**
     * <code>.iscp2.v1.extensions.DownstreamCloseResponseExtensionFields extension_fields = 4 [json_name = "extensionFields"];</code>
     * @return Whether the extensionFields field is set.
     */
    public boolean hasExtensionFields() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>.iscp2.v1.extensions.DownstreamCloseResponseExtensionFields extension_fields = 4 [json_name = "extensionFields"];</code>
     * @return The extensionFields.
     */
    public com.github.aptpod.proto.iscp2.v1.extensions.DownstreamCloseResponseExtensionFields getExtensionFields() {
      if (extensionFieldsBuilder_ == null) {
        return extensionFields_ == null ? com.github.aptpod.proto.iscp2.v1.extensions.DownstreamCloseResponseExtensionFields.getDefaultInstance() : extensionFields_;
      } else {
        return extensionFieldsBuilder_.getMessage();
      }
    }
    /**
     * <code>.iscp2.v1.extensions.DownstreamCloseResponseExtensionFields extension_fields = 4 [json_name = "extensionFields"];</code>
     */
    public Builder setExtensionFields(com.github.aptpod.proto.iscp2.v1.extensions.DownstreamCloseResponseExtensionFields value) {
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
     * <code>.iscp2.v1.extensions.DownstreamCloseResponseExtensionFields extension_fields = 4 [json_name = "extensionFields"];</code>
     */
    public Builder setExtensionFields(
        com.github.aptpod.proto.iscp2.v1.extensions.DownstreamCloseResponseExtensionFields.Builder builderForValue) {
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
     * <code>.iscp2.v1.extensions.DownstreamCloseResponseExtensionFields extension_fields = 4 [json_name = "extensionFields"];</code>
     */
    public Builder mergeExtensionFields(com.github.aptpod.proto.iscp2.v1.extensions.DownstreamCloseResponseExtensionFields value) {
      if (extensionFieldsBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          extensionFields_ != null &&
          extensionFields_ != com.github.aptpod.proto.iscp2.v1.extensions.DownstreamCloseResponseExtensionFields.getDefaultInstance()) {
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
     * <code>.iscp2.v1.extensions.DownstreamCloseResponseExtensionFields extension_fields = 4 [json_name = "extensionFields"];</code>
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
     * <code>.iscp2.v1.extensions.DownstreamCloseResponseExtensionFields extension_fields = 4 [json_name = "extensionFields"];</code>
     */
    public com.github.aptpod.proto.iscp2.v1.extensions.DownstreamCloseResponseExtensionFields.Builder getExtensionFieldsBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getExtensionFieldsFieldBuilder().getBuilder();
    }
    /**
     * <code>.iscp2.v1.extensions.DownstreamCloseResponseExtensionFields extension_fields = 4 [json_name = "extensionFields"];</code>
     */
    public com.github.aptpod.proto.iscp2.v1.extensions.DownstreamCloseResponseExtensionFieldsOrBuilder getExtensionFieldsOrBuilder() {
      if (extensionFieldsBuilder_ != null) {
        return extensionFieldsBuilder_.getMessageOrBuilder();
      } else {
        return extensionFields_ == null ?
            com.github.aptpod.proto.iscp2.v1.extensions.DownstreamCloseResponseExtensionFields.getDefaultInstance() : extensionFields_;
      }
    }
    /**
     * <code>.iscp2.v1.extensions.DownstreamCloseResponseExtensionFields extension_fields = 4 [json_name = "extensionFields"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.github.aptpod.proto.iscp2.v1.extensions.DownstreamCloseResponseExtensionFields, com.github.aptpod.proto.iscp2.v1.extensions.DownstreamCloseResponseExtensionFields.Builder, com.github.aptpod.proto.iscp2.v1.extensions.DownstreamCloseResponseExtensionFieldsOrBuilder> 
        getExtensionFieldsFieldBuilder() {
      if (extensionFieldsBuilder_ == null) {
        extensionFieldsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.github.aptpod.proto.iscp2.v1.extensions.DownstreamCloseResponseExtensionFields, com.github.aptpod.proto.iscp2.v1.extensions.DownstreamCloseResponseExtensionFields.Builder, com.github.aptpod.proto.iscp2.v1.extensions.DownstreamCloseResponseExtensionFieldsOrBuilder>(
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


    // @@protoc_insertion_point(builder_scope:iscp2.v1.DownstreamCloseResponse)
  }

  // @@protoc_insertion_point(class_scope:iscp2.v1.DownstreamCloseResponse)
  private static final com.github.aptpod.proto.iscp2.v1.DownstreamCloseResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.aptpod.proto.iscp2.v1.DownstreamCloseResponse();
  }

  public static com.github.aptpod.proto.iscp2.v1.DownstreamCloseResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DownstreamCloseResponse>
      PARSER = new com.google.protobuf.AbstractParser<DownstreamCloseResponse>() {
    @java.lang.Override
    public DownstreamCloseResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<DownstreamCloseResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DownstreamCloseResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.aptpod.proto.iscp2.v1.DownstreamCloseResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

