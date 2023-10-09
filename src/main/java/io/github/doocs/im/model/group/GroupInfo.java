package io.github.doocs.im.model.group;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * @author bingo
 * @since 2021/10/31 21:02
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GroupInfo implements Serializable {
    private static final long serialVersionUID = -4244731127077878133L;
    /**
     * 群组 ID，App 内保证唯一，其格式前缀为 @TGS#。另外，App 亦可自定义群组 ID
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * 群组形态，包括 Public（陌生人社交群），Private（即 Work，好友工作群），
     * ChatRoom（即 Meeting，会议群），AVChatRoom（直播群），Community（社群）
     */
    @JsonProperty("Type")
    private String type;

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
     * 群主 ID（需是 已导入 的账号）。填写后自动添加到群成员中；如果不填，群没有群主
     */
    @JsonProperty("Owner_Account")
    private String ownerAccount;

    /**
     * 群组的创建时间
     */
    @JsonProperty("CreateTime")
    private Integer createTime;

    /**
     * 群资料的每次变都会增加该值
     */
    @JsonProperty("InfoSeq")
    private Long infoSeq;

    /**
     * 群组最后一次信息变更时间
     */
    @JsonProperty("LastInfoTime")
    private Integer lastInfoTime;

    /**
     * 群组内最后发消息的时间
     */
    @JsonProperty("LastMsgTime")
    private Integer lastMsgTime;

    /**
     * 群内下一条消息的 Seq
     */
    @JsonProperty("NextMsgSeq")
    private Long nextMsgSeq;

    /**
     * 当前成员数量
     */
    @JsonProperty("MemberNum")
    private Integer memberNum;

    /**
     * 最大群成员数量，缺省时的默认值：付费套餐包上限，例如体验版是20，如果升级套餐包，需按照修改群基础资料修改这个字段
     */
    @JsonProperty("MaxMemberNum")
    private Integer maxMemberNum;

    /**
     * 申请加群处理方式。包含 FreeAccess（自由加入），NeedPermission（需要验证），
     * DisableApply（禁止加群），不填默认为 NeedPermission（需要验证）
     * 仅当创建支持申请加群的 群组 时，该字段有效
     */
    @JsonProperty("ApplyJoinOption")
    private String applyJoinOption;

    /**
     * 群全员禁言状态
     */
    @JsonProperty("MuteAllMember")
    private String muteAllMember;

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

    public GroupInfo(String groupId, String type, String name, String introduction, String notification,
                     String faceUrl, String ownerAccount, Integer createTime, Long infoSeq,
                     Integer lastInfoTime, Integer lastMsgTime, Long nextMsgSeq, Integer memberNum,
                     Integer maxMemberNum, String applyJoinOption, String muteAllMember,
                     List<AppDefinedDataItem> appDefinedData, List<MemberProfile> memberList,
                     List<AppMemberDefinedDataItem> appMemberDefinedData) {
        this.groupId = groupId;
        this.type = type;
        this.name = name;
        this.introduction = introduction;
        this.notification = notification;
        this.faceUrl = faceUrl;
        this.ownerAccount = ownerAccount;
        this.createTime = createTime;
        this.infoSeq = infoSeq;
        this.lastInfoTime = lastInfoTime;
        this.lastMsgTime = lastMsgTime;
        this.nextMsgSeq = nextMsgSeq;
        this.memberNum = memberNum;
        this.maxMemberNum = maxMemberNum;
        this.applyJoinOption = applyJoinOption;
        this.muteAllMember = muteAllMember;
        this.appDefinedData = appDefinedData;
        this.memberList = memberList;
        this.appMemberDefinedData = appMemberDefinedData;
    }

    private GroupInfo(Builder builder) {
        this.groupId = builder.groupId;
        this.type = builder.type;
        this.name = builder.name;
        this.introduction = builder.introduction;
        this.notification = builder.notification;
        this.faceUrl = builder.faceUrl;
        this.ownerAccount = builder.ownerAccount;
        this.createTime = builder.createTime;
        this.infoSeq = builder.infoSeq;
        this.lastInfoTime = builder.lastInfoTime;
        this.lastMsgTime = builder.lastMsgTime;
        this.nextMsgSeq = builder.nextMsgSeq;
        this.memberNum = builder.memberNum;
        this.maxMemberNum = builder.maxMemberNum;
        this.applyJoinOption = builder.applyJoinOption;
        this.muteAllMember = builder.muteAllMember;
        this.appDefinedData = builder.appDefinedData;
        this.memberList = builder.memberList;
        this.appMemberDefinedData = builder.appMemberDefinedData;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public String getOwnerAccount() {
        return ownerAccount;
    }

    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Long getInfoSeq() {
        return infoSeq;
    }

    public void setInfoSeq(Long infoSeq) {
        this.infoSeq = infoSeq;
    }

    public Integer getLastInfoTime() {
        return lastInfoTime;
    }

    public void setLastInfoTime(Integer lastInfoTime) {
        this.lastInfoTime = lastInfoTime;
    }

    public Integer getLastMsgTime() {
        return lastMsgTime;
    }

    public void setLastMsgTime(Integer lastMsgTime) {
        this.lastMsgTime = lastMsgTime;
    }

    public Long getNextMsgSeq() {
        return nextMsgSeq;
    }

    public void setNextMsgSeq(Long nextMsgSeq) {
        this.nextMsgSeq = nextMsgSeq;
    }

    public Integer getMemberNum() {
        return memberNum;
    }

    public void setMemberNum(Integer memberNum) {
        this.memberNum = memberNum;
    }

    public Integer getMaxMemberNum() {
        return maxMemberNum;
    }

    public void setMaxMemberNum(Integer maxMemberNum) {
        this.maxMemberNum = maxMemberNum;
    }

    public String getApplyJoinOption() {
        return applyJoinOption;
    }

    public void setApplyJoinOption(String applyJoinOption) {
        this.applyJoinOption = applyJoinOption;
    }

    public String getMuteAllMember() {
        return muteAllMember;
    }

    public void setMuteAllMember(String muteAllMember) {
        this.muteAllMember = muteAllMember;
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


    public static final class Builder {
        private String groupId;
        private String type;
        private String name;
        private String introduction;
        private String notification;
        private String faceUrl;
        private String ownerAccount;
        private Integer createTime;
        private Long infoSeq;
        private Integer lastInfoTime;
        private Integer lastMsgTime;
        private Long nextMsgSeq;
        private Integer memberNum;
        private Integer maxMemberNum;
        private String applyJoinOption;
        private String muteAllMember;
        private List<AppDefinedDataItem> appDefinedData;
        private List<MemberProfile> memberList;
        private List<AppMemberDefinedDataItem> appMemberDefinedData;

        private Builder() {
        }

        public GroupInfo build() {
            return new GroupInfo(this);
        }

        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        public Builder type(String type) {
            this.type = type;
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

        public Builder ownerAccount(String ownerAccount) {
            this.ownerAccount = ownerAccount;
            return this;
        }

        public Builder createTime(Integer createTime) {
            this.createTime = createTime;
            return this;
        }

        public Builder infoSeq(Long infoSeq) {
            this.infoSeq = infoSeq;
            return this;
        }

        public Builder lastInfoTime(Integer lastInfoTime) {
            this.lastInfoTime = lastInfoTime;
            return this;
        }

        public Builder lastMsgTime(Integer lastMsgTime) {
            this.lastMsgTime = lastMsgTime;
            return this;
        }

        public Builder nextMsgSeq(Long nextMsgSeq) {
            this.nextMsgSeq = nextMsgSeq;
            return this;
        }

        public Builder memberNum(Integer memberNum) {
            this.memberNum = memberNum;
            return this;
        }

        public Builder maxMemberNum(Integer maxMemberNum) {
            this.maxMemberNum = maxMemberNum;
            return this;
        }

        public Builder applyJoinOption(String applyJoinOption) {
            this.applyJoinOption = applyJoinOption;
            return this;
        }

        public Builder muteAllMember(String muteAllMember) {
            this.muteAllMember = muteAllMember;
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
    }
}
