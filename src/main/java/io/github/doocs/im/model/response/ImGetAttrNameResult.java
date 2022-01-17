package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

/**
 * 获取应用属性名称-结果
 *
 * @author hyh
 * @since 2021/07/30 11:23
 */
public class ImGetAttrNameResult extends GenericResult {
    /**
     * 包含多个键对。每对键值对，表示第几个属性对应的名称。例如"0":"xxx"表示第0号属性的名称是 xxx
     */
    @JsonProperty("AttrNames")
    private Map<String, Object> attrNames;

    public Map<String, Object> getAttrNames() {
        return attrNames;
    }

    public void setAttrNames(Map<String, Object> attrNames) {
        this.attrNames = attrNames;
    }

    @Override
    public String toString() {
        return "ImGetAttrNameResult{" +
                "attrNames=" + attrNames +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}


