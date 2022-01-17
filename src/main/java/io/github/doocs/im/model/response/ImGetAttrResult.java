package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 获取用户属性-结果
 *
 * @author hyh
 * @since 2021/07/30 11:27
 */
public class ImGetAttrResult extends GenericResult {
    /**
     * 用户标签内容列表
     */
    @JsonProperty("UserAttrs")
    private List<UserAttrItem> userAttrs;

    public List<UserAttrItem> getUserAttrs() {
        return userAttrs;
    }

    public void setUserAttrs(List<UserAttrItem> userAttrs) {
        this.userAttrs = userAttrs;
    }

    @Override
    public String toString() {
        return "ImGetAttrResult{" +
                "userAttrs=" + userAttrs +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
