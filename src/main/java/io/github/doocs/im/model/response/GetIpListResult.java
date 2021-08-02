package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author bingo
 * @since 2021/7/31 20:31
 */
public class GetIpListResult {
    @JsonProperty("ErrorCode")
    private Integer errorCode;

    @JsonProperty("errorInfo")
    private String errorInfo;

    @JsonProperty("IPList")
    private List<String> ipList;

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(String errorInfo) {
        this.errorInfo = errorInfo;
    }

    public List<String> getIpList() {
        return ipList;
    }

    public void setIpList(List<String> ipList) {
        this.ipList = ipList;
    }

    @Override
    public String toString() {
        return "GetIpListResult{" +
                "errorCode=" + errorCode +
                ", errorInfo='" + errorInfo + '\'' +
                ", ipList=" + ipList +
                '}';
    }
}
