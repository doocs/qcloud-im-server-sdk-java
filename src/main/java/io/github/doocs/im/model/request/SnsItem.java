package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * @author hyh
 * @since 2021/07/31 14:24
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SnsItem implements Serializable {
    private static final long serialVersionUID = 2518921269147835324L;
    /**
     * 需要更新的关系链字段的字段名，目前只支持好友备注、好友分组、关系链自定义字段的更新操作，关系链字段的详细信息可参见 好友表
     */
    @JsonProperty("Tag")
    private String tag;

    /**
     * 需要更新的关系链字段的值，关系链字段的值类型信息可参见 好友表
     */
    @JsonProperty("Value")
    private Object value;

    private SnsItem(Builder builder) {
        this.tag = builder.tag;
        this.value = builder.value;
    }

    public SnsItem() {
    }

    public SnsItem(String tag, Object value) {
        this.tag = tag;
        this.value = value;
    }

    public static Builder builder() {
        return new Builder();
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


    public static final class Builder {
        private String tag;
        private Object value;

        private Builder() {
        }

        public SnsItem build() {
            return new SnsItem(this);
        }

        public Builder tag(String tag) {
            this.tag = tag;
            return this;
        }

        public Builder value(Object value) {
            this.value = value;
            return this;
        }
    }
}
