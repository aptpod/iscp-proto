// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: iscp2/v1/metadata.proto
//
// For information on using the generated types, please see the documentation:
//   https://github.com/apple/swift-protobuf/

import Foundation
import SwiftProtobuf

// If the compiler emits an error on this type, it is because this file
// was generated by a version of the `protoc` Swift plug-in that is
// incompatible with the version of SwiftProtobuf to which you are linking.
// Please ensure that you are building against the same version of the API
// that was used to generate this file.
fileprivate struct _GeneratedWithProtocGenSwiftVersion: SwiftProtobuf.ProtobufAPIVersionCheck {
  struct _2: SwiftProtobuf.ProtobufAPIVersion_2 {}
  typealias Version = _2
}

struct Iscp2_V1_BaseTime {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var sessionID: String = String()

  var name: String = String()

  var priority: UInt32 = 0

  var elapsedTime: UInt64 = 0

  var baseTime: Int64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Iscp2_V1_UpstreamOpen {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var streamID: Data = Data()

  var sessionID: String = String()

  var qos: Iscp2_V1_QoS = .unreliable

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Iscp2_V1_UpstreamAbnormalClose {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var streamID: Data = Data()

  var sessionID: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Iscp2_V1_UpstreamResume {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var streamID: Data = Data()

  var sessionID: String = String()

  var qos: Iscp2_V1_QoS = .unreliable

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Iscp2_V1_UpstreamNormalClose {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var streamID: Data = Data()

  var sessionID: String = String()

  var totalDataPoints: UInt64 = 0

  var finalSequenceNumber: UInt32 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Iscp2_V1_DownstreamOpen {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var streamID: Data = Data()

  var downstreamFilters: [Iscp2_V1_DownstreamFilter] = []

  var qos: Iscp2_V1_QoS = .unreliable

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Iscp2_V1_DownstreamAbnormalClose {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var streamID: Data = Data()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Iscp2_V1_DownstreamResume {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var streamID: Data = Data()

  var downstreamFilters: [Iscp2_V1_DownstreamFilter] = []

  var qos: Iscp2_V1_QoS = .unreliable

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Iscp2_V1_DownstreamNormalClose {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var streamID: Data = Data()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Iscp2_V1_BaseTime: @unchecked Sendable {}
extension Iscp2_V1_UpstreamOpen: @unchecked Sendable {}
extension Iscp2_V1_UpstreamAbnormalClose: @unchecked Sendable {}
extension Iscp2_V1_UpstreamResume: @unchecked Sendable {}
extension Iscp2_V1_UpstreamNormalClose: @unchecked Sendable {}
extension Iscp2_V1_DownstreamOpen: @unchecked Sendable {}
extension Iscp2_V1_DownstreamAbnormalClose: @unchecked Sendable {}
extension Iscp2_V1_DownstreamResume: @unchecked Sendable {}
extension Iscp2_V1_DownstreamNormalClose: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "iscp2.v1"

extension Iscp2_V1_BaseTime: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".BaseTime"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "session_id"),
    2: .same(proto: "name"),
    3: .same(proto: "priority"),
    4: .standard(proto: "elapsed_time"),
    5: .standard(proto: "base_time"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.sessionID) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.name) }()
      case 3: try { try decoder.decodeSingularUInt32Field(value: &self.priority) }()
      case 4: try { try decoder.decodeSingularUInt64Field(value: &self.elapsedTime) }()
      case 5: try { try decoder.decodeSingularSInt64Field(value: &self.baseTime) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.sessionID.isEmpty {
      try visitor.visitSingularStringField(value: self.sessionID, fieldNumber: 1)
    }
    if !self.name.isEmpty {
      try visitor.visitSingularStringField(value: self.name, fieldNumber: 2)
    }
    if self.priority != 0 {
      try visitor.visitSingularUInt32Field(value: self.priority, fieldNumber: 3)
    }
    if self.elapsedTime != 0 {
      try visitor.visitSingularUInt64Field(value: self.elapsedTime, fieldNumber: 4)
    }
    if self.baseTime != 0 {
      try visitor.visitSingularSInt64Field(value: self.baseTime, fieldNumber: 5)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Iscp2_V1_BaseTime, rhs: Iscp2_V1_BaseTime) -> Bool {
    if lhs.sessionID != rhs.sessionID {return false}
    if lhs.name != rhs.name {return false}
    if lhs.priority != rhs.priority {return false}
    if lhs.elapsedTime != rhs.elapsedTime {return false}
    if lhs.baseTime != rhs.baseTime {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Iscp2_V1_UpstreamOpen: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".UpstreamOpen"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "stream_id"),
    2: .standard(proto: "session_id"),
    3: .same(proto: "qos"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularBytesField(value: &self.streamID) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.sessionID) }()
      case 3: try { try decoder.decodeSingularEnumField(value: &self.qos) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.streamID.isEmpty {
      try visitor.visitSingularBytesField(value: self.streamID, fieldNumber: 1)
    }
    if !self.sessionID.isEmpty {
      try visitor.visitSingularStringField(value: self.sessionID, fieldNumber: 2)
    }
    if self.qos != .unreliable {
      try visitor.visitSingularEnumField(value: self.qos, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Iscp2_V1_UpstreamOpen, rhs: Iscp2_V1_UpstreamOpen) -> Bool {
    if lhs.streamID != rhs.streamID {return false}
    if lhs.sessionID != rhs.sessionID {return false}
    if lhs.qos != rhs.qos {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Iscp2_V1_UpstreamAbnormalClose: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".UpstreamAbnormalClose"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "stream_id"),
    2: .standard(proto: "session_id"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularBytesField(value: &self.streamID) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.sessionID) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.streamID.isEmpty {
      try visitor.visitSingularBytesField(value: self.streamID, fieldNumber: 1)
    }
    if !self.sessionID.isEmpty {
      try visitor.visitSingularStringField(value: self.sessionID, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Iscp2_V1_UpstreamAbnormalClose, rhs: Iscp2_V1_UpstreamAbnormalClose) -> Bool {
    if lhs.streamID != rhs.streamID {return false}
    if lhs.sessionID != rhs.sessionID {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Iscp2_V1_UpstreamResume: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".UpstreamResume"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "stream_id"),
    2: .standard(proto: "session_id"),
    3: .same(proto: "qos"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularBytesField(value: &self.streamID) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.sessionID) }()
      case 3: try { try decoder.decodeSingularEnumField(value: &self.qos) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.streamID.isEmpty {
      try visitor.visitSingularBytesField(value: self.streamID, fieldNumber: 1)
    }
    if !self.sessionID.isEmpty {
      try visitor.visitSingularStringField(value: self.sessionID, fieldNumber: 2)
    }
    if self.qos != .unreliable {
      try visitor.visitSingularEnumField(value: self.qos, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Iscp2_V1_UpstreamResume, rhs: Iscp2_V1_UpstreamResume) -> Bool {
    if lhs.streamID != rhs.streamID {return false}
    if lhs.sessionID != rhs.sessionID {return false}
    if lhs.qos != rhs.qos {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Iscp2_V1_UpstreamNormalClose: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".UpstreamNormalClose"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "stream_id"),
    2: .standard(proto: "session_id"),
    3: .standard(proto: "total_data_points"),
    4: .standard(proto: "final_sequence_number"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularBytesField(value: &self.streamID) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.sessionID) }()
      case 3: try { try decoder.decodeSingularUInt64Field(value: &self.totalDataPoints) }()
      case 4: try { try decoder.decodeSingularUInt32Field(value: &self.finalSequenceNumber) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.streamID.isEmpty {
      try visitor.visitSingularBytesField(value: self.streamID, fieldNumber: 1)
    }
    if !self.sessionID.isEmpty {
      try visitor.visitSingularStringField(value: self.sessionID, fieldNumber: 2)
    }
    if self.totalDataPoints != 0 {
      try visitor.visitSingularUInt64Field(value: self.totalDataPoints, fieldNumber: 3)
    }
    if self.finalSequenceNumber != 0 {
      try visitor.visitSingularUInt32Field(value: self.finalSequenceNumber, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Iscp2_V1_UpstreamNormalClose, rhs: Iscp2_V1_UpstreamNormalClose) -> Bool {
    if lhs.streamID != rhs.streamID {return false}
    if lhs.sessionID != rhs.sessionID {return false}
    if lhs.totalDataPoints != rhs.totalDataPoints {return false}
    if lhs.finalSequenceNumber != rhs.finalSequenceNumber {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Iscp2_V1_DownstreamOpen: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".DownstreamOpen"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "stream_id"),
    2: .standard(proto: "downstream_filters"),
    3: .same(proto: "qos"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularBytesField(value: &self.streamID) }()
      case 2: try { try decoder.decodeRepeatedMessageField(value: &self.downstreamFilters) }()
      case 3: try { try decoder.decodeSingularEnumField(value: &self.qos) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.streamID.isEmpty {
      try visitor.visitSingularBytesField(value: self.streamID, fieldNumber: 1)
    }
    if !self.downstreamFilters.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.downstreamFilters, fieldNumber: 2)
    }
    if self.qos != .unreliable {
      try visitor.visitSingularEnumField(value: self.qos, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Iscp2_V1_DownstreamOpen, rhs: Iscp2_V1_DownstreamOpen) -> Bool {
    if lhs.streamID != rhs.streamID {return false}
    if lhs.downstreamFilters != rhs.downstreamFilters {return false}
    if lhs.qos != rhs.qos {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Iscp2_V1_DownstreamAbnormalClose: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".DownstreamAbnormalClose"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "stream_id"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularBytesField(value: &self.streamID) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.streamID.isEmpty {
      try visitor.visitSingularBytesField(value: self.streamID, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Iscp2_V1_DownstreamAbnormalClose, rhs: Iscp2_V1_DownstreamAbnormalClose) -> Bool {
    if lhs.streamID != rhs.streamID {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Iscp2_V1_DownstreamResume: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".DownstreamResume"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "stream_id"),
    2: .standard(proto: "downstream_filters"),
    3: .same(proto: "qos"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularBytesField(value: &self.streamID) }()
      case 2: try { try decoder.decodeRepeatedMessageField(value: &self.downstreamFilters) }()
      case 3: try { try decoder.decodeSingularEnumField(value: &self.qos) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.streamID.isEmpty {
      try visitor.visitSingularBytesField(value: self.streamID, fieldNumber: 1)
    }
    if !self.downstreamFilters.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.downstreamFilters, fieldNumber: 2)
    }
    if self.qos != .unreliable {
      try visitor.visitSingularEnumField(value: self.qos, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Iscp2_V1_DownstreamResume, rhs: Iscp2_V1_DownstreamResume) -> Bool {
    if lhs.streamID != rhs.streamID {return false}
    if lhs.downstreamFilters != rhs.downstreamFilters {return false}
    if lhs.qos != rhs.qos {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Iscp2_V1_DownstreamNormalClose: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".DownstreamNormalClose"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "stream_id"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularBytesField(value: &self.streamID) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.streamID.isEmpty {
      try visitor.visitSingularBytesField(value: self.streamID, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Iscp2_V1_DownstreamNormalClose, rhs: Iscp2_V1_DownstreamNormalClose) -> Bool {
    if lhs.streamID != rhs.streamID {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
