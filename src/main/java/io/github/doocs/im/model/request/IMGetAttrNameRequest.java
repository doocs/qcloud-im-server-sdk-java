package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author bingo
 * @since 2021/7/31 16:47
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class IMGetAttrNameRequest extends GenericRequest {
    @JsonProperty("To_Account")
    private List<String> toAccount;

    public IMGetAttrNameRequest(List<String> toAccount) {
        this.toAccount = toAccount;
    }

    public List<String> getToAccount() {
        return toAccount;
    }

    public void setToAccount(List<String> toAccount) {
        this.toAccount = toAccount;
    }
}
