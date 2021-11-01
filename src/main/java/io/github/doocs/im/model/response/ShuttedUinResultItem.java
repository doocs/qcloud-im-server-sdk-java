package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author bingo
 * @since 2021/8/4 11:23
 */
public class ShuttedUinResultItem {
    @JsonProperty("Member_Account")
    private String memberAccount;

    @JsonProperty("ShuttedUntil")
    private Integer shuttedUntil;

    public String getMemberAccount() {
        return memberAccount;
    }

    public void setMemberAccount(String memberAccount) {
        this.memberAccount = memberAccount;
    }

    public Integer getShuttedUntil() {
        return shuttedUntil;
    }

    public void setShuttedUntil(Integer shuttedUntil) {
        this.shuttedUntil = shuttedUntil;
    }

    @Override
    public String toString() {
        return "ShuttedUinResultItem{" +
                "memberAccount='" + memberAccount + '\'' +
                ", shuttedUntil=" + shuttedUntil +
                '}';
    }
}
