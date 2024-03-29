package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * @author bingo
 * @since 2021/8/4 11:23
 */
public class MutedAccountItem implements Serializable {
    private static final long serialVersionUID = 1084397267742286846L;
    /**
     * 被禁言的成员 ID
     */
    @JsonProperty("Member_Account")
    private String memberAccount;

    /**
     * 被禁言到的时间
     */
    @JsonProperty("MutedUntil")
    private Long mutedUntil;

    public String getMemberAccount() {
        return memberAccount;
    }

    public void setMemberAccount(String memberAccount) {
        this.memberAccount = memberAccount;
    }

    public Long getMutedUntil() {
        return mutedUntil;
    }

    public void setMutedUntil(Long mutedUntil) {
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
