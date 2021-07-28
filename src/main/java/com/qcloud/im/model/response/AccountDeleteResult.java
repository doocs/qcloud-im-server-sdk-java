package com.qcloud.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author bingo
 * @since 2021/7/28 11:04
 */
public class AccountDeleteResult extends GenericResult {
    @JsonProperty("ResultItem")
    private List<AccountDeleteResultItem> resultItems;

    public List<AccountDeleteResultItem> getResultItems() {
        return resultItems;
    }

    public void setResultItems(List<AccountDeleteResultItem> resultItems) {
        this.resultItems = resultItems;
    }
}
