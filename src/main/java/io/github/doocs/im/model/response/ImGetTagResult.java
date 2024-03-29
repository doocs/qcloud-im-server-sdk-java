package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 获取用户标签-结果
 *
 * @author hyh
 * @since 2021/07/30 14:10
 */
public class ImGetTagResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = 4478348885714533596L;
    /**
     * 用户标签内容列表
     */
    @JsonProperty("UserTags")
    private List<UserTagItem> userTags;

    public List<UserTagItem> getUserTags() {
        return userTags;
    }

    public void setUserTags(List<UserTagItem> userTags) {
        this.userTags = userTags;
    }

    @Override
    public String toString() {
        return "ImGetTagResult{" +
                "userTags=" + userTags +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
