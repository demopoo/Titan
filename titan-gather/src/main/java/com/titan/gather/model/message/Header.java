package com.titan.gather.model.message;// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: header.proto

public final class Header {
  private Header() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface headerOrBuilder extends
      // @@protoc_insertion_point(interface_extends:header)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>fixed32 crcCode = 1;</code>
     */
    int getCrcCode();

    /**
     * <code>fixed32 length = 2;</code>
     */
    int getLength();

    /**
     * <code>fixed64 sessionID = 3;</code>
     */
    long getSessionID();

    /**
     * <code>int32 type = 4;</code>
     */
    int getType();

    /**
     * <code>int32 priority = 5;</code>
     */
    int getPriority();

    /**
     * <code>map&lt;string, string&gt; attachment = 6;</code>
     */
    int getAttachmentCount();
    /**
     * <code>map&lt;string, string&gt; attachment = 6;</code>
     */
    boolean containsAttachment(
            String key);
    /**
     * Use {@link #getAttachmentMap()} instead.
     */
    @Deprecated
    java.util.Map<String, String>
    getAttachment();
    /**
     * <code>map&lt;string, string&gt; attachment = 6;</code>
     */
    java.util.Map<String, String>
    getAttachmentMap();
    /**
     * <code>map&lt;string, string&gt; attachment = 6;</code>
     */

    String getAttachmentOrDefault(
            String key,
            String defaultValue);
    /**
     * <code>map&lt;string, string&gt; attachment = 6;</code>
     */

    String getAttachmentOrThrow(
            String key);
  }
  /**
   * Protobuf type {@code header}
   */
  public  static final class header extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:header)
      headerOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use header.newBuilder() to construct.
    private header(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private header() {
      crcCode_ = 0;
      length_ = 0;
      sessionID_ = 0L;
      type_ = 0;
      priority_ = 0;
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private header(
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
            case 13: {

              crcCode_ = input.readFixed32();
              break;
            }
            case 21: {

              length_ = input.readFixed32();
              break;
            }
            case 25: {

              sessionID_ = input.readFixed64();
              break;
            }
            case 32: {

              type_ = input.readInt32();
              break;
            }
            case 40: {

              priority_ = input.readInt32();
              break;
            }
            case 50: {
              if (!((mutable_bitField0_ & 0x00000020) == 0x00000020)) {
                attachment_ = com.google.protobuf.MapField.newMapField(
                    AttachmentDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00000020;
              }
              com.google.protobuf.MapEntry<String, String>
              attachment__ = input.readMessage(
                  AttachmentDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              attachment_.getMutableMap().put(
                  attachment__.getKey(), attachment__.getValue());
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
      return Header.internal_static_header_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 6:
          return internalGetAttachment();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Header.internal_static_header_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              header.class, Builder.class);
    }

    private int bitField0_;
    public static final int CRCCODE_FIELD_NUMBER = 1;
    private int crcCode_;
    /**
     * <code>fixed32 crcCode = 1;</code>
     */
    public int getCrcCode() {
      return crcCode_;
    }

    public static final int LENGTH_FIELD_NUMBER = 2;
    private int length_;
    /**
     * <code>fixed32 length = 2;</code>
     */
    public int getLength() {
      return length_;
    }

    public static final int SESSIONID_FIELD_NUMBER = 3;
    private long sessionID_;
    /**
     * <code>fixed64 sessionID = 3;</code>
     */
    public long getSessionID() {
      return sessionID_;
    }

    public static final int TYPE_FIELD_NUMBER = 4;
    private int type_;
    /**
     * <code>int32 type = 4;</code>
     */
    public int getType() {
      return type_;
    }

    public static final int PRIORITY_FIELD_NUMBER = 5;
    private int priority_;
    /**
     * <code>int32 priority = 5;</code>
     */
    public int getPriority() {
      return priority_;
    }

    public static final int ATTACHMENT_FIELD_NUMBER = 6;
    private static final class AttachmentDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          String, String> defaultEntry =
              com.google.protobuf.MapEntry
              .<String, String>newDefaultInstance(
                  Header.internal_static_header_AttachmentEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.STRING,
                  "",
                  com.google.protobuf.WireFormat.FieldType.STRING,
                  "");
    }
    private com.google.protobuf.MapField<
        String, String> attachment_;
    private com.google.protobuf.MapField<String, String>
    internalGetAttachment() {
      if (attachment_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            AttachmentDefaultEntryHolder.defaultEntry);
      }
      return attachment_;
    }

    public int getAttachmentCount() {
      return internalGetAttachment().getMap().size();
    }
    /**
     * <code>map&lt;string, string&gt; attachment = 6;</code>
     */

    public boolean containsAttachment(
        String key) {
      if (key == null) { throw new NullPointerException(); }
      return internalGetAttachment().getMap().containsKey(key);
    }
    /**
     * Use {@link #getAttachmentMap()} instead.
     */
    @Deprecated
    public java.util.Map<String, String> getAttachment() {
      return getAttachmentMap();
    }
    /**
     * <code>map&lt;string, string&gt; attachment = 6;</code>
     */

    public java.util.Map<String, String> getAttachmentMap() {
      return internalGetAttachment().getMap();
    }
    /**
     * <code>map&lt;string, string&gt; attachment = 6;</code>
     */

    public String getAttachmentOrDefault(
        String key,
        String defaultValue) {
      if (key == null) { throw new NullPointerException(); }
      java.util.Map<String, String> map =
          internalGetAttachment().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, string&gt; attachment = 6;</code>
     */

    public String getAttachmentOrThrow(
        String key) {
      if (key == null) { throw new NullPointerException(); }
      java.util.Map<String, String> map =
          internalGetAttachment().getMap();
      if (!map.containsKey(key)) {
        throw new IllegalArgumentException();
      }
      return map.get(key);
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
      if (crcCode_ != 0) {
        output.writeFixed32(1, crcCode_);
      }
      if (length_ != 0) {
        output.writeFixed32(2, length_);
      }
      if (sessionID_ != 0L) {
        output.writeFixed64(3, sessionID_);
      }
      if (type_ != 0) {
        output.writeInt32(4, type_);
      }
      if (priority_ != 0) {
        output.writeInt32(5, priority_);
      }
      com.google.protobuf.GeneratedMessageV3
        .serializeStringMapTo(
          output,
          internalGetAttachment(),
          AttachmentDefaultEntryHolder.defaultEntry,
          6);
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (crcCode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFixed32Size(1, crcCode_);
      }
      if (length_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFixed32Size(2, length_);
      }
      if (sessionID_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeFixed64Size(3, sessionID_);
      }
      if (type_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, type_);
      }
      if (priority_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, priority_);
      }
      for (java.util.Map.Entry<String, String> entry
           : internalGetAttachment().getMap().entrySet()) {
        com.google.protobuf.MapEntry<String, String>
        attachment__ = AttachmentDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(6, attachment__);
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
      if (!(obj instanceof header)) {
        return super.equals(obj);
      }
      header other = (header) obj;

      boolean result = true;
      result = result && (getCrcCode()
          == other.getCrcCode());
      result = result && (getLength()
          == other.getLength());
      result = result && (getSessionID()
          == other.getSessionID());
      result = result && (getType()
          == other.getType());
      result = result && (getPriority()
          == other.getPriority());
      result = result && internalGetAttachment().equals(
          other.internalGetAttachment());
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
      hash = (37 * hash) + CRCCODE_FIELD_NUMBER;
      hash = (53 * hash) + getCrcCode();
      hash = (37 * hash) + LENGTH_FIELD_NUMBER;
      hash = (53 * hash) + getLength();
      hash = (37 * hash) + SESSIONID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getSessionID());
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getType();
      hash = (37 * hash) + PRIORITY_FIELD_NUMBER;
      hash = (53 * hash) + getPriority();
      if (!internalGetAttachment().getMap().isEmpty()) {
        hash = (37 * hash) + ATTACHMENT_FIELD_NUMBER;
        hash = (53 * hash) + internalGetAttachment().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static header parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static header parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static header parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static header parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static header parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static header parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static header parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static header parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static header parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static header parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static header parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static header parseFrom(
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
    public static Builder newBuilder(header prototype) {
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
     * Protobuf type {@code header}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:header)
        headerOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return Header.internal_static_header_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 6:
            return internalGetAttachment();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 6:
            return internalGetMutableAttachment();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Header.internal_static_header_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                header.class, Builder.class);
      }

      // Construct using Header.header.newBuilder()
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
        crcCode_ = 0;

        length_ = 0;

        sessionID_ = 0L;

        type_ = 0;

        priority_ = 0;

        internalGetMutableAttachment().clear();
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return Header.internal_static_header_descriptor;
      }

      @Override
      public header getDefaultInstanceForType() {
        return header.getDefaultInstance();
      }

      @Override
      public header build() {
        header result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public header buildPartial() {
        header result = new header(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        result.crcCode_ = crcCode_;
        result.length_ = length_;
        result.sessionID_ = sessionID_;
        result.type_ = type_;
        result.priority_ = priority_;
        result.attachment_ = internalGetAttachment();
        result.attachment_.makeImmutable();
        result.bitField0_ = to_bitField0_;
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
        if (other instanceof header) {
          return mergeFrom((header)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(header other) {
        if (other == header.getDefaultInstance()) return this;
        if (other.getCrcCode() != 0) {
          setCrcCode(other.getCrcCode());
        }
        if (other.getLength() != 0) {
          setLength(other.getLength());
        }
        if (other.getSessionID() != 0L) {
          setSessionID(other.getSessionID());
        }
        if (other.getType() != 0) {
          setType(other.getType());
        }
        if (other.getPriority() != 0) {
          setPriority(other.getPriority());
        }
        internalGetMutableAttachment().mergeFrom(
            other.internalGetAttachment());
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
        header parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (header) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int crcCode_ ;
      /**
       * <code>fixed32 crcCode = 1;</code>
       */
      public int getCrcCode() {
        return crcCode_;
      }
      /**
       * <code>fixed32 crcCode = 1;</code>
       */
      public Builder setCrcCode(int value) {
        
        crcCode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>fixed32 crcCode = 1;</code>
       */
      public Builder clearCrcCode() {
        
        crcCode_ = 0;
        onChanged();
        return this;
      }

      private int length_ ;
      /**
       * <code>fixed32 length = 2;</code>
       */
      public int getLength() {
        return length_;
      }
      /**
       * <code>fixed32 length = 2;</code>
       */
      public Builder setLength(int value) {
        
        length_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>fixed32 length = 2;</code>
       */
      public Builder clearLength() {
        
        length_ = 0;
        onChanged();
        return this;
      }

      private long sessionID_ ;
      /**
       * <code>fixed64 sessionID = 3;</code>
       */
      public long getSessionID() {
        return sessionID_;
      }
      /**
       * <code>fixed64 sessionID = 3;</code>
       */
      public Builder setSessionID(long value) {
        
        sessionID_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>fixed64 sessionID = 3;</code>
       */
      public Builder clearSessionID() {
        
        sessionID_ = 0L;
        onChanged();
        return this;
      }

      private int type_ ;
      /**
       * <code>int32 type = 4;</code>
       */
      public int getType() {
        return type_;
      }
      /**
       * <code>int32 type = 4;</code>
       */
      public Builder setType(int value) {
        
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 type = 4;</code>
       */
      public Builder clearType() {
        
        type_ = 0;
        onChanged();
        return this;
      }

      private int priority_ ;
      /**
       * <code>int32 priority = 5;</code>
       */
      public int getPriority() {
        return priority_;
      }
      /**
       * <code>int32 priority = 5;</code>
       */
      public Builder setPriority(int value) {
        
        priority_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 priority = 5;</code>
       */
      public Builder clearPriority() {
        
        priority_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.MapField<
          String, String> attachment_;
      private com.google.protobuf.MapField<String, String>
      internalGetAttachment() {
        if (attachment_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              AttachmentDefaultEntryHolder.defaultEntry);
        }
        return attachment_;
      }
      private com.google.protobuf.MapField<String, String>
      internalGetMutableAttachment() {
        onChanged();;
        if (attachment_ == null) {
          attachment_ = com.google.protobuf.MapField.newMapField(
              AttachmentDefaultEntryHolder.defaultEntry);
        }
        if (!attachment_.isMutable()) {
          attachment_ = attachment_.copy();
        }
        return attachment_;
      }

      public int getAttachmentCount() {
        return internalGetAttachment().getMap().size();
      }
      /**
       * <code>map&lt;string, string&gt; attachment = 6;</code>
       */

      public boolean containsAttachment(
          String key) {
        if (key == null) { throw new NullPointerException(); }
        return internalGetAttachment().getMap().containsKey(key);
      }
      /**
       * Use {@link #getAttachmentMap()} instead.
       */
      @Deprecated
      public java.util.Map<String, String> getAttachment() {
        return getAttachmentMap();
      }
      /**
       * <code>map&lt;string, string&gt; attachment = 6;</code>
       */

      public java.util.Map<String, String> getAttachmentMap() {
        return internalGetAttachment().getMap();
      }
      /**
       * <code>map&lt;string, string&gt; attachment = 6;</code>
       */

      public String getAttachmentOrDefault(
          String key,
          String defaultValue) {
        if (key == null) { throw new NullPointerException(); }
        java.util.Map<String, String> map =
            internalGetAttachment().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;string, string&gt; attachment = 6;</code>
       */

      public String getAttachmentOrThrow(
          String key) {
        if (key == null) { throw new NullPointerException(); }
        java.util.Map<String, String> map =
            internalGetAttachment().getMap();
        if (!map.containsKey(key)) {
          throw new IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearAttachment() {
        internalGetMutableAttachment().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;string, string&gt; attachment = 6;</code>
       */

      public Builder removeAttachment(
          String key) {
        if (key == null) { throw new NullPointerException(); }
        internalGetMutableAttachment().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @Deprecated
      public java.util.Map<String, String>
      getMutableAttachment() {
        return internalGetMutableAttachment().getMutableMap();
      }
      /**
       * <code>map&lt;string, string&gt; attachment = 6;</code>
       */
      public Builder putAttachment(
          String key,
          String value) {
        if (key == null) { throw new NullPointerException(); }
        if (value == null) { throw new NullPointerException(); }
        internalGetMutableAttachment().getMutableMap()
            .put(key, value);
        return this;
      }
      /**
       * <code>map&lt;string, string&gt; attachment = 6;</code>
       */

      public Builder putAllAttachment(
          java.util.Map<String, String> values) {
        internalGetMutableAttachment().getMutableMap()
            .putAll(values);
        return this;
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


      // @@protoc_insertion_point(builder_scope:header)
    }

    // @@protoc_insertion_point(class_scope:header)
    private static final header DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new header();
    }

    public static header getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<header>
        PARSER = new com.google.protobuf.AbstractParser<header>() {
      @Override
      public header parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new header(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<header> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<header> getParserForType() {
      return PARSER;
    }

    @Override
    public header getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_header_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_header_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_header_AttachmentEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_header_AttachmentEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\014header.proto\"\274\001\n\006header\022\017\n\007crcCode\030\001 \001" +
      "(\007\022\016\n\006length\030\002 \001(\007\022\021\n\tsessionID\030\003 \001(\006\022\014\n" +
      "\004type\030\004 \001(\005\022\020\n\010priority\030\005 \001(\005\022+\n\nattachm" +
      "ent\030\006 \003(\0132\027.header.AttachmentEntry\0321\n\017At" +
      "tachmentEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(" +
      "\t:\0028\001B\010B\006Headerb\006proto3"
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
        }, assigner);
    internal_static_header_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_header_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_header_descriptor,
        new String[] { "CrcCode", "Length", "SessionID", "Type", "Priority", "Attachment", });
    internal_static_header_AttachmentEntry_descriptor =
      internal_static_header_descriptor.getNestedTypes().get(0);
    internal_static_header_AttachmentEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_header_AttachmentEntry_descriptor,
        new String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}