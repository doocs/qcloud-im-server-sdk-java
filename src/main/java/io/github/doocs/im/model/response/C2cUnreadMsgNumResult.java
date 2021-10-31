package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author hyh
 * @since 2021/07/28 20:34
 */
public class C2cUnreadMsgNumResult extends GenericResult {
    @JsonProperty("AllC2CUnreadMsgNum")
    private Integer allC2cUnreadMsgNum;

    @JsonProperty("C2CUnreadMsgNumList")
    private List<C2cUnreadMsgNumListItem> unreadMsgNumList;

    @JsonProperty("ErrorList")
    private List<C2cUnreadMsgErrorListItem> errorList;

    public Integer getAllC2cUnreadMsgNum() {
        return allC2cUnreadMsgNum;
    }

    public void setAllC2cUnreadMsgNum(Integer allC2cUnreadMsgNum) {
        this.allC2cUnreadMsgNum = allC2cUnreadMsgNum;
    }

    public List<C2cUnreadMsgNumListItem> getUnreadMsgNumList() {
        return unreadMsgNumList;
    }

    public void setUnreadMsgNumList(List<C2cUnreadMsgNumListItem> unreadMsgNumList) {
        this.unreadMsgNumList = unreadMsgNumList;
    }

    public List<C2cUnreadMsgErrorListItem> getErrorList() {
        return errorList;
    }

    public void setErrorList(List<C2cUnreadMsgErrorListItem> errorList) {
        this.errorList = errorList;
    }

    @Override
    public String toString() {
        return "C2cUnreadMsgNumResult{" +
                "allC2cUnreadMsgNum=" + allC2cUnreadMsgNum +
                ", unreadMsgNumList=" + unreadMsgNumList +
                ", errorList=" + errorList +
                '}';
    }
}
