package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 修改话题资料-请求参数
 *
 * @author bingo
 * @since 2022/8/2 10:34
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModifyGroupTopicRequest extends GenericRequest {
    /**
     * 需要修改的话题所属的群组ID
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * 需要修改的话题ID
     */
    @JsonProperty("TopicId")
    private String topicId;

    /**
     * 话题名称，最长30字节，使用 UTF-8 编码，1个汉字占3个字节
     */
    @JsonProperty("TopicName")
    private String topicName;

    /**
     * 表示需要修改话题的用户帐号
     */
    @JsonProperty("From_Account")
    private String fromAccount;

    /**
     * 自定义字符串，最长3000个字节，使用 UTF-8 编码，1个汉字占3个字节
     */
    @JsonProperty("CustomString")
    private String customString;

    /**
     * 话题头像 URL，最长100字节
     */
    @JsonProperty("FaceUrl")
    private String faceUrl;

    /**
     * 话题公告，最长300字节，使用 UTF-8 编码，1个汉字占3个字节
     */
    @JsonProperty("Notification")
    private String notification;

    /**
     * 话题简介，最长240字节，使用 UTF-8 编码，1个汉字占3个字节
     */
    @JsonProperty("Introduction")
    private String introduction;

    /**
     * 话题内成员禁言，只有群管理员和群主以及系统管理员可以发言
     * {@link io.github.doocs.im.constant.MuteAllMember}
     */
    @JsonProperty("MuteAllMember")
    private String muteAllMember;

    public ModifyGroupTopicRequest() {
    }

    public ModifyGroupTopicRequest(String groupId, String topicId) {
        this.groupId = groupId;
        this.topicId = topicId;
    }

    public ModifyGroupTopicRequest(String groupId, String topicId, String topicName, String fromAccount,
                                   String customString, String faceUrl, String notification,
                                   String introduction, String muteAllMember) {
        this.groupId = groupId;
        this.topicId = topicId;
        this.topicName = topicName;
        this.fromAccount = fromAccount;
        this.customString = customString;
        this.faceUrl = faceUrl;
        this.notification = notification;
        this.introduction = introduction;
        this.muteAllMember = muteAllMember;
    }

    private ModifyGroupTopicRequest(Builder builder) {
        this.groupId = builder.groupId;
        this.topicId = builder.topicId;
        this.topicName = builder.topicName;
        this.fromAccount = builder.fromAccount;
        this.customString = builder.customString;
        this.faceUrl = builder.faceUrl;
        this.notification = builder.notification;
        this.introduction = builder.introduction;
        this.muteAllMember = builder.muteAllMember;
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

    public String getTopicId() {
        return topicId;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public String getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
    }

    public String getCustomString() {
        return customString;
    }

    public void setCustomString(String customString) {
        this.customString = customString;
    }

    public String getFaceUrl() {
        return faceUrl;
    }

    public void setFaceUrl(String faceUrl) {
        this.faceUrl = faceUrl;
    }

    public String getNotification() {
        return notification;
    }

    public void setNotification(String notification) {
        this.notification = notification;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getMuteAllMember() {
        return muteAllMember;
    }

    public void setMuteAllMember(String muteAllMember) {
        this.muteAllMember = muteAllMember;
    }


    public static final class Builder {
        private String groupId;
        private String topicId;
        private String topicName;
        private String fromAccount;
        private String customString;
        private String faceUrl;
        private String notification;
        private String introduction;
        private String muteAllMember;

        private Builder() {
        }

        public ModifyGroupTopicRequest build() {
            return new ModifyGroupTopicRequest(this);
        }

        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        public Builder topicId(String topicId) {
            this.topicId = topicId;
            return this;
        }

        public Builder topicName(String topicName) {
            this.topicName = topicName;
            return this;
        }

        public Builder fromAccount(String fromAccount) {
            this.fromAccount = fromAccount;
            return this;
        }

        public Builder customString(String customString) {
            this.customString = customString;
            return this;
        }

        public Builder faceUrl(String faceUrl) {
            this.faceUrl = faceUrl;
            return this;
        }

        public Builder notification(String notification) {
            this.notification = notification;
            return this;
        }

        public Builder introduction(String introduction) {
            this.introduction = introduction;
            return this;
        }

        public Builder muteAllMember(String muteAllMember) {
            this.muteAllMember = muteAllMember;
            return this;
        }
    }
}
