package com.qcloud.im.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author hyh
 * @since 2021/07/29 15:45
 */
public class CustomItem {
    @JsonProperty("Tag")
    private String tag;

    @JsonProperty("Value")
    private String value;

    public CustomItem() {
    }

    public CustomItem(String tag, String value) {
        this.tag = tag;
        this.value = value;
    }

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
