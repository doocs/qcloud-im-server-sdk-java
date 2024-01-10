package io.github.doocs.im.model.callback;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.doocs.im.model.message.TIMMsgElement;

import java.io.Serializable;
import java.util.List;

/**
 * 发公众号消息之前回调
 *
 * @author bingo
 * @since 2024/1/10 10:18
 */
public class BeforeSendOfficialAccountMsgCallback implements Serializable {
    private static final long serialVersionUID = -1405855865750878475L;

    /**
     * 回调命令
     */
    @JsonProperty("CallbackCommand")
    private String callbackCommand;

    /**
     * 公众号用户 ID。
     */
    @JsonProperty("Official_Account")
    private String officialAccount;

    /**
     * 在线消息，为1，否则为0。
     */
    @JsonProperty("OnlineOnlyFlag")
    private Integer onlineOnlyFlag;

    /**
     * 消息体，具体请参见 消息格式描述。
     */
    @JsonProperty("MsgBody")
    private List<TIMMsgElement> msgBody;

    /**
     * 消息自定义数据（云端保存，会发送到对端，程序卸载重装后还能拉取到）。
     */
    @JsonProperty("CloudCustomData")
    private String cloudCustomData;

    /**
     * 事件触发的毫秒级别时间戳。
     */
    @JsonProperty("EventTime")
    private Long eventTime;

    public String getCallbackCommand() {
        return callbackCommand;
    }

    public void setCallbackCommand(String callbackCommand) {
        this.callbackCommand = callbackCommand;
    }

    public String getOfficialAccount() {
        return officialAccount;
    }

    public void setOfficialAccount(String officialAccount) {
        this.officialAccount = officialAccount;
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

    public Long getEventTime() {
        return eventTime;
    }

    public void setEventTime(Long eventTime) {
        this.eventTime = eventTime;
    }
}
