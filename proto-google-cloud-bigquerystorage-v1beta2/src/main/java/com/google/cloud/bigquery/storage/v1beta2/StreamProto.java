/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/storage/v1beta2/stream.proto

package com.google.cloud.bigquery.storage.v1beta2;

public final class StreamProto {
  private StreamProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_storage_v1beta2_ReadSession_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_storage_v1beta2_ReadSession_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_storage_v1beta2_ReadSession_TableModifiers_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_storage_v1beta2_ReadSession_TableModifiers_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_storage_v1beta2_ReadSession_TableReadOptions_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_storage_v1beta2_ReadSession_TableReadOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_storage_v1beta2_ReadStream_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_storage_v1beta2_ReadStream_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_storage_v1beta2_WriteStream_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_storage_v1beta2_WriteStream_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + "2google/cloud/bigquery/storage/v1beta2/stream.proto\022%google.cloud.bigquery.stor"
          + "age.v1beta2\032\037google/api/field_behavior.p"
          + "roto\032\031google/api/resource.proto\0321google/"
          + "cloud/bigquery/storage/v1beta2/arrow.proto\0320google/cloud/bigquery/storage/v1beta"
          + "2/avro.proto\0321google/cloud/bigquery/storage/v1beta2/table.proto\032\037google/protobuf/timestamp.proto\"\362\007\n"
          + "\013ReadSession\022\021\n"
          + "\004name\030\001 \001(\tB\003\340A\003\0224\n"
          + "\013expire_time\030\002 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\022K\n"
          + "\013data_format\030\003"
          + " \001(\01621.google.cloud.bigquery.storage.v1beta2.DataFormatB\003\340A\005\022M\n"
          + "\013avro_schema\030\004"
          + " \001(\01321.google.cloud.bigquery.storage.v1beta2.AvroSchemaB\003\340A\003H\000\022O\n"
          + "\014arrow_schema\030\005"
          + " \001(\01322.google.cloud.bigquery.storage.v1beta2.ArrowSchemaB\003\340A\003H\000\0224\n"
          + "\005table\030\006 \001(\tB%\340A\005\372A\037\n"
          + "\035bigquery.googleapis.com/Table\022_\n"
          + "\017table_modifiers\030\007"
          + " \001(\0132A.google.cloud.bigquery.storage.v1beta2.ReadSession.TableModifiersB\003\340A\001\022^\n"
          + "\014read_options\030\010"
          + " \001(\0132C.google.cloud.bigquery.storage.v1beta2.ReadSession.TableReadOptionsB\003\340A\001\022G\n"
          + "\007streams\030\n"
          + " \003(\01321.google.cloud.bigquery.storage.v1beta2.ReadStreamB\003\340A\003\032C\n"
          + "\016TableModifiers\0221\n\r"
          + "snapshot_time\030\001 \001(\0132\032.google.protobuf.Timestamp\032\260\001\n"
          + "\020TableReadOptions\022\027\n"
          + "\017selected_fields\030\001 \003(\t\022\027\n"
          + "\017row_restriction\030\002 \001(\t\022j\n"
          + "\033arrow_serialization_options\030\003"
          + " \001(\0132@.google.cloud.bigquery.storage.v1beta2.ArrowSerializationOptionsB\003\340A\001:k\352Ah\n"
          + "*bigquerystorage.googleapis.com/ReadSession\022:projects/{project}/locations/{location}/sessions/{session}B\010\n"
          + "\006schema\"\234\001\n\n"
          + "ReadStream\022\021\n"
          + "\004name\030\001 \001(\tB\003\340A\003:{\352Ax\n"
          + ")bigquerystorage.googleapis.com/ReadStream\022Kprojects/{project}/locations/{location}/sessions/{session}/streams/{stream}\"\347\003\n"
          + "\013WriteStream\022\021\n"
          + "\004name\030\001 \001(\tB\003\340A\003\022J\n"
          + "\004type\030\002"
          + " \001(\01627.google.cloud.bigquery.storage.v1beta2.WriteStream.TypeB\003\340A\005\0224\n"
          + "\013create_time\030\003 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\0224\n"
          + "\013commit_time\030\004 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\022M\n"
          + "\014table_schema\030\005"
          + " \001(\01322.google.cloud.bigquery.storage.v1beta2.TableSchemaB\003\340A\003\"F\n"
          + "\004Type\022\024\n"
          + "\020TYPE_UNSPECIFIED\020\000\022\r\n"
          + "\tCOMMITTED\020\001\022\013\n"
          + "\007PENDING\020\002\022\014\n"
          + "\010BUFFERED\020\003:v\352As\n"
          + "*bigquerystorage.googleapis.com/WriteStream\022Eprojects/{project}/datasets/{dataset}/tables/{table}/streams/{stream}*>\n\n"
          + "DataFormat\022\033\n"
          + "\027DATA_FORMAT_UNSPECIFIED\020\000\022\010\n"
          + "\004AVRO\020\001\022\t\n"
          + "\005ARROW\020\002B\340\001\n"
          + ")com.google.cloud.bigquery.storage.v1beta2B\013StreamProt"
          + "oP\001ZLgoogle.golang.org/genproto/googleapis/cloud/bigquery/storage/v1beta2;storage\352AU\n"
          + "\035bigquery.googleapis.com/Table\0224projects/{project}/datasets/{dataset}/table"
          + "s/{table}b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.bigquery.storage.v1beta2.ArrowProto.getDescriptor(),
              com.google.cloud.bigquery.storage.v1beta2.AvroProto.getDescriptor(),
              com.google.cloud.bigquery.storage.v1beta2.TableProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_bigquery_storage_v1beta2_ReadSession_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_bigquery_storage_v1beta2_ReadSession_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_storage_v1beta2_ReadSession_descriptor,
            new java.lang.String[] {
              "Name",
              "ExpireTime",
              "DataFormat",
              "AvroSchema",
              "ArrowSchema",
              "Table",
              "TableModifiers",
              "ReadOptions",
              "Streams",
              "Schema",
            });
    internal_static_google_cloud_bigquery_storage_v1beta2_ReadSession_TableModifiers_descriptor =
        internal_static_google_cloud_bigquery_storage_v1beta2_ReadSession_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_bigquery_storage_v1beta2_ReadSession_TableModifiers_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_storage_v1beta2_ReadSession_TableModifiers_descriptor,
            new java.lang.String[] {
              "SnapshotTime",
            });
    internal_static_google_cloud_bigquery_storage_v1beta2_ReadSession_TableReadOptions_descriptor =
        internal_static_google_cloud_bigquery_storage_v1beta2_ReadSession_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_bigquery_storage_v1beta2_ReadSession_TableReadOptions_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_storage_v1beta2_ReadSession_TableReadOptions_descriptor,
            new java.lang.String[] {
              "SelectedFields", "RowRestriction", "ArrowSerializationOptions",
            });
    internal_static_google_cloud_bigquery_storage_v1beta2_ReadStream_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_bigquery_storage_v1beta2_ReadStream_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_storage_v1beta2_ReadStream_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_bigquery_storage_v1beta2_WriteStream_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_bigquery_storage_v1beta2_WriteStream_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_storage_v1beta2_WriteStream_descriptor,
            new java.lang.String[] {
              "Name", "Type", "CreateTime", "CommitTime", "TableSchema",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.bigquery.storage.v1beta2.ArrowProto.getDescriptor();
    com.google.cloud.bigquery.storage.v1beta2.AvroProto.getDescriptor();
    com.google.cloud.bigquery.storage.v1beta2.TableProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
