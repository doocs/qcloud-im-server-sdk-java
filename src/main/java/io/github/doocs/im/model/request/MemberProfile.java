package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

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

    @JsonProperty("NameCard")
    private String nameCard;

    public MemberProfile() {
    }

    public MemberProfile(String memberAccount, String role, Integer joinTime, Integer msgSeq, String msgFlag, Integer lastSendMsgTime, String nameCard) {
        this.memberAccount = memberAccount;
        this.role = role;
        this.joinTime = joinTime;
        this.msgSeq = msgSeq;
        this.msgFlag = msgFlag;
        this.lastSendMsgTime = lastSendMsgTime;
        this.nameCard = nameCard;
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

    public String getNameCard() {
        return nameCard;
    }

    public void setNameCard(String nameCard) {
        this.nameCard = nameCard;
    }
}
