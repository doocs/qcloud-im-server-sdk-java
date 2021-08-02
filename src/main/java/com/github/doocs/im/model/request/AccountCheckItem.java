package com.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author bingo
 * @since 2021/7/30 17:27
 */
public class AccountCheckItem {
    @JsonProperty("UserID")
    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
