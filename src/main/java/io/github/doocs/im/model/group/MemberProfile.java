package io.github.doocs.im.model.group;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * @author bingo
 * @since 2021/8/1 11:20
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MemberProfile implements Serializable {
    private static final long serialVersionUID = -7102796968963047885L;
    /**
     * 群成员 ID
     */
    @JsonProperty("Member_Account")
    private String memberAccount;

    /**
     * 群内身份
     */
    @JsonProperty("Role")
    private String role;

    /**
     * 入群时间
     */
    @JsonProperty("JoinTime")
    private Integer joinTime;

    /**
     * 该成员当前已读消息 Seq
     * 消息序列号，用于标记该条消息，数据范围 [0,4294967295]
     */
    @JsonProperty("MsgSeq")
    private Long msgSeq;

    /**
     * 消息接收选项
     */
    @JsonProperty("MsgFlag")
    private String msgFlag;

    /**
     * 最后发送消息的时间
     */
    @JsonProperty("LastSendMsgTime")
    private Integer lastSendMsgTime;

    /**
     * 0表示未被禁言，否则为禁言的截止时间
     */
    @JsonProperty("MuteUntil")
    private Long muteUntil;

    /**
     * 群名片
     */
    @JsonProperty("NameCard")
    private String nameCard;

    /**
     * 返回的群成员自定义字段信息
     */
    @JsonProperty("AppMemberDefinedData")
    private List<AppMemberDefinedDataItem> appMemberDefinedData;

    public MemberProfile() {
    }

    public MemberProfile(String memberAccount, String role, Integer joinTime, Long msgSeq,
                         String msgFlag, Integer lastSendMsgTime, Long muteUntil, String nameCard,
                         List<AppMemberDefinedDataItem> appMemberDefinedData) {
        this.memberAccount = memberAccount;
        this.role = role;
        this.joinTime = joinTime;
        this.msgSeq = msgSeq;
        this.msgFlag = msgFlag;
        this.lastSendMsgTime = lastSendMsgTime;
        this.muteUntil = muteUntil;
        this.nameCard = nameCard;
        this.appMemberDefinedData = appMemberDefinedData;
    }

    private MemberProfile(Builder builder) {
        this.memberAccount = builder.memberAccount;
        this.role = builder.role;
        this.joinTime = builder.joinTime;
        this.msgSeq = builder.msgSeq;
        this.msgFlag = builder.msgFlag;
        this.lastSendMsgTime = builder.lastSendMsgTime;
        this.muteUntil = builder.muteUntil;
        this.nameCard = builder.nameCard;
        this.appMemberDefinedData = builder.appMemberDefinedData;
    }

    public static Builder builder() {
        return new Builder();
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

    public Long getMsgSeq() {
        return msgSeq;
    }

    public void setMsgSeq(Long msgSeq) {
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

    public Long getMuteUntil() {
        return muteUntil;
    }

    public void setMuteUntil(Long muteUntil) {
        this.muteUntil = muteUntil;
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


    public static final class Builder {
        private String memberAccount;
        private String role;
        private Integer joinTime;
        /**
         * 消息序列号，用于标记该条消息，数据范围 [0,4294967295]
         */
        private Long msgSeq;
        private String msgFlag;
        private Integer lastSendMsgTime;
        private Long muteUntil;
        private String nameCard;
        private List<AppMemberDefinedDataItem> appMemberDefinedData;

        private Builder() {
        }

        public MemberProfile build() {
            return new MemberProfile(this);
        }

        public Builder memberAccount(String memberAccount) {
            this.memberAccount = memberAccount;
            return this;
        }

        public Builder role(String role) {
            this.role = role;
            return this;
        }

        public Builder joinTime(Integer joinTime) {
            this.joinTime = joinTime;
            return this;
        }

        public Builder msgSeq(Long msgSeq) {
            this.msgSeq = msgSeq;
            return this;
        }

        public Builder msgFlag(String msgFlag) {
            this.msgFlag = msgFlag;
            return this;
        }

        public Builder lastSendMsgTime(Integer lastSendMsgTime) {
            this.lastSendMsgTime = lastSendMsgTime;
            return this;
        }

        public Builder muteUntil(Long muteUntil) {
            this.muteUntil = muteUntil;
            return this;
        }

        public Builder nameCard(String nameCard) {
            this.nameCard = nameCard;
            return this;
        }

        public Builder appMemberDefinedData(List<AppMemberDefinedDataItem> appMemberDefinedData) {
            this.appMemberDefinedData = appMemberDefinedData;
            return this;
        }
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
                ", muteUntil=" + muteUntil +
                ", nameCard='" + nameCard + '\'' +
                ", appMemberDefinedData=" + appMemberDefinedData +
                '}';
    }
}
