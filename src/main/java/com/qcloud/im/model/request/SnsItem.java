package com.qcloud.im.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author hyh
 * @since 2021/07/31 14:24
 */
public class SnsItem {
    @JsonProperty("Tag")
    private String tag;

    @JsonProperty("Value")
    private Object value;

    public SnsItem() {
    }

    public SnsItem(String tag, Object value) {
        this.tag = tag;
        this.value = value;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
