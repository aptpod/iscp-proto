// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: iscp2/v1/upstream.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.github.aptpod.proto.iscp2.v1;

@kotlin.jvm.JvmName("-initializeupstreamMetadata")
public inline fun upstreamMetadata(block: com.github.aptpod.proto.iscp2.v1.UpstreamMetadataKt.Dsl.() -> kotlin.Unit): com.github.aptpod.proto.iscp2.v1.UpstreamMetadata =
  com.github.aptpod.proto.iscp2.v1.UpstreamMetadataKt.Dsl._create(com.github.aptpod.proto.iscp2.v1.UpstreamMetadata.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `iscp2.v1.UpstreamMetadata`
 */
public object UpstreamMetadataKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.github.aptpod.proto.iscp2.v1.UpstreamMetadata.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.github.aptpod.proto.iscp2.v1.UpstreamMetadata.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.github.aptpod.proto.iscp2.v1.UpstreamMetadata = _builder.build()

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
     * `.iscp2.v1.BaseTime base_time = 2 [json_name = "baseTime"];`
     */
    public var baseTime: com.github.aptpod.proto.iscp2.v1.BaseTime
      @JvmName("getBaseTime")
      get() = _builder.getBaseTime()
      @JvmName("setBaseTime")
      set(value) {
        _builder.setBaseTime(value)
      }
    /**
     * `.iscp2.v1.BaseTime base_time = 2 [json_name = "baseTime"];`
     */
    public fun clearBaseTime() {
      _builder.clearBaseTime()
    }
    /**
     * `.iscp2.v1.BaseTime base_time = 2 [json_name = "baseTime"];`
     * @return Whether the baseTime field is set.
     */
    public fun hasBaseTime(): kotlin.Boolean {
      return _builder.hasBaseTime()
    }

    /**
     * `.iscp2.v1.extensions.UpstreamMetadataExtensionFields extension_fields = 4 [json_name = "extensionFields"];`
     */
    public var extensionFields: com.github.aptpod.proto.iscp2.v1.extensions.UpstreamMetadataExtensionFields
      @JvmName("getExtensionFields")
      get() = _builder.getExtensionFields()
      @JvmName("setExtensionFields")
      set(value) {
        _builder.setExtensionFields(value)
      }
    /**
     * `.iscp2.v1.extensions.UpstreamMetadataExtensionFields extension_fields = 4 [json_name = "extensionFields"];`
     */
    public fun clearExtensionFields() {
      _builder.clearExtensionFields()
    }
    /**
     * `.iscp2.v1.extensions.UpstreamMetadataExtensionFields extension_fields = 4 [json_name = "extensionFields"];`
     * @return Whether the extensionFields field is set.
     */
    public fun hasExtensionFields(): kotlin.Boolean {
      return _builder.hasExtensionFields()
    }
    public val metadataCase: com.github.aptpod.proto.iscp2.v1.UpstreamMetadata.MetadataCase
      @JvmName("getMetadataCase")
      get() = _builder.getMetadataCase()

    public fun clearMetadata() {
      _builder.clearMetadata()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.github.aptpod.proto.iscp2.v1.UpstreamMetadata.copy(block: `com.github.aptpod.proto.iscp2.v1`.UpstreamMetadataKt.Dsl.() -> kotlin.Unit): com.github.aptpod.proto.iscp2.v1.UpstreamMetadata =
  `com.github.aptpod.proto.iscp2.v1`.UpstreamMetadataKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val com.github.aptpod.proto.iscp2.v1.UpstreamMetadataOrBuilder.baseTimeOrNull: com.github.aptpod.proto.iscp2.v1.BaseTime?
  get() = if (hasBaseTime()) getBaseTime() else null

public val com.github.aptpod.proto.iscp2.v1.UpstreamMetadataOrBuilder.extensionFieldsOrNull: com.github.aptpod.proto.iscp2.v1.extensions.UpstreamMetadataExtensionFields?
  get() = if (hasExtensionFields()) getExtensionFields() else null

