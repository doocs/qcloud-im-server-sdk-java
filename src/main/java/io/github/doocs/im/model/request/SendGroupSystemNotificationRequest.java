package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 在群组中发送系统通知-请求参数
 *
 * @author hyh
 * @since 2021/08/02 17:09
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SendGroupSystemNotificationRequest extends GenericRequest {
    /**
     * 向哪个群组发送系统通知
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * 接收者群成员列表，请填写接收者 UserID，不填或为空表示全员下发
     */
    @JsonProperty("ToMembers_Account")
    private List<String> toMembersAccount;

    /**
     * 系统通知的内容
     */
    @JsonProperty("Content")
    private String content;

    /**
     * 话题的 ID，仅社群支持此选项
     */
    @JsonProperty("TopicId")
    private String topicId;

    public SendGroupSystemNotificationRequest() {
    }

    public SendGroupSystemNotificationRequest(String groupId, String content) {
        this.groupId = groupId;
        this.content = content;
    }

    public SendGroupSystemNotificationRequest(String groupId, List<String> toMembersAccount,
                                              String content, String topicId) {
        this.groupId = groupId;
        this.toMembersAccount = toMembersAccount;
        this.content = content;
        this.topicId = topicId;
    }

    private SendGroupSystemNotificationRequest(Builder builder) {
        this.groupId = builder.groupId;
        this.toMembersAccount = builder.toMembersAccount;
        this.content = builder.content;
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

    public List<String> getToMembersAccount() {
        return toMembersAccount;
    }

    public void setToMembersAccount(List<String> toMembersAccount) {
        this.toMembersAccount = toMembersAccount;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTopicId() {
        return topicId;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }


    public static final class Builder {
        private String groupId;
        private List<String> toMembersAccount;
        private String content;
        private String topicId;

        private Builder() {
        }

        public SendGroupSystemNotificationRequest build() {
            return new SendGroupSystemNotificationRequest(this);
        }

        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        public Builder toMembersAccount(List<String> toMembersAccount) {
            this.toMembersAccount = toMembersAccount;
            return this;
        }

        public Builder content(String content) {
            this.content = content;
            return this;
        }

        public Builder topicId(String topicId) {
            this.topicId = topicId;
            return this;
        }
    }
}
