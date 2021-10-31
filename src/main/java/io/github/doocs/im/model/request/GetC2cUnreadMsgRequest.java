package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author bingo
 * @since 2021/7/31 15:37
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetC2cUnreadMsgRequest extends GenericRequest {
    @JsonProperty("To_Account")
    private String toAccount;

    @JsonProperty("Peer_Account")
    private List<String> peerAccount;

    public GetC2cUnreadMsgRequest(String toAccount) {
        this(toAccount, null);
    }

    public GetC2cUnreadMsgRequest(String toAccount, List<String> peerAccount) {
        this.toAccount = toAccount;
        this.peerAccount = peerAccount;
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
}
