package com.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author bingo
 * @since 2021/7/27 16:00
 */
public class MultiAccountImportResult extends GenericResult {
    @JsonProperty("FailAccounts")
    private List<String> failAccounts;

    public List<String> getFailAccounts() {
        return failAccounts;
    }

    public void setFailAccounts(List<String> failAccounts) {
        this.failAccounts = failAccounts;
    }

    @Override
    public String toString() {
        return "MultiAccountImportResult{" +
                "failAccounts=" + failAccounts +
                '}';
    }
}
