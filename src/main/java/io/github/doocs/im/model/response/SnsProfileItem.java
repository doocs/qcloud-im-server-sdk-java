package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author hyh
 * @since 2021/07/30 17:11
 */
public class SnsProfileItem {
    /**
     * 字段的名称
     */
    @JsonProperty("Tag")
    private String tag;

    /**
     * 字段的值
     */
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

    @Override
    public String toString() {
        return "SnsProfileItem{" +
                "tag='" + tag + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
