package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author bingo
 * @since 2021/8/4 11:50
 */
public class MemberListResultItem {
    @JsonProperty("Member_Account")
    private String memberAccount;

    @JsonProperty("Result")
    private Integer result;

    @Override
    public String toString() {
        return "MemberListResultItem{" +
                "memberAccount='" + memberAccount + '\'' +
                ", result=" + result +
                '}';
    }
}
