// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: iscp2/v1/downstream.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.github.aptpod.proto.iscp2.v1;

@kotlin.jvm.JvmName("-initializedownstreamMetadata")
public inline fun downstreamMetadata(block: com.github.aptpod.proto.iscp2.v1.DownstreamMetadataKt.Dsl.() -> kotlin.Unit): com.github.aptpod.proto.iscp2.v1.DownstreamMetadata =
  com.github.aptpod.proto.iscp2.v1.DownstreamMetadataKt.Dsl._create(com.github.aptpod.proto.iscp2.v1.DownstreamMetadata.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `iscp2.v1.DownstreamMetadata`
 */
public object DownstreamMetadataKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.github.aptpod.proto.iscp2.v1.DownstreamMetadata.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.github.aptpod.proto.iscp2.v1.DownstreamMetadata.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.github.aptpod.proto.iscp2.v1.DownstreamMetadata = _builder.build()

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
     * `uint32 stream_id_alias = 13 [json_name = "streamIdAlias"];`
     */
    public var streamIdAlias: kotlin.Int
      @JvmName("getStreamIdAlias")
      get() = _builder.getStreamIdAlias()
      @JvmName("setStreamIdAlias")
      set(value) {
        _builder.setStreamIdAlias(value)
      }
    /**
     * `uint32 stream_id_alias = 13 [json_name = "streamIdAlias"];`
     */
    public fun clearStreamIdAlias() {
      _builder.clearStreamIdAlias()
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
     * `.iscp2.v1.UpstreamOpen upstream_open = 3 [json_name = "upstreamOpen"];`
     */
    public var upstreamOpen: com.github.aptpod.proto.iscp2.v1.UpstreamOpen
      @JvmName("getUpstreamOpen")
      get() = _builder.getUpstreamOpen()
      @JvmName("setUpstreamOpen")
      set(value) {
        _builder.setUpstreamOpen(value)
      }
    /**
     * `.iscp2.v1.UpstreamOpen upstream_open = 3 [json_name = "upstreamOpen"];`
     */
    public fun clearUpstreamOpen() {
      _builder.clearUpstreamOpen()
    }
    /**
     * `.iscp2.v1.UpstreamOpen upstream_open = 3 [json_name = "upstreamOpen"];`
     * @return Whether the upstreamOpen field is set.
     */
    public fun hasUpstreamOpen(): kotlin.Boolean {
      return _builder.hasUpstreamOpen()
    }

    /**
     * `.iscp2.v1.UpstreamAbnormalClose upstream_abnormal_close = 4 [json_name = "upstreamAbnormalClose"];`
     */
    public var upstreamAbnormalClose: com.github.aptpod.proto.iscp2.v1.UpstreamAbnormalClose
      @JvmName("getUpstreamAbnormalClose")
      get() = _builder.getUpstreamAbnormalClose()
      @JvmName("setUpstreamAbnormalClose")
      set(value) {
        _builder.setUpstreamAbnormalClose(value)
      }
    /**
     * `.iscp2.v1.UpstreamAbnormalClose upstream_abnormal_close = 4 [json_name = "upstreamAbnormalClose"];`
     */
    public fun clearUpstreamAbnormalClose() {
      _builder.clearUpstreamAbnormalClose()
    }
    /**
     * `.iscp2.v1.UpstreamAbnormalClose upstream_abnormal_close = 4 [json_name = "upstreamAbnormalClose"];`
     * @return Whether the upstreamAbnormalClose field is set.
     */
    public fun hasUpstreamAbnormalClose(): kotlin.Boolean {
      return _builder.hasUpstreamAbnormalClose()
    }

    /**
     * `.iscp2.v1.UpstreamResume upstream_resume = 5 [json_name = "upstreamResume"];`
     */
    public var upstreamResume: com.github.aptpod.proto.iscp2.v1.UpstreamResume
      @JvmName("getUpstreamResume")
      get() = _builder.getUpstreamResume()
      @JvmName("setUpstreamResume")
      set(value) {
        _builder.setUpstreamResume(value)
      }
    /**
     * `.iscp2.v1.UpstreamResume upstream_resume = 5 [json_name = "upstreamResume"];`
     */
    public fun clearUpstreamResume() {
      _builder.clearUpstreamResume()
    }
    /**
     * `.iscp2.v1.UpstreamResume upstream_resume = 5 [json_name = "upstreamResume"];`
     * @return Whether the upstreamResume field is set.
     */
    public fun hasUpstreamResume(): kotlin.Boolean {
      return _builder.hasUpstreamResume()
    }

    /**
     * `.iscp2.v1.UpstreamNormalClose upstream_normal_close = 6 [json_name = "upstreamNormalClose"];`
     */
    public var upstreamNormalClose: com.github.aptpod.proto.iscp2.v1.UpstreamNormalClose
      @JvmName("getUpstreamNormalClose")
      get() = _builder.getUpstreamNormalClose()
      @JvmName("setUpstreamNormalClose")
      set(value) {
        _builder.setUpstreamNormalClose(value)
      }
    /**
     * `.iscp2.v1.UpstreamNormalClose upstream_normal_close = 6 [json_name = "upstreamNormalClose"];`
     */
    public fun clearUpstreamNormalClose() {
      _builder.clearUpstreamNormalClose()
    }
    /**
     * `.iscp2.v1.UpstreamNormalClose upstream_normal_close = 6 [json_name = "upstreamNormalClose"];`
     * @return Whether the upstreamNormalClose field is set.
     */
    public fun hasUpstreamNormalClose(): kotlin.Boolean {
      return _builder.hasUpstreamNormalClose()
    }

    /**
     * `.iscp2.v1.DownstreamOpen downstream_open = 7 [json_name = "downstreamOpen"];`
     */
    public var downstreamOpen: com.github.aptpod.proto.iscp2.v1.DownstreamOpen
      @JvmName("getDownstreamOpen")
      get() = _builder.getDownstreamOpen()
      @JvmName("setDownstreamOpen")
      set(value) {
        _builder.setDownstreamOpen(value)
      }
    /**
     * `.iscp2.v1.DownstreamOpen downstream_open = 7 [json_name = "downstreamOpen"];`
     */
    public fun clearDownstreamOpen() {
      _builder.clearDownstreamOpen()
    }
    /**
     * `.iscp2.v1.DownstreamOpen downstream_open = 7 [json_name = "downstreamOpen"];`
     * @return Whether the downstreamOpen field is set.
     */
    public fun hasDownstreamOpen(): kotlin.Boolean {
      return _builder.hasDownstreamOpen()
    }

    /**
     * `.iscp2.v1.DownstreamAbnormalClose downstream_abnormal_close = 8 [json_name = "downstreamAbnormalClose"];`
     */
    public var downstreamAbnormalClose: com.github.aptpod.proto.iscp2.v1.DownstreamAbnormalClose
      @JvmName("getDownstreamAbnormalClose")
      get() = _builder.getDownstreamAbnormalClose()
      @JvmName("setDownstreamAbnormalClose")
      set(value) {
        _builder.setDownstreamAbnormalClose(value)
      }
    /**
     * `.iscp2.v1.DownstreamAbnormalClose downstream_abnormal_close = 8 [json_name = "downstreamAbnormalClose"];`
     */
    public fun clearDownstreamAbnormalClose() {
      _builder.clearDownstreamAbnormalClose()
    }
    /**
     * `.iscp2.v1.DownstreamAbnormalClose downstream_abnormal_close = 8 [json_name = "downstreamAbnormalClose"];`
     * @return Whether the downstreamAbnormalClose field is set.
     */
    public fun hasDownstreamAbnormalClose(): kotlin.Boolean {
      return _builder.hasDownstreamAbnormalClose()
    }

    /**
     * `.iscp2.v1.DownstreamResume downstream_resume = 9 [json_name = "downstreamResume"];`
     */
    public var downstreamResume: com.github.aptpod.proto.iscp2.v1.DownstreamResume
      @JvmName("getDownstreamResume")
      get() = _builder.getDownstreamResume()
      @JvmName("setDownstreamResume")
      set(value) {
        _builder.setDownstreamResume(value)
      }
    /**
     * `.iscp2.v1.DownstreamResume downstream_resume = 9 [json_name = "downstreamResume"];`
     */
    public fun clearDownstreamResume() {
      _builder.clearDownstreamResume()
    }
    /**
     * `.iscp2.v1.DownstreamResume downstream_resume = 9 [json_name = "downstreamResume"];`
     * @return Whether the downstreamResume field is set.
     */
    public fun hasDownstreamResume(): kotlin.Boolean {
      return _builder.hasDownstreamResume()
    }

    /**
     * `.iscp2.v1.DownstreamNormalClose downstream_normal_close = 10 [json_name = "downstreamNormalClose"];`
     */
    public var downstreamNormalClose: com.github.aptpod.proto.iscp2.v1.DownstreamNormalClose
      @JvmName("getDownstreamNormalClose")
      get() = _builder.getDownstreamNormalClose()
      @JvmName("setDownstreamNormalClose")
      set(value) {
        _builder.setDownstreamNormalClose(value)
      }
    /**
     * `.iscp2.v1.DownstreamNormalClose downstream_normal_close = 10 [json_name = "downstreamNormalClose"];`
     */
    public fun clearDownstreamNormalClose() {
      _builder.clearDownstreamNormalClose()
    }
    /**
     * `.iscp2.v1.DownstreamNormalClose downstream_normal_close = 10 [json_name = "downstreamNormalClose"];`
     * @return Whether the downstreamNormalClose field is set.
     */
    public fun hasDownstreamNormalClose(): kotlin.Boolean {
      return _builder.hasDownstreamNormalClose()
    }

    /**
     * `string source_node_id = 11 [json_name = "sourceNodeId"];`
     */
    public var sourceNodeId: kotlin.String
      @JvmName("getSourceNodeId")
      get() = _builder.getSourceNodeId()
      @JvmName("setSourceNodeId")
      set(value) {
        _builder.setSourceNodeId(value)
      }
    /**
     * `string source_node_id = 11 [json_name = "sourceNodeId"];`
     */
    public fun clearSourceNodeId() {
      _builder.clearSourceNodeId()
    }

    /**
     * `.iscp2.v1.extensions.DownstreamMetadataExtensionFields extension_fields = 12 [json_name = "extensionFields"];`
     */
    public var extensionFields: com.github.aptpod.proto.iscp2.v1.extensions.DownstreamMetadataExtensionFields
      @JvmName("getExtensionFields")
      get() = _builder.getExtensionFields()
      @JvmName("setExtensionFields")
      set(value) {
        _builder.setExtensionFields(value)
      }
    /**
     * `.iscp2.v1.extensions.DownstreamMetadataExtensionFields extension_fields = 12 [json_name = "extensionFields"];`
     */
    public fun clearExtensionFields() {
      _builder.clearExtensionFields()
    }
    /**
     * `.iscp2.v1.extensions.DownstreamMetadataExtensionFields extension_fields = 12 [json_name = "extensionFields"];`
     * @return Whether the extensionFields field is set.
     */
    public fun hasExtensionFields(): kotlin.Boolean {
      return _builder.hasExtensionFields()
    }
    public val metadataCase: com.github.aptpod.proto.iscp2.v1.DownstreamMetadata.MetadataCase
      @JvmName("getMetadataCase")
      get() = _builder.getMetadataCase()

    public fun clearMetadata() {
      _builder.clearMetadata()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.github.aptpod.proto.iscp2.v1.DownstreamMetadata.copy(block: `com.github.aptpod.proto.iscp2.v1`.DownstreamMetadataKt.Dsl.() -> kotlin.Unit): com.github.aptpod.proto.iscp2.v1.DownstreamMetadata =
  `com.github.aptpod.proto.iscp2.v1`.DownstreamMetadataKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val com.github.aptpod.proto.iscp2.v1.DownstreamMetadataOrBuilder.baseTimeOrNull: com.github.aptpod.proto.iscp2.v1.BaseTime?
  get() = if (hasBaseTime()) getBaseTime() else null

public val com.github.aptpod.proto.iscp2.v1.DownstreamMetadataOrBuilder.upstreamOpenOrNull: com.github.aptpod.proto.iscp2.v1.UpstreamOpen?
  get() = if (hasUpstreamOpen()) getUpstreamOpen() else null

public val com.github.aptpod.proto.iscp2.v1.DownstreamMetadataOrBuilder.upstreamAbnormalCloseOrNull: com.github.aptpod.proto.iscp2.v1.UpstreamAbnormalClose?
  get() = if (hasUpstreamAbnormalClose()) getUpstreamAbnormalClose() else null

public val com.github.aptpod.proto.iscp2.v1.DownstreamMetadataOrBuilder.upstreamResumeOrNull: com.github.aptpod.proto.iscp2.v1.UpstreamResume?
  get() = if (hasUpstreamResume()) getUpstreamResume() else null

public val com.github.aptpod.proto.iscp2.v1.DownstreamMetadataOrBuilder.upstreamNormalCloseOrNull: com.github.aptpod.proto.iscp2.v1.UpstreamNormalClose?
  get() = if (hasUpstreamNormalClose()) getUpstreamNormalClose() else null

public val com.github.aptpod.proto.iscp2.v1.DownstreamMetadataOrBuilder.downstreamOpenOrNull: com.github.aptpod.proto.iscp2.v1.DownstreamOpen?
  get() = if (hasDownstreamOpen()) getDownstreamOpen() else null

public val com.github.aptpod.proto.iscp2.v1.DownstreamMetadataOrBuilder.downstreamAbnormalCloseOrNull: com.github.aptpod.proto.iscp2.v1.DownstreamAbnormalClose?
  get() = if (hasDownstreamAbnormalClose()) getDownstreamAbnormalClose() else null

public val com.github.aptpod.proto.iscp2.v1.DownstreamMetadataOrBuilder.downstreamResumeOrNull: com.github.aptpod.proto.iscp2.v1.DownstreamResume?
  get() = if (hasDownstreamResume()) getDownstreamResume() else null

public val com.github.aptpod.proto.iscp2.v1.DownstreamMetadataOrBuilder.downstreamNormalCloseOrNull: com.github.aptpod.proto.iscp2.v1.DownstreamNormalClose?
  get() = if (hasDownstreamNormalClose()) getDownstreamNormalClose() else null

public val com.github.aptpod.proto.iscp2.v1.DownstreamMetadataOrBuilder.extensionFieldsOrNull: com.github.aptpod.proto.iscp2.v1.extensions.DownstreamMetadataExtensionFields?
  get() = if (hasExtensionFields()) getExtensionFields() else null

