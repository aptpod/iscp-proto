// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: iscp2/v1/downstream.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.github.aptpod.proto.iscp2.v1;

@kotlin.jvm.JvmName("-initializedownstreamChunkResult")
public inline fun downstreamChunkResult(block: com.github.aptpod.proto.iscp2.v1.DownstreamChunkResultKt.Dsl.() -> kotlin.Unit): com.github.aptpod.proto.iscp2.v1.DownstreamChunkResult =
  com.github.aptpod.proto.iscp2.v1.DownstreamChunkResultKt.Dsl._create(com.github.aptpod.proto.iscp2.v1.DownstreamChunkResult.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `iscp2.v1.DownstreamChunkResult`
 */
public object DownstreamChunkResultKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.github.aptpod.proto.iscp2.v1.DownstreamChunkResult.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.github.aptpod.proto.iscp2.v1.DownstreamChunkResult.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.github.aptpod.proto.iscp2.v1.DownstreamChunkResult = _builder.build()

    /**
     * `bytes stream_id_of_upstream = 1 [json_name = "streamIdOfUpstream"];`
     */
    public var streamIdOfUpstream: com.google.protobuf.ByteString
      @JvmName("getStreamIdOfUpstream")
      get() = _builder.getStreamIdOfUpstream()
      @JvmName("setStreamIdOfUpstream")
      set(value) {
        _builder.setStreamIdOfUpstream(value)
      }
    /**
     * `bytes stream_id_of_upstream = 1 [json_name = "streamIdOfUpstream"];`
     */
    public fun clearStreamIdOfUpstream() {
      _builder.clearStreamIdOfUpstream()
    }

    /**
     * `uint32 sequence_number_in_upstream = 2 [json_name = "sequenceNumberInUpstream"];`
     */
    public var sequenceNumberInUpstream: kotlin.Int
      @JvmName("getSequenceNumberInUpstream")
      get() = _builder.getSequenceNumberInUpstream()
      @JvmName("setSequenceNumberInUpstream")
      set(value) {
        _builder.setSequenceNumberInUpstream(value)
      }
    /**
     * `uint32 sequence_number_in_upstream = 2 [json_name = "sequenceNumberInUpstream"];`
     */
    public fun clearSequenceNumberInUpstream() {
      _builder.clearSequenceNumberInUpstream()
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
     * `.iscp2.v1.extensions.DownstreamChunkResultExtensionFields extension_fields = 5 [json_name = "extensionFields"];`
     */
    public var extensionFields: com.github.aptpod.proto.iscp2.v1.extensions.DownstreamChunkResultExtensionFields
      @JvmName("getExtensionFields")
      get() = _builder.getExtensionFields()
      @JvmName("setExtensionFields")
      set(value) {
        _builder.setExtensionFields(value)
      }
    /**
     * `.iscp2.v1.extensions.DownstreamChunkResultExtensionFields extension_fields = 5 [json_name = "extensionFields"];`
     */
    public fun clearExtensionFields() {
      _builder.clearExtensionFields()
    }
    /**
     * `.iscp2.v1.extensions.DownstreamChunkResultExtensionFields extension_fields = 5 [json_name = "extensionFields"];`
     * @return Whether the extensionFields field is set.
     */
    public fun hasExtensionFields(): kotlin.Boolean {
      return _builder.hasExtensionFields()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.github.aptpod.proto.iscp2.v1.DownstreamChunkResult.copy(block: `com.github.aptpod.proto.iscp2.v1`.DownstreamChunkResultKt.Dsl.() -> kotlin.Unit): com.github.aptpod.proto.iscp2.v1.DownstreamChunkResult =
  `com.github.aptpod.proto.iscp2.v1`.DownstreamChunkResultKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val com.github.aptpod.proto.iscp2.v1.DownstreamChunkResultOrBuilder.extensionFieldsOrNull: com.github.aptpod.proto.iscp2.v1.extensions.DownstreamChunkResultExtensionFields?
  get() = if (hasExtensionFields()) getExtensionFields() else null
