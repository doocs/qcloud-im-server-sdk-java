package io.github.doocs.im.model.callback;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 添加好友之前回调
 *
 * @author bingo
 * @since 2021/11/16 15:56
 */
public class PrevFriendAddCallback implements Serializable {
    private static final long serialVersionUID = 3162021789720896019L;
    /**
     * 回调命令
     */
    @JsonProperty("CallbackCommand")
    private String callbackCommand;

    /**
     * 请求发起方的 UserID
     */
    @JsonProperty("Requester_Account")
    private String requesterAccount;

    /**
     * 请求添加好友的用户的 UserID
     */
    @JsonProperty("From_Account")
    private String fromAccount;

    /**
     * 加好友请求的参数
     */
    @JsonProperty("FriendItem")
    private List<FriendItem> friendItem;

    /**
     * 加好友方式（默认双向加好友方式）：
     * Add_Type_Single 表示单向加好友
     * Add_Type_Both 表示双向加好友
     */
    @JsonProperty("AddType")
    private String addType;

    /**
     * 管理员强制加好友标记：
     * 1 表示强制加好友
     * 0 表示常规加好友方式
     */
    @JsonProperty("ForceAddFlags")
    private Integer forceAddFlags;

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

    public static class FriendItem implements Serializable {
        private static final long serialVersionUID = 2972509299932495782L;
        /**
         * 请求添加的用户的 UserID
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
        @JsonProperty("GroupName")
        private String groupName;

        /**
         * 加好友来源，详情可参见 标配好友字段
         */
        @JsonProperty("AddSource")
        private String addSource;

        /**
         * 加好友附言，详情可参见 标配好友字段
         */
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
