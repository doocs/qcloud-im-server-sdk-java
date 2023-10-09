package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Map;

/**
 * @author hyh
 * @since 2021/07/30 11:47
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserAttrItem implements Serializable {
    private static final long serialVersionUID = -2291314624855454051L;
    /**
     * 用户账号
     */
    @JsonProperty("To_Account")
    private String toAccount;

    /**
     * 属性内容
     */
    @JsonProperty("Attrs")
    private Map<String, Object> attrs;

    public UserAttrItem() {
    }

    public UserAttrItem(String toAccount, Map<String, Object> attrs) {
        this.toAccount = toAccount;
        this.attrs = attrs;
    }

    private UserAttrItem(Builder builder) {
        this.toAccount = builder.toAccount;
        this.attrs = builder.attrs;
    }

    public static Builder builder() {
        return new Builder();
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


    public static final class Builder {
        private String toAccount;
        private Map<String, Object> attrs;

        private Builder() {
        }

        public UserAttrItem build() {
            return new UserAttrItem(this);
        }

        public Builder toAccount(String toAccount) {
            this.toAccount = toAccount;
            return this;
        }

        public Builder attrs(Map<String, Object> attrs) {
            this.attrs = attrs;
            return this;
        }
    }

    @Override
    public String toString() {
        return "UserAttrItem{" +
                "toAccount='" + toAccount + '\'' +
                ", attrs=" + attrs +
                '}';
    }
}
