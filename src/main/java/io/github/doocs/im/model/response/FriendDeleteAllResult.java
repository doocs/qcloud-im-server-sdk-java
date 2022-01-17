package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 删除所有好友-结果
 *
 * @author hyh
 * @since 2021/07/30 16:38
 */
public class FriendDeleteAllResult extends GenericResult {
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
        return "FriendDeleteAllResult{" +
                "errorDisplay='" + errorDisplay + '\'' +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
