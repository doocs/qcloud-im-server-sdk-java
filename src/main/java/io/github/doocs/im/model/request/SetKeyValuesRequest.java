package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.doocs.im.model.response.KeyValueSeq;

import java.io.Serializable;
import java.util.List;

/**
 * 设置单聊消息扩展-请求参数
 *
 * @author bingo
 * @since 2022/11/2 16:32
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SetKeyValuesRequest extends GenericRequest implements Serializable {
    private static final long serialVersionUID = 7103686738435677357L;
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
     * 1 为设置消息扩展KV，2 为删除消息扩展KV，3 为清空所有消息扩展KV
     * {@link io.github.doocs.im.constant.OperateType}
     */
    @JsonProperty("OperateType")
    private Integer operateType;

    /**
     * 需要设置/删除的KV，单次请求最多可设置20条KV
     */
    @JsonProperty("ExtensionList")
    private List<KeyValueSeq> extensionList;

    public SetKeyValuesRequest() {
    }

    public SetKeyValuesRequest(String toAccount, String msgKey, Integer operateType) {
        this.toAccount = toAccount;
        this.msgKey = msgKey;
        this.operateType = operateType;
    }

    public SetKeyValuesRequest(String fromAccount, String toAccount, String msgKey, Integer operateType,
                               List<KeyValueSeq> extensionList) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.msgKey = msgKey;
        this.operateType = operateType;
        this.extensionList = extensionList;
    }

    private SetKeyValuesRequest(Builder builder) {
        this.fromAccount = builder.fromAccount;
        this.toAccount = builder.toAccount;
        this.msgKey = builder.msgKey;
        this.operateType = builder.operateType;
        this.extensionList = builder.extensionList;
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

    public Integer getOperateType() {
        return operateType;
    }

    public void setOperateType(Integer operateType) {
        this.operateType = operateType;
    }

    public List<KeyValueSeq> getExtensionList() {
        return extensionList;
    }

    public void setExtensionList(List<KeyValueSeq> extensionList) {
        this.extensionList = extensionList;
    }


    public static final class Builder {
        private String fromAccount;
        private String toAccount;
        private String msgKey;
        private Integer operateType;
        private List<KeyValueSeq> extensionList;

        private Builder() {
        }

        public SetKeyValuesRequest build() {
            return new SetKeyValuesRequest(this);
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

        public Builder operateType(Integer operateType) {
            this.operateType = operateType;
            return this;
        }

        public Builder extensionList(List<KeyValueSeq> extensionList) {
            this.extensionList = extensionList;
            return this;
        }
    }
}
