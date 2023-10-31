package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 云端审核主动批量审核内容项
 *
 * @author bingo
 * @since 2023/10/31 10:25
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuditContentItem implements Serializable {
    private static final long serialVersionUID = -4862840041361119218L;

    /**
     * 必填
     * 内容 ID，数组里各个成员，不能重复的 ContentId。
     */
    @JsonProperty("ContentId")
    private Integer contentId;

    /**
     * 必填
     * 送审类型，批量审核接口里，限制取值：Text/Image，音视频送审请参见 主动审核接口
     * {@link io.github.doocs.im.constant.AuditContentType}
     */
    @JsonProperty("ContentType")
    private String contentType;

    /**
     * 必填
     * 送审内容，最大限制8KB，当审核文件时，填对应 URL。其中图片审核最大不超过5MB。
     */
    @JsonProperty("Content")
    private String content;

    public AuditContentItem() {
    }

    public AuditContentItem(Integer contentId, String contentType, String content) {
        this.contentId = contentId;
        this.contentType = contentType;
        this.content = content;
    }

    private AuditContentItem(Builder builder) {
        this.contentId = builder.contentId;
        this.contentType = builder.contentType;
        this.content = builder.content;
    }

    public static Builder builder() {
        return new Builder();
    }

    public Integer getContentId() {
        return contentId;
    }

    public void setContentId(Integer contentId) {
        this.contentId = contentId;
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
        private Integer contentId;
        private String contentType;
        private String content;

        private Builder() {
        }

        public AuditContentItem build() {
            return new AuditContentItem(this);
        }

        public Builder contentId(Integer contentId) {
            this.contentId = contentId;
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
