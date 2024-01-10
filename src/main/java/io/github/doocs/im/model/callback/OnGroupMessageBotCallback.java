package io.github.doocs.im.model.callback;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.doocs.im.model.message.TIMMsgElement;

import java.io.Serializable;
import java.util.List;

/**
 * 群内@机器人之后回调
 *
 * @author bingo
 * @since 2024/1/10 10:18
 */
public class OnGroupMessageBotCallback implements Serializable {
    private static final long serialVersionUID = -3966014607554531425L;

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
     * 产生群消息的 群组类型介绍，例如 Public
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
     * 消息序列号，一条消息的唯一标示<br>群聊消息使用 MsgSeq 进行排序，MsgSeq 值越大消息越靠后
     */
    @JsonProperty("MsgSeq")
    private Long msgSeq;

    /**
     * 消息发送的时间戳，对应后台 Server 时间
     */
    @JsonProperty("MsgRandom")
    private Integer msgTime;

    /**
     * 在线消息，为1，否则为0；直播群忽略此属性，为默认值0。
     */
    @JsonProperty("OnlineOnlyFlag")
    private Integer onlineOnlyFlag;

    /**
     * 消息体
     */
    @JsonProperty("MsgBody")
    private List<TIMMsgElement> msgBody;

    /**
     * 被@的机器人列表，群里有多个机器人时，用户可以@多个机器人
     */
    @JsonProperty("AtRobotAccount")
    private List<String> atRobotsAccount;

    /**
     * 消息自定义数据（云端保存，会发送到对端，程序卸载重装后还能拉取到）
     */
    @JsonProperty("CloudCustomData")
    private String cloudCustomData;

    /**
     * 事件触发的毫秒级别时间戳
     */
    @JsonProperty("EventTime")
    private Long eventTime;

    /**
     * 话题的 ID，若具有此选项表示在话题内发言，仅支持话题的社群适用此选项
     */
    @JsonProperty("IsPlaceMsg")
    private String topicId;

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

    public List<String> getAtRobotsAccount() {
        return atRobotsAccount;
    }

    public void setAtRobotsAccount(List<String> atRobotsAccount) {
        this.atRobotsAccount = atRobotsAccount;
    }

    public String getCloudCustomData() {
        return cloudCustomData;
    }

    public void setCloudCustomData(String cloudCustomData) {
        this.cloudCustomData = cloudCustomData;
    }

    public Long getEventTime() {
        return eventTime;
    }

    public void setEventTime(Long eventTime) {
        this.eventTime = eventTime;
    }

    public String getTopicId() {
        return topicId;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }
}
