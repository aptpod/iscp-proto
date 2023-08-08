// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: iscp2/v1/downstream.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.github.aptpod.proto.iscp2.v1;

@kotlin.jvm.JvmName("-initializedownstreamResumeResponse")
public inline fun downstreamResumeResponse(block: com.github.aptpod.proto.iscp2.v1.DownstreamResumeResponseKt.Dsl.() -> kotlin.Unit): com.github.aptpod.proto.iscp2.v1.DownstreamResumeResponse =
  com.github.aptpod.proto.iscp2.v1.DownstreamResumeResponseKt.Dsl._create(com.github.aptpod.proto.iscp2.v1.DownstreamResumeResponse.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `iscp2.v1.DownstreamResumeResponse`
 */
public object DownstreamResumeResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.github.aptpod.proto.iscp2.v1.DownstreamResumeResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.github.aptpod.proto.iscp2.v1.DownstreamResumeResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.github.aptpod.proto.iscp2.v1.DownstreamResumeResponse = _builder.build()

    /**
     * `uint32 request_id = 1 [json_name = "requestId"];`
     */
    public var requestId: kotlin.Int
      @JvmName("getRequestId")
      get() = _builder.getRequestId()
      @JvmName("setRequestId")
      set(value) {
        _builder.setRequestId(value)
      }
    /**
     * `uint32 request_id = 1 [json_name = "requestId"];`
     */
    public fun clearRequestId() {
      _builder.clearRequestId()
    }

    /**
     * `.iscp2.v1.ResultCode result_code = 2 [json_name = "resultCode"];`
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
     * `.iscp2.v1.ResultCode result_code = 2 [json_name = "resultCode"];`
     */
    public fun clearResultCode() {
      _builder.clearResultCode()
    }

    /**
     * `string result_string = 3 [json_name = "resultString"];`
     */
    public var resultString: kotlin.String
      @JvmName("getResultString")
      get() = _builder.getResultString()
      @JvmName("setResultString")
      set(value) {
        _builder.setResultString(value)
      }
    /**
     * `string result_string = 3 [json_name = "resultString"];`
     */
    public fun clearResultString() {
      _builder.clearResultString()
    }

    /**
     * `.iscp2.v1.extensions.DownstreamResumeResponseExtensionFields extension_fields = 4 [json_name = "extensionFields"];`
     */
    public var extensionFields: com.github.aptpod.proto.iscp2.v1.extensions.DownstreamResumeResponseExtensionFields
      @JvmName("getExtensionFields")
      get() = _builder.getExtensionFields()
      @JvmName("setExtensionFields")
      set(value) {
        _builder.setExtensionFields(value)
      }
    /**
     * `.iscp2.v1.extensions.DownstreamResumeResponseExtensionFields extension_fields = 4 [json_name = "extensionFields"];`
     */
    public fun clearExtensionFields() {
      _builder.clearExtensionFields()
    }
    /**
     * `.iscp2.v1.extensions.DownstreamResumeResponseExtensionFields extension_fields = 4 [json_name = "extensionFields"];`
     * @return Whether the extensionFields field is set.
     */
    public fun hasExtensionFields(): kotlin.Boolean {
      return _builder.hasExtensionFields()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.github.aptpod.proto.iscp2.v1.DownstreamResumeResponse.copy(block: `com.github.aptpod.proto.iscp2.v1`.DownstreamResumeResponseKt.Dsl.() -> kotlin.Unit): com.github.aptpod.proto.iscp2.v1.DownstreamResumeResponse =
  `com.github.aptpod.proto.iscp2.v1`.DownstreamResumeResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val com.github.aptpod.proto.iscp2.v1.DownstreamResumeResponseOrBuilder.extensionFieldsOrNull: com.github.aptpod.proto.iscp2.v1.extensions.DownstreamResumeResponseExtensionFields?
  get() = if (hasExtensionFields()) getExtensionFields() else null

