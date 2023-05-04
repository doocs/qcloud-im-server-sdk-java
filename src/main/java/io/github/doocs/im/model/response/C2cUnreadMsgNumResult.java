package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 查询单聊未读消息计数-结果
 *
 * @author hyh
 * @since 2021/07/28 20:34
 */
public class C2cUnreadMsgNumResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = -9178093027888499841L;
    /**
     * 单聊消息总未读数
     */
    @JsonProperty("AllC2CUnreadMsgNum")
    private Integer allC2cUnreadMsgNum;

    /**
     * 单聊会话未读列表
     */
    @JsonProperty("C2CUnreadMsgNumList")
    private List<C2cUnreadMsgNumListItem> unreadMsgNumList;

    /**
     * 错误列表
     */
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
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
