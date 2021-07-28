package com.qcloud.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author bingo
 * @since 2021/7/28 11:11
 */
public class QueryStateErrorItem {
    @JsonProperty("To_Account")
    private String toAccount;

    @JsonProperty("ErrorCode")
    private Integer errorCode;

    public String getToAccount() {
        return toAccount;
    }

    public void setToAccount(String toAccount) {
        this.toAccount = toAccount;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }
}
