package com.titan.gather.model;// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ParentMessage.proto

public final class ParentMessage {
  private ParentMessage() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface parent_messageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:parent_message)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 messageLen = 1;</code>
     */
    int getMessageLen();

    /**
     * <code>string cmdValue = 2;</code>
     */
    String getCmdValue();
    /**
     * <code>string cmdValue = 2;</code>
     */
    com.google.protobuf.ByteString
        getCmdValueBytes();

    /**
     * <code>.google.protobuf.Any data = 3;</code>
     */
    boolean hasData();
    /**
     * <code>.google.protobuf.Any data = 3;</code>
     */
    com.google.protobuf.Any getData();
    /**
     * <code>.google.protobuf.Any data = 3;</code>
     */
    com.google.protobuf.AnyOrBuilder getDataOrBuilder();
  }
  /**
   * Protobuf type {@code parent_message}
   */
  public  static final class parent_message extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:parent_message)
      parent_messageOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use parent_message.newBuilder() to construct.
    private parent_message(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private parent_message() {
      messageLen_ = 0;
      cmdValue_ = "";
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private parent_message(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {

              messageLen_ = input.readInt32();
              break;
            }
            case 18: {
              String s = input.readStringRequireUtf8();

              cmdValue_ = s;
              break;
            }
            case 26: {
              com.google.protobuf.Any.Builder subBuilder = null;
              if (data_ != null) {
                subBuilder = data_.toBuilder();
              }
              data_ = input.readMessage(com.google.protobuf.Any.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(data_);
                data_ = subBuilder.buildPartial();
              }

              break;
            }
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ParentMessage.internal_static_parent_message_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ParentMessage.internal_static_parent_message_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              parent_message.class, Builder.class);
    }

    public static final int MESSAGELEN_FIELD_NUMBER = 1;
    private int messageLen_;
    /**
     * <code>int32 messageLen = 1;</code>
     */
    public int getMessageLen() {
      return messageLen_;
    }

    public static final int CMDVALUE_FIELD_NUMBER = 2;
    private volatile Object cmdValue_;
    /**
     * <code>string cmdValue = 2;</code>
     */
    public String getCmdValue() {
      Object ref = cmdValue_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        cmdValue_ = s;
        return s;
      }
    }
    /**
     * <code>string cmdValue = 2;</code>
     */
    public com.google.protobuf.ByteString
        getCmdValueBytes() {
      Object ref = cmdValue_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        cmdValue_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int DATA_FIELD_NUMBER = 3;
    private com.google.protobuf.Any data_;
    /**
     * <code>.google.protobuf.Any data = 3;</code>
     */
    public boolean hasData() {
      return data_ != null;
    }
    /**
     * <code>.google.protobuf.Any data = 3;</code>
     */
    public com.google.protobuf.Any getData() {
      return data_ == null ? com.google.protobuf.Any.getDefaultInstance() : data_;
    }
    /**
     * <code>.google.protobuf.Any data = 3;</code>
     */
    public com.google.protobuf.AnyOrBuilder getDataOrBuilder() {
      return getData();
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (messageLen_ != 0) {
        output.writeInt32(1, messageLen_);
      }
      if (!getCmdValueBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, cmdValue_);
      }
      if (data_ != null) {
        output.writeMessage(3, getData());
      }
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (messageLen_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, messageLen_);
      }
      if (!getCmdValueBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, cmdValue_);
      }
      if (data_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, getData());
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof parent_message)) {
        return super.equals(obj);
      }
      parent_message other = (parent_message) obj;

      boolean result = true;
      result = result && (getMessageLen()
          == other.getMessageLen());
      result = result && getCmdValue()
          .equals(other.getCmdValue());
      result = result && (hasData() == other.hasData());
      if (hasData()) {
        result = result && getData()
            .equals(other.getData());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + MESSAGELEN_FIELD_NUMBER;
      hash = (53 * hash) + getMessageLen();
      hash = (37 * hash) + CMDVALUE_FIELD_NUMBER;
      hash = (53 * hash) + getCmdValue().hashCode();
      if (hasData()) {
        hash = (37 * hash) + DATA_FIELD_NUMBER;
        hash = (53 * hash) + getData().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static parent_message parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static parent_message parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static parent_message parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static parent_message parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static parent_message parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static parent_message parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static parent_message parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static parent_message parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static parent_message parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static parent_message parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static parent_message parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static parent_message parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(parent_message prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code parent_message}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:parent_message)
        parent_messageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ParentMessage.internal_static_parent_message_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ParentMessage.internal_static_parent_message_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                parent_message.class, Builder.class);
      }

      // Construct using ParentMessage.parent_message.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        messageLen_ = 0;

        cmdValue_ = "";

        if (dataBuilder_ == null) {
          data_ = null;
        } else {
          data_ = null;
          dataBuilder_ = null;
        }
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ParentMessage.internal_static_parent_message_descriptor;
      }

      @Override
      public parent_message getDefaultInstanceForType() {
        return parent_message.getDefaultInstance();
      }

      @Override
      public parent_message build() {
        parent_message result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public parent_message buildPartial() {
        parent_message result = new parent_message(this);
        result.messageLen_ = messageLen_;
        result.cmdValue_ = cmdValue_;
        if (dataBuilder_ == null) {
          result.data_ = data_;
        } else {
          result.data_ = dataBuilder_.build();
        }
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof parent_message) {
          return mergeFrom((parent_message)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(parent_message other) {
        if (other == parent_message.getDefaultInstance()) return this;
        if (other.getMessageLen() != 0) {
          setMessageLen(other.getMessageLen());
        }
        if (!other.getCmdValue().isEmpty()) {
          cmdValue_ = other.cmdValue_;
          onChanged();
        }
        if (other.hasData()) {
          mergeData(other.getData());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        parent_message parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (parent_message) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int messageLen_ ;
      /**
       * <code>int32 messageLen = 1;</code>
       */
      public int getMessageLen() {
        return messageLen_;
      }
      /**
       * <code>int32 messageLen = 1;</code>
       */
      public Builder setMessageLen(int value) {
        
        messageLen_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 messageLen = 1;</code>
       */
      public Builder clearMessageLen() {
        
        messageLen_ = 0;
        onChanged();
        return this;
      }

      private Object cmdValue_ = "";
      /**
       * <code>string cmdValue = 2;</code>
       */
      public String getCmdValue() {
        Object ref = cmdValue_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          cmdValue_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string cmdValue = 2;</code>
       */
      public com.google.protobuf.ByteString
          getCmdValueBytes() {
        Object ref = cmdValue_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          cmdValue_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string cmdValue = 2;</code>
       */
      public Builder setCmdValue(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        cmdValue_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string cmdValue = 2;</code>
       */
      public Builder clearCmdValue() {
        
        cmdValue_ = getDefaultInstance().getCmdValue();
        onChanged();
        return this;
      }
      /**
       * <code>string cmdValue = 2;</code>
       */
      public Builder setCmdValueBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        cmdValue_ = value;
        onChanged();
        return this;
      }

      private com.google.protobuf.Any data_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> dataBuilder_;
      /**
       * <code>.google.protobuf.Any data = 3;</code>
       */
      public boolean hasData() {
        return dataBuilder_ != null || data_ != null;
      }
      /**
       * <code>.google.protobuf.Any data = 3;</code>
       */
      public com.google.protobuf.Any getData() {
        if (dataBuilder_ == null) {
          return data_ == null ? com.google.protobuf.Any.getDefaultInstance() : data_;
        } else {
          return dataBuilder_.getMessage();
        }
      }
      /**
       * <code>.google.protobuf.Any data = 3;</code>
       */
      public Builder setData(com.google.protobuf.Any value) {
        if (dataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          data_ = value;
          onChanged();
        } else {
          dataBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.google.protobuf.Any data = 3;</code>
       */
      public Builder setData(
          com.google.protobuf.Any.Builder builderForValue) {
        if (dataBuilder_ == null) {
          data_ = builderForValue.build();
          onChanged();
        } else {
          dataBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.google.protobuf.Any data = 3;</code>
       */
      public Builder mergeData(com.google.protobuf.Any value) {
        if (dataBuilder_ == null) {
          if (data_ != null) {
            data_ =
              com.google.protobuf.Any.newBuilder(data_).mergeFrom(value).buildPartial();
          } else {
            data_ = value;
          }
          onChanged();
        } else {
          dataBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.google.protobuf.Any data = 3;</code>
       */
      public Builder clearData() {
        if (dataBuilder_ == null) {
          data_ = null;
          onChanged();
        } else {
          data_ = null;
          dataBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.google.protobuf.Any data = 3;</code>
       */
      public com.google.protobuf.Any.Builder getDataBuilder() {
        
        onChanged();
        return getDataFieldBuilder().getBuilder();
      }
      /**
       * <code>.google.protobuf.Any data = 3;</code>
       */
      public com.google.protobuf.AnyOrBuilder getDataOrBuilder() {
        if (dataBuilder_ != null) {
          return dataBuilder_.getMessageOrBuilder();
        } else {
          return data_ == null ?
              com.google.protobuf.Any.getDefaultInstance() : data_;
        }
      }
      /**
       * <code>.google.protobuf.Any data = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> 
          getDataFieldBuilder() {
        if (dataBuilder_ == null) {
          dataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder>(
                  getData(),
                  getParentForChildren(),
                  isClean());
          data_ = null;
        }
        return dataBuilder_;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:parent_message)
    }

    // @@protoc_insertion_point(class_scope:parent_message)
    private static final parent_message DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new parent_message();
    }

    public static parent_message getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<parent_message>
        PARSER = new com.google.protobuf.AbstractParser<parent_message>() {
      @Override
      public parent_message parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new parent_message(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<parent_message> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<parent_message> getParserForType() {
      return PARSER;
    }

    @Override
    public parent_message getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_parent_message_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_parent_message_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\023ParentMessage.proto\032\031google/protobuf/a" +
      "ny.proto\"Z\n\016parent_message\022\022\n\nmessageLen" +
      "\030\001 \001(\005\022\020\n\010cmdValue\030\002 \001(\t\022\"\n\004data\030\003 \001(\0132\024" +
      ".google.protobuf.AnyB\017B\rParentMessageb\006p" +
      "roto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.AnyProto.getDescriptor(),
        }, assigner);
    internal_static_parent_message_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_parent_message_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_parent_message_descriptor,
        new String[] { "MessageLen", "CmdValue", "Data", });
    com.google.protobuf.AnyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
