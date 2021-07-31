package com.qcloud.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author hyh
 * @since 2021/07/28 20:34
 */
public class C2CUnreadMsgNumResult extends GenericResult {
    @JsonProperty("C2CUnreadMsgNumList")
    private List<C2CUnreadMsgNumListItem> unreadMsgNumList;

    public List<C2CUnreadMsgNumListItem> getUnreadMsgNumList() {
        return unreadMsgNumList;
    }

    public void setUnreadMsgNumList(List<C2CUnreadMsgNumListItem> unreadMsgNumList) {
        this.unreadMsgNumList = unreadMsgNumList;
    }

    @Override
    public String toString() {
        return "C2CUnreadMsgNumResult{" +
                "unreadMsgNumList=" + unreadMsgNumList +
                '}';
    }
}
