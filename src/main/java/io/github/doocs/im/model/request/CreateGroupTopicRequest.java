package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 创建话题-请求参数
 *
 * @author bingo
 * @since 2022/8/2 10:04
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateGroupTopicRequest extends GenericRequest {
    /**
     * 需要创建的话题所属的群组ID
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * 为了使得话题 ID 更加简单，便于记忆传播，腾讯云支持 App 在通过 REST API 创建话题时 自定义话题 ID
     */
    @JsonProperty("TopicId")
    private String topicId;

    /**
     * 话题名称，最长30字节，使用 UTF-8 编码，1个汉字占3个字节
     */
    @JsonProperty("TopicName")
    private String topicName;

    /**
     * 表示需要创建话题的用户帐号
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
     * 话题维度的自定义信息，TopicDefinedData 和群共享自定义字段，可以通过 即时通信 IM 控制台 进行配置，详情请参阅 自定义字段
     */
    @JsonProperty("TopicDefinedData")
    private List<TopicDefinedDataItem> topicDefinedData;

    public CreateGroupTopicRequest() {
    }

    public CreateGroupTopicRequest(String groupId, String topicName) {
        this.groupId = groupId;
        this.topicName = topicName;
    }

    public CreateGroupTopicRequest(String groupId, String topicId, String topicName, String fromAccount,
                                   String customString, String faceUrl, String notification, String introduction,
                                   List<TopicDefinedDataItem> topicDefinedData) {
        this.groupId = groupId;
        this.topicId = topicId;
        this.topicName = topicName;
        this.fromAccount = fromAccount;
        this.customString = customString;
        this.faceUrl = faceUrl;
        this.notification = notification;
        this.introduction = introduction;
        this.topicDefinedData = topicDefinedData;
    }

    private CreateGroupTopicRequest(Builder builder) {
        this.groupId = builder.groupId;
        this.topicId = builder.topicId;
        this.topicName = builder.topicName;
        this.fromAccount = builder.fromAccount;
        this.customString = builder.customString;
        this.faceUrl = builder.faceUrl;
        this.notification = builder.notification;
        this.introduction = builder.introduction;
        this.topicDefinedData = builder.topicDefinedData;
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

    public List<TopicDefinedDataItem> getTopicDefinedData() {
        return topicDefinedData;
    }

    public void setTopicDefinedData(List<TopicDefinedDataItem> topicDefinedData) {
        this.topicDefinedData = topicDefinedData;
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
        private List<TopicDefinedDataItem> topicDefinedData;

        private Builder() {
        }

        public CreateGroupTopicRequest build() {
            return new CreateGroupTopicRequest(this);
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

        public Builder topicDefinedData(List<TopicDefinedDataItem> topicDefinedData) {
            this.topicDefinedData = topicDefinedData;
            return this;
        }
    }
}
