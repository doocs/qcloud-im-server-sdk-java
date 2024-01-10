package io.github.doocs.im.model.callback;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 删除订阅者之后回调
 *
 * @author bingo
 * @since 2024/1/10 10:18
 */
public class AfterDeleteOfficialAccountSubscriberCallback implements Serializable {
    private static final long serialVersionUID = -9151244339635022909L;

    /**
     * 回调命令
     */
    @JsonProperty("CallbackCommand")
    private String callbackCommand;

    /**
     * 取消订阅的公众号用户 ID。
     */
    @JsonProperty("Official_Account")
    private String officialAccount;

    /**
     * 发起请求的操作者 UserID。
     */
    @JsonProperty("Operator_Account")
    private String operatorAccount;

    /**
     * 取消订阅的用户列表。
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
