// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: iscp2/v1/downstream.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.github.aptpod.proto.iscp2.v1;

@kotlin.jvm.JvmName("-initializedownstreamChunkAckComplete")
public inline fun downstreamChunkAckComplete(block: com.github.aptpod.proto.iscp2.v1.DownstreamChunkAckCompleteKt.Dsl.() -> kotlin.Unit): com.github.aptpod.proto.iscp2.v1.DownstreamChunkAckComplete =
  com.github.aptpod.proto.iscp2.v1.DownstreamChunkAckCompleteKt.Dsl._create(com.github.aptpod.proto.iscp2.v1.DownstreamChunkAckComplete.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `iscp2.v1.DownstreamChunkAckComplete`
 */
public object DownstreamChunkAckCompleteKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.github.aptpod.proto.iscp2.v1.DownstreamChunkAckComplete.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.github.aptpod.proto.iscp2.v1.DownstreamChunkAckComplete.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.github.aptpod.proto.iscp2.v1.DownstreamChunkAckComplete = _builder.build()

    /**
     * `uint32 stream_id_alias = 1 [json_name = "streamIdAlias"];`
     */
    public var streamIdAlias: kotlin.Int
      @JvmName("getStreamIdAlias")
      get() = _builder.getStreamIdAlias()
      @JvmName("setStreamIdAlias")
      set(value) {
        _builder.setStreamIdAlias(value)
      }
    /**
     * `uint32 stream_id_alias = 1 [json_name = "streamIdAlias"];`
     */
    public fun clearStreamIdAlias() {
      _builder.clearStreamIdAlias()
    }

    /**
     * `uint32 ack_id = 2 [json_name = "ackId"];`
     */
    public var ackId: kotlin.Int
      @JvmName("getAckId")
      get() = _builder.getAckId()
      @JvmName("setAckId")
      set(value) {
        _builder.setAckId(value)
      }
    /**
     * `uint32 ack_id = 2 [json_name = "ackId"];`
     */
    public fun clearAckId() {
      _builder.clearAckId()
    }

    /**
     * `.iscp2.v1.ResultCode result_code = 3 [json_name = "resultCode"];`
     */
    public var resultCode: com.github.aptpod.proto.iscp2.v1.ResultCode
      @JvmName("getResultCode")
      get() = _builder.getResultCode()
      @JvmName("setResultCode")
      set(value) {
        _builder.setResultCode(value)
      }
    public var resultCodeValue: kotlin.Int
      @JvmName("getResultCodeValue")
      get() = _builder.getResultCodeValue()
      @JvmName("setResultCodeValue")
      set(value) {
        _builder.setResultCodeValue(value)
      }
    /**
     * `.iscp2.v1.ResultCode result_code = 3 [json_name = "resultCode"];`
     */
    public fun clearResultCode() {
      _builder.clearResultCode()
    }

    /**
     * `string result_string = 4 [json_name = "resultString"];`
     */
    public var resultString: kotlin.String
      @JvmName("getResultString")
      get() = _builder.getResultString()
      @JvmName("setResultString")
      set(value) {
        _builder.setResultString(value)
      }
    /**
     * `string result_string = 4 [json_name = "resultString"];`
     */
    public fun clearResultString() {
      _builder.clearResultString()
    }

    /**
     * `.iscp2.v1.extensions.DownstreamChunkAckCompleteExtensionFields extension_fields = 5 [json_name = "extensionFields"];`
     */
    public var extensionFields: com.github.aptpod.proto.iscp2.v1.extensions.DownstreamChunkAckCompleteExtensionFields
      @JvmName("getExtensionFields")
      get() = _builder.getExtensionFields()
      @JvmName("setExtensionFields")
      set(value) {
        _builder.setExtensionFields(value)
      }
    /**
     * `.iscp2.v1.extensions.DownstreamChunkAckCompleteExtensionFields extension_fields = 5 [json_name = "extensionFields"];`
     */
    public fun clearExtensionFields() {
      _builder.clearExtensionFields()
    }
    /**
     * `.iscp2.v1.extensions.DownstreamChunkAckCompleteExtensionFields extension_fields = 5 [json_name = "extensionFields"];`
     * @return Whether the extensionFields field is set.
     */
    public fun hasExtensionFields(): kotlin.Boolean {
      return _builder.hasExtensionFields()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.github.aptpod.proto.iscp2.v1.DownstreamChunkAckComplete.copy(block: `com.github.aptpod.proto.iscp2.v1`.DownstreamChunkAckCompleteKt.Dsl.() -> kotlin.Unit): com.github.aptpod.proto.iscp2.v1.DownstreamChunkAckComplete =
  `com.github.aptpod.proto.iscp2.v1`.DownstreamChunkAckCompleteKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val com.github.aptpod.proto.iscp2.v1.DownstreamChunkAckCompleteOrBuilder.extensionFieldsOrNull: com.github.aptpod.proto.iscp2.v1.extensions.DownstreamChunkAckCompleteExtensionFields?
  get() = if (hasExtensionFields()) getExtensionFields() else null
