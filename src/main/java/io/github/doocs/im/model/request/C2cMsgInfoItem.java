package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * @author hyh
 * @since 2021/07/29 15:37
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class C2cMsgInfoItem implements Serializable {
    private static final long serialVersionUID = 2340480215779943454L;

    /**
     * 消息的发送方 UserID，需与 Peer_Account 保持一致
     */
    @JsonProperty("From_Account")
    private String fromAccount;

    /**
     * 消息的接收方 UserID，需与 Operator_Account 保持一致
     */
    @JsonProperty("To_Account")
    private String toAccount;

    /**
     * 消息的 MsgKey
     */
    @JsonProperty("MsgKey")
    private String msgKey;

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

    public C2cMsgInfoItem() {
    }

    public C2cMsgInfoItem(String fromAccount, String toAccount, String msgKey) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.msgKey = msgKey;
    }

    private C2cMsgInfoItem(Builder builder) {
        this.fromAccount = builder.fromAccount;
        this.toAccount = builder.toAccount;
        this.msgKey = builder.msgKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private String fromAccount;
        private String toAccount;
        private String msgKey;

        private Builder() {
        }

        public C2cMsgInfoItem build() {
            return new C2cMsgInfoItem(this);
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
