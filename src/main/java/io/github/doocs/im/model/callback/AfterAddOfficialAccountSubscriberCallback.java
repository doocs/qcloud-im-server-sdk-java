package io.github.doocs.im.model.callback;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 订阅公众号之后回调
 *
 * @author bingo
 * @since 2024/1/10 10:18
 */
public class AfterAddOfficialAccountSubscriberCallback implements Serializable {
    private static final long serialVersionUID = -2551706422161131110L;

    /**
     * 回调命令
     */
    @JsonProperty("CallbackCommand")
    private String callbackCommand;

    /**
     * 订阅的公众号用户 ID。
     */
    @JsonProperty("Official_Account")
    private String officialAccount;

    /**
     * 发起请求的操作者 UserID。
     */
    @JsonProperty("Operator_Account")
    private String operatorAccount;

    /**
     * 添加的订阅者列表。
     */
    @JsonProperty("SubscribeAccountList")
    private List<SubscriberAccount> subscribeAccountList;

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

    public String getOperatorAccount() {
        return operatorAccount;
    }

    public void setOperatorAccount(String operatorAccount) {
        this.operatorAccount = operatorAccount;
    }

    public List<SubscriberAccount> getSubscribeAccountList() {
        return subscribeAccountList;
    }

    public void setSubscribeAccountList(List<SubscriberAccount> subscribeAccountList) {
        this.subscribeAccountList = subscribeAccountList;
    }

    public Long getEventTime() {
        return eventTime;
    }

    public void setEventTime(Long eventTime) {
        this.eventTime = eventTime;
    }
}
