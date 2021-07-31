package com.qcloud.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author hyh
 * @since 2021/07/30 17:19
 */
public class BlackListDeleteResult extends GenericResult {
    @JsonProperty("ResultItem")
    private List<ResultItem> resultItemList;

    @JsonProperty("Fail_Account")
    private List<String> failAccount;

    @JsonProperty("ErrorDisplay")
    private String errorDisplay;

    public List<ResultItem> getResultItemList() {
        return resultItemList;
    }

    public void setResultItemList(List<ResultItem> resultItemList) {
        this.resultItemList = resultItemList;
    }

    public List<String> getFailAccount() {
        return failAccount;
    }

    public void setFailAccount(List<String> failAccount) {
        this.failAccount = failAccount;
    }

    public String getErrorDisplay() {
        return errorDisplay;
    }

    public void setErrorDisplay(String errorDisplay) {
        this.errorDisplay = errorDisplay;
    }

    @Override
    public String toString() {
        return "BlackListDeleteResult{" +
                "resultItemList=" + resultItemList +
                ", failAccount=" + failAccount +
                ", errorDisplay='" + errorDisplay + '\'' +
                '}';
    }
}
