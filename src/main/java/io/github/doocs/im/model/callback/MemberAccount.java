package io.github.doocs.im.model.callback;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 群组成员
 *
 * @author bingo
 * @since 2022/7/1 10:18
 */
public class MemberAccount {
    @JsonProperty("Member_Account")
    private String memberAccount;

    public String getMemberAccount() {
        return memberAccount;
    }

    public void setMemberAccount(String memberAccount) {
        this.memberAccount = memberAccount;
    }
}
