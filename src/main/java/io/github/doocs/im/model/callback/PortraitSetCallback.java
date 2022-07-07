package io.github.doocs.im.model.callback;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.doocs.im.model.request.ProfileItem;

import java.util.List;

/**
 * 更新资料之后回调
 *
 * @author bingo
 * @since 2022/7/7 10:13
 */
public class PortraitSetCallback {
    /**
     * 回调命令
     */
    @JsonProperty("CallbackCommand")
    private String callbackCommand;

    /**
     * 触发更新操作的用户的 UserID
     */
    @JsonProperty("Operator_Account")
    private String operatorAccount;

    /**
     * 更新用户资料的用户的 UserID
     */
    @JsonProperty("From_Account")
    private String fromAccount;

    /**
     * 毫秒时间戳
     */
    @JsonProperty("EventTime")
    private Long eventTime;

    /**
     * 更新成功的用户资料列表
     */
    @JsonProperty("ProfileItem")
    private List<ProfileItem> profileItem;

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

    public String getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
    }

    public Long getEventTime() {
        return eventTime;
    }

    public void setEventTime(Long eventTime) {
        this.eventTime = eventTime;
    }

    public List<ProfileItem> getProfileItem() {
        return profileItem;
    }

    public void setProfileItem(List<ProfileItem> profileItem) {
        this.profileItem = profileItem;
    }
}
