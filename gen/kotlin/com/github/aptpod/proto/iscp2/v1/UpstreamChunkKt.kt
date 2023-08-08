// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: iscp2/v1/upstream.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.github.aptpod.proto.iscp2.v1;

@kotlin.jvm.JvmName("-initializeupstreamChunk")
public inline fun upstreamChunk(block: com.github.aptpod.proto.iscp2.v1.UpstreamChunkKt.Dsl.() -> kotlin.Unit): com.github.aptpod.proto.iscp2.v1.UpstreamChunk =
  com.github.aptpod.proto.iscp2.v1.UpstreamChunkKt.Dsl._create(com.github.aptpod.proto.iscp2.v1.UpstreamChunk.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `iscp2.v1.UpstreamChunk`
 */
public object UpstreamChunkKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.github.aptpod.proto.iscp2.v1.UpstreamChunk.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.github.aptpod.proto.iscp2.v1.UpstreamChunk.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.github.aptpod.proto.iscp2.v1.UpstreamChunk = _builder.build()

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
     * `.iscp2.v1.StreamChunk stream_chunk = 2 [json_name = "streamChunk"];`
     */
    public var streamChunk: com.github.aptpod.proto.iscp2.v1.StreamChunk
      @JvmName("getStreamChunk")
      get() = _builder.getStreamChunk()
      @JvmName("setStreamChunk")
      set(value) {
        _builder.setStreamChunk(value)
      }
    /**
     * `.iscp2.v1.StreamChunk stream_chunk = 2 [json_name = "streamChunk"];`
     */
    public fun clearStreamChunk() {
      _builder.clearStreamChunk()
    }
    /**
     * `.iscp2.v1.StreamChunk stream_chunk = 2 [json_name = "streamChunk"];`
     * @return Whether the streamChunk field is set.
     */
    public fun hasStreamChunk(): kotlin.Boolean {
      return _builder.hasStreamChunk()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class DataIdsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * `repeated .iscp2.v1.DataID data_ids = 3 [json_name = "dataIds"];`
     */
     public val dataIds: com.google.protobuf.kotlin.DslList<com.github.aptpod.proto.iscp2.v1.DataID, DataIdsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getDataIdsList()
      )
    /**
     * `repeated .iscp2.v1.DataID data_ids = 3 [json_name = "dataIds"];`
     * @param value The dataIds to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addDataIds")
    public fun com.google.protobuf.kotlin.DslList<com.github.aptpod.proto.iscp2.v1.DataID, DataIdsProxy>.add(value: com.github.aptpod.proto.iscp2.v1.DataID) {
      _builder.addDataIds(value)
    }
    /**
     * `repeated .iscp2.v1.DataID data_ids = 3 [json_name = "dataIds"];`
     * @param value The dataIds to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignDataIds")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<com.github.aptpod.proto.iscp2.v1.DataID, DataIdsProxy>.plusAssign(value: com.github.aptpod.proto.iscp2.v1.DataID) {
      add(value)
    }
    /**
     * `repeated .iscp2.v1.DataID data_ids = 3 [json_name = "dataIds"];`
     * @param values The dataIds to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllDataIds")
    public fun com.google.protobuf.kotlin.DslList<com.github.aptpod.proto.iscp2.v1.DataID, DataIdsProxy>.addAll(values: kotlin.collections.Iterable<com.github.aptpod.proto.iscp2.v1.DataID>) {
      _builder.addAllDataIds(values)
    }
    /**
     * `repeated .iscp2.v1.DataID data_ids = 3 [json_name = "dataIds"];`
     * @param values The dataIds to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllDataIds")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<com.github.aptpod.proto.iscp2.v1.DataID, DataIdsProxy>.plusAssign(values: kotlin.collections.Iterable<com.github.aptpod.proto.iscp2.v1.DataID>) {
      addAll(values)
    }
    /**
     * `repeated .iscp2.v1.DataID data_ids = 3 [json_name = "dataIds"];`
     * @param index The index to set the value at.
     * @param value The dataIds to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setDataIds")
    public operator fun com.google.protobuf.kotlin.DslList<com.github.aptpod.proto.iscp2.v1.DataID, DataIdsProxy>.set(index: kotlin.Int, value: com.github.aptpod.proto.iscp2.v1.DataID) {
      _builder.setDataIds(index, value)
    }
    /**
     * `repeated .iscp2.v1.DataID data_ids = 3 [json_name = "dataIds"];`
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearDataIds")
    public fun com.google.protobuf.kotlin.DslList<com.github.aptpod.proto.iscp2.v1.DataID, DataIdsProxy>.clear() {
      _builder.clearDataIds()
    }


    /**
     * `.iscp2.v1.extensions.UpstreamChunkExtensionFields extension_fields = 4 [json_name = "extensionFields"];`
     */
    public var extensionFields: com.github.aptpod.proto.iscp2.v1.extensions.UpstreamChunkExtensionFields
      @JvmName("getExtensionFields")
      get() = _builder.getExtensionFields()
      @JvmName("setExtensionFields")
      set(value) {
        _builder.setExtensionFields(value)
      }
    /**
     * `.iscp2.v1.extensions.UpstreamChunkExtensionFields extension_fields = 4 [json_name = "extensionFields"];`
     */
    public fun clearExtensionFields() {
      _builder.clearExtensionFields()
    }
    /**
     * `.iscp2.v1.extensions.UpstreamChunkExtensionFields extension_fields = 4 [json_name = "extensionFields"];`
     * @return Whether the extensionFields field is set.
     */
    public fun hasExtensionFields(): kotlin.Boolean {
      return _builder.hasExtensionFields()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.github.aptpod.proto.iscp2.v1.UpstreamChunk.copy(block: `com.github.aptpod.proto.iscp2.v1`.UpstreamChunkKt.Dsl.() -> kotlin.Unit): com.github.aptpod.proto.iscp2.v1.UpstreamChunk =
  `com.github.aptpod.proto.iscp2.v1`.UpstreamChunkKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val com.github.aptpod.proto.iscp2.v1.UpstreamChunkOrBuilder.streamChunkOrNull: com.github.aptpod.proto.iscp2.v1.StreamChunk?
  get() = if (hasStreamChunk()) getStreamChunk() else null

public val com.github.aptpod.proto.iscp2.v1.UpstreamChunkOrBuilder.extensionFieldsOrNull: com.github.aptpod.proto.iscp2.v1.extensions.UpstreamChunkExtensionFields?
  get() = if (hasExtensionFields()) getExtensionFields() else null

