package io.github.doocs.im.model.callback;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 创建公众号之后回调
 *
 * @author bingo
 * @since 2024/1/10 10:18
 */
public class AfterCreateOfficialAccountCallback implements Serializable {
    private static final long serialVersionUID = -9085700933136339593L;

    /**
     * 回调命令。
     */
    @JsonProperty("CallbackCommand")
    private String callbackCommand;

    /**
     * 发起创建请求的操作者 UserID。
     */
    @JsonProperty("Operator_Account")
    private String operatorAccount;

    /**
     * 创建的公众号用户 ID。
     */
    @JsonProperty("Official_Account")
    private String officialAccount;

    /**
     * 公众号的创建者，也就是公众号的拥有者。
     */
    @JsonProperty("Owner_Account")
    private String ownerAccount;

    /**
     * 请求创建的公众号的名称。
     */
    @JsonProperty("Name")
    private String name;

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

    public String getOperatorAccount() {
        return operatorAccount;
    }

    public void setOperatorAccount(String operatorAccount) {
        this.operatorAccount = operatorAccount;
    }

    public String getOfficialAccount() {
        return officialAccount;
    }

    public void setOfficialAccount(String officialAccount) {
        this.officialAccount = officialAccount;
    }

    public String getOwnerAccount() {
        return ownerAccount;
    }

    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getEventTime() {
        return eventTime;
    }

    public void setEventTime(Long eventTime) {
        this.eventTime = eventTime;
    }
}
