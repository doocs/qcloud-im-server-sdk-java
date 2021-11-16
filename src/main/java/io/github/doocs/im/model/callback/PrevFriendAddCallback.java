package io.github.doocs.im.model.callback;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 添加好友之前回调
 *
 * @author bingo
 * @since 2021/11/16 15:56
 */
public class PrevFriendAddCallback {
    @JsonProperty("CallbackCommand")
    private String callbackCommand;

    @JsonProperty("Requester_Account")
    private String requesterAccount;

    @JsonProperty("From_Account")
    private String fromAccount;

    @JsonProperty("FriendItem")
    private List<FriendItem> friendItem;

    @JsonProperty("AddType")
    private String addType;

    @JsonProperty("ForceAddFlags")
    private Integer forceAddFlags;

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

    public List<FriendItem> getFriendItem() {
        return friendItem;
    }

    public void setFriendItem(List<FriendItem> friendItem) {
        this.friendItem = friendItem;
    }

    public String getAddType() {
        return addType;
    }

    public void setAddType(String addType) {
        this.addType = addType;
    }

    public Integer getForceAddFlags() {
        return forceAddFlags;
    }

    public void setForceAddFlags(Integer forceAddFlags) {
        this.forceAddFlags = forceAddFlags;
    }

    public Long getEventTime() {
        return eventTime;
    }

    public void setEventTime(Long eventTime) {
        this.eventTime = eventTime;
    }

    public static class FriendItem {
        @JsonProperty("To_Account")
        private String toAccount;

        @JsonProperty("Remark")
        private String remark;

        @JsonProperty("GroupName")
        private String groupName;

        @JsonProperty("AddSource")
        private String addSource;

        @JsonProperty("AddWording")
        private String addWording;

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

        public String getGroupName() {
            return groupName;
        }

        public void setGroupName(String groupName) {
            this.groupName = groupName;
        }

        public String getAddSource() {
            return addSource;
        }

        public void setAddSource(String addSource) {
            this.addSource = addSource;
        }

        public String getAddWording() {
            return addWording;
        }

        public void setAddWording(String addWording) {
            this.addWording = addWording;
        }
    }
}
