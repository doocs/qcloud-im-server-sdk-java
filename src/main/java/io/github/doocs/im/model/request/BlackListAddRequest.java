package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author hyh
 * @since 2021/07/31 14:44
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BlackListAddRequest extends GenericRequest {
    @JsonProperty("From_Account")
    private String fromAccount;

    @JsonProperty("To_Account")
    private List<String> toAccount;

    public BlackListAddRequest() {
    }

    public BlackListAddRequest(String fromAccount, List<String> toAccount) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
    }

    public String getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
    }

    public List<String> getToAccount() {
        return toAccount;
    }

    public void setToAccount(List<String> toAccount) {
        this.toAccount = toAccount;
    }
}
