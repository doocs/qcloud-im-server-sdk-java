package com.qcloud.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

/**
 * @author hyh
 * @since 2021/07/30 11:47
 */
public class UserAttrItem {
    @JsonProperty("To_Account")
    private String toAccount;

    @JsonProperty("Attrs")
    private Map<String, Object> attrs;

    public String getToAccount() {
        return toAccount;
    }

    public void setToAccount(String toAccount) {
        this.toAccount = toAccount;
    }

    public Map<String, Object> getAttrs() {
        return attrs;
    }

    public void setAttrs(Map<String, Object> attrs) {
        this.attrs = attrs;
    }

    @Override
    public String toString() {
        return "UserAttrItem{" +
                "toAccount='" + toAccount + '\'' +
                ", attrs=" + attrs +
                '}';
    }
}
