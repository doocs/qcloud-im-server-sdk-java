package io.github.doocs.im.model.group;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 群自定义属性
 *
 * @author bingo
 * @since 2021/12/31 10:47
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GroupAttr implements Serializable {
    private static final long serialVersionUID = -8220038751545935481L;
    /**
     * key 为自定义属性的键
     */
    @JsonProperty("key")
    private String key;

    /**
     * value 为自定义属性的值
     */
    @JsonProperty("value")
    private String value;

    public GroupAttr() {
    }

    public GroupAttr(String key, String value) {
        this.key = key;
        this.value = value;
    }

    private GroupAttr(Builder builder) {
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

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


    public static final class Builder {
        private String key;
        private String value;

        private Builder() {
        }

        public GroupAttr build() {
            return new GroupAttr(this);
        }

        public Builder key(String key) {
            this.key = key;
            return this;
        }

        public Builder value(String value) {
            this.value = value;
            return this;
        }
    }
}
