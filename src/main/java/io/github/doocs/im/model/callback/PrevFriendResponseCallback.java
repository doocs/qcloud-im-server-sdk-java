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
    @JsonProperty("CallbackCommand")
    private String callbackCommand;

    @JsonProperty("Requester_Account")
    private String requesterAccount;

    @JsonProperty("From_Account")
    private String fromAccount;

    @JsonProperty("ResponseFriendItem")
    private List<ResponseFriendItem> responseFriendItem;

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
        @JsonProperty("To_Account")
        private String toAccount;

        @JsonProperty("Remark")
        private String remark;

        @JsonProperty("TagName")
        private String tagName;

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
