package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 拉取分组-结果
 *
 * @author hyh
 * @since 2021/07/30 17:38
 */
public class GroupGetResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = -2770857932890733954L;
    /**
     * 拉取分组的结果对象数组
     */
    @JsonProperty("ResultItem")
    private List<GroupGetResultItem> resultItemList;

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

    public List<GroupGetResultItem> getResultItemList() {
        return resultItemList;
    }

    public void setResultItemList(List<GroupGetResultItem> resultItemList) {
        this.resultItemList = resultItemList;
    }

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
        return "GroupGetResult{" +
                "resultItemList=" + resultItemList +
                ", currentSequence=" + currentSequence +
                ", errorDisplay='" + errorDisplay + '\'' +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
