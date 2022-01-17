package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 删除单个会话-结果
 *
 * @author bingo
 * @since 2021/10/11 10:53
 */
public class DeleteRecentContactResult extends GenericResult {
    /**
     * 详细的客户端展示信息
     */
    @JsonProperty("ErrorDisplay")
    private String errorDisplay;

    public String getErrorDisplay() {
        return errorDisplay;
    }

    public void setErrorDisplay(String errorDisplay) {
        this.errorDisplay = errorDisplay;
    }

    @Override
    public String toString() {
        return "DeleteRecentContactResult{" +
                "errorDisplay='" + errorDisplay + '\'' +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
