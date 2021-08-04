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

    @Override
    public String toString() {
        return "ShuttedUinResultItem{" +
                "memberAccount='" + memberAccount + '\'' +
                ", shuttedUntil=" + shuttedUntil +
                '}';
    }
}
