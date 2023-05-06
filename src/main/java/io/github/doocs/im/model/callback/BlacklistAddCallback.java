package io.github.doocs.im.model.callback;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 添加黑名单之后回调
 *
 * @author bingo
 * @since 2021/11/16 16:48
 */
public class BlacklistAddCallback implements Serializable {
    private static final long serialVersionUID = 4310613851124596479L;
    /**
     * 回调命令
     */
    @JsonProperty("CallbackCommand")
    private String callbackCommand;

    /**
     * 成功添加的黑名单关系链对
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
        private static final long serialVersionUID = -8777612848125670287L;
        /**
         * From_Account 的黑名单列表中添加了 To_Account
         */
        @JsonProperty("From_Account")
        private String fromAccount;

        /**
         * To_Account 被加入到 From_Account 的黑名单列表中
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
