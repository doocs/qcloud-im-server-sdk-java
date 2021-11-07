package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author hyh
 * @since 2021/07/30 14:10
 */
public class ImGetTagResult extends GenericResult {
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
