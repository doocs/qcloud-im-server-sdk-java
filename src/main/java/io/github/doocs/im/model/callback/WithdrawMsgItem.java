package io.github.doocs.im.model.callback;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * @author bingo
 * @since 2024/1/10 10:18
 */
public class WithdrawMsgItem implements Serializable {
    private static final long serialVersionUID = -4758534993353336327L;
    @JsonProperty("MsgKey")
    private String msgKey;

    public String getMsgKey() {
        return msgKey;
    }

    public void setMsgKey(String msgKey) {
        this.msgKey = msgKey;
    }
}
