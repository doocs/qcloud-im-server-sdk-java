package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 聊天文件封禁-请求参数
 *
 * @author bingo
 * @since 2022/6/1 17:10
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ForbidIllegalObjectRequest extends GenericRequest implements Serializable {
    private static final long serialVersionUID = -3958762234713986003L;
    /**
     * 文件 URL，可从 IM 富媒体消息的 URL 字段获取
     */
    @JsonProperty("RawURL")
    private String rawUrl;

    public ForbidIllegalObjectRequest() {
    }

    public ForbidIllegalObjectRequest(String rawUrl) {
        this.rawUrl = rawUrl;
    }

    private ForbidIllegalObjectRequest(Builder builder) {
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

        public ForbidIllegalObjectRequest build() {
            return new ForbidIllegalObjectRequest(this);
        }

        public Builder rawUrl(String rawUrl) {
            this.rawUrl = rawUrl;
            return this;
        }
    }
}
