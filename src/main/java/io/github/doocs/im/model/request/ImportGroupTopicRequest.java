package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 导入话题资料-请求参数
 *
 * @author bingo
 * @since 2023/1/10 16:19
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImportGroupTopicRequest extends GenericRequest implements Serializable {
    private static final long serialVersionUID = 4799803245565149118L;
    /**
     * 话题所属的群组类型，目前只支持Community（社群）类型
     */
    @JsonProperty("Type")
    private String type;

    /**
     * 导入话题所在的群组Id
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
     * 表示需要创建话题的用户账号
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
     * 指定话题的创建时间
     */
    @JsonProperty("CreateTime")
    private Integer createTime;

    public ImportGroupTopicRequest() {
    }

    public ImportGroupTopicRequest(String groupId, String topicName) {
        this.groupId = groupId;
        this.topicName = topicName;
    }

    public ImportGroupTopicRequest(String type, String groupId, String topicId, String topicName,
                                   String fromAccount, String customString, String faceUrl, String notification,
                                   String introduction, Integer createTime) {
        this.type = type;
        this.groupId = groupId;
        this.topicId = topicId;
        this.topicName = topicName;
        this.fromAccount = fromAccount;
        this.customString = customString;
        this.faceUrl = faceUrl;
        this.notification = notification;
        this.introduction = introduction;
        this.createTime = createTime;
    }

    private ImportGroupTopicRequest(Builder builder) {
        this.type = builder.type;
        this.groupId = builder.groupId;
        this.topicId = builder.topicId;
        this.topicName = builder.topicName;
        this.fromAccount = builder.fromAccount;
        this.customString = builder.customString;
        this.faceUrl = builder.faceUrl;
        this.notification = builder.notification;
        this.introduction = builder.introduction;
        this.createTime = builder.createTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }


    public static final class Builder {
        private String type;
        private String groupId;
        private String topicId;
        private String topicName;
        private String fromAccount;
        private String customString;
        private String faceUrl;
        private String notification;
        private String introduction;
        private Integer createTime;

        private Builder() {
        }

        public ImportGroupTopicRequest build() {
            return new ImportGroupTopicRequest(this);
        }

        public Builder type(String type) {
            this.type = type;
            return this;
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

        public Builder createTime(Integer createTime) {
            this.createTime = createTime;
            return this;
        }
    }
}
