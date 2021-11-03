package io.github.doocs.im.model.group;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author bingo
 * @since 2021/10/31 20:57
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AppDefinedDataItem {
    @JsonProperty("Key")
    private String key;

    @JsonProperty("Value")
    private Object value;

    public AppDefinedDataItem() {
    }

    public AppDefinedDataItem(String key, Object value) {
        this.key = key;
        this.value = value;
    }

    private AppDefinedDataItem(Builder builder) {
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


    @Override
    public String toString() {
        return "AppDefinedDataItem{" +
                "key='" + key + '\'' +
                ", value=" + value +
                '}';
    }

    public static final class Builder {
        private String key;
        private Object value;

        private Builder() {
        }

        public AppDefinedDataItem build() {
            return new AppDefinedDataItem(this);
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
