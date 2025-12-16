package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 检查关注关系-结果
 * </p>
 *
 * @author MC.Yang
 * @version V1.0
 **/
public class FollowCheckResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = 950703576946301497L;

    /**
     * 校验结果对象数组
     */
    @JsonProperty("ResultItem")
    private List<FollowCheckResultItem> resultItemList;

    /**
     * 详细的客户端展示信息
     */
    @JsonProperty("ErrorDisplay")
    private String errorDisplay;

    public List<FollowCheckResultItem> getResultItemList() {
        return resultItemList;
    }

    public void setResultItemList(List<FollowCheckResultItem> resultItemList) {
        this.resultItemList = resultItemList;
    }

    public String getErrorDisplay() {
        return errorDisplay;
    }

    public void setErrorDisplay(String errorDisplay) {
        this.errorDisplay = errorDisplay;
    }

    @Override
    public String toString() {
        return "FollowCheckResult{" +
                "resultItemList=" + resultItemList +
                ", errorDisplay='" + errorDisplay + '\'' +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
