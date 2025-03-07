package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 发送单聊消息已读回执-请求参数
 *
 * @author bingo
 * @since 2024/3/7 15:27
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class C2cMsgReadReceiptRequest extends GenericRequest implements Serializable {
    @JsonProperty("Operator_Account")
    private String operatorAccount;
    @JsonProperty("Peer_Account")
    private String peerAccount;

    @JsonProperty("C2CMsgInfo")
    private List<C2cMsgInfoItem> c2cMsgInfoItemList;

    public C2cMsgReadReceiptRequest() {
    }

    public C2cMsgReadReceiptRequest(String operatorAccount, String peerAccount, List<C2cMsgInfoItem> c2cMsgInfoItemList) {
        this.operatorAccount = operatorAccount;
        this.peerAccount = peerAccount;
        this.c2cMsgInfoItemList = c2cMsgInfoItemList;
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

    public List<C2cMsgInfoItem> getC2cMsgInfoItemList() {
        return c2cMsgInfoItemList;
    }

    public void setC2cMsgInfoItemList(List<C2cMsgInfoItem> c2cMsgInfoItemList) {
        this.c2cMsgInfoItemList = c2cMsgInfoItemList;
    }

    private C2cMsgReadReceiptRequest(Builder builder) {
        this.operatorAccount = builder.operatorAccount;
        this.peerAccount = builder.peerAccount;
        this.c2cMsgInfoItemList = builder.c2cMsgInfoItemList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private String operatorAccount;
        private String peerAccount;
        private List<C2cMsgInfoItem> c2cMsgInfoItemList;

        public C2cMsgReadReceiptRequest build() {
            return new C2cMsgReadReceiptRequest(this);
        }

        public Builder operatorAccount(String operatorAccount) {
            this.operatorAccount = operatorAccount;
            return this;
        }

        public Builder peerAccount(String peerAccount) {
            this.peerAccount = peerAccount;
            return this;
        }

        public Builder c2cMsgInfoItemList(List<C2cMsgInfoItem> c2cMsgInfoItemList) {
            this.c2cMsgInfoItemList = c2cMsgInfoItemList;
            return this;
        }
    }
}
