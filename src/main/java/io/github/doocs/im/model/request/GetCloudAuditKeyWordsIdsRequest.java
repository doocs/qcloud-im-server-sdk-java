package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 云端审核获取词库列表-请求参数
 *
 * @author bingo
 * @since 2023/7/26 10:25
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetCloudAuditKeyWordsIdsRequest extends GenericRequest implements Serializable {
    private static final long serialVersionUID = -3005116926291576286L;

    /**
     * 应用 ID
     */
    @JsonProperty("SdkAppId")
    private Integer sdkAppId;

    /**
     * 偏移
     */
    @JsonProperty("Offset")
    private Integer offset;

    /**
     * 本次最大请求数量，最多不超过100个
     */
    @JsonProperty("Limit")
    private Integer limit;

    public GetCloudAuditKeyWordsIdsRequest() {
    }

    public GetCloudAuditKeyWordsIdsRequest(Integer sdkAppId, Integer offset, Integer limit) {
        this.sdkAppId = sdkAppId;
        this.offset = offset;
        this.limit = limit;
    }

    private GetCloudAuditKeyWordsIdsRequest(Builder builder) {
        this.sdkAppId = builder.sdkAppId;
        this.offset = builder.offset;
        this.limit = builder.limit;
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


    public static final class Builder {
        private Integer sdkAppId;
        private Integer offset;
        private Integer limit;

        private Builder() {
        }

        public GetCloudAuditKeyWordsIdsRequest build() {
            return new GetCloudAuditKeyWordsIdsRequest(this);
        }

        public Builder sdkAppId(Integer sdkAppId) {
            this.sdkAppId = sdkAppId;
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
    }
}
