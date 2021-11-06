package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author hyh
 * @since 2021/07/30 17:27
 */
public class BlackListCheckResult extends GenericResult {
    @JsonProperty("BlackListCheckItem")
    private List<BlackListCheckItem> blackListCheckItemList;

    @JsonProperty("Fail_Account")
    private List<String> failAccount;

    @JsonProperty("ErrorDisplay")
    private String errorDisplay;

    public List<BlackListCheckItem> getBlackListCheckItemList() {
        return blackListCheckItemList;
    }

    public void setBlackListCheckItemList(List<BlackListCheckItem> blackListCheckItemList) {
        this.blackListCheckItemList = blackListCheckItemList;
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
        return "BlackListCheckResult{" +
                "blackListCheckItemList=" + blackListCheckItemList +
                ", failAccount=" + failAccount +
                ", errorDisplay='" + errorDisplay + '\'' +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
