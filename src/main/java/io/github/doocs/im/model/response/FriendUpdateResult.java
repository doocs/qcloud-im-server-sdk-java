package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * @author hyh
 * @since 2021/07/30 16:20
 */
public class FriendUpdateResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = -6178061242243002111L;
    /**
     * 批量更新好友的结果对象数组
     */
    @JsonProperty("ResultItem")
    private List<ResultItem> resultItemList;

    /**
     * 详细的客户端展示信息
     */
    @JsonProperty("ErrorDisplay")
    private String errorDisplay;

    /**
     * 返回处理失败的用户列表，仅当存在失败用户时才返回该字段
     */
    @JsonProperty("Fail_Account")
    private List<String> failAccount;

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

    public List<String> getFailAccount() {
        return failAccount;
    }

    public void setFailAccount(List<String> failAccount) {
        this.failAccount = failAccount;
    }

    @Override
    public String toString() {
        return "FriendUpdateResult{" +
                "resultItemList=" + resultItemList +
                ", errorDisplay='" + errorDisplay + '\'' +
                ", failAccount=" + failAccount +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
