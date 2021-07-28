package com.qcloud.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author bingo
 * @since 2021/7/28 11:10
 */
public class QueryStateResultItem {
    @JsonProperty("To_Account")
    private String toAccount;

    @JsonProperty("Status")
    private String status;

    public String getToAccount() {
        return toAccount;
    }

    public void setToAccount(String toAccount) {
        this.toAccount = toAccount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
