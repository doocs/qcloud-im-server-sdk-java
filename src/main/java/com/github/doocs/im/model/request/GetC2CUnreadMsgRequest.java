package com.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author bingo
 * @since 2021/7/31 15:37
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetC2CUnreadMsgRequest extends GenericRequest {
    @JsonProperty("To_Account")
    private String toAccount;

    @JsonProperty("Peer_Account")
    private List<String> peerAccount;

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
