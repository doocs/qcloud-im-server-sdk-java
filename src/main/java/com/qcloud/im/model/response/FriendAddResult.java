package com.qcloud.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author hyh
 * @since 2021/07/30 15:14
 */
public class FriendAddResult extends GenericResult {
    @JsonProperty("ResultItem")
    private List<ResultItem> resultItemList;

    @JsonProperty("ActionStatus")
    private String actionStatus;

    @JsonProperty("ErrorDisplay")
    private String errorDisplay;

    public List<ResultItem> getResultItemList() {
        return resultItemList;
    }

    public void setResultItemList(List<ResultItem> resultItemList) {
        this.resultItemList = resultItemList;
    }

    @Override
    public String getActionStatus() {
        return actionStatus;
    }

    @Override
    public void setActionStatus(String actionStatus) {
        this.actionStatus = actionStatus;
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
                ", actionStatus='" + actionStatus + '\'' +
                ", errorDisplay='" + errorDisplay + '\'' +
                '}';
    }
}
