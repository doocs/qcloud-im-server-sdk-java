package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 查询单聊未读消息计数-请求参数
 *
 * @author bingo
 * @since 2021/7/31 15:37
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetC2cUnreadMsgRequest extends GenericRequest {
    /**
     * 待查询的用户 UserId
     */
    @JsonProperty("To_Account")
    private String toAccount;

    /**
     * 待查询的单聊会话对端的用户 UserId。
     * 若要查询单个会话的未读数，该字段必填
     * 该数组最大大小为10
     */
    @JsonProperty("Peer_Account")
    private List<String> peerAccount;

    public GetC2cUnreadMsgRequest() {
    }

    public GetC2cUnreadMsgRequest(String toAccount) {
        this.toAccount = toAccount;
    }

    public GetC2cUnreadMsgRequest(String toAccount, List<String> peerAccount) {
        this.toAccount = toAccount;
        this.peerAccount = peerAccount;
    }

    private GetC2cUnreadMsgRequest(Builder builder) {
        this.toAccount = builder.toAccount;
        this.peerAccount = builder.peerAccount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getToAccount() {
        return toAccount;
    }

    public void setToAccount(String toAccount) {
        this.toAccount = toAccount;
    }

    public List<String> getPeerAccount() {
        return peerAccount;
    }

    public void setPeerAccount(List<String> peerAccount) {
        this.peerAccount = peerAccount;
    }


    public static final class Builder {
        private String toAccount;
        private List<String> peerAccount;

        private Builder() {
        }

        public GetC2cUnreadMsgRequest build() {
            return new GetC2cUnreadMsgRequest(this);
        }

        public Builder toAccount(String toAccount) {
            this.toAccount = toAccount;
            return this;
        }

        public Builder peerAccount(List<String> peerAccount) {
            this.peerAccount = peerAccount;
            return this;
        }
    }
}
