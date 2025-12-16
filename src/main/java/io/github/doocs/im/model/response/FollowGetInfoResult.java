package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 获取用户的关注、粉丝与互关数-结果
 * </p>
 *
 * @author MC.Yang
 * @version V1.0
 **/
public class FollowGetInfoResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = 6489950260163429701L;

    /**
     * 拉取的结果对象数组
     */
    @JsonProperty("FollowInfo")
    private List<FollowInfoResultItem> followInfoList;

    /**
     * 详细的客户端展示信息
     */
    @JsonProperty("ErrorDisplay")
    private String errorDisplay;

    public List<FollowInfoResultItem> getFollowInfoList() {
        return followInfoList;
    }

    public void setFollowInfoList(List<FollowInfoResultItem> followInfoList) {
        this.followInfoList = followInfoList;
    }

    public String getErrorDisplay() {
        return errorDisplay;
    }

    public void setErrorDisplay(String errorDisplay) {
        this.errorDisplay = errorDisplay;
    }

    @Override
    public String toString() {
        return "FollowGetInfoResult{" +
                "followInfoList=" + followInfoList +
                ", errorDisplay='" + errorDisplay + '\'' +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
