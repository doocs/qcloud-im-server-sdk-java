package com.qcloud.im.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author hyh
 * @since 2021/07/31 14:22
 */
public class UpdateItem {
    @JsonProperty("To_Account")
    private String toAccount;

    @JsonProperty("SnsItem")
    private List<SnsItem> snsItemList;

    public UpdateItem() {
    }

    public UpdateItem(String toAccount, List<SnsItem> snsItemList) {
        this.toAccount = toAccount;
        this.snsItemList = snsItemList;
    }

    public String getToAccount() {
        return toAccount;
    }

    public void setToAccount(String toAccount) {
        this.toAccount = toAccount;
    }

    public List<SnsItem> getSnsItemList() {
        return snsItemList;
    }

    public void setSnsItemList(List<SnsItem> snsItemList) {
        this.snsItemList = snsItemList;
    }
}
