package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author bingo
 * @since 2021/10/31 20:21
 */
public class C2cUnreadMsgErrorListItem {
    @JsonProperty("Peer_Account")
    private String peerAccount;

    @JsonProperty("ErrorCode")
    private Integer errorCode;

    public String getPeerAccount() {
        return peerAccount;
    }

    public void setPeerAccount(String peerAccount) {
        this.peerAccount = peerAccount;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    @Override
    public String toString() {
        return "C2cUnreadMsgErrorListItem{" +
                "peerAccount='" + peerAccount + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
