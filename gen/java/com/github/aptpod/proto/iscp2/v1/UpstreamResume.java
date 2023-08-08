// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: iscp2/v1/metadata.proto

package com.github.aptpod.proto.iscp2.v1;

/**
 * Protobuf type {@code iscp2.v1.UpstreamResume}
 */
public final class UpstreamResume extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:iscp2.v1.UpstreamResume)
    UpstreamResumeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpstreamResume.newBuilder() to construct.
  private UpstreamResume(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpstreamResume() {
    streamId_ = com.google.protobuf.ByteString.EMPTY;
    sessionId_ = "";
    qos_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpstreamResume();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.aptpod.proto.iscp2.v1.MetadataProto.internal_static_iscp2_v1_UpstreamResume_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.aptpod.proto.iscp2.v1.MetadataProto.internal_static_iscp2_v1_UpstreamResume_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.aptpod.proto.iscp2.v1.UpstreamResume.class, com.github.aptpod.proto.iscp2.v1.UpstreamResume.Builder.class);
  }

  public static final int STREAM_ID_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString streamId_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes stream_id = 1 [json_name = "streamId"];</code>
   * @return The streamId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getStreamId() {
    return streamId_;
  }

  public static final int SESSION_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object sessionId_ = "";
  /**
   * <code>string session_id = 2 [json_name = "sessionId"];</code>
   * @return The sessionId.
   */
  @java.lang.Override
  public java.lang.String getSessionId() {
    java.lang.Object ref = sessionId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sessionId_ = s;
      return s;
    }
  }
  /**
   * <code>string session_id = 2 [json_name = "sessionId"];</code>
   * @return The bytes for sessionId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSessionIdBytes() {
    java.lang.Object ref = sessionId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sessionId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int QOS_FIELD_NUMBER = 3;
  private int qos_ = 0;
  /**
   * <code>.iscp2.v1.QoS qos = 3 [json_name = "qos"];</code>
   * @return The enum numeric value on the wire for qos.
   */
  @java.lang.Override public int getQosValue() {
    return qos_;
  }
  /**
   * <code>.iscp2.v1.QoS qos = 3 [json_name = "qos"];</code>
   * @return The qos.
   */
  @java.lang.Override public com.github.aptpod.proto.iscp2.v1.QoS getQos() {
    com.github.aptpod.proto.iscp2.v1.QoS result = com.github.aptpod.proto.iscp2.v1.QoS.forNumber(qos_);
    return result == null ? com.github.aptpod.proto.iscp2.v1.QoS.UNRECOGNIZED : result;
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
    if (!streamId_.isEmpty()) {
      output.writeBytes(1, streamId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sessionId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, sessionId_);
    }
    if (qos_ != com.github.aptpod.proto.iscp2.v1.QoS.UNRELIABLE.getNumber()) {
      output.writeEnum(3, qos_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!streamId_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, streamId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sessionId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, sessionId_);
    }
    if (qos_ != com.github.aptpod.proto.iscp2.v1.QoS.UNRELIABLE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, qos_);
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
    if (!(obj instanceof com.github.aptpod.proto.iscp2.v1.UpstreamResume)) {
      return super.equals(obj);
    }
    com.github.aptpod.proto.iscp2.v1.UpstreamResume other = (com.github.aptpod.proto.iscp2.v1.UpstreamResume) obj;

    if (!getStreamId()
        .equals(other.getStreamId())) return false;
    if (!getSessionId()
        .equals(other.getSessionId())) return false;
    if (qos_ != other.qos_) return false;
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
    hash = (37 * hash) + STREAM_ID_FIELD_NUMBER;
    hash = (53 * hash) + getStreamId().hashCode();
    hash = (37 * hash) + SESSION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getSessionId().hashCode();
    hash = (37 * hash) + QOS_FIELD_NUMBER;
    hash = (53 * hash) + qos_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.aptpod.proto.iscp2.v1.UpstreamResume parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.aptpod.proto.iscp2.v1.UpstreamResume parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.aptpod.proto.iscp2.v1.UpstreamResume parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.aptpod.proto.iscp2.v1.UpstreamResume parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.aptpod.proto.iscp2.v1.UpstreamResume parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.aptpod.proto.iscp2.v1.UpstreamResume parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.aptpod.proto.iscp2.v1.UpstreamResume parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.aptpod.proto.iscp2.v1.UpstreamResume parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.github.aptpod.proto.iscp2.v1.UpstreamResume parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.github.aptpod.proto.iscp2.v1.UpstreamResume parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.aptpod.proto.iscp2.v1.UpstreamResume parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.aptpod.proto.iscp2.v1.UpstreamResume parseFrom(
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
  public static Builder newBuilder(com.github.aptpod.proto.iscp2.v1.UpstreamResume prototype) {
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
   * Protobuf type {@code iscp2.v1.UpstreamResume}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:iscp2.v1.UpstreamResume)
      com.github.aptpod.proto.iscp2.v1.UpstreamResumeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.aptpod.proto.iscp2.v1.MetadataProto.internal_static_iscp2_v1_UpstreamResume_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.aptpod.proto.iscp2.v1.MetadataProto.internal_static_iscp2_v1_UpstreamResume_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.aptpod.proto.iscp2.v1.UpstreamResume.class, com.github.aptpod.proto.iscp2.v1.UpstreamResume.Builder.class);
    }

    // Construct using com.github.aptpod.proto.iscp2.v1.UpstreamResume.newBuilder()
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
      streamId_ = com.google.protobuf.ByteString.EMPTY;
      sessionId_ = "";
      qos_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.aptpod.proto.iscp2.v1.MetadataProto.internal_static_iscp2_v1_UpstreamResume_descriptor;
    }

    @java.lang.Override
    public com.github.aptpod.proto.iscp2.v1.UpstreamResume getDefaultInstanceForType() {
      return com.github.aptpod.proto.iscp2.v1.UpstreamResume.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.aptpod.proto.iscp2.v1.UpstreamResume build() {
      com.github.aptpod.proto.iscp2.v1.UpstreamResume result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.aptpod.proto.iscp2.v1.UpstreamResume buildPartial() {
      com.github.aptpod.proto.iscp2.v1.UpstreamResume result = new com.github.aptpod.proto.iscp2.v1.UpstreamResume(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.github.aptpod.proto.iscp2.v1.UpstreamResume result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.streamId_ = streamId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.sessionId_ = sessionId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.qos_ = qos_;
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
      if (other instanceof com.github.aptpod.proto.iscp2.v1.UpstreamResume) {
        return mergeFrom((com.github.aptpod.proto.iscp2.v1.UpstreamResume)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.aptpod.proto.iscp2.v1.UpstreamResume other) {
      if (other == com.github.aptpod.proto.iscp2.v1.UpstreamResume.getDefaultInstance()) return this;
      if (other.getStreamId() != com.google.protobuf.ByteString.EMPTY) {
        setStreamId(other.getStreamId());
      }
      if (!other.getSessionId().isEmpty()) {
        sessionId_ = other.sessionId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.qos_ != 0) {
        setQosValue(other.getQosValue());
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
              streamId_ = input.readBytes();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              sessionId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              qos_ = input.readEnum();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
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

    private com.google.protobuf.ByteString streamId_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes stream_id = 1 [json_name = "streamId"];</code>
     * @return The streamId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getStreamId() {
      return streamId_;
    }
    /**
     * <code>bytes stream_id = 1 [json_name = "streamId"];</code>
     * @param value The streamId to set.
     * @return This builder for chaining.
     */
    public Builder setStreamId(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      streamId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>bytes stream_id = 1 [json_name = "streamId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearStreamId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      streamId_ = getDefaultInstance().getStreamId();
      onChanged();
      return this;
    }

    private java.lang.Object sessionId_ = "";
    /**
     * <code>string session_id = 2 [json_name = "sessionId"];</code>
     * @return The sessionId.
     */
    public java.lang.String getSessionId() {
      java.lang.Object ref = sessionId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sessionId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string session_id = 2 [json_name = "sessionId"];</code>
     * @return The bytes for sessionId.
     */
    public com.google.protobuf.ByteString
        getSessionIdBytes() {
      java.lang.Object ref = sessionId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sessionId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string session_id = 2 [json_name = "sessionId"];</code>
     * @param value The sessionId to set.
     * @return This builder for chaining.
     */
    public Builder setSessionId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      sessionId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string session_id = 2 [json_name = "sessionId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSessionId() {
      sessionId_ = getDefaultInstance().getSessionId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string session_id = 2 [json_name = "sessionId"];</code>
     * @param value The bytes for sessionId to set.
     * @return This builder for chaining.
     */
    public Builder setSessionIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      sessionId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private int qos_ = 0;
    /**
     * <code>.iscp2.v1.QoS qos = 3 [json_name = "qos"];</code>
     * @return The enum numeric value on the wire for qos.
     */
    @java.lang.Override public int getQosValue() {
      return qos_;
    }
    /**
     * <code>.iscp2.v1.QoS qos = 3 [json_name = "qos"];</code>
     * @param value The enum numeric value on the wire for qos to set.
     * @return This builder for chaining.
     */
    public Builder setQosValue(int value) {
      qos_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.iscp2.v1.QoS qos = 3 [json_name = "qos"];</code>
     * @return The qos.
     */
    @java.lang.Override
    public com.github.aptpod.proto.iscp2.v1.QoS getQos() {
      com.github.aptpod.proto.iscp2.v1.QoS result = com.github.aptpod.proto.iscp2.v1.QoS.forNumber(qos_);
      return result == null ? com.github.aptpod.proto.iscp2.v1.QoS.UNRECOGNIZED : result;
    }
    /**
     * <code>.iscp2.v1.QoS qos = 3 [json_name = "qos"];</code>
     * @param value The qos to set.
     * @return This builder for chaining.
     */
    public Builder setQos(com.github.aptpod.proto.iscp2.v1.QoS value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      qos_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.iscp2.v1.QoS qos = 3 [json_name = "qos"];</code>
     * @return This builder for chaining.
     */
    public Builder clearQos() {
      bitField0_ = (bitField0_ & ~0x00000004);
      qos_ = 0;
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


    // @@protoc_insertion_point(builder_scope:iscp2.v1.UpstreamResume)
  }

  // @@protoc_insertion_point(class_scope:iscp2.v1.UpstreamResume)
  private static final com.github.aptpod.proto.iscp2.v1.UpstreamResume DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.aptpod.proto.iscp2.v1.UpstreamResume();
  }

  public static com.github.aptpod.proto.iscp2.v1.UpstreamResume getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpstreamResume>
      PARSER = new com.google.protobuf.AbstractParser<UpstreamResume>() {
    @java.lang.Override
    public UpstreamResume parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpstreamResume> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpstreamResume> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.aptpod.proto.iscp2.v1.UpstreamResume getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

