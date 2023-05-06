package io.github.doocs.im.model.callback;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 删除好友之后回调
 *
 * @author bingo
 * @since 2021/11/16 16:44
 */
public class FriendDeleteCallback implements Serializable {
    private static final long serialVersionUID = -4496048288078545306L;
    /**
     * 回调命令
     */
    @JsonProperty("CallbackCommand")
    private String callbackCommand;

    /**
     * 成功删除的好友
     */
    @JsonProperty("PairList")
    private List<PairItem> pairList;

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

    public static class PairItem implements Serializable {
        private static final long serialVersionUID = -5013084462615142758L;
        /**
         * From_Account 的好友表中删除了 To_Account
         */
        @JsonProperty("From_Account")
        private String fromAccount;

        /**
         * To_Account 从 From_Account 的好友表中删除
         */
        @JsonProperty("To_Account")
        private String toAccount;

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
    }
}
