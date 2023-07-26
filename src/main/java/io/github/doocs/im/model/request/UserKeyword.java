package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * @author bingo
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserKeyword implements Serializable {
    private static final long serialVersionUID = 599748749707035470L;

    /**
     * 敏感词内容。
     */
    @JsonProperty("Content")
    private String content;

    /**
     * 敏感词分类
     * {@link io.github.doocs.im.constant.ContentModerationLabel}
     */
    @JsonProperty("Label")
    private String label;

    public UserKeyword() {
    }

    public UserKeyword(String content, String label) {
        this.content = content;
        this.label = label;
    }

    private UserKeyword(Builder builder) {
        this.content = builder.content;
        this.label = builder.label;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }


    public static final class Builder {
        private String content;
        private String label;

        private Builder() {
        }

        public UserKeyword build() {
            return new UserKeyword(this);
        }

        public Builder content(String content) {
            this.content = content;
            return this;
        }

        public Builder label(String label) {
            this.label = label;
            return this;
        }
    }
}
