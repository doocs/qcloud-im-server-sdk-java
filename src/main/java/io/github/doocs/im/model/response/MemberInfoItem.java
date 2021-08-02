package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

/**
 * @author hyh
 * @since 2021/08/02 19:22
 */
public class MemberInfoItem {
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

    @JsonProperty("AppMemberDefinedData")
    private List<Map<String, Object>> appMemberDefinedData;

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

    public List<Map<String, Object>> getAppMemberDefinedData() {
        return appMemberDefinedData;
    }

    public void setAppMemberDefinedData(List<Map<String, Object>> appMemberDefinedData) {
        this.appMemberDefinedData = appMemberDefinedData;
    }

    @Override
    public String toString() {
        return "MemberInfoItem{" +
                "memberAccount='" + memberAccount + '\'' +
                ", role='" + role + '\'' +
                ", joinTime=" + joinTime +
                ", msgSeq=" + msgSeq +
                ", msgFlag='" + msgFlag + '\'' +
                ", lastSendMsgTime=" + lastSendMsgTime +
                ", shutUpUntil=" + shutUpUntil +
                ", appMemberDefinedData=" + appMemberDefinedData +
                '}';
    }
}
