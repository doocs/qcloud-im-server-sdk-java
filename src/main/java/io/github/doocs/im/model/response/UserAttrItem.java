package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

/**
 * @author hyh
 * @since 2021/07/30 11:47
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserAttrItem {
    @JsonProperty("To_Account")
    private String toAccount;

    @JsonProperty("Attrs")
    private Map<String, Object> attrs;

    public UserAttrItem() {
    }

    public UserAttrItem(String toAccount, Map<String, Object> attrs) {
        this.toAccount = toAccount;
        this.attrs = attrs;
    }

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
