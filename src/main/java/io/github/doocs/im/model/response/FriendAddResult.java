package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 添加好友-结果
 *
 * @author hyh
 * @since 2021/07/30 15:14
 */
public class FriendAddResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = 7877755722037049761L;
    /**
     * 批量加好友的结果对象数组
     */
    @JsonProperty("ResultItem")
    private List<ResultItem> resultItemList;

    /**
     * 详细的客户端展示信息
     */
    @JsonProperty("ErrorDisplay")
    private String errorDisplay;

    public List<ResultItem> getResultItemList() {
        return resultItemList;
    }

    public void setResultItemList(List<ResultItem> resultItemList) {
        this.resultItemList = resultItemList;
    }

    public String getErrorDisplay() {
        return errorDisplay;
    }

    public void setErrorDisplay(String errorDisplay) {
        this.errorDisplay = errorDisplay;
    }

    @Override
    public String toString() {
        return "FriendAddResult{" +
                "resultItemList=" + resultItemList +
                ", errorDisplay='" + errorDisplay + '\'' +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
