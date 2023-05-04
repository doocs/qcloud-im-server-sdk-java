package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 删除分组-结果
 *
 * @author hyh
 * @since 2021/07/30 17:37
 */
public class GroupDeleteResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = 8991556663354967495L;
    /**
     * 返回最新的分组 Sequence
     */
    @JsonProperty("CurrentSequence")
    private Integer currentSequence;

    /**
     * 详细的客户端展示信息
     */
    @JsonProperty("ErrorDisplay")
    private String errorDisplay;

    public Integer getCurrentSequence() {
        return currentSequence;
    }

    public void setCurrentSequence(Integer currentSequence) {
        this.currentSequence = currentSequence;
    }

    public String getErrorDisplay() {
        return errorDisplay;
    }

    public void setErrorDisplay(String errorDisplay) {
        this.errorDisplay = errorDisplay;
    }

    @Override
    public String toString() {
        return "GroupDeleteResult{" +
                "currentSequence=" + currentSequence +
                ", errorDisplay='" + errorDisplay + '\'' +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
