package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 清空群聊历史消息-请求参数
 *
 * @author bingo
 * @since 2024/1/10 10:25
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClearGroupMsgRequest extends GenericRequest implements Serializable {
    private static final long serialVersionUID = 1822917977659354031L;

    /**
     * 要清空历史消息的群组 ID
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * 清空小于等于 MsgSeq 的历史消息，不填则清空所有的历史消息
     */
    @JsonProperty("MsgSeq")
    private Long msgSeq;

    public ClearGroupMsgRequest() {
    }

    public ClearGroupMsgRequest(String groupId) {
        this.groupId = groupId;
    }

    public ClearGroupMsgRequest(String groupId, Long msgSeq) {
        this.groupId = groupId;
        this.msgSeq = msgSeq;
    }

    private ClearGroupMsgRequest(Builder builder) {
        this.groupId = builder.groupId;
        this.msgSeq = builder.msgSeq;
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


    public static final class Builder {
        private String groupId;
        private Long msgSeq;

        private Builder() {
        }

        public ClearGroupMsgRequest build() {
            return new ClearGroupMsgRequest(this);
        }

        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        public Builder msgSeq(Long msgSeq) {
            this.msgSeq = msgSeq;
            return this;
        }
    }
}
