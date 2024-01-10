package io.github.doocs.im.model.callback;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 撤回公众号消息之后回调
 *
 * @author bingo
 * @since 2024/1/10 10:18
 */
public class AfterOfficialAccountMsgWithdrawCallback implements Serializable {
    private static final long serialVersionUID = -7080030096097700901L;

    /**
     * 回调命令。
     */
    @JsonProperty("CallbackCommand")
    private String callbackCommand;

    /**
     * 公众号用户 ID。
     */
    @JsonProperty("Official_Account")
    private String officialAccount;

    /**
     * 撤回消息 MsgKey 列表。
     */
    @JsonProperty("WithdrawMsgList")
    private List<WithdrawMsgItem> withdrawMsgList;

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

    public List<WithdrawMsgItem> getWithdrawMsgList() {
        return withdrawMsgList;
    }

    public void setWithdrawMsgList(List<WithdrawMsgItem> withdrawMsgList) {
        this.withdrawMsgList = withdrawMsgList;
    }

    public Long getEventTime() {
        return eventTime;
    }

    public void setEventTime(Long eventTime) {
        this.eventTime = eventTime;
    }
}
