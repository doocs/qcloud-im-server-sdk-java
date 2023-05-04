package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * @author bingo
 * @since 2022/7/15 11:07
 */
public class MemberListItem implements Serializable {
    private static final long serialVersionUID = 8600887312871395093L;
    /**
     * 用户的 UserID
     */
    @JsonProperty("Member_Account")
    private String memberAccount;

    /**
     * 成员进群时间
     */
    @JsonProperty("JoinTime")
    private Integer joinTime;

    public String getMemberAccount() {
        return memberAccount;
    }

    public void setMemberAccount(String memberAccount) {
        this.memberAccount = memberAccount;
    }

    public Integer getJoinTime() {
        return joinTime;
    }

    public void setJoinTime(Integer joinTime) {
        this.joinTime = joinTime;
    }

    @Override
    public String toString() {
        return "MemberListItem{" +
                "memberAccount='" + memberAccount + '\'' +
                ", joinTime=" + joinTime +
                '}';
    }
}
