package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 聊天文件解封-请求参数
 *
 * @author bingo
 * @since 2022/6/1 17:17
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AllowBannedObjectRequest extends GenericRequest {
    /**
     * 文件 URL，可从 IM 富媒体消息的 URL 字段获取
     */
    @JsonProperty("RawURL")
    private String rawUrl;

    public AllowBannedObjectRequest() {
    }

    public AllowBannedObjectRequest(String rawUrl) {
        this.rawUrl = rawUrl;
    }

    private AllowBannedObjectRequest(Builder builder) {
        this.rawUrl = builder.rawUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getRawUrl() {
        return rawUrl;
    }

    public void setRawUrl(String rawUrl) {
        this.rawUrl = rawUrl;
    }


    public static final class Builder {
        private String rawUrl;

        private Builder() {
        }

        public AllowBannedObjectRequest build() {
            return new AllowBannedObjectRequest(this);
        }

        public Builder rawUrl(String rawUrl) {
            this.rawUrl = rawUrl;
            return this;
        }
    }
}
