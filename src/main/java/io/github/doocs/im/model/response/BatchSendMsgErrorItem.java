package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author hyh
 * @since 2021/07/28 17:47
 */
public class BatchSendMsgErrorItem {
    /**
     * 消息发送失败的目标帐号
     */
    @JsonProperty("To_Account")
    private String toAccount;

    /**
     * 消息发送失败的错误码，若目标帐号的错误码为70107表示该帐号不存在
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
        return "BatchSendMsgErrorItem{" +
                "toAccount='" + toAccount + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
