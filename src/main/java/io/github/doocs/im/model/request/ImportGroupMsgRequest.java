package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 导入群消息-请求参数
 *
 * @author hyh
 * @since 2021/08/02 17:45
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImportGroupMsgRequest extends GenericRequest {
    /**
     * 要导入消息的群 ID
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * 会话更新识别，为1的时候标识触发会话更新，默认不触发（avchatroom 群不支持）。
     */
    @JsonProperty("RecentContactFlag")
    private Integer recentContactFlag;

    /**
     * 导入的消息列表
     */
    @JsonProperty("MsgList")
    private List<GroupMsgItem> msgList;

    /**
     * 话题的 ID，仅社群支持此选项
     */
    @JsonProperty("TopicId")
    private String topicId;

    public ImportGroupMsgRequest() {
    }

    public ImportGroupMsgRequest(String groupId, List<GroupMsgItem> msgList) {
        this.groupId = groupId;
        this.msgList = msgList;
    }

    public ImportGroupMsgRequest(String groupId, Integer recentContactFlag,
                                 List<GroupMsgItem> msgList, String topicId) {
        this.groupId = groupId;
        this.recentContactFlag = recentContactFlag;
        this.msgList = msgList;
        this.topicId = topicId;
    }

    private ImportGroupMsgRequest(Builder builder) {
        this.groupId = builder.groupId;
        this.recentContactFlag = builder.recentContactFlag;
        this.msgList = builder.msgList;
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

    public Integer getRecentContactFlag() {
        return recentContactFlag;
    }

    public void setRecentContactFlag(Integer recentContactFlag) {
        this.recentContactFlag = recentContactFlag;
    }

    public List<GroupMsgItem> getMsgList() {
        return msgList;
    }

    public void setMsgList(List<GroupMsgItem> msgList) {
        this.msgList = msgList;
    }

    public String getTopicId() {
        return topicId;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }


    public static final class Builder {
        private String groupId;
        private Integer recentContactFlag;
        private List<GroupMsgItem> msgList;
        private String topicId;

        private Builder() {
        }

        public ImportGroupMsgRequest build() {
            return new ImportGroupMsgRequest(this);
        }

        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        public Builder recentContactFlag(Integer recentContactFlag) {
            this.recentContactFlag = recentContactFlag;
            return this;
        }

        public Builder msgList(List<GroupMsgItem> msgList) {
            this.msgList = msgList;
            return this;
        }

        public Builder topicId(String topicId) {
            this.topicId = topicId;
            return this;
        }
    }
}
