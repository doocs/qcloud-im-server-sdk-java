package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 删除黑名单-结果
 *
 * @author hyh
 * @since 2021/07/30 17:19
 */
public class BlackListDeleteResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = -7865708958408436526L;
    /**
     * 批量删除黑名单的结果对象数组
     */
    @JsonProperty("ResultItem")
    private List<ResultItem> resultItemList;

    /**
     * 返回处理失败的用户列表，仅当存在失败用户时才返回该字段
     */
    @JsonProperty("Fail_Account")
    private List<String> failAccount;

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
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
