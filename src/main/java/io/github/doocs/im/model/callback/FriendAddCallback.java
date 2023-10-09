package io.github.doocs.im.model.callback;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 添加好友之后回调
 *
 * @author bingo
 * @since 2021/11/16 16:35
 */
public class FriendAddCallback implements Serializable {
    private static final long serialVersionUID = 4948241362885587291L;
    /**
     * 回调命令
     */
    @JsonProperty("CallbackCommand")
    private String callbackCommand;

    /**
     * 成功添加的好友对
     */
    @JsonProperty("PairList")
    private List<PairItem> pairList;

    /**
     * 触发回调的命令字：
     * 加好友请求，合理的取值如下：friend_add、FriendAdd
     * 加好友回应，合理的取值如下：friend_response、FriendResponse
     */
    @JsonProperty("ClientCmd")
    private String clientCmd;

    /**
     * 如果当前请求是后台触发的加好友请求，则该字段被赋值为管理员账号；否则为空
     */
    @JsonProperty("Admin_Account")
    private String adminAccount;

    /**
     * 管理员强制加好友标记：1 表示强制加好友；0 表示常规加好友方式
     */
    @JsonProperty("ForceFlag")
    private Integer forceFlag;

    public String getCallbackCommand() {
        return callbackCommand;
    }

    public void setCallbackCommand(String callbackCommand) {
        this.callbackCommand = callbackCommand;
    }

    public List<PairItem> getPairList() {
        return pairList;
    }

    public void setPairList(List<PairItem> pairList) {
        this.pairList = pairList;
    }

    public String getClientCmd() {
        return clientCmd;
    }

    public void setClientCmd(String clientCmd) {
        this.clientCmd = clientCmd;
    }

    public String getAdminAccount() {
        return adminAccount;
    }

    public void setAdminAccount(String adminAccount) {
        this.adminAccount = adminAccount;
    }

    public Integer getForceFlag() {
        return forceFlag;
    }

    public void setForceFlag(Integer forceFlag) {
        this.forceFlag = forceFlag;
    }

    public static class PairItem implements Serializable {
        private static final long serialVersionUID = -1835139846826692955L;
        /**
         * From_Account 的好友表中增加了 To_Account
         */
        @JsonProperty("From_Account")
        private String fromAccount;

        /**
         * To_Account 被增加到了 From_Account 的好友表中
         */
        @JsonProperty("To_Account")
        private String toAccount;

        /**
         * 发起加好友请求的用户的 UserID
         */
        @JsonProperty("Initiator_Account")
        private String initiatorAccount;

        public String getFromAccount() {
            return fromAccount;
        }

        public void setFromAccount(String fromAccount) {
            this.fromAccount = fromAccount;
        }

        public String getToAccount() {
            return toAccount;
        }

        public void setToAccount(String toAccount) {
            this.toAccount = toAccount;
        }

        public String getInitiatorAccount() {
            return initiatorAccount;
        }

        public void setInitiatorAccount(String initiatorAccount) {
            this.initiatorAccount = initiatorAccount;
        }
    }
}
