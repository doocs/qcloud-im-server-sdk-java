package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author xy
 * @since 2021/07/31 11:51:01
 */
public class GetNoSpeakingResult {
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
        return "GetNoSpeakingResult{" +
                "errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
