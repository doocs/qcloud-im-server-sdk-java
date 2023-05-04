package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.doocs.im.model.message.TIMMsgElement;

import java.io.Serializable;
import java.util.List;

/**
 * 修改单聊历史消息-请求参数
 *
 * @author bingo
 * @since 2022/5/31 17:38
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModifyC2cMsgRequest extends GenericRequest implements Serializable {
    private static final long serialVersionUID = 1012191471983294004L;
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

    /**
     * 待修改消息的唯一标识。获取消息 MsgKey 的方法请参见本接口的接口说明
     */
    @JsonProperty("MsgKey")
    private String msgKey;

    /**
     * 消息内容，具体格式请参考 消息格式描述（注意，一条消息可包括多种消息元素，MsgBody 为 Array 类型）
     */
    @JsonProperty("MsgBody")
    private List<TIMMsgElement> msgBody;

    /**
     * 消息自定义数据（云端保存，会发送到对端，程序卸载重装后还能拉取到）
     */
    @JsonProperty("CloudCustomData")
    private String cloudCustomData;

    public ModifyC2cMsgRequest() {
    }

    public ModifyC2cMsgRequest(String fromAccount, String toAccount) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
    }

    public ModifyC2cMsgRequest(String fromAccount, String toAccount, String msgKey,
                               List<TIMMsgElement> msgBody, String cloudCustomData) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.msgKey = msgKey;
        this.msgBody = msgBody;
        this.cloudCustomData = cloudCustomData;
    }

    private ModifyC2cMsgRequest(Builder builder) {
        this.fromAccount = builder.fromAccount;
        this.toAccount = builder.toAccount;
        this.msgKey = builder.msgKey;
        this.msgBody = builder.msgBody;
        this.cloudCustomData = builder.cloudCustomData;
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

    public List<TIMMsgElement> getMsgBody() {
        return msgBody;
    }

    public void setMsgBody(List<TIMMsgElement> msgBody) {
        this.msgBody = msgBody;
    }

    public String getCloudCustomData() {
        return cloudCustomData;
    }

    public void setCloudCustomData(String cloudCustomData) {
        this.cloudCustomData = cloudCustomData;
    }


    public static final class Builder {
        private String fromAccount;
        private String toAccount;
        private String msgKey;
        private List<TIMMsgElement> msgBody;
        private String cloudCustomData;

        private Builder() {
        }

        public ModifyC2cMsgRequest build() {
            return new ModifyC2cMsgRequest(this);
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

        public Builder msgBody(List<TIMMsgElement> msgBody) {
            this.msgBody = msgBody;
            return this;
        }

        public Builder cloudCustomData(String cloudCustomData) {
            this.cloudCustomData = cloudCustomData;
            return this;
        }
    }
}
