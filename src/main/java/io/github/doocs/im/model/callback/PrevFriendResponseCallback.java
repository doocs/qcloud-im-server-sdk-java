package io.github.doocs.im.model.callback;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 添加好友回应之前回调
 *
 * @author bingo
 * @since 2021/11/16 16:28
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PrevFriendResponseCallback {
    /**
     * 回调命令
     */
    @JsonProperty("CallbackCommand")
    private String callbackCommand;

    /**
     * 添加好友回应请求发起方的 UserID
     */
    @JsonProperty("Requester_Account")
    private String requesterAccount;

    /**
     * 请求加好友回应的用户的 UserID
     */
    @JsonProperty("From_Account")
    private String fromAccount;

    /**
     * 加好友回应请求的参数
     */
    @JsonProperty("ResponseFriendItem")
    private List<ResponseFriendItem> responseFriendItem;

    /**
     * 毫秒时间戳
     */
    @JsonProperty("EventTime")
    private Long eventTime;

    public String getCallbackCommand() {
        return callbackCommand;
    }

    public void setCallbackCommand(String callbackCommand) {
        this.callbackCommand = callbackCommand;
    }

    public String getRequesterAccount() {
        return requesterAccount;
    }

    public void setRequesterAccount(String requesterAccount) {
        this.requesterAccount = requesterAccount;
    }

    public String getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
    }

    public List<ResponseFriendItem> getResponseFriendItem() {
        return responseFriendItem;
    }

    public void setResponseFriendItem(List<ResponseFriendItem> responseFriendItem) {
        this.responseFriendItem = responseFriendItem;
    }

    public Long getEventTime() {
        return eventTime;
    }

    public void setEventTime(Long eventTime) {
        this.eventTime = eventTime;
    }

    public static class ResponseFriendItem {
        /**
         * 请求回应的用户的 UserID
         */
        @JsonProperty("To_Account")
        private String toAccount;

        /**
         * From_Account 对 To_Account 设置的好友备注，详情可参见 标配好友字段
         */
        @JsonProperty("Remark")
        private String remark;

        /**
         * From_Account 对 To_Account 设置的好友分组，详情可参见 标配好友字段
         */
        @JsonProperty("TagName")
        private String tagName;

        /**
         * 加好友回应方式：
         * Response_Action_AgreeAndAdd 表示同意且添加对方为好友
         * Response_Action_Agree 表示同意对方加自己为好友
         * Response_Action_Reject 表示拒绝对方的加好友请求
         */
        @JsonProperty("ResponseAction")
        private String responseAction;

        public String getToAccount() {
            return toAccount;
        }

        public void setToAccount(String toAccount) {
            this.toAccount = toAccount;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getTagName() {
            return tagName;
        }

        public void setTagName(String tagName) {
            this.tagName = tagName;
        }

        public String getResponseAction() {
            return responseAction;
        }

        public void setResponseAction(String responseAction) {
            this.responseAction = responseAction;
        }
    }
}
