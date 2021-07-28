package com.qcloud.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author hyh
 * @since 2021/07/28 20:39
 */
public class C2CUnreadMsgNumListItem {
    @JsonProperty("Peer_Account")
    private String peerAccount;

    @JsonProperty("C2CUnreadMsgNum")
    private String unreadMsgNum;

    public String getPeerAccount() {
        return peerAccount;
    }

    public void setPeerAccount(String peerAccount) {
        this.peerAccount = peerAccount;
    }

    public String getUnreadMsgNum() {
        return unreadMsgNum;
    }

    public void setUnreadMsgNum(String unreadMsgNum) {
        this.unreadMsgNum = unreadMsgNum;
    }
}
