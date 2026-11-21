package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 搜索结果中的资料字段值
 *
 * @author MC.Yang
 * @version V1.0
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProfileItemValue implements Serializable {
    private static final long serialVersionUID = -42884255649710653L;

    /**
     * 资料字段名
     */
    @JsonProperty("Tag")
    private String tag;

    /**
     * 整型值
     */
    @JsonProperty("IntValue")
    private Integer intValue;

    /**
     * 字符串值
     */
    @JsonProperty("StrValue")
    private String strValue;

    public ProfileItemValue() {
    }

    public ProfileItemValue(String tag, Integer intValue, String strValue) {
        this.tag = tag;
        this.intValue = intValue;
        this.strValue = strValue;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Integer getIntValue() {
        return intValue;
    }

    public void setIntValue(Integer intValue) {
        this.intValue = intValue;
    }

    public String getStrValue() {
        return strValue;
    }

    public void setStrValue(String strValue) {
        this.strValue = strValue;
    }

    @Override
    public String toString() {
        return "ProfileItemValue{" +
                "tag='" + tag + '\'' +
                ", intValue=" + intValue +
                ", strValue='" + strValue + '\'' +
                '}';
    }
}