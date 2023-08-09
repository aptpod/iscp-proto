// @generated by protoc-gen-es v1.3.0 with parameter "target=ts"
// @generated from file iscp2/v1/result_code.proto (package iscp2.v1, syntax proto3)
/* eslint-disable */
// @ts-nocheck

import { proto3 } from "@bufbuild/protobuf";

/**
 * @generated from enum iscp2.v1.ResultCode
 */
export enum ResultCode {
  /**
   * @generated from enum value: SUCCEEDED = 0;
   */
  SUCCEEDED = 0,

  /**
   * @generated from enum value: NORMAL_CLOSURE = 0;
   */
  NORMAL_CLOSURE = 0,

  /**
   * @generated from enum value: INCOMPATIBLE_VERSION = 1;
   */
  INCOMPATIBLE_VERSION = 1,

  /**
   * @generated from enum value: MAXIMUM_DATA_ID_ALIAS = 2;
   */
  MAXIMUM_DATA_ID_ALIAS = 2,

  /**
   * @generated from enum value: MAXIMUM_UPSTREAM_ALIAS = 3;
   */
  MAXIMUM_UPSTREAM_ALIAS = 3,

  /**
   * @generated from enum value: UNSPECIFIED_ERROR = 64;
   */
  UNSPECIFIED_ERROR = 64,

  /**
   * @generated from enum value: NO_NODE_ID = 65;
   */
  NO_NODE_ID = 65,

  /**
   * @generated from enum value: AUTH_FAILED = 66;
   */
  AUTH_FAILED = 66,

  /**
   * @generated from enum value: CONNECT_TIMEOUT = 67;
   */
  CONNECT_TIMEOUT = 67,

  /**
   * @generated from enum value: MALFORMED_MESSAGE = 68;
   */
  MALFORMED_MESSAGE = 68,

  /**
   * @generated from enum value: PROTOCOL_ERROR = 69;
   */
  PROTOCOL_ERROR = 69,

  /**
   * @generated from enum value: ACK_TIMEOUT = 70;
   */
  ACK_TIMEOUT = 70,

  /**
   * @generated from enum value: INVALID_PAYLOAD = 71;
   */
  INVALID_PAYLOAD = 71,

  /**
   * @generated from enum value: INVALID_DATA_ID = 72;
   */
  INVALID_DATA_ID = 72,

  /**
   * @generated from enum value: INVALID_DATA_ID_ALIAS = 73;
   */
  INVALID_DATA_ID_ALIAS = 73,

  /**
   * @generated from enum value: INVALID_DATA_FILTER = 74;
   */
  INVALID_DATA_FILTER = 74,

  /**
   * @generated from enum value: STREAM_NOT_FOUND = 75;
   */
  STREAM_NOT_FOUND = 75,

  /**
   * @generated from enum value: RESUME_REQUEST_CONFLICT = 76;
   */
  RESUME_REQUEST_CONFLICT = 76,

  /**
   * @generated from enum value: PROCESS_FAILED = 77;
   */
  PROCESS_FAILED = 77,

  /**
   * @generated from enum value: DESIRED_QOS_NOT_SUPPORTED = 78;
   */
  DESIRED_QOS_NOT_SUPPORTED = 78,

  /**
   * @generated from enum value: PING_TIMEOUT = 79;
   */
  PING_TIMEOUT = 79,

  /**
   * @generated from enum value: TOO_LARGE_MESSAGE_SIZE = 80;
   */
  TOO_LARGE_MESSAGE_SIZE = 80,

  /**
   * @generated from enum value: TOO_MANY_DATA_ID_ALIASES = 81;
   */
  TOO_MANY_DATA_ID_ALIASES = 81,

  /**
   * @generated from enum value: TOO_MANY_STREAMS = 82;
   */
  TOO_MANY_STREAMS = 82,

  /**
   * @generated from enum value: TOO_LONG_ACK_INTERVAL = 83;
   */
  TOO_LONG_ACK_INTERVAL = 83,

  /**
   * @generated from enum value: TOO_MANY_DOWNSTREAM_FILTERS = 84;
   */
  TOO_MANY_DOWNSTREAM_FILTERS = 84,

  /**
   * @generated from enum value: TOO_MANY_DATA_FILTERS = 85;
   */
  TOO_MANY_DATA_FILTERS = 85,

  /**
   * @generated from enum value: TOO_LONG_EXPIRY_INTERVAL = 86;
   */
  TOO_LONG_EXPIRY_INTERVAL = 86,

  /**
   * @generated from enum value: TOO_LONG_PING_TIMEOUT = 87;
   */
  TOO_LONG_PING_TIMEOUT = 87,

  /**
   * @generated from enum value: TOO_SHORT_PING_INTERVAL = 88;
   */
  TOO_SHORT_PING_INTERVAL = 88,

  /**
   * @generated from enum value: TOO_SHORT_PING_TIMEOUT = 89;
   */
  TOO_SHORT_PING_TIMEOUT = 89,

  /**
   * @generated from enum value: RATE_LIMIT_REACHED = 90;
   */
  RATE_LIMIT_REACHED = 90,

  /**
   * @generated from enum value: NODE_ID_MISMATCH = 128;
   */
  NODE_ID_MISMATCH = 128,

  /**
   * @generated from enum value: SESSION_NOT_FOUND = 129;
   */
  SESSION_NOT_FOUND = 129,

  /**
   * @generated from enum value: SESSION_ALREADY_CLOSED = 130;
   */
  SESSION_ALREADY_CLOSED = 130,

  /**
   * @generated from enum value: SESSION_CANNOT_CLOSED = 131;
   */
  SESSION_CANNOT_CLOSED = 131,
}
// Retrieve enum metadata with: proto3.getEnumType(ResultCode)
proto3.util.setEnumType(ResultCode, "iscp2.v1.ResultCode", [
  { no: 0, name: "SUCCEEDED" },
  { no: 0, name: "NORMAL_CLOSURE" },
  { no: 1, name: "INCOMPATIBLE_VERSION" },
  { no: 2, name: "MAXIMUM_DATA_ID_ALIAS" },
  { no: 3, name: "MAXIMUM_UPSTREAM_ALIAS" },
  { no: 64, name: "UNSPECIFIED_ERROR" },
  { no: 65, name: "NO_NODE_ID" },
  { no: 66, name: "AUTH_FAILED" },
  { no: 67, name: "CONNECT_TIMEOUT" },
  { no: 68, name: "MALFORMED_MESSAGE" },
  { no: 69, name: "PROTOCOL_ERROR" },
  { no: 70, name: "ACK_TIMEOUT" },
  { no: 71, name: "INVALID_PAYLOAD" },
  { no: 72, name: "INVALID_DATA_ID" },
  { no: 73, name: "INVALID_DATA_ID_ALIAS" },
  { no: 74, name: "INVALID_DATA_FILTER" },
  { no: 75, name: "STREAM_NOT_FOUND" },
  { no: 76, name: "RESUME_REQUEST_CONFLICT" },
  { no: 77, name: "PROCESS_FAILED" },
  { no: 78, name: "DESIRED_QOS_NOT_SUPPORTED" },
  { no: 79, name: "PING_TIMEOUT" },
  { no: 80, name: "TOO_LARGE_MESSAGE_SIZE" },
  { no: 81, name: "TOO_MANY_DATA_ID_ALIASES" },
  { no: 82, name: "TOO_MANY_STREAMS" },
  { no: 83, name: "TOO_LONG_ACK_INTERVAL" },
  { no: 84, name: "TOO_MANY_DOWNSTREAM_FILTERS" },
  { no: 85, name: "TOO_MANY_DATA_FILTERS" },
  { no: 86, name: "TOO_LONG_EXPIRY_INTERVAL" },
  { no: 87, name: "TOO_LONG_PING_TIMEOUT" },
  { no: 88, name: "TOO_SHORT_PING_INTERVAL" },
  { no: 89, name: "TOO_SHORT_PING_TIMEOUT" },
  { no: 90, name: "RATE_LIMIT_REACHED" },
  { no: 128, name: "NODE_ID_MISMATCH" },
  { no: 129, name: "SESSION_NOT_FOUND" },
  { no: 130, name: "SESSION_ALREADY_CLOSED" },
  { no: 131, name: "SESSION_CANNOT_CLOSED" },
]);
