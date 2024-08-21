package io.github.doocs.im.model.callback;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.doocs.im.model.message.TIMMsgElement;

import java.io.Serializable;
import java.util.List;

/**
 * 群内发言之后回调
 *
 * @author bingo
 * @since 2021/11/16 19:40
 */
public class AfterSendGroupMsgCallback implements Serializable {
    private static final long serialVersionUID = -7079750109544052808L;
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

    /**
     * 消息自定义数据（云端保存，会发送到对端，程序卸载重装后还能拉取到）
     */
    @JsonProperty("CloudCustomData")
    private String cloudCustomData;

    /**
     * 话题的 ID，若具有此选项表示在话题内发言，仅支持话题的社群适用此选项
     */
    @JsonProperty("TopicId")
    private String topicId;

    /**
     * 事件触发的毫秒级别时间戳
     */
    @JsonProperty("EventTime")
    private Long eventTime;

    /**
     * 群组@信息
     */
    @JsonProperty("GroupAtInfo")
    private List<GroupAtInfoItem> groupAtInfo;


    public static class GroupAtInfoItem {
        /**
         * 群组@全体成员标识，0-非全体@，1-全体@
         */
        @JsonProperty("GroupAtAllFlag")
        private Integer groupAtAllFlag;

        /**
         * 被@的群成员 UserID
         */
        @JsonProperty("GroupAt_Account")
        private String groupAtAccount;

        public Integer getGroupAtAllFlag() {
            return groupAtAllFlag;
        }

        public void setGroupAtAllFlag(Integer groupAtAllFlag) {
            this.groupAtAllFlag = groupAtAllFlag;
        }

        public String getGroupAtAccount() {
            return groupAtAccount;
        }

        public void setGroupAtAccount(String groupAtAccount) {
            this.groupAtAccount = groupAtAccount;
        }

    }

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

    public String getCloudCustomData() {
        return cloudCustomData;
    }

    public void setCloudCustomData(String cloudCustomData) {
        this.cloudCustomData = cloudCustomData;
    }

    public String getTopicId() {
        return topicId;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }

    public Long getEventTime() {
        return eventTime;
    }

    public void setEventTime(Long eventTime) {
        this.eventTime = eventTime;
    }

    public List<GroupAtInfoItem> getGroupAtInfo() {
        return groupAtInfo;
    }

    public void setGroupAtInfo(List<GroupAtInfoItem> groupAtInfo) {
        this.groupAtInfo = groupAtInfo;
    }
}
