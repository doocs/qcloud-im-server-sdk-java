package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

/**
 * @author hyh
 * @since 2021/08/02 17:17
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImportGroupRequest extends GenericRequest {
    @JsonProperty("Owner_Account")
    private String ownerAccount;

    @JsonProperty("Type")
    private String type;

    @JsonProperty("GroupId")
    private String groupId;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Introduction")
    private String introduction;

    @JsonProperty("Notification")
    private String notification;

    @JsonProperty("FaceUrl")
    private String faceUrl;

    @JsonProperty("MaxMemberCount")
    private Integer maxMemberCount;

    @JsonProperty("ApplyJoinOption")
    private String applyJoinOption;

    @JsonProperty("CreateTime")
    private Integer createTime;

    @JsonProperty("AppDefinedData")
    private List<Map<String, Object>> appDefinedData;

    public ImportGroupRequest() {
    }

    public ImportGroupRequest(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public ImportGroupRequest(String ownerAccount, String type, String groupId, String name, String introduction,
                              String notification, String faceUrl, Integer maxMemberCount, String applyJoinOption,
                              Integer createTime, List<Map<String, Object>> appDefinedData) {
        this.ownerAccount = ownerAccount;
        this.type = type;
        this.groupId = groupId;
        this.name = name;
        this.introduction = introduction;
        this.notification = notification;
        this.faceUrl = faceUrl;
        this.maxMemberCount = maxMemberCount;
        this.applyJoinOption = applyJoinOption;
        this.createTime = createTime;
        this.appDefinedData = appDefinedData;
    }

    private ImportGroupRequest(Builder builder) {
        this.ownerAccount = builder.ownerAccount;
        this.type = builder.type;
        this.groupId = builder.groupId;
        this.name = builder.name;
        this.introduction = builder.introduction;
        this.notification = builder.notification;
        this.faceUrl = builder.faceUrl;
        this.maxMemberCount = builder.maxMemberCount;
        this.applyJoinOption = builder.applyJoinOption;
        this.createTime = builder.createTime;
        this.appDefinedData = builder.appDefinedData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getOwnerAccount() {
        return ownerAccount;
    }

    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getNotification() {
        return notification;
    }

    public void setNotification(String notification) {
        this.notification = notification;
    }

    public String getFaceUrl() {
        return faceUrl;
    }

    public void setFaceUrl(String faceUrl) {
        this.faceUrl = faceUrl;
    }

    public Integer getMaxMemberCount() {
        return maxMemberCount;
    }

    public void setMaxMemberCount(Integer maxMemberCount) {
        this.maxMemberCount = maxMemberCount;
    }

    public String getApplyJoinOption() {
        return applyJoinOption;
    }

    public void setApplyJoinOption(String applyJoinOption) {
        this.applyJoinOption = applyJoinOption;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public List<Map<String, Object>> getAppDefinedData() {
        return appDefinedData;
    }

    public void setAppDefinedData(List<Map<String, Object>> appDefinedData) {
        this.appDefinedData = appDefinedData;
    }


    public static final class Builder {
        private String ownerAccount;
        private String type;
        private String groupId;
        private String name;
        private String introduction;
        private String notification;
        private String faceUrl;
        private Integer maxMemberCount;
        private String applyJoinOption;
        private Integer createTime;
        private List<Map<String, Object>> appDefinedData;

        private Builder() {
        }

        public ImportGroupRequest build() {
            return new ImportGroupRequest(this);
        }

        public Builder ownerAccount(String ownerAccount) {
            this.ownerAccount = ownerAccount;
            return this;
        }

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder introduction(String introduction) {
            this.introduction = introduction;
            return this;
        }

        public Builder notification(String notification) {
            this.notification = notification;
            return this;
        }

        public Builder faceUrl(String faceUrl) {
            this.faceUrl = faceUrl;
            return this;
        }

        public Builder maxMemberCount(Integer maxMemberCount) {
            this.maxMemberCount = maxMemberCount;
            return this;
        }

        public Builder applyJoinOption(String applyJoinOption) {
            this.applyJoinOption = applyJoinOption;
            return this;
        }

        public Builder createTime(Integer createTime) {
            this.createTime = createTime;
            return this;
        }

        public Builder appDefinedData(List<Map<String, Object>> appDefinedData) {
            this.appDefinedData = appDefinedData;
            return this;
        }
    }
}
