package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.doocs.im.model.message.TIMMsgElement;

import java.io.Serializable;
import java.util.List;

/**
 * 修改群聊历史消息-请求参数
 *
 * @author bingo
 * @since 2022/7/20 11:04
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModifyGroupMsgRequest extends GenericRequest implements Serializable {
    private static final long serialVersionUID = 3479900458252545494L;
    /**
     * 操作的群 ID
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * 请求修改的消息 seq
     */
    @JsonProperty("MsgSeq")
    private Long msgSeq;

    /**
     * 消息内容
     */
    @JsonProperty("MsgBody")
    private List<TIMMsgElement> msgBody;

    /**
     * 消息自定义数据（云端保存，会发送到对端，程序卸载重装后还能拉取到）
     */
    @JsonProperty("CloudCustomData")
    private String cloudCustomData;

    /**
     * 话题的 ID，仅社群支持此选项
     */
    @JsonProperty("TopicId")
    private String topicId;

    public ModifyGroupMsgRequest() {
    }

    public ModifyGroupMsgRequest(String groupId, Long msgSeq) {
        this.groupId = groupId;
        this.msgSeq = msgSeq;
    }

    public ModifyGroupMsgRequest(String groupId, Long msgSeq, List<TIMMsgElement> msgBody,
                                 String cloudCustomData, String topicId) {
        this.groupId = groupId;
        this.msgSeq = msgSeq;
        this.msgBody = msgBody;
        this.cloudCustomData = cloudCustomData;
        this.topicId = topicId;
    }

    private ModifyGroupMsgRequest(Builder builder) {
        this.groupId = builder.groupId;
        this.msgSeq = builder.msgSeq;
        this.msgBody = builder.msgBody;
        this.cloudCustomData = builder.cloudCustomData;
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

    public Long getMsgSeq() {
        return msgSeq;
    }

    public void setMsgSeq(Long msgSeq) {
        this.msgSeq = msgSeq;
    }

    public List<TIMMsgElement> getMsgBody() {
        return msgBody;
    }

    public void setMsgBody(List<TIMMsgElement> msgBody) {
        this.msgBody = msgBody;
    }

    public String getCloudCustomData() {
        return cloudCustomData;
    }

    public void setCloudCustomData(String cloudCustomData) {
        this.cloudCustomData = cloudCustomData;
    }

    public String getTopicId() {
        return topicId;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }


    public static final class Builder {
        private String groupId;
        private Long msgSeq;
        private List<TIMMsgElement> msgBody;
        private String cloudCustomData;
        private String topicId;

        private Builder() {
        }

        public ModifyGroupMsgRequest build() {
            return new ModifyGroupMsgRequest(this);
        }

        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        public Builder msgSeq(Long msgSeq) {
            this.msgSeq = msgSeq;
            return this;
        }

        public Builder msgBody(List<TIMMsgElement> msgBody) {
            this.msgBody = msgBody;
            return this;
        }

        public Builder cloudCustomData(String cloudCustomData) {
            this.cloudCustomData = cloudCustomData;
            return this;
        }

        public Builder topicId(String topicId) {
            this.topicId = topicId;
            return this;
        }
    }
}
