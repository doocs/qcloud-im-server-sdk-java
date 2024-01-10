package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 销毁公众号-请求参数
 *
 * @author hyh
 * @since 2024/1/9 22:06
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DestroyOfficialAccountRequest extends GenericRequest implements Serializable {
    private static final long serialVersionUID = 5130762102739300161L;

    /**
     * 需要销毁的公众号 ID. 使用创建时接口返回的 OfficialAccountUserID 字段
     */
    @JsonProperty("Official_Account")
    private String officialAccount;

    public DestroyOfficialAccountRequest() {
    }

    public DestroyOfficialAccountRequest(String officialAccount) {
        this.officialAccount = officialAccount;
    }

    private DestroyOfficialAccountRequest(Builder builder) {
        this.officialAccount = builder.officialAccount;
    }

    public String getOfficialAccount() {
        return officialAccount;
    }

    public void setOfficialAccount(String officialAccount) {
        this.officialAccount = officialAccount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private String officialAccount;

        private Builder() {
        }

        public DestroyOfficialAccountRequest build() {
            return new DestroyOfficialAccountRequest(this);
        }

        public Builder officialAccount(String officialAccount) {
            this.officialAccount = officialAccount;
            return this;
        }
    }
}
