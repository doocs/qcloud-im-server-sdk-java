package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 云端审核删除敏感词-请求参数
 *
 * @author bingo
 * @since 2023/7/26 10:25
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteCloudAuditKeywordsRequest extends GenericRequest implements Serializable {
    private static final long serialVersionUID = -8497240089725178729L;

    /**
     * 应用 ID
     */
    @JsonProperty("SdkAppId")
    private Integer sdkAppId;

    /**
     * 操作的词库 ID。
     */
    @JsonProperty("LibID")
    private String libId;

    /**
     * 待删除的敏感词数组,一次请求最多支持删10个敏感词。
     */
    @JsonProperty("Keywords")
    private List<String> keywords;

    public DeleteCloudAuditKeywordsRequest() {
    }

    public DeleteCloudAuditKeywordsRequest(Integer sdkAppId, String libId, List<String> keywords) {
        this.sdkAppId = sdkAppId;
        this.libId = libId;
        this.keywords = keywords;
    }

    private DeleteCloudAuditKeywordsRequest(Builder builder) {
        this.sdkAppId = builder.sdkAppId;
        this.libId = builder.libId;
        this.keywords = builder.keywords;
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

    public String getLibId() {
        return libId;
    }

    public void setLibId(String libId) {
        this.libId = libId;
    }

    public List<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }


    public static final class Builder {
        private Integer sdkAppId;
        private String libId;
        private List<String> keywords;

        private Builder() {
        }

        public DeleteCloudAuditKeywordsRequest build() {
            return new DeleteCloudAuditKeywordsRequest(this);
        }

        public Builder sdkAppId(Integer sdkAppId) {
            this.sdkAppId = sdkAppId;
            return this;
        }

        public Builder libId(String libId) {
            this.libId = libId;
            return this;
        }

        public Builder keywords(List<String> keywords) {
            this.keywords = keywords;
            return this;
        }
    }
}
