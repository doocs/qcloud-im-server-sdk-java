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
    /**
     * 群主 ID（需是 已导入 的帐号）。填写后自动添加到群成员中；如果不填，群没有群主
     */
    @JsonProperty("Owner_Account")
    private String ownerAccount;

    /**
     * 群组形态，包括 Public（陌生人社交群），Private（即 Work，好友工作群），
     * ChatRoom（即 Meeting，会议群），AVChatRoom（直播群），Community（社群）
     */
    @JsonProperty("Type")
    private String type;

    /**
     * 为了使得群组 ID 更加简单，便于记忆传播，腾讯云支持 App 在通过 REST API 创建群组时 自定义群组 ID
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * 群名称，最长30字节，使用 UTF-8 编码，1个汉字占3个字节
     */
    @JsonProperty("Name")
    private String name;

    /**
     * 群简介，最长240字节，使用 UTF-8 编码，1个汉字占3个字节
     */
    @JsonProperty("Introduction")
    private String introduction;

    /**
     * 群公告，最长300字节，使用 UTF-8 编码，1个汉字占3个字节
     */
    @JsonProperty("Notification")
    private String notification;

    /**
     * 群头像 URL，最长100字节
     */
    @JsonProperty("FaceUrl")
    private String faceUrl;

    /**
     * 最大群成员数量，缺省时的默认值：付费套餐包上限，例如体验版是20，如果升级套餐包，需按照修改群基础资料修改这个字段
     */
    @JsonProperty("MaxMemberCount")
    private Integer maxMemberCount;

    /**
     * 申请加群处理方式。包含 FreeAccess（自由加入），NeedPermission（需要验证），
     * DisableApply（禁止加群），不填默认为 NeedPermission（需要验证）
     * 仅当创建支持申请加群的 群组 时，该字段有效
     */
    @JsonProperty("ApplyJoinOption")
    private String applyJoinOption;

    /**
     * 群组维度的自定义字段，默认情况是没有的，可以通过 即时通信 IM 控制台 进行配置，详情请参阅 自定义字段
     */
    @JsonProperty("AppDefinedData")
    private List<AppDefinedDataItem> appDefinedData;

    /**
     * 初始群成员列表，最多100个；成员信息字段详情请参阅 群成员资料
     */
    @JsonProperty("MemberList")
    private List<MemberProfile> memberList;

    /**
     * 群成员维度的自定义字段，默认情况是没有的，可以通过 即时通信 IM 控制台 进行配置，详情请参阅 自定义字段
     */
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
