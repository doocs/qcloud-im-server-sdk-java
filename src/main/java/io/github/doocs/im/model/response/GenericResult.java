package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author bingo
 * @since 2021/7/27 15:43
 */
public abstract class GenericResult {
    /**
     * 请求处理的结果，OK 表示处理成功，FAIL 表示失败，如果为 FAIL，ErrorInfo 带上失败原因
     */
    @JsonProperty("ActionStatus")
    private String actionStatus;

    /**
     * 失败原因
     */
    @JsonProperty("ErrorInfo")
    private String errorInfo;

    /**
     * 错误码，0为成功，其他为失败，错误码表：https://cloud.tencent.com/document/product/269/1671
     */
    @JsonProperty("ErrorCode")
    private Integer errorCode;

    public String getActionStatus() {
        return actionStatus;
    }

    public void setActionStatus(String actionStatus) {
        this.actionStatus = actionStatus;
    }

    public String getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(String errorInfo) {
        this.errorInfo = errorInfo;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    @Override
    public String toString() {
        return "Result{" +
                "actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
