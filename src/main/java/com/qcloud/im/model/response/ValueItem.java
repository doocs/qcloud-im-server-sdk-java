package com.qcloud.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author hyh
 * @since 2021/07/30 16:54
 */
public class ValueItem {
    @JsonProperty("Tag")
    private String tag;

    @JsonProperty("Value")
    private String value;

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
