package com.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author hyh
 * @since 2021/07/29 15:45
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomItem {
    @JsonProperty("Tag")
    private String tag;

    @JsonProperty("Value")
    private Object value;

    public CustomItem() {
    }

    public CustomItem(String tag, Object value) {
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

    @Override
    public String toString() {
        return "CustomItem{" +
                "tag='" + tag + '\'' +
                ", value=" + value +
                '}';
    }
}
