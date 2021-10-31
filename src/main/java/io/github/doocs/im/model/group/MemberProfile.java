package io.github.doocs.im.model.group;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author bingo
 * @since 2021/8/1 11:20
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MemberProfile {
    @JsonProperty("Member_Account")
    private String memberAccount;

    @JsonProperty("Role")
    private String role;

    @JsonProperty("JoinTime")
    private Integer joinTime;

    @JsonProperty("MsgSeq")
    private Integer msgSeq;

    @JsonProperty("MsgFlag")
    private String msgFlag;

    @JsonProperty("LastSendMsgTime")
    private Integer lastSendMsgTime;

    @JsonProperty("ShutUpUntil")
    private Integer shutUpUntil;

    @JsonProperty("NameCard")
    private String nameCard;

    @JsonProperty("AppMemberDefinedData")
    private List<AppMemberDefinedDataItem> appMemberDefinedData;

    public MemberProfile() {
    }

    public MemberProfile(String memberAccount, String role, Integer joinTime, Integer msgSeq, String msgFlag, Integer lastSendMsgTime, Integer shutUpUntil, String nameCard, List<AppMemberDefinedDataItem> appMemberDefinedData) {
        this.memberAccount = memberAccount;
        this.role = role;
        this.joinTime = joinTime;
        this.msgSeq = msgSeq;
        this.msgFlag = msgFlag;
        this.lastSendMsgTime = lastSendMsgTime;
        this.shutUpUntil = shutUpUntil;
        this.nameCard = nameCard;
        this.appMemberDefinedData = appMemberDefinedData;
    }

    public String getMemberAccount() {
        return memberAccount;
    }

    public void setMemberAccount(String memberAccount) {
        this.memberAccount = memberAccount;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getJoinTime() {
        return joinTime;
    }

    public void setJoinTime(Integer joinTime) {
        this.joinTime = joinTime;
    }

    public Integer getMsgSeq() {
        return msgSeq;
    }

    public void setMsgSeq(Integer msgSeq) {
        this.msgSeq = msgSeq;
    }

    public String getMsgFlag() {
        return msgFlag;
    }

    public void setMsgFlag(String msgFlag) {
        this.msgFlag = msgFlag;
    }

    public Integer getLastSendMsgTime() {
        return lastSendMsgTime;
    }

    public void setLastSendMsgTime(Integer lastSendMsgTime) {
        this.lastSendMsgTime = lastSendMsgTime;
    }

    public Integer getShutUpUntil() {
        return shutUpUntil;
    }

    public void setShutUpUntil(Integer shutUpUntil) {
        this.shutUpUntil = shutUpUntil;
    }

    public String getNameCard() {
        return nameCard;
    }

    public void setNameCard(String nameCard) {
        this.nameCard = nameCard;
    }

    public List<AppMemberDefinedDataItem> getAppMemberDefinedData() {
        return appMemberDefinedData;
    }

    public void setAppMemberDefinedData(List<AppMemberDefinedDataItem> appMemberDefinedData) {
        this.appMemberDefinedData = appMemberDefinedData;
    }

    @Override
    public String toString() {
        return "MemberProfile{" +
                "memberAccount='" + memberAccount + '\'' +
                ", role='" + role + '\'' +
                ", joinTime=" + joinTime +
                ", msgSeq=" + msgSeq +
                ", msgFlag='" + msgFlag + '\'' +
                ", lastSendMsgTime=" + lastSendMsgTime +
                ", shutUpUntil=" + shutUpUntil +
                ", nameCard='" + nameCard + '\'' +
                ", appMemberDefinedData=" + appMemberDefinedData +
                '}';
    }
}
