package io.github.doocs.im.model.callback;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 单聊消息撤回后回调
 *
 * @author bingo
 * @since 2021/11/16 17:06
 */
public class AfterMsgWithdrawCallback {
    @JsonProperty("CallbackCommand")
    private String callbackCommand;

    @JsonProperty("From_Account")
    private String fromAccount;

    @JsonProperty("To_Account")
    private String toAccount;

    @JsonProperty("MsgKey")
    private String msgKey;

    @JsonProperty("UnreadMsgNum")
    private Integer unreadMsgNum;

    public String getCallbackCommand() {
        return callbackCommand;
    }

    public void setCallbackCommand(String callbackCommand) {
        this.callbackCommand = callbackCommand;
    }

    public String getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
    }

    public String getToAccount() {
        return toAccount;
    }

    public void setToAccount(String toAccount) {
        this.toAccount = toAccount;
    }

    public String getMsgKey() {
        return msgKey;
    }

    public void setMsgKey(String msgKey) {
        this.msgKey = msgKey;
    }

    public Integer getUnreadMsgNum() {
        return unreadMsgNum;
    }

    public void setUnreadMsgNum(Integer unreadMsgNum) {
        this.unreadMsgNum = unreadMsgNum;
    }
}
