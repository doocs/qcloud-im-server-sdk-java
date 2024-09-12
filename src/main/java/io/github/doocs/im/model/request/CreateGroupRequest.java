package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.doocs.im.model.group.AppDefinedDataItem;
import io.github.doocs.im.model.group.AppMemberDefinedDataItem;
import io.github.doocs.im.model.group.MemberProfile;

import java.io.Serializable;
import java.util.List;

/**
 * 创建群组-请求参数
 *
 * @author bingo
 * @since 2021/8/1 11:12
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateGroupRequest implements Serializable {
    private static final long serialVersionUID = -3315570733601873621L;
    /**
     * 群主 ID（需是 已导入 的账号）。填写后自动添加到群成员中；如果不填，群没有群主；成员使用 AVChatroom（直播群）时，必须每次调用进群操作
     */
    @JsonProperty("Owner_Account")
    private String ownerAccount;

    /**
     * 群组形态，包括 Public（陌生人社交群），Private（即 Work，好友工作群），ChatRoom（即 Meeting，会议群），AVChatRoom（直播群），Community（社群）
     * {@link io.github.doocs.im.constant.GroupType}
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
     * 申请加群处理方式。包含 FreeAccess（自由加入），NeedPermission（需要验证），DisableApply（禁止加群），不填默认为 NeedPermission（需要验证）
     * 仅当创建支持申请加群的 群组 时，该字段有效
     * {@link io.github.doocs.im.constant.ApplyJoinOption}
     */
    @JsonProperty("ApplyJoinOption")
    private String applyJoinOption;

    /**
     * 邀请加群处理方式。
     * 包含 FreeAccess （直接邀请用户进群，不需要审批等操作）， NeedPermission 需要群管理员或者群主审批， DisableInvite 不支持 SDK 邀请进群
     * 该选项 AVChatRoom 群类型不支持
     */
    @JsonProperty("InviteJoinOption")
    private String inviteJoinOption;

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

    /**
     * 是否支持话题选项，此字段只针对社群有效
     */
    @JsonProperty("SupportTopic")
    private Integer supportTopic;

    /**
     * 仅支持话题的社群可以设置该字段
     * 是否启用权限组作为权限判断依据
     * 0：不启用
     * 1：启用
     */
    @JsonProperty("EnablePermission")
    private Integer enablePermission;

    /**
     * 仅启用权限组作为权限判断依据的群可以设置该字段
     * 群成员在该群中的默认权限
     */
    @JsonProperty("DefaultPermission")
    private Integer defaultPermission;

    public CreateGroupRequest() {
    }

    public CreateGroupRequest(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public CreateGroupRequest(String ownerAccount, String type, String groupId, String name, String introduction,
                              String notification, String faceUrl, Integer maxMemberCount,
                              String applyJoinOption, String inviteJoinOption,
                              List<AppDefinedDataItem> appDefinedData, List<MemberProfile> memberList,
                              List<AppMemberDefinedDataItem> appMemberDefinedData, Integer supportTopic,
                              Integer enablePermission, Integer defaultPermission) {
        this.ownerAccount = ownerAccount;
        this.type = type;
        this.groupId = groupId;
        this.name = name;
        this.introduction = introduction;
        this.notification = notification;
        this.faceUrl = faceUrl;
        this.maxMemberCount = maxMemberCount;
        this.applyJoinOption = applyJoinOption;
        this.inviteJoinOption = inviteJoinOption;
        this.appDefinedData = appDefinedData;
        this.memberList = memberList;
        this.appMemberDefinedData = appMemberDefinedData;
        this.supportTopic = supportTopic;
        this.enablePermission = enablePermission;
        this.defaultPermission = defaultPermission;
    }

    private CreateGroupRequest(Builder builder) {
        this.ownerAccount = builder.ownerAccount;
        this.type = builder.type;
        this.groupId = builder.groupId;
        this.name = builder.name;
        this.introduction = builder.introduction;
        this.notification = builder.notification;
        this.faceUrl = builder.faceUrl;
        this.maxMemberCount = builder.maxMemberCount;
        this.applyJoinOption = builder.applyJoinOption;
        this.inviteJoinOption = builder.inviteJoinOption;
        this.appDefinedData = builder.appDefinedData;
        this.memberList = builder.memberList;
        this.appMemberDefinedData = builder.appMemberDefinedData;
        this.supportTopic = builder.supportTopic;
        this.enablePermission = builder.enablePermission;
        this.defaultPermission = builder.defaultPermission;
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

    public String getInviteJoinOption() {
        return inviteJoinOption;
    }

    public void setInviteJoinOption(String inviteJoinOption) {
        this.inviteJoinOption = inviteJoinOption;
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

    public Integer getSupportTopic() {
        return supportTopic;
    }

    public void setSupportTopic(Integer supportTopic) {
        this.supportTopic = supportTopic;
    }

    public Integer getEnablePermission() {
        return enablePermission;
    }

    public void setEnablePermission(Integer enablePermission) {
        this.enablePermission = enablePermission;
    }

    public Integer getDefaultPermission() {
        return defaultPermission;
    }

    public void setDefaultPermission(Integer defaultPermission) {
        this.defaultPermission = defaultPermission;
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
        private String inviteJoinOption;
        private List<AppDefinedDataItem> appDefinedData;
        private List<MemberProfile> memberList;
        private List<AppMemberDefinedDataItem> appMemberDefinedData;
        private Integer supportTopic;
        private Integer enablePermission;
        private Integer defaultPermission;

        private Builder() {
        }

        public CreateGroupRequest build() {
            return new CreateGroupRequest(this);
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

        public Builder inviteJoinOption(String inviteJoinOption) {
            this.inviteJoinOption = inviteJoinOption;
            return this;
        }

        public Builder appDefinedData(List<AppDefinedDataItem> appDefinedData) {
            this.appDefinedData = appDefinedData;
            return this;
        }

        public Builder memberList(List<MemberProfile> memberList) {
            this.memberList = memberList;
            return this;
        }

        public Builder appMemberDefinedData(List<AppMemberDefinedDataItem> appMemberDefinedData) {
            this.appMemberDefinedData = appMemberDefinedData;
            return this;
        }

        public Builder supportTopic(Integer supportTopic) {
            this.supportTopic = supportTopic;
            return this;
        }

        public Builder enablePermission(Integer enablePermission) {
            this.enablePermission = enablePermission;
            return this;
        }

        public Builder defaultPermission(Integer defaultPermission) {
            this.defaultPermission = defaultPermission;
            return this;
        }
    }
}
