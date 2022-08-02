package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author bingo
 * @since 2021/8/4 10:48
 */
public class GroupIdListResultItem {
    /**
     * 群组的唯一标识
     * 只读
     * 群组 ID，App 内保证唯一，其格式前缀为 @TGS#。另外，App 亦可自定义群组 ID
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * 群组类型
     * 只读
     * 默认支持以下群组类型：
     * 好友工作群（Work）、陌生人社交群（Public）、临时会议群（Meeting）、直播群（AVChatRoom）、社群（Community）
     * 旧版本 SDK 中还包含 Private、ChatRoom 以及 BChatRoom 类型，不建议使用
     */
    @JsonProperty("Type")
    private String type;

    /**
     * 群组名称
     * 可读可写。最长30字节，不可调整
     */
    @JsonProperty("Name")
    private String name;

    /**
     * 群组简介
     * 可读可写。最长240字节，不可调整
     */
    @JsonProperty("Introduction")
    private String introduction;

    /**
     * 群组公告
     * 可读可写。最长300字节，不可调整
     */
    @JsonProperty("Notification")
    private String notification;

    /**
     * 群组头像 URL
     * 可读可写。最长100字节，不可调整
     */
    @JsonProperty("FaceUrl")
    private String faceUrl;

    /**
     * 群主 ID
     * 只读
     */
    @JsonProperty("Owner_Account")
    private String ownerAccount;

    /**
     * 群组的创建时间
     * 只读
     */
    @JsonProperty("CreateTime")
    private Integer createTime;

    /**
     * 群资料的每次变都会增加该值
     * 只读
     */
    @JsonProperty("InfoSeq")
    private Integer infoSeq;

    /**
     * 群组最后一次信息变更时间
     * 只读
     */
    @JsonProperty("LastInfoTime")
    private Integer lastInfoTime;

    /**
     * 群组内最后发消息的时间
     * 只读
     */
    @JsonProperty("LastMsgTime")
    private Integer lastMsgTime;

    /**
     * 群内下一条消息的 Seq
     * 只读
     * 群组内每一条消息都有一条唯一的消息 Seq，且该 Seq 是按照发消息顺序而连续的。从1开始，群内每增加一条消息，NextMsgSeq 就会增加1
     */
    @JsonProperty("NextMsgSeq")
    private Long nextMsgSeq;

    /**
     * 当前成员数量
     * 只读
     */
    @JsonProperty("MemberNum")
    private Integer memberNum;

    /**
     * 最大成员数量
     * 缺省时的默认值：付费套餐包上限，例如体验版是20，如果升级套餐包，需按照修改群基础资料修改这个字段到对应数值
     */
    @JsonProperty("MaxMemberNum")
    private Integer maxMemberNum;

    /**
     * 申请加群选项
     * 申请加群选项包括如下几种：
     * DisableApply 表示禁止任何人申请加入
     * NeedPermission 表示需要群主或管理员审批
     * FreeAccess 表示允许无需审批自由加入群组
     */
    @JsonProperty("ApplyJoinOption")
    private String applyJoinOption;

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

    public Integer getInfoSeq() {
        return infoSeq;
    }

    public void setInfoSeq(Integer infoSeq) {
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

    @Override
    public String toString() {
        return "GroupIdListResultItem{" +
                "groupId='" + groupId + '\'' +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", introduction='" + introduction + '\'' +
                ", notification='" + notification + '\'' +
                ", faceUrl='" + faceUrl + '\'' +
                ", ownerAccount='" + ownerAccount + '\'' +
                ", createTime=" + createTime +
                ", infoSeq=" + infoSeq +
                ", lastInfoTime=" + lastInfoTime +
                ", lastMsgTime=" + lastMsgTime +
                ", nextMsgSeq=" + nextMsgSeq +
                ", memberNum=" + memberNum +
                ", maxMemberNum=" + maxMemberNum +
                ", applyJoinOption='" + applyJoinOption + '\'' +
                '}';
    }
}
