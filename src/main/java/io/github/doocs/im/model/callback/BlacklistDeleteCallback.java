package io.github.doocs.im.model.callback;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 删除黑名单之后回调
 *
 * @author bingo
 * @since 2021/11/16 16:51
 */
public class BlacklistDeleteCallback implements Serializable {
    private static final long serialVersionUID = 2695719287926779076L;
    /**
     * 回调命令
     */
    @JsonProperty("CallbackCommand")
    private String callbackCommand;

    /**
     * 成功删除的黑名单对
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
        private static final long serialVersionUID = 2366462460933813701L;
        /**
         * From_Account 的黑名单列表中删除了 To_Account
         */
        @JsonProperty("From_Account")
        private String fromAccount;

        /**
         * To_Account 从 From_Account 的黑名单列表中删除
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
