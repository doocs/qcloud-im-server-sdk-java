package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author hyh
 * @since 2021/07/29 15:06
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProfileItem {
    @JsonProperty("Tag")
    private String tag;

    @JsonProperty("Value")
    private String value;

    public ProfileItem() {
    }

    public ProfileItem(String tag, String value) {
        this.tag = tag;
        this.value = value;
    }

    private ProfileItem(Builder builder) {
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

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


    public static final class Builder {
        private String tag;
        private String value;

        private Builder() {
        }

        public ProfileItem build() {
            return new ProfileItem(this);
        }

        public Builder tag(String tag) {
            this.tag = tag;
            return this;
        }

        public Builder value(String value) {
            this.value = value;
            return this;
        }
    }
}
