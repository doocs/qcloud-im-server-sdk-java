package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author bingo
 * @since 2022/8/29 14:07
 */
public class BannedAccountItem {
    /**
     * 封禁成员的封禁截止时间
     */
    @JsonProperty("BannedUntil")
    private Long bannedUntil;

    /**
     * 封禁成员账号 id
     */
    @JsonProperty("Member_Account")
    private String memberAccount;

    public Long getBannedUntil() {
        return bannedUntil;
    }

    public void setBannedUntil(Long bannedUntil) {
        this.bannedUntil = bannedUntil;
    }

    public String getMemberAccount() {
        return memberAccount;
    }

    public void setMemberAccount(String memberAccount) {
        this.memberAccount = memberAccount;
    }

    @Override
    public String toString() {
        return "BannedAccountItem{" +
                "bannedUntil=" + bannedUntil +
                ", memberAccount='" + memberAccount + '\'' +
                '}';
    }
}
