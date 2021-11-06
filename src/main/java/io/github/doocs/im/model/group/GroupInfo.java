package io.github.doocs.im.model.group;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author bingo
 * @since 2021/10/31 21:02
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GroupInfo {
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

    @JsonProperty("AppDefinedData")
    private List<AppDefinedDataItem> appDefinedData;

    @JsonProperty("MemberList")
    private List<MemberProfile> memberList;

    @JsonProperty("AppMemberDefinedData")
    private List<AppMemberDefinedDataItem> appMemberDefinedData;

    public GroupInfo() {
    }

    public <T extends Builder> GroupInfo(String ownerAccount, String type, String groupId, String name, String introduction,
                                         String notification, String faceUrl, Integer maxMemberCount, String applyJoinOption,
                                         List<AppDefinedDataItem> appDefinedData, List<MemberProfile> memberList,
                                         List<AppMemberDefinedDataItem> appMemberDefinedData) {
        this.ownerAccount = ownerAccount;
        this.type = type;
        this.groupId = groupId;
        this.name = name;
        this.introduction = introduction;
        this.notification = notification;
        this.faceUrl = faceUrl;
        this.maxMemberCount = maxMemberCount;
        this.applyJoinOption = applyJoinOption;
        this.appDefinedData = appDefinedData;
        this.memberList = memberList;
        this.appMemberDefinedData = appMemberDefinedData;
    }

    protected <T extends Builder> GroupInfo(Builder builder) {
        this.ownerAccount = builder.ownerAccount;
        this.type = builder.type;
        this.groupId = builder.groupId;
        this.name = builder.name;
        this.introduction = builder.introduction;
        this.notification = builder.notification;
        this.faceUrl = builder.faceUrl;
        this.maxMemberCount = builder.maxMemberCount;
        this.applyJoinOption = builder.applyJoinOption;
        this.appDefinedData = builder.appDefinedData;
        this.memberList = builder.memberList;
        this.appMemberDefinedData = builder.appMemberDefinedData;
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

    public List<AppDefinedDataItem> getAppDefinedData() {
        return appDefinedData;
    }

    public void setAppDefinedData(List<AppDefinedDataItem> appDefinedData) {
        this.appDefinedData = appDefinedData;
    }

    public List<MemberProfile> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<MemberProfile> memberList) {
        this.memberList = memberList;
    }

    public List<AppMemberDefinedDataItem> getAppMemberDefinedData() {
        return appMemberDefinedData;
    }

    public void setAppMemberDefinedData(List<AppMemberDefinedDataItem> appMemberDefinedData) {
        this.appMemberDefinedData = appMemberDefinedData;
    }


    @Override
    public String toString() {
        return "GroupInfo{" +
                "ownerAccount='" + ownerAccount + '\'' +
                ", type='" + type + '\'' +
                ", groupId='" + groupId + '\'' +
                ", name='" + name + '\'' +
                ", introduction='" + introduction + '\'' +
                ", notification='" + notification + '\'' +
                ", faceUrl='" + faceUrl + '\'' +
                ", maxMemberCount=" + maxMemberCount +
                ", applyJoinOption='" + applyJoinOption + '\'' +
                ", appDefinedData=" + appDefinedData +
                ", memberList=" + memberList +
                ", appMemberDefinedData=" + appMemberDefinedData +
                '}';
    }

    public static class Builder<T extends Builder> {
        private String ownerAccount;
        private String type;
        private String groupId;
        private String name;
        private String introduction;
        private String notification;
        private String faceUrl;
        private Integer maxMemberCount;
        private String applyJoinOption;
        private List<AppDefinedDataItem> appDefinedData;
        private List<MemberProfile> memberList;
        private List<AppMemberDefinedDataItem> appMemberDefinedData;

        protected Builder() {
        }

        public GroupInfo build() {
            return new GroupInfo(this);
        }

        public T ownerAccount(String ownerAccount) {
            this.ownerAccount = ownerAccount;
            return (T) this;
        }

        public T type(String type) {
            this.type = type;
            return (T) this;
        }

        public T groupId(String groupId) {
            this.groupId = groupId;
            return (T) this;
        }

        public T name(String name) {
            this.name = name;
            return (T) this;
        }

        public T introduction(String introduction) {
            this.introduction = introduction;
            return (T) this;
        }

        public T notification(String notification) {
            this.notification = notification;
            return (T) this;
        }

        public T faceUrl(String faceUrl) {
            this.faceUrl = faceUrl;
            return (T) this;
        }

        public T maxMemberCount(Integer maxMemberCount) {
            this.maxMemberCount = maxMemberCount;
            return (T) this;
        }

        public T applyJoinOption(String applyJoinOption) {
            this.applyJoinOption = applyJoinOption;
            return (T) this;
        }

        public T appDefinedData(List<AppDefinedDataItem> appDefinedData) {
            this.appDefinedData = appDefinedData;
            return (T) this;
        }

        public T memberList(List<MemberProfile> memberList) {
            this.memberList = memberList;
            return (T) this;
        }

        public T appMemberDefinedData(List<AppMemberDefinedDataItem> appMemberDefinedData) {
            this.appMemberDefinedData = appMemberDefinedData;
            return (T) this;
        }
    }
}
