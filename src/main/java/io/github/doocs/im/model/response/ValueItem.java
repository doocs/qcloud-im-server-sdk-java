package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * @author hyh
 * @since 2021/07/30 16:54
 */
public class ValueItem implements Serializable {
    private static final long serialVersionUID = 2634107854954005106L;
    /**
     * 好友字段的名称
     */
    @JsonProperty("Tag")
    private String tag;

    /**
     * 好友字段的值
     */
    @JsonProperty("Value")
    private Object value;

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
        return "ValueItem{" +
                "tag='" + tag + '\'' +
                ", value=" + value +
                '}';
    }
}
