package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author bingo
 * @since 2021/7/28 11:11
 */
public class QueryResultErrorItem {
    /**
     * 状态查询失败的目标帐号
     */
    @JsonProperty("To_Account")
    private String toAccount;

    /**
     * 状态查询失败的错误码，若目标帐号的错误码为70107，表示该帐号不存在
     */
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

    @Override
    public String toString() {
        return "QueryResultErrorItem{" +
                "toAccount='" + toAccount + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
