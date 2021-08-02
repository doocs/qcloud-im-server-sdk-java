package com.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author bingo
 * @since 2021/7/28 11:04
 */
public class AccountDeleteResultItem {
    @JsonProperty("ResultCode")
    private Integer resultCode;

    @JsonProperty("ResultInfo")
    private String resultInfo;

    @JsonProperty("UserID")
    private String userId;

    public Integer getResultCode() {
        return resultCode;
    }

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultInfo() {
        return resultInfo;
    }

    public void setResultInfo(String resultInfo) {
        this.resultInfo = resultInfo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "AccountDeleteResultItem{" +
                "resultCode=" + resultCode +
                ", resultInfo='" + resultInfo + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }
}
