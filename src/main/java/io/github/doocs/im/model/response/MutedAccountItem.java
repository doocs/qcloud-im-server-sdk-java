package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author bingo
 * @since 2021/8/4 11:23
 */
public class MutedAccountItem {
    /**
     * 被禁言的成员 ID
     */
    @JsonProperty("Member_Account")
    private String memberAccount;

    /**
     * 被禁言到的时间
     */
    @JsonProperty("MutedUntil")
    private Integer mutedUntil;

    public String getMemberAccount() {
        return memberAccount;
    }

    public void setMemberAccount(String memberAccount) {
        this.memberAccount = memberAccount;
    }

    public Integer getMutedUntil() {
        return mutedUntil;
    }

    public void setMutedUntil(Integer mutedUntil) {
        this.mutedUntil = mutedUntil;
    }

    @Override
    public String toString() {
        return "MutedAccountItem{" +
                "memberAccount='" + memberAccount + '\'' +
                ", mutedUntil=" + mutedUntil +
                '}';
    }
}
