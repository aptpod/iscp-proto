// <auto-generated>
//     Generated by the protocol buffer compiler.  DO NOT EDIT!
//     source: iscp2/v1/ping_pong.proto
// </auto-generated>
#pragma warning disable 1591, 0612, 3021, 8981
#region Designer generated code

using pb = global::Google.Protobuf;
using pbc = global::Google.Protobuf.Collections;
using pbr = global::Google.Protobuf.Reflection;
using scg = global::System.Collections.Generic;
namespace Iscp2.V1 {

  /// <summary>Holder for reflection information generated from iscp2/v1/ping_pong.proto</summary>
  internal static partial class PingPongReflection {

    #region Descriptor
    /// <summary>File descriptor for iscp2/v1/ping_pong.proto</summary>
    public static pbr::FileDescriptor Descriptor {
      get { return descriptor; }
    }
    private static pbr::FileDescriptor descriptor;

    static PingPongReflection() {
      byte[] descriptorData = global::System.Convert.FromBase64String(
          string.Concat(
            "Chhpc2NwMi92MS9waW5nX3BvbmcucHJvdG8SCGlzY3AyLnYxGiNpc2NwMi92",
            "MS9leHRlbnNpb25zL3BpbmdfcG9uZy5wcm90byJ6CgRQaW5nEh0KCnJlcXVl",
            "c3RfaWQYASABKA1SCXJlcXVlc3RJZBJTChBleHRlbnNpb25fZmllbGRzGAIg",
            "ASgLMiguaXNjcDIudjEuZXh0ZW5zaW9ucy5QaW5nRXh0ZW5zaW9uRmllbGRz",
            "Ug9leHRlbnNpb25GaWVsZHMiegoEUG9uZxIdCgpyZXF1ZXN0X2lkGAEgASgN",
            "UglyZXF1ZXN0SWQSUwoQZXh0ZW5zaW9uX2ZpZWxkcxgCIAEoCzIoLmlzY3Ay",
            "LnYxLmV4dGVuc2lvbnMuUG9uZ0V4dGVuc2lvbkZpZWxkc1IPZXh0ZW5zaW9u",
            "RmllbGRzQqgBCiBjb20uZ2l0aHViLmFwdHBvZC5wcm90by5pc2NwMi52MUIN",
            "UGluZ1BvbmdQcm90b1ABWjRnaXRodWIuY29tL2FwdHBvZC9pc2NwLXByb3Rv",
            "L2dlbi9nby9pc2NwMi92MTtpc2NwMnYxogIDSVhYqgIISXNjcDIuVjHKAghJ",
            "c2NwMlxWMeICFElzY3AyXFYxXEdQQk1ldGFkYXRh6gIJSXNjcDI6OlYxYgZw",
            "cm90bzM="));
      descriptor = pbr::FileDescriptor.FromGeneratedCode(descriptorData,
          new pbr::FileDescriptor[] { global::Iscp2.V1.Extensions.PingPongReflection.Descriptor, },
          new pbr::GeneratedClrTypeInfo(null, null, new pbr::GeneratedClrTypeInfo[] {
            new pbr::GeneratedClrTypeInfo(typeof(global::Iscp2.V1.Ping), global::Iscp2.V1.Ping.Parser, new[]{ "RequestId", "ExtensionFields" }, null, null, null, null),
            new pbr::GeneratedClrTypeInfo(typeof(global::Iscp2.V1.Pong), global::Iscp2.V1.Pong.Parser, new[]{ "RequestId", "ExtensionFields" }, null, null, null, null)
          }));
    }
    #endregion

  }
  #region Messages
  internal sealed partial class Ping : pb::IMessage<Ping>
  #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
      , pb::IBufferMessage
  #endif
  {
    private static readonly pb::MessageParser<Ping> _parser = new pb::MessageParser<Ping>(() => new Ping());
    private pb::UnknownFieldSet _unknownFields;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public static pb::MessageParser<Ping> Parser { get { return _parser; } }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public static pbr::MessageDescriptor Descriptor {
      get { return global::Iscp2.V1.PingPongReflection.Descriptor.MessageTypes[0]; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    pbr::MessageDescriptor pb::IMessage.Descriptor {
      get { return Descriptor; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public Ping() {
      OnConstruction();
    }

    partial void OnConstruction();

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public Ping(Ping other) : this() {
      requestId_ = other.requestId_;
      extensionFields_ = other.extensionFields_ != null ? other.extensionFields_.Clone() : null;
      _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public Ping Clone() {
      return new Ping(this);
    }

    /// <summary>Field number for the "request_id" field.</summary>
    public const int RequestIdFieldNumber = 1;
    private uint requestId_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public uint RequestId {
      get { return requestId_; }
      set {
        requestId_ = value;
      }
    }

    /// <summary>Field number for the "extension_fields" field.</summary>
    public const int ExtensionFieldsFieldNumber = 2;
    private global::Iscp2.V1.Extensions.PingExtensionFields extensionFields_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public global::Iscp2.V1.Extensions.PingExtensionFields ExtensionFields {
      get { return extensionFields_; }
      set {
        extensionFields_ = value;
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public override bool Equals(object other) {
      return Equals(other as Ping);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public bool Equals(Ping other) {
      if (ReferenceEquals(other, null)) {
        return false;
      }
      if (ReferenceEquals(other, this)) {
        return true;
      }
      if (RequestId != other.RequestId) return false;
      if (!object.Equals(ExtensionFields, other.ExtensionFields)) return false;
      return Equals(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public override int GetHashCode() {
      int hash = 1;
      if (RequestId != 0) hash ^= RequestId.GetHashCode();
      if (extensionFields_ != null) hash ^= ExtensionFields.GetHashCode();
      if (_unknownFields != null) {
        hash ^= _unknownFields.GetHashCode();
      }
      return hash;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public override string ToString() {
      return pb::JsonFormatter.ToDiagnosticString(this);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public void WriteTo(pb::CodedOutputStream output) {
    #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
      output.WriteRawMessage(this);
    #else
      if (RequestId != 0) {
        output.WriteRawTag(8);
        output.WriteUInt32(RequestId);
      }
      if (extensionFields_ != null) {
        output.WriteRawTag(18);
        output.WriteMessage(ExtensionFields);
      }
      if (_unknownFields != null) {
        _unknownFields.WriteTo(output);
      }
    #endif
    }

    #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    void pb::IBufferMessage.InternalWriteTo(ref pb::WriteContext output) {
      if (RequestId != 0) {
        output.WriteRawTag(8);
        output.WriteUInt32(RequestId);
      }
      if (extensionFields_ != null) {
        output.WriteRawTag(18);
        output.WriteMessage(ExtensionFields);
      }
      if (_unknownFields != null) {
        _unknownFields.WriteTo(ref output);
      }
    }
    #endif

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public int CalculateSize() {
      int size = 0;
      if (RequestId != 0) {
        size += 1 + pb::CodedOutputStream.ComputeUInt32Size(RequestId);
      }
      if (extensionFields_ != null) {
        size += 1 + pb::CodedOutputStream.ComputeMessageSize(ExtensionFields);
      }
      if (_unknownFields != null) {
        size += _unknownFields.CalculateSize();
      }
      return size;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public void MergeFrom(Ping other) {
      if (other == null) {
        return;
      }
      if (other.RequestId != 0) {
        RequestId = other.RequestId;
      }
      if (other.extensionFields_ != null) {
        if (extensionFields_ == null) {
          ExtensionFields = new global::Iscp2.V1.Extensions.PingExtensionFields();
        }
        ExtensionFields.MergeFrom(other.ExtensionFields);
      }
      _unknownFields = pb::UnknownFieldSet.MergeFrom(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public void MergeFrom(pb::CodedInputStream input) {
    #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
      input.ReadRawMessage(this);
    #else
      uint tag;
      while ((tag = input.ReadTag()) != 0) {
        switch(tag) {
          default:
            _unknownFields = pb::UnknownFieldSet.MergeFieldFrom(_unknownFields, input);
            break;
          case 8: {
            RequestId = input.ReadUInt32();
            break;
          }
          case 18: {
            if (extensionFields_ == null) {
              ExtensionFields = new global::Iscp2.V1.Extensions.PingExtensionFields();
            }
            input.ReadMessage(ExtensionFields);
            break;
          }
        }
      }
    #endif
    }

    #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    void pb::IBufferMessage.InternalMergeFrom(ref pb::ParseContext input) {
      uint tag;
      while ((tag = input.ReadTag()) != 0) {
        switch(tag) {
          default:
            _unknownFields = pb::UnknownFieldSet.MergeFieldFrom(_unknownFields, ref input);
            break;
          case 8: {
            RequestId = input.ReadUInt32();
            break;
          }
          case 18: {
            if (extensionFields_ == null) {
              ExtensionFields = new global::Iscp2.V1.Extensions.PingExtensionFields();
            }
            input.ReadMessage(ExtensionFields);
            break;
          }
        }
      }
    }
    #endif

  }

  internal sealed partial class Pong : pb::IMessage<Pong>
  #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
      , pb::IBufferMessage
  #endif
  {
    private static readonly pb::MessageParser<Pong> _parser = new pb::MessageParser<Pong>(() => new Pong());
    private pb::UnknownFieldSet _unknownFields;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public static pb::MessageParser<Pong> Parser { get { return _parser; } }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public static pbr::MessageDescriptor Descriptor {
      get { return global::Iscp2.V1.PingPongReflection.Descriptor.MessageTypes[1]; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    pbr::MessageDescriptor pb::IMessage.Descriptor {
      get { return Descriptor; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public Pong() {
      OnConstruction();
    }

    partial void OnConstruction();

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public Pong(Pong other) : this() {
      requestId_ = other.requestId_;
      extensionFields_ = other.extensionFields_ != null ? other.extensionFields_.Clone() : null;
      _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public Pong Clone() {
      return new Pong(this);
    }

    /// <summary>Field number for the "request_id" field.</summary>
    public const int RequestIdFieldNumber = 1;
    private uint requestId_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public uint RequestId {
      get { return requestId_; }
      set {
        requestId_ = value;
      }
    }

    /// <summary>Field number for the "extension_fields" field.</summary>
    public const int ExtensionFieldsFieldNumber = 2;
    private global::Iscp2.V1.Extensions.PongExtensionFields extensionFields_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public global::Iscp2.V1.Extensions.PongExtensionFields ExtensionFields {
      get { return extensionFields_; }
      set {
        extensionFields_ = value;
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public override bool Equals(object other) {
      return Equals(other as Pong);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public bool Equals(Pong other) {
      if (ReferenceEquals(other, null)) {
        return false;
      }
      if (ReferenceEquals(other, this)) {
        return true;
      }
      if (RequestId != other.RequestId) return false;
      if (!object.Equals(ExtensionFields, other.ExtensionFields)) return false;
      return Equals(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public override int GetHashCode() {
      int hash = 1;
      if (RequestId != 0) hash ^= RequestId.GetHashCode();
      if (extensionFields_ != null) hash ^= ExtensionFields.GetHashCode();
      if (_unknownFields != null) {
        hash ^= _unknownFields.GetHashCode();
      }
      return hash;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public override string ToString() {
      return pb::JsonFormatter.ToDiagnosticString(this);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public void WriteTo(pb::CodedOutputStream output) {
    #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
      output.WriteRawMessage(this);
    #else
      if (RequestId != 0) {
        output.WriteRawTag(8);
        output.WriteUInt32(RequestId);
      }
      if (extensionFields_ != null) {
        output.WriteRawTag(18);
        output.WriteMessage(ExtensionFields);
      }
      if (_unknownFields != null) {
        _unknownFields.WriteTo(output);
      }
    #endif
    }

    #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    void pb::IBufferMessage.InternalWriteTo(ref pb::WriteContext output) {
      if (RequestId != 0) {
        output.WriteRawTag(8);
        output.WriteUInt32(RequestId);
      }
      if (extensionFields_ != null) {
        output.WriteRawTag(18);
        output.WriteMessage(ExtensionFields);
      }
      if (_unknownFields != null) {
        _unknownFields.WriteTo(ref output);
      }
    }
    #endif

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public int CalculateSize() {
      int size = 0;
      if (RequestId != 0) {
        size += 1 + pb::CodedOutputStream.ComputeUInt32Size(RequestId);
      }
      if (extensionFields_ != null) {
        size += 1 + pb::CodedOutputStream.ComputeMessageSize(ExtensionFields);
      }
      if (_unknownFields != null) {
        size += _unknownFields.CalculateSize();
      }
      return size;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public void MergeFrom(Pong other) {
      if (other == null) {
        return;
      }
      if (other.RequestId != 0) {
        RequestId = other.RequestId;
      }
      if (other.extensionFields_ != null) {
        if (extensionFields_ == null) {
          ExtensionFields = new global::Iscp2.V1.Extensions.PongExtensionFields();
        }
        ExtensionFields.MergeFrom(other.ExtensionFields);
      }
      _unknownFields = pb::UnknownFieldSet.MergeFrom(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public void MergeFrom(pb::CodedInputStream input) {
    #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
      input.ReadRawMessage(this);
    #else
      uint tag;
      while ((tag = input.ReadTag()) != 0) {
        switch(tag) {
          default:
            _unknownFields = pb::UnknownFieldSet.MergeFieldFrom(_unknownFields, input);
            break;
          case 8: {
            RequestId = input.ReadUInt32();
            break;
          }
          case 18: {
            if (extensionFields_ == null) {
              ExtensionFields = new global::Iscp2.V1.Extensions.PongExtensionFields();
            }
            input.ReadMessage(ExtensionFields);
            break;
          }
        }
      }
    #endif
    }

    #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    void pb::IBufferMessage.InternalMergeFrom(ref pb::ParseContext input) {
      uint tag;
      while ((tag = input.ReadTag()) != 0) {
        switch(tag) {
          default:
            _unknownFields = pb::UnknownFieldSet.MergeFieldFrom(_unknownFields, ref input);
            break;
          case 8: {
            RequestId = input.ReadUInt32();
            break;
          }
          case 18: {
            if (extensionFields_ == null) {
              ExtensionFields = new global::Iscp2.V1.Extensions.PongExtensionFields();
            }
            input.ReadMessage(ExtensionFields);
            break;
          }
        }
      }
    }
    #endif

  }

  #endregion

}

#endregion Designer generated code
