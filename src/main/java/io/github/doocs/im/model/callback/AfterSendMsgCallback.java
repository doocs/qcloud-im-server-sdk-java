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
    /**
     * 回调命令
     */
    @JsonProperty("CallbackCommand")
    private String callbackCommand;

    /**
     * 消息发送者 UserID
     */
    @JsonProperty("From_Account")
    private String fromAccount;

    /**
     * 消息接收者 UserID
     */
    @JsonProperty("To_Account")
    private String toAccount;

    /**
     * 消息序列号，用于标记该条消息（32位无符号整数）
     */
    @JsonProperty("MsgSeq")
    private Long msgSeq;

    /**
     * 消息随机数，用于标记该条消息（32位无符号整数）
     */
    @JsonProperty("MsgRandom")
    private Long msgRandom;

    /**
     * 消息的发送时间戳，单位为秒
     * 单聊消息优先使用 MsgTime 进行排序，同一秒发送的消息则按 MsgSeq 排序，MsgSeq 值越大消息越靠后
     */
    @JsonProperty("MsgTime")
    private Integer msgTime;

    /**
     * 该条消息的唯一标识，可根据该标识进行 REST API 撤回单聊消息
     */
    @JsonProperty("MsgKey")
    private String msgKey;

    /**
     * 在线消息，为1，否则为0
     */
    @JsonProperty("OnlineOnlyFlag")
    private Integer onlineOnlyFlag;

    /**
     * 该条消息的下发结果，0表示下发成功，非0表示下发失败，具体可参见 错误码
     */
    @JsonProperty("SendMsgResult")
    private Integer sendMsgResult;

    /**
     * 该条消息下发失败的错误信息，若消息发送成功，则为"send msg succeed"
     */
    @JsonProperty("ErrorInfo")
    private String errorInfo;

    /**
     * To_Account 未读的单聊消息总数量（包含所有的单聊会话）。若该条消息下发失败（例如被脏字过滤），该字段值为-1
     */
    @JsonProperty("UnreadMsgNum")
    private Integer unreadMsgNum;

    /**
     * 消息体
     */
    @JsonProperty("MsgBody")
    private List<TIMMsgElement> msgBody;

    /**
     * 消息自定义数据（云端保存，会发送到对端，程序卸载重装后还能拉取到）
     */
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
