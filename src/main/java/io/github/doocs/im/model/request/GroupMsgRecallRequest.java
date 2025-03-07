package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 撤回群消息-请求参数
 *
 * @author hyh
 * @since 2021/08/02 17:13
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GroupMsgRecallRequest extends GenericRequest implements Serializable {
    private static final long serialVersionUID = 3332309278900848054L;
    /**
     * 操作的群 ID
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * 被撤回的消息 seq 列表，一次请求最多可以撤回10条消息 seq
     */
    @JsonProperty("MsgSeqList")
    private List<MsgSeqItem> msgSeqList;

    /**
     * 话题的 ID，若具有此选项表示撤回的是对应话题中的消息，仅支持话题的社群适用此选项
     */
    @JsonProperty("TopicId")
    private String topicId;

    /**
     * 撤回消息的原因，长度限制最大100字节
     */
    @JsonProperty("Reason")
    private String reason;

    public GroupMsgRecallRequest() {
    }

    public GroupMsgRecallRequest(String groupId, List<MsgSeqItem> msgSeqList) {
        this.groupId = groupId;
        this.msgSeqList = msgSeqList;
    }

    public GroupMsgRecallRequest(String groupId, List<MsgSeqItem> msgSeqList, String topicId) {
        this.groupId = groupId;
        this.msgSeqList = msgSeqList;
        this.topicId = topicId;
    }

    public GroupMsgRecallRequest(String groupId, List<MsgSeqItem> msgSeqList, String topicId, String reason) {
        this.groupId = groupId;
        this.msgSeqList = msgSeqList;
        this.topicId = topicId;
        this.reason = reason;
    }

    private GroupMsgRecallRequest(Builder builder) {
        this.groupId = builder.groupId;
        this.msgSeqList = builder.msgSeqList;
        this.topicId = builder.topicId;
        this.reason = builder.reason;
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

    public List<MsgSeqItem> getMsgSeqList() {
        return msgSeqList;
    }

    public void setMsgSeqList(List<MsgSeqItem> msgSeqList) {
        this.msgSeqList = msgSeqList;
    }

    public String getTopicId() {
        return topicId;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public static final class Builder {
        private String groupId;
        private List<MsgSeqItem> msgSeqList;
        private String topicId;
        private String reason;

        private Builder() {
        }

        public GroupMsgRecallRequest build() {
            return new GroupMsgRecallRequest(this);
        }

        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        public Builder msgSeqList(List<MsgSeqItem> msgSeqList) {
            this.msgSeqList = msgSeqList;
            return this;
        }

        public Builder topicId(String topicId) {
            this.topicId = topicId;
            return this;
        }

        public Builder reason(String reason) {
            this.reason = reason;
            return this;
        }
    }
}
