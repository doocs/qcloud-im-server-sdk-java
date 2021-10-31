package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author bingo
 * @since 2021/8/4 10:48
 */
public class GroupIdListResultItem {
    @JsonProperty("GroupId")
    private String groupId;

    @JsonProperty("Type")
    private String type;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Introduction")
    private String introduction;

    @JsonProperty("Notification")
    private String notification;

    @JsonProperty("FaceUrl")
    private String faceUrl;

    @JsonProperty("Owner_Account")
    private String ownerAccount;

    @JsonProperty("CreateTime")
    private Integer createTime;

    @JsonProperty("InfoSeq")
    private Integer infoSeq;

    @JsonProperty("LastInfoTime")
    private Integer lastInfoTime;

    @JsonProperty("LastMsgTime")
    private Integer lastMsgTime;

    @JsonProperty("NextMsgSeq")
    private Integer nextMsgSeq;

    @JsonProperty("MemberNum")
    private Integer memberNum;

    @JsonProperty("MaxMemberNum")
    private Integer maxMemberNum;

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

    public Integer getNextMsgSeq() {
        return nextMsgSeq;
    }

    public void setNextMsgSeq(Integer nextMsgSeq) {
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
        return "GroupIdListIResultItem{" +
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
