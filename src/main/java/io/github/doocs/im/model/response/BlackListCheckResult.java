package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 校验黑名单-结果
 *
 * @author hyh
 * @since 2021/07/30 17:27
 */
public class BlackListCheckResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = -7904359585307764694L;
    /**
     * 校验结果对象数组
     */
    @JsonProperty("BlackListCheckItem")
    private List<BlackListCheckItem> blackListCheckItemList;

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
