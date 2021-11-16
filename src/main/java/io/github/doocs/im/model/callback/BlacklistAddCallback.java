package io.github.doocs.im.model.callback;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 添加黑名单之后回调
 *
 * @author bingo
 * @since 2021/11/16 16:48
 */
public class BlacklistAddCallback {
    @JsonProperty("CallbackCommand")
    private String callbackCommand;

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

    public static class PairItem {
        @JsonProperty("From_Account")
        private String fromAccount;

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
