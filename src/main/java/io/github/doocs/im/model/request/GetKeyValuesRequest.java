package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 拉取单聊消息扩展-请求参数
 *
 * @author bingo
 * @since 2022/11/2 16:32
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetKeyValuesRequest extends GenericRequest implements Serializable {
    private static final long serialVersionUID = 5051921921880776092L;
    /**
     * 消息发送方 UserID（用于指定发送消息方账号）
     */
    @JsonProperty("From_Account")
    private String fromAccount;

    /**
     * 消息接收方 UserID
     */
    @JsonProperty("To_Account")
    private String toAccount;

    /**
     * 单聊消息的唯一标识。获取消息 MsgKey 的方法请参见单发单聊消息的接口说明
     */
    @JsonProperty("MsgKey")
    private String msgKey;

    /**
     * 拉取大于等于StartSeq的消息扩展
     */
    @JsonProperty("StartSeq")
    private Long startSeq;

    public GetKeyValuesRequest() {
    }

    public GetKeyValuesRequest(String toAccount, String msgKey) {
        this.toAccount = toAccount;
        this.msgKey = msgKey;
    }

    public GetKeyValuesRequest(String fromAccount, String toAccount, String msgKey, Long startSeq) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.msgKey = msgKey;
        this.startSeq = startSeq;
    }

    private GetKeyValuesRequest(Builder builder) {
        this.fromAccount = builder.fromAccount;
        this.toAccount = builder.toAccount;
        this.msgKey = builder.msgKey;
        this.startSeq = builder.startSeq;
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

    public Long getStartSeq() {
        return startSeq;
    }

    public void setStartSeq(Long startSeq) {
        this.startSeq = startSeq;
    }


    public static final class Builder {
        private String fromAccount;
        private String toAccount;
        private String msgKey;
        private Long startSeq;

        private Builder() {
        }

        public GetKeyValuesRequest build() {
            return new GetKeyValuesRequest(this);
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

        public Builder startSeq(Long startSeq) {
            this.startSeq = startSeq;
            return this;
        }
    }
}
