// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: sample.proto
// Protobuf Java Version: 4.27.0

package org.springframework.protobuf;

public interface MsgOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Msg)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string foo = 1;</code>
   * @return Whether the foo field is set.
   */
  boolean hasFoo();
  /**
   * <code>optional string foo = 1;</code>
   * @return The foo.
   */
  java.lang.String getFoo();
  /**
   * <code>optional string foo = 1;</code>
   * @return The bytes for foo.
   */
  com.google.protobuf.ByteString
      getFooBytes();

  /**
   * <code>optional .SecondMsg blah = 2;</code>
   * @return Whether the blah field is set.
   */
  boolean hasBlah();
  /**
   * <code>optional .SecondMsg blah = 2;</code>
   * @return The blah.
   */
  org.springframework.protobuf.SecondMsg getBlah();
  /**
   * <code>optional .SecondMsg blah = 2;</code>
   */
  org.springframework.protobuf.SecondMsgOrBuilder getBlahOrBuilder();
}
