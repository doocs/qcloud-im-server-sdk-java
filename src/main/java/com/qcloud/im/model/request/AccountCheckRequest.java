package com.qcloud.im.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author bingo
 * @since 2021/7/30 17:26
 */
public class AccountCheckRequest extends GenericRequest {
    @JsonProperty("CheckItem")
    private List<AccountCheckItem> checkItemList;

    public List<AccountCheckItem> getCheckItemList() {
        return checkItemList;
    }

    public void setCheckItemList(List<AccountCheckItem> checkItemList) {
        this.checkItemList = checkItemList;
    }
}
