package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author bingo
 * @since 2021/8/4 11:07
 */
public class UserIdListItem {
    /**
     * 成员id
     */
    @JsonProperty("Member_Account")
    private String memberAccount;

    /**
     * 成员角色
     */
    @JsonProperty("Role")
    private String role;

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

    @Override
    public String toString() {
        return "UserIdListItem{" +
                "memberAccount='" + memberAccount + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
