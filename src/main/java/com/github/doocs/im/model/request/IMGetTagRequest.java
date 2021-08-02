package com.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author bingo
 * @since 2021/7/31 17:03
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class IMGetTagRequest extends GenericRequest {
    @JsonProperty("To_Account")
    private List<String> toAccount;

    public List<String> getToAccount() {
        return toAccount;
    }

    public void setToAccount(List<String> toAccount) {
        this.toAccount = toAccount;
    }
}
