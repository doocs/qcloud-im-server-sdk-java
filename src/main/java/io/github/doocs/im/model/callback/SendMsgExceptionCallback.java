package io.github.doocs.im.model.callback;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.doocs.im.model.message.TIMMsgElement;

import java.io.Serializable;
import java.util.List;

/**
 * 发送群聊消息异常回调
 *
 * @author bingo
 * @since 2023/4/27 16:28
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SendMsgExceptionCallback implements Serializable {
    private static final long serialVersionUID = 9009185242375464546L;
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
     * 发消息请求中的 32 位随机数
     */
    @JsonProperty("Random")
    private Long random;

    /**
     * 在线消息，为1，否则为0；直播群忽略此属性，为默认值0。
     */
    @JsonProperty("OnlineOnlyFlag")
    private Integer onlineOnlyFlag;

    /**
     * 消息体，具体参见 消息格式描述
     */
    @JsonProperty("MsgBody")
    private List<TIMMsgElement> msgBody;

    /**
     * 消息自定义数据（云端保存，会发送到对端，程序卸载重装后还能拉取到）
     */
    @JsonProperty("CloudCustomData")
    private String cloudCustomData;

    /**
     * 消息异常错误码，更多的错误码请参见群组错误码
     */
    @JsonProperty("ErrorCode")
    private Integer errorCode;

    /**
     * 消息异常详细信息
     */
    @JsonProperty("ErrorInfo")
    private String errorInfo;

    /**
     * 事件触发的毫秒级别时间戳
     */
    @JsonProperty("EventTime")
    private Long eventTime;

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

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(String errorInfo) {
        this.errorInfo = errorInfo;
    }

    public Long getEventTime() {
        return eventTime;
    }

    public void setEventTime(Long eventTime) {
        this.eventTime = eventTime;
    }
}
