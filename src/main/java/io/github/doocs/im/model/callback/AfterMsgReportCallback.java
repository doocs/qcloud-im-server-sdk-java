package io.github.doocs.im.model.callback;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 单聊消息已读上报后回调
 *
 * @author bingo
 * @since 2021/11/16 17:03
 */
public class AfterMsgReportCallback implements Serializable {
    private static final long serialVersionUID = -6921436802328726496L;
    /**
     * 回调命令
     */
    @JsonProperty("CallbackCommand")
    private String callbackCommand;

    /**
     * 已读上报方 UserID
     */
    @JsonProperty("Report_Account")
    private String reportAccount;

    /**
     * 会话对端 UserID
     */
    @JsonProperty("Peer_Account")
    private String peerAccount;

    /**
     * 已读时间
     */
    @JsonProperty("LastReadTime")
    private Integer lastReadTime;

    /**
     * Report_Account 未读的单聊消息总数量（包含所有的单聊会话）
     */
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
