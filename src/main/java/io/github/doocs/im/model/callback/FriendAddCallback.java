package io.github.doocs.im.model.callback;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 添加好友之后回调
 *
 * @author bingo
 * @since 2021/11/16 16:35
 */
public class FriendAddCallback {
    @JsonProperty("CallbackCommand")
    private String callbackCommand;

    @JsonProperty("PairList")
    private List<PairItem> pairList;

    @JsonProperty("ClientCmd")
    private String clientCmd;

    @JsonProperty("Admin_Account")
    private String adminAccount;

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

    public static class PairItem {
        @JsonProperty("From_Account")
        private String fromAccount;

        @JsonProperty("To_Account")
        private String toAccount;

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
