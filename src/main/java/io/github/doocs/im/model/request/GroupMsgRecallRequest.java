package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 撤回群消息-请求参数
 *
 * @author hyh
 * @since 2021/08/02 17:13
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GroupMsgRecallRequest extends GenericRequest {
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
     * 话题的 ID，仅社群支持此选项
     */
    @JsonProperty("TopicId")
    private String topicId;

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

    private GroupMsgRecallRequest(Builder builder) {
        this.groupId = builder.groupId;
        this.msgSeqList = builder.msgSeqList;
        this.topicId = builder.topicId;
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


    public static final class Builder {
        private String groupId;
        private List<MsgSeqItem> msgSeqList;
        private String topicId;

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
    }
}
