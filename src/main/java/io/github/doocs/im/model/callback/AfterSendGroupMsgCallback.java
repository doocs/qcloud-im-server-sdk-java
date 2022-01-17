package io.github.doocs.im.model.callback;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.doocs.im.model.message.TIMMsgElement;

import java.util.List;

/**
 * 群内发言之后回调
 *
 * @author bingo
 * @since 2021/11/16 19:40
 */
public class AfterSendGroupMsgCallback {
    /**
     * 回调命令
     */
    @JsonProperty("CallbackCommand")
    private String callbackCommand;

    /**
     * 产生群消息的群组 ID
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * 产生群消息的群组类型，例如 Public
     */
    @JsonProperty("Type")
    private String type;

    /**
     * 消息发送者 UserID
     */
    @JsonProperty("From_Account")
    private String fromAccount;

    /**
     * 请求发起者 UserID，可以用来识别是否为管理员请求的
     */
    @JsonProperty("Operator_Account")
    private String operatorAccount;

    /**
     * 发消息请求中的32位随机数
     */
    @JsonProperty("Random")
    private Long random;

    /**
     * 消息序列号，一条消息的唯一标示
     * 群聊消息使用 MsgSeq 进行排序，MsgSeq 值越大消息越靠后
     */
    @JsonProperty("MsgSeq")
    private Long msgSeq;

    /**
     * 消息发送的时间戳，对应后台 Server 时间
     */
    @JsonProperty("MsgTime")
    private Integer msgTime;

    /**
     * 在线消息，为1，否则为0；直播群忽略此属性，为默认值0
     */
    @JsonProperty("OnlineOnlyFlag")
    private Integer onlineOnlyFlag;

    /**
     * 消息体
     */
    @JsonProperty("MsgBody")
    private List<TIMMsgElement> msgBody;

    public String getCallbackCommand() {
        return callbackCommand;
    }

    public void setCallbackCommand(String callbackCommand) {
        this.callbackCommand = callbackCommand;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
    }

    public String getOperatorAccount() {
        return operatorAccount;
    }

    public void setOperatorAccount(String operatorAccount) {
        this.operatorAccount = operatorAccount;
    }

    public Long getRandom() {
        return random;
    }

    public void setRandom(Long random) {
        this.random = random;
    }

    public Long getMsgSeq() {
        return msgSeq;
    }

    public void setMsgSeq(Long msgSeq) {
        this.msgSeq = msgSeq;
    }

    public Integer getMsgTime() {
        return msgTime;
    }

    public void setMsgTime(Integer msgTime) {
        this.msgTime = msgTime;
    }

    public Integer getOnlineOnlyFlag() {
        return onlineOnlyFlag;
    }

    public void setOnlineOnlyFlag(Integer onlineOnlyFlag) {
        this.onlineOnlyFlag = onlineOnlyFlag;
    }

    public List<TIMMsgElement> getMsgBody() {
        return msgBody;
    }

    public void setMsgBody(List<TIMMsgElement> msgBody) {
        this.msgBody = msgBody;
    }
}
