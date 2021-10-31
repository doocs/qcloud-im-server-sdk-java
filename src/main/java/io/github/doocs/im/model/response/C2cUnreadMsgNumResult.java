package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author hyh
 * @since 2021/07/28 20:34
 */
public class C2cUnreadMsgNumResult extends GenericResult {
    @JsonProperty("C2CUnreadMsgNumList")
    private List<C2cUnreadMsgNumListItem> unreadMsgNumList;

    public List<C2cUnreadMsgNumListItem> getUnreadMsgNumList() {
        return unreadMsgNumList;
    }

    public void setUnreadMsgNumList(List<C2cUnreadMsgNumListItem> unreadMsgNumList) {
        this.unreadMsgNumList = unreadMsgNumList;
    }

    @Override
    public String toString() {
        return "C2cUnreadMsgNumResult{" +
                "unreadMsgNumList=" + unreadMsgNumList +
                '}';
    }
}
