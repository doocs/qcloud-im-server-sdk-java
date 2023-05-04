package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.doocs.im.model.response.KeyValueSeq;

import java.io.Serializable;
import java.util.List;

/**
 * 设置群消息扩展-请求参数
 *
 * @author bingo
 * @since 2022/11/2 16:32
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GroupSetKeyValuesRequest extends GenericRequest implements Serializable {
    private static final long serialVersionUID = -2714029276131841189L;
    /**
     * 群id
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * 需要设置的群消息的Seq
     */
    @JsonProperty("MsgSeq")
    private Long msgSeq;

    /**
     * 1 为设置消息扩展KV，2 为删除消息扩展KV，3 为清空所有消息扩展KV
     * {@link io.github.doocs.im.constant.OperateType}
     */
    @JsonProperty("OperateType")
    private Integer operateType;

    /**
     * 需要设置/删除的KV，单次请求最多可设置20条KV
     */
    @JsonProperty("ExtensionList")
    private List<KeyValueSeq> extensionList;

    public GroupSetKeyValuesRequest() {
    }

    public GroupSetKeyValuesRequest(String groupId, Long msgSeq, Integer operateType) {
        this.groupId = groupId;
        this.msgSeq = msgSeq;
        this.operateType = operateType;
    }

    public GroupSetKeyValuesRequest(String groupId, Long msgSeq, Integer operateType, List<KeyValueSeq> extensionList) {
        this.groupId = groupId;
        this.msgSeq = msgSeq;
        this.operateType = operateType;
        this.extensionList = extensionList;
    }

    private GroupSetKeyValuesRequest(Builder builder) {
        this.groupId = builder.groupId;
        this.msgSeq = builder.msgSeq;
        this.operateType = builder.operateType;
        this.extensionList = builder.extensionList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public Long getMsgSeq() {
        return msgSeq;
    }

    public void setMsgSeq(Long msgSeq) {
        this.msgSeq = msgSeq;
    }

    public Integer getOperateType() {
        return operateType;
    }

    public void setOperateType(Integer operateType) {
        this.operateType = operateType;
    }

    public List<KeyValueSeq> getExtensionList() {
        return extensionList;
    }

    public void setExtensionList(List<KeyValueSeq> extensionList) {
        this.extensionList = extensionList;
    }


    public static final class Builder {
        private String groupId;
        private Long msgSeq;
        private Integer operateType;
        private List<KeyValueSeq> extensionList;

        private Builder() {
        }

        public GroupSetKeyValuesRequest build() {
            return new GroupSetKeyValuesRequest(this);
        }

        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        public Builder msgSeq(Long msgSeq) {
            this.msgSeq = msgSeq;
            return this;
        }

        public Builder operateType(Integer operateType) {
            this.operateType = operateType;
            return this;
        }

        public Builder extensionList(List<KeyValueSeq> extensionList) {
            this.extensionList = extensionList;
            return this;
        }
    }
}
