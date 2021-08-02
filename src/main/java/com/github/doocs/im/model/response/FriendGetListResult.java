package com.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author hyh
 * @since 2021/07/30 16:56
 */
public class FriendGetListResult extends GroupGetResult {
    @JsonProperty("InfoItem")
    private List<FriendGetListInfoItem> infoItemList;

    @JsonProperty("Fail_Account")
    private List<String> failAccount;

    public List<FriendGetListInfoItem> getInfoItemList() {
        return infoItemList;
    }

    public void setInfoItemList(List<FriendGetListInfoItem> infoItemList) {
        this.infoItemList = infoItemList;
    }

    public List<String> getFailAccount() {
        return failAccount;
    }

    public void setFailAccount(List<String> failAccount) {
        this.failAccount = failAccount;
    }

    @Override
    public String toString() {
        return "FriendGetListResult{" +
                "infoItemList=" + infoItemList +
                ", failAccount=" + failAccount +
                '}';
    }
}
