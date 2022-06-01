package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 文件资源
 *
 * @author bingo
 * @since 2022/6/1 17:42
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RawUrlItem {
    /**
     * 同批次查询的资源 ID
     */
    @JsonProperty("ResourceID")
    private Integer resourceId;

    /**
     * 同批次查询的文件 URL
     */
    @JsonProperty("RawURL")
    private String rawUrl;

    public RawUrlItem() {
    }

    public RawUrlItem(Integer resourceId, String rawUrl) {
        this.resourceId = resourceId;
        this.rawUrl = rawUrl;
    }

    private RawUrlItem(Builder builder) {
        this.resourceId = builder.resourceId;
        this.rawUrl = builder.rawUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public Integer getResourceId() {
        return resourceId;
    }

    public void setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
    }

    public String getRawUrl() {
        return rawUrl;
    }

    public void setRawUrl(String rawUrl) {
        this.rawUrl = rawUrl;
    }


    public static final class Builder {
        private Integer resourceId;
        private String rawUrl;

        private Builder() {
        }

        public RawUrlItem build() {
            return new RawUrlItem(this);
        }

        public Builder resourceId(Integer resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public Builder rawUrl(String rawUrl) {
            this.rawUrl = rawUrl;
            return this;
        }
    }
}
