package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 云端审核获取敏感词-请求参数
 *
 * @author bingo
 * @since 2023/7/26 10:25
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetCloudAuditKeyWordsRequest extends GenericRequest implements Serializable {
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

    /**
     * 当前操作的词库 ID
     */
    @JsonProperty("LibID")
    private String libId;

    /**
     * 如果不为空，则返回对应模糊匹配敏感词；如果为空，则分页拉取相应敏感词。
     */
    @JsonProperty("Content")
    private String content;

    public GetCloudAuditKeyWordsRequest() {
    }

    public GetCloudAuditKeyWordsRequest(Integer sdkAppId, Integer offset, Integer limit, String libId) {
        this.sdkAppId = sdkAppId;
        this.offset = offset;
        this.limit = limit;
        this.libId = libId;
    }

    public GetCloudAuditKeyWordsRequest(Integer sdkAppId, Integer offset, Integer limit, String libId, String content) {
        this.sdkAppId = sdkAppId;
        this.offset = offset;
        this.limit = limit;
        this.libId = libId;
        this.content = content;
    }

    private GetCloudAuditKeyWordsRequest(Builder builder) {
        this.sdkAppId = builder.sdkAppId;
        this.offset = builder.offset;
        this.limit = builder.limit;
        this.libId = builder.libId;
        this.content = builder.content;
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

    public String getLibId() {
        return libId;
    }

    public void setLibId(String libId) {
        this.libId = libId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    public static final class Builder {
        private Integer sdkAppId;
        private Integer offset;
        private Integer limit;
        private String libId;
        private String content;

        private Builder() {
        }

        public GetCloudAuditKeyWordsRequest build() {
            return new GetCloudAuditKeyWordsRequest(this);
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

        public Builder libId(String libId) {
            this.libId = libId;
            return this;
        }

        public Builder content(String content) {
            this.content = content;
            return this;
        }
    }
}
