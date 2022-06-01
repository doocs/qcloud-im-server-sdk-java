package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 聊天文件签名-请求参数
 *
 * @author bingo
 * @since 2022/6/1 17:41
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetCosSigRequest extends GenericRequest {
    /**
     * 批量查询的文件 URL，可从 IM 富媒体消息的 URL 字段获取
     */
    @JsonProperty("RawURLs")
    private List<RawUrlItem> rawUrls;

    public GetCosSigRequest() {
    }

    public GetCosSigRequest(List<RawUrlItem> rawUrls) {
        this.rawUrls = rawUrls;
    }

    private GetCosSigRequest(Builder builder) {
        this.rawUrls = builder.rawUrls;
    }

    public static Builder builder() {
        return new Builder();
    }

    public List<RawUrlItem> getRawUrls() {
        return rawUrls;
    }

    public void setRawUrls(List<RawUrlItem> rawUrls) {
        this.rawUrls = rawUrls;
    }


    public static final class Builder {
        private List<RawUrlItem> rawUrls;

        private Builder() {
        }

        public GetCosSigRequest build() {
            return new GetCosSigRequest(this);
        }

        public Builder rawUrls(List<RawUrlItem> rawUrls) {
            this.rawUrls = rawUrls;
            return this;
        }
    }
}
