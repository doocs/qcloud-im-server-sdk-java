package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 撤回单聊消息-请求参数
 *
 * @author bingo
 * @since 2021/7/31 14:43
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdminMsgWithdrawRequest extends GenericRequest {
    /**
     * 消息发送方 UserID
     */
    @JsonProperty("From_Account")
    private String fromAccount;

    /**
     * 消息接收方 UserID
     */
    @JsonProperty("To_Account")
    private String toAccount;

    @JsonProperty("MsgKey")
    private String msgKey;

    public AdminMsgWithdrawRequest() {
    }

    public AdminMsgWithdrawRequest(String fromAccount, String toAccount, String msgKey) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.msgKey = msgKey;
    }

    private AdminMsgWithdrawRequest(Builder builder) {
        this.fromAccount = builder.fromAccount;
        this.toAccount = builder.toAccount;
        this.msgKey = builder.msgKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
    }

    public String getToAccount() {
        return toAccount;
    }

    public void setToAccount(String toAccount) {
        this.toAccount = toAccount;
    }

    public String getMsgKey() {
        return msgKey;
    }

    public void setMsgKey(String msgKey) {
        this.msgKey = msgKey;
    }


    public static final class Builder {
        private String fromAccount;
        private String toAccount;
        private String msgKey;

        private Builder() {
        }

        public AdminMsgWithdrawRequest build() {
            return new AdminMsgWithdrawRequest(this);
        }

        public Builder fromAccount(String fromAccount) {
            this.fromAccount = fromAccount;
            return this;
        }

        public Builder toAccount(String toAccount) {
            this.toAccount = toAccount;
            return this;
        }

        public Builder msgKey(String msgKey) {
            this.msgKey = msgKey;
            return this;
        }
    }
}
