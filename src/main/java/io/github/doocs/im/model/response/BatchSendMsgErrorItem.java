package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author hyh
 * @since 2021/07/28 17:47
 */
public class BatchSendMsgErrorItem {
    @JsonProperty("To_Account")
    private String toAccount;

    @JsonProperty("ErrorCode")
    private String errorCode;

    public String getToAccount() {
        return toAccount;
    }

    public void setToAccount(String toAccount) {
        this.toAccount = toAccount;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    @Override
    public String toString() {
        return "BatchSendMsgErrorItem{" +
                "toAccount='" + toAccount + '\'' +
                ", errorCode='" + errorCode + '\'' +
                '}';
    }
}
