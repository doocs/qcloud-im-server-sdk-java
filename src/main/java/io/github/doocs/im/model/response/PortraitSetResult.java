package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 设置资料-结果
 *
 * @author hyh
 * @since 2021/07/29 15:09
 */
public class PortraitSetResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = 6674035770761552443L;
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
        return "PortraitSetResult{" +
                "errorDisplay='" + errorDisplay + '\'' +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
