package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 单向删除单聊历史消息-请求参数
 *
 * @author bingo
 * @since 2024/1/10 10:25
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteC2cMsgRambleRequest extends GenericRequest implements Serializable {
    private static final long serialVersionUID = 7845418223658345469L;

    /**
     * 发起删除操作的账号，即以 Operator_Account 的身份删除消息。
     */
    @JsonProperty("Operator_Account")
    private String operatorAccount;

    /**
     * 会话的另一方账号。
     */
    @JsonProperty("Peer_Account")
    private String peerAccount;

    /**
     * 待删除消息的 MsgKey 数组。
     * 一次最多删除30条消息。
     */
    @JsonProperty("MsgKeyList")
    private List<String> msgKeyList;

    public DeleteC2cMsgRambleRequest() {
    }

    public DeleteC2cMsgRambleRequest(String operatorAccount, String peerAccount, List<String> msgKeyList) {
        this.operatorAccount = operatorAccount;
        this.peerAccount = peerAccount;
        this.msgKeyList = msgKeyList;
    }

    private DeleteC2cMsgRambleRequest(Builder builder) {
        this.operatorAccount = builder.operatorAccount;
        this.peerAccount = builder.peerAccount;
        this.msgKeyList = builder.msgKeyList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getOperatorAccount() {
        return operatorAccount;
    }

    public void setOperatorAccount(String operatorAccount) {
        this.operatorAccount = operatorAccount;
    }

    public String getPeerAccount() {
        return peerAccount;
    }

    public void setPeerAccount(String peerAccount) {
        this.peerAccount = peerAccount;
    }

    public List<String> getMsgKeyList() {
        return msgKeyList;
    }

    public void setMsgKeyList(List<String> msgKeyList) {
        this.msgKeyList = msgKeyList;
    }


    public static final class Builder {
        private String operatorAccount;
        private String peerAccount;
        private List<String> msgKeyList;

        private Builder() {
        }

        public DeleteC2cMsgRambleRequest build() {
            return new DeleteC2cMsgRambleRequest(this);
        }

        public Builder operatorAccount(String operatorAccount) {
            this.operatorAccount = operatorAccount;
            return this;
        }

        public Builder peerAccount(String peerAccount) {
            this.peerAccount = peerAccount;
            return this;
        }

        public Builder msgKeyList(List<String> msgKeyList) {
            this.msgKeyList = msgKeyList;
            return this;
        }
    }
}
