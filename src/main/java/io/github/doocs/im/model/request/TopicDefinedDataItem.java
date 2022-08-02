package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 创建话题-请求参数
 *
 * @author bingo
 * @since 2022/8/2 10:24
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TopicDefinedDataItem {
    /**
     * 自定义的字段 Key
     */
    @JsonProperty("Key")
    private String key;

    /**
     * 自定义字段的值
     */
    @JsonProperty("Value")
    private Object value;

    public TopicDefinedDataItem() {
    }

    public TopicDefinedDataItem(String key, Object value) {
        this.key = key;
        this.value = value;
    }

    private TopicDefinedDataItem(Builder builder) {
        this.key = builder.key;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }


    public static final class Builder {
        private String key;
        private Object value;

        private Builder() {
        }

        public TopicDefinedDataItem build() {
            return new TopicDefinedDataItem(this);
        }

        public Builder key(String key) {
            this.key = key;
            return this;
        }

        public Builder value(Object value) {
            this.value = value;
            return this;
        }
    }
}
