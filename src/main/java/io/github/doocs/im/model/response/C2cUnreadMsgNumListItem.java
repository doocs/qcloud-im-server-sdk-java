package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * @author hyh
 * @since 2021/07/28 20:39
 */
public class C2cUnreadMsgNumListItem implements Serializable {
    private static final long serialVersionUID = -5255581371827404624L;
    /**
     * 单聊会话对端 UserId
     */
    @JsonProperty("Peer_Account")
    private String peerAccount;

    /**
     * 该单聊会话的未读数
     */
    @JsonProperty("C2CUnreadMsgNum")
    private Integer unreadMsgNum;

    public String getPeerAccount() {
        return peerAccount;
    }

    public void setPeerAccount(String peerAccount) {
        this.peerAccount = peerAccount;
    }

    public Integer getUnreadMsgNum() {
        return unreadMsgNum;
    }

    public void setUnreadMsgNum(Integer unreadMsgNum) {
        this.unreadMsgNum = unreadMsgNum;
    }

    @Override
    public String toString() {
        return "C2cUnreadMsgNumListItem{" +
                "peerAccount='" + peerAccount + '\'' +
                ", unreadMsgNum=" + unreadMsgNum +
                '}';
    }
}
