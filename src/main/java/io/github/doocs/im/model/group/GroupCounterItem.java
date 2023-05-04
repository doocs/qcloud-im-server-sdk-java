package io.github.doocs.im.model.group;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 群计数器
 *
 * @author bingo
 * @since 2023/2/6 11:33
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GroupCounterItem implements Serializable {
    private static final long serialVersionUID = -8147807519216351803L;
    /**
     * 群计数器Key
     */
    @JsonProperty("Key")
    private String key;

    /**
     * 群计数器Value
     */
    @JsonProperty("Value")
    private Long value;

    public GroupCounterItem() {
    }

    public GroupCounterItem(String key, Long value) {
        this.key = key;
        this.value = value;
    }

    private GroupCounterItem(Builder builder) {
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

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }


    public static final class Builder {
        private String key;
        private Long value;

        private Builder() {
        }

        public GroupCounterItem build() {
            return new GroupCounterItem(this);
        }

        public Builder key(String key) {
            this.key = key;
            return this;
        }

        public Builder value(Long value) {
            this.value = value;
            return this;
        }
    }
}
