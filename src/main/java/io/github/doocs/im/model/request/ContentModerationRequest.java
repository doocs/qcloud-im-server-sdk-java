package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 云端审核主动审核-请求参数
 *
 * @author bingo
 * @since 2023/7/26 10:25
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ContentModerationRequest extends GenericRequest implements Serializable {
    private static final long serialVersionUID = -5086605409044562844L;

    /**
     * 表明送审策略
     */
    @JsonProperty("AuditName")
    private String auditName;

    /**
     * 送审类型
     */
    @JsonProperty("ContentType")
    private String contentType;

    /**
     * 送审内容
     */
    @JsonProperty("Content")
    private String content;

    public ContentModerationRequest() {
    }

    public ContentModerationRequest(String auditName, String contentType, String content) {
        this.auditName = auditName;
        this.contentType = contentType;
        this.content = content;
    }

    private ContentModerationRequest(Builder builder) {
        this.auditName = builder.auditName;
        this.contentType = builder.contentType;
        this.content = builder.content;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getAuditName() {
        return auditName;
    }

    public void setAuditName(String auditName) {
        this.auditName = auditName;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    public static final class Builder {
        private String auditName;
        private String contentType;
        private String content;

        private Builder() {
        }

        public ContentModerationRequest build() {
            return new ContentModerationRequest(this);
        }

        public Builder auditName(String auditName) {
            this.auditName = auditName;
            return this;
        }

        public Builder contentType(String contentType) {
            this.contentType = contentType;
            return this;
        }

        public Builder content(String content) {
            this.content = content;
            return this;
        }
    }
}
