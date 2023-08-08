// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: iscp2/v1/e2e_call.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.github.aptpod.proto.iscp2.v1;

@kotlin.jvm.JvmName("-initializeupstreamCall")
public inline fun upstreamCall(block: com.github.aptpod.proto.iscp2.v1.UpstreamCallKt.Dsl.() -> kotlin.Unit): com.github.aptpod.proto.iscp2.v1.UpstreamCall =
  com.github.aptpod.proto.iscp2.v1.UpstreamCallKt.Dsl._create(com.github.aptpod.proto.iscp2.v1.UpstreamCall.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `iscp2.v1.UpstreamCall`
 */
public object UpstreamCallKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.github.aptpod.proto.iscp2.v1.UpstreamCall.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.github.aptpod.proto.iscp2.v1.UpstreamCall.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.github.aptpod.proto.iscp2.v1.UpstreamCall = _builder.build()

    /**
     * `string call_id = 1 [json_name = "callId"];`
     */
    public var callId: kotlin.String
      @JvmName("getCallId")
      get() = _builder.getCallId()
      @JvmName("setCallId")
      set(value) {
        _builder.setCallId(value)
      }
    /**
     * `string call_id = 1 [json_name = "callId"];`
     */
    public fun clearCallId() {
      _builder.clearCallId()
    }

    /**
     * `string request_call_id = 2 [json_name = "requestCallId"];`
     */
    public var requestCallId: kotlin.String
      @JvmName("getRequestCallId")
      get() = _builder.getRequestCallId()
      @JvmName("setRequestCallId")
      set(value) {
        _builder.setRequestCallId(value)
      }
    /**
     * `string request_call_id = 2 [json_name = "requestCallId"];`
     */
    public fun clearRequestCallId() {
      _builder.clearRequestCallId()
    }

    /**
     * `string destination_node_id = 3 [json_name = "destinationNodeId"];`
     */
    public var destinationNodeId: kotlin.String
      @JvmName("getDestinationNodeId")
      get() = _builder.getDestinationNodeId()
      @JvmName("setDestinationNodeId")
      set(value) {
        _builder.setDestinationNodeId(value)
      }
    /**
     * `string destination_node_id = 3 [json_name = "destinationNodeId"];`
     */
    public fun clearDestinationNodeId() {
      _builder.clearDestinationNodeId()
    }

    /**
     * `string name = 4 [json_name = "name"];`
     */
    public var name: kotlin.String
      @JvmName("getName")
      get() = _builder.getName()
      @JvmName("setName")
      set(value) {
        _builder.setName(value)
      }
    /**
     * `string name = 4 [json_name = "name"];`
     */
    public fun clearName() {
      _builder.clearName()
    }

    /**
     * `string type = 5 [json_name = "type"];`
     */
    public var type: kotlin.String
      @JvmName("getType")
      get() = _builder.getType()
      @JvmName("setType")
      set(value) {
        _builder.setType(value)
      }
    /**
     * `string type = 5 [json_name = "type"];`
     */
    public fun clearType() {
      _builder.clearType()
    }

    /**
     * `bytes payload = 6 [json_name = "payload"];`
     */
    public var payload: com.google.protobuf.ByteString
      @JvmName("getPayload")
      get() = _builder.getPayload()
      @JvmName("setPayload")
      set(value) {
        _builder.setPayload(value)
      }
    /**
     * `bytes payload = 6 [json_name = "payload"];`
     */
    public fun clearPayload() {
      _builder.clearPayload()
    }

    /**
     * `.iscp2.v1.extensions.UpstreamCallExtensionFields extension_fields = 7 [json_name = "extensionFields"];`
     */
    public var extensionFields: com.github.aptpod.proto.iscp2.v1.extensions.UpstreamCallExtensionFields
      @JvmName("getExtensionFields")
      get() = _builder.getExtensionFields()
      @JvmName("setExtensionFields")
      set(value) {
        _builder.setExtensionFields(value)
      }
    /**
     * `.iscp2.v1.extensions.UpstreamCallExtensionFields extension_fields = 7 [json_name = "extensionFields"];`
     */
    public fun clearExtensionFields() {
      _builder.clearExtensionFields()
    }
    /**
     * `.iscp2.v1.extensions.UpstreamCallExtensionFields extension_fields = 7 [json_name = "extensionFields"];`
     * @return Whether the extensionFields field is set.
     */
    public fun hasExtensionFields(): kotlin.Boolean {
      return _builder.hasExtensionFields()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.github.aptpod.proto.iscp2.v1.UpstreamCall.copy(block: `com.github.aptpod.proto.iscp2.v1`.UpstreamCallKt.Dsl.() -> kotlin.Unit): com.github.aptpod.proto.iscp2.v1.UpstreamCall =
  `com.github.aptpod.proto.iscp2.v1`.UpstreamCallKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val com.github.aptpod.proto.iscp2.v1.UpstreamCallOrBuilder.extensionFieldsOrNull: com.github.aptpod.proto.iscp2.v1.extensions.UpstreamCallExtensionFields?
  get() = if (hasExtensionFields()) getExtensionFields() else null

