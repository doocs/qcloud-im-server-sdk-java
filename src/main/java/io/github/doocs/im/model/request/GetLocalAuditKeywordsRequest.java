package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 本地审核获取敏感词-请求参数
 *
 * @author bingo
 * @since 2022/11/2 16:32
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetLocalAuditKeywordsRequest extends GenericRequest implements Serializable {
    private static final long serialVersionUID = -8567314151110757583L;

    /**
     * 应用 ID
     */
    @JsonProperty("SdkAppId")
    private Integer sdkAppId;

    /**
     * 脏词类型
     */
    @JsonProperty("FilterType")
    private Integer filterType;

    /**
     * 偏移
     */
    @JsonProperty("Offset")
    private Integer offset;

    /**
     * 本次最大请求数量，最多不超过100个。
     */
    @JsonProperty("Limit")
    private Integer limit;

    /**
     * 如果不为空，则返回对应模糊匹配敏感词；如果为空，则分页拉取相应敏感词。
     */
    @JsonProperty("Keyword")
    private String keyword;

    public GetLocalAuditKeywordsRequest() {
    }

    public GetLocalAuditKeywordsRequest(Integer sdkAppId, Integer filterType, Integer offset, Integer limit) {
        this.sdkAppId = sdkAppId;
        this.filterType = filterType;
        this.offset = offset;
        this.limit = limit;
    }

    public GetLocalAuditKeywordsRequest(Integer sdkAppId, Integer filterType, Integer offset, Integer limit, String keyword) {
        this.sdkAppId = sdkAppId;
        this.filterType = filterType;
        this.offset = offset;
        this.limit = limit;
        this.keyword = keyword;
    }

    private GetLocalAuditKeywordsRequest(Builder builder) {
        this.sdkAppId = builder.sdkAppId;
        this.filterType = builder.filterType;
        this.offset = builder.offset;
        this.limit = builder.limit;
        this.keyword = builder.keyword;
    }

    public static Builder builder() {
        return new Builder();
    }

    public Integer getSdkAppId() {
        return sdkAppId;
    }

    public void setSdkAppId(Integer sdkAppId) {
        this.sdkAppId = sdkAppId;
    }

    public Integer getFilterType() {
        return filterType;
    }

    public void setFilterType(Integer filterType) {
        this.filterType = filterType;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }


    public static final class Builder {
        private Integer sdkAppId;
        private Integer filterType;
        private Integer offset;
        private Integer limit;
        private String keyword;

        private Builder() {
        }

        public GetLocalAuditKeywordsRequest build() {
            return new GetLocalAuditKeywordsRequest(this);
        }

        public Builder sdkAppId(Integer sdkAppId) {
            this.sdkAppId = sdkAppId;
            return this;
        }

        public Builder filterType(Integer filterType) {
            this.filterType = filterType;
            return this;
        }

        public Builder offset(Integer offset) {
            this.offset = offset;
            return this;
        }

        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public Builder keyword(String keyword) {
            this.keyword = keyword;
            return this;
        }
    }
}
