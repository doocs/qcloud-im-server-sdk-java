package io.github.doocs.im.model.request;

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

    private CustomItem(Builder builder) {
        this.tag = builder.tag;
        this.value = builder.value;
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

        public CustomItem build() {
            return new CustomItem(this);
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
