package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author hyh
 * @since 2021/08/02 19:15
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MemberItem {
    @JsonProperty("Member_Account")
    private String memberAccount;

    @JsonProperty("Role")
    private String role;

    @JsonProperty("JoinTime")
    private Integer joinTime;

    @JsonProperty("UnreadMsgNum")
    private Integer unreadMsgNum;

    public MemberItem() {
    }

    public MemberItem(String memberAccount) {
        this.memberAccount = memberAccount;
    }

    public MemberItem(String memberAccount, String role, Integer joinTime, Integer unreadMsgNum) {
        this.memberAccount = memberAccount;
        this.role = role;
        this.joinTime = joinTime;
        this.unreadMsgNum = unreadMsgNum;
    }

    private MemberItem(Builder builder) {
        this.memberAccount = builder.memberAccount;
        this.role = builder.role;
        this.joinTime = builder.joinTime;
        this.unreadMsgNum = builder.unreadMsgNum;
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

    public Integer getUnreadMsgNum() {
        return unreadMsgNum;
    }

    public void setUnreadMsgNum(Integer unreadMsgNum) {
        this.unreadMsgNum = unreadMsgNum;
    }


    public static final class Builder {
        private String memberAccount;
        private String role;
        private Integer joinTime;
        private Integer unreadMsgNum;

        private Builder() {
        }

        public MemberItem build() {
            return new MemberItem(this);
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

        public Builder unreadMsgNum(Integer unreadMsgNum) {
            this.unreadMsgNum = unreadMsgNum;
            return this;
        }
    }
}
