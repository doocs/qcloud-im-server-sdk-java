package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 导入多个账号-请求参数
 * 
 * @author dileex
 * @since 2024/12/19
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MultiAccountImportNewRequest extends GenericRequest implements Serializable {
    private static final long serialVersionUID = 1096507781689811276L;

    /**
     * 待导入的用户列表，单次最多导入100个用户
     */
    @JsonProperty("AccountList")
    private List<AccountImportRequest> accountList;

    public MultiAccountImportNewRequest() {
    }

    public MultiAccountImportNewRequest(List<AccountImportRequest> accountList) {
        this.accountList = accountList;
    }

    private MultiAccountImportNewRequest(Builder builder) {
        this.accountList = builder.accountList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public List<AccountImportRequest> getAccountList() {
        return accountList;
    }

    public void setAccountList(List<AccountImportRequest> accountList) {
        this.accountList = accountList;
    }

    public static final class Builder {
        private List<AccountImportRequest> accountList;

        private Builder() {
        }

        public MultiAccountImportNewRequest build() {
            return new MultiAccountImportNewRequest(this);
        }

        public Builder accountList(List<AccountImportRequest> accountList) {
            this.accountList = accountList;
            return this;
        }
    }
}
