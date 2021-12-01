package io.github.doocs.im.model.callback;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.doocs.im.model.message.TIMMsgElement;

import java.util.List;

/**
 * 发单聊消息之后回调
 *
 * @author bingo
 * @since 2021/11/16 16:58
 */
public class AfterSendMsgCallback {
    @JsonProperty("CallbackCommand")
    private String callbackCommand;

    @JsonProperty("From_Account")
    private String fromAccount;

    @JsonProperty("To_Account")
    private String toAccount;

    @JsonProperty("MsgSeq")
    private Long msgSeq;

    @JsonProperty("MsgRandom")
    private Long msgRandom;

    @JsonProperty("MsgTime")
    private Integer msgTime;

    @JsonProperty("MsgKey")
    private String msgKey;

    @JsonProperty("OnlineOnlyFlag")
    private Integer onlineOnlyFlag;

    @JsonProperty("SendMsgResult")
    private Integer sendMsgResult;

    @JsonProperty("ErrorInfo")
    private String errorInfo;

    @JsonProperty("UnreadMsgNum")
    private Integer unreadMsgNum;

    @JsonProperty("MsgBody")
    private List<TIMMsgElement> msgBody;

    @JsonProperty("CloudCustomData")
    private String cloudCustomData;

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

    public Long getMsgSeq() {
        return msgSeq;
    }

    public void setMsgSeq(Long msgSeq) {
        this.msgSeq = msgSeq;
    }

    public Long getMsgRandom() {
        return msgRandom;
    }

    public void setMsgRandom(Long msgRandom) {
        this.msgRandom = msgRandom;
    }

    public Integer getMsgTime() {
        return msgTime;
    }

    public void setMsgTime(Integer msgTime) {
        this.msgTime = msgTime;
    }

    public String getMsgKey() {
        return msgKey;
    }

    public void setMsgKey(String msgKey) {
        this.msgKey = msgKey;
    }

    public Integer getOnlineOnlyFlag() {
        return onlineOnlyFlag;
    }

    public void setOnlineOnlyFlag(Integer onlineOnlyFlag) {
        this.onlineOnlyFlag = onlineOnlyFlag;
    }

    public Integer getSendMsgResult() {
        return sendMsgResult;
    }

    public void setSendMsgResult(Integer sendMsgResult) {
        this.sendMsgResult = sendMsgResult;
    }

    public String getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(String errorInfo) {
        this.errorInfo = errorInfo;
    }

    public Integer getUnreadMsgNum() {
        return unreadMsgNum;
    }

    public void setUnreadMsgNum(Integer unreadMsgNum) {
        this.unreadMsgNum = unreadMsgNum;
    }

    public List<TIMMsgElement> getMsgBody() {
        return msgBody;
    }

    public void setMsgBody(List<TIMMsgElement> msgBody) {
        this.msgBody = msgBody;
    }

    public String getCloudCustomData() {
        return cloudCustomData;
    }

    public void setCloudCustomData(String cloudCustomData) {
        this.cloudCustomData = cloudCustomData;
    }
}
