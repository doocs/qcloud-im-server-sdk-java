package io.github.doocs.im.model.callback;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 单聊消息已读上报后回调
 *
 * @author bingo
 * @since 2021/11/16 17:03
 */
public class AfterMsgReportCallback {
    @JsonProperty("CallbackCommand")
    private String callbackCommand;

    @JsonProperty("Report_Account")
    private String reportAccount;

    @JsonProperty("Peer_Account")
    private String peerAccount;

    @JsonProperty("LastReadTime")
    private Integer lastReadTime;

    @JsonProperty("UnreadMsgNum")
    private Integer unreadMsgNum;

    public String getCallbackCommand() {
        return callbackCommand;
    }

    public void setCallbackCommand(String callbackCommand) {
        this.callbackCommand = callbackCommand;
    }

    public String getReportAccount() {
        return reportAccount;
    }

    public void setReportAccount(String reportAccount) {
        this.reportAccount = reportAccount;
    }

    public String getPeerAccount() {
        return peerAccount;
    }

    public void setPeerAccount(String peerAccount) {
        this.peerAccount = peerAccount;
    }

    public Integer getLastReadTime() {
        return lastReadTime;
    }

    public void setLastReadTime(Integer lastReadTime) {
        this.lastReadTime = lastReadTime;
    }

    public Integer getUnreadMsgNum() {
        return unreadMsgNum;
    }

    public void setUnreadMsgNum(Integer unreadMsgNum) {
        this.unreadMsgNum = unreadMsgNum;
    }
}
