package com.qcloud.im.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author bingo
 * @since 2021/7/30 17:07
 */
public class MultiAccountImportRequest extends GenericRequest {
    @JsonProperty("Accounts")
    private List<String> accounts;

    public List<String> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<String> accounts) {
        this.accounts = accounts;
    }
}
