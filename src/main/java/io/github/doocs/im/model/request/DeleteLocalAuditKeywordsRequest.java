package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 本地审核添加敏感词-请求参数
 *
 * @author bingo
 * @since 2023/7/26 10:25
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteLocalAuditKeywordsRequest extends GenericRequest implements Serializable {
    private static final long serialVersionUID = -3564467427878293901L;

    /**
     * 应用 ID
     */
    @JsonProperty("SdkAppId")
    private Integer sdkAppId;

    /**
     * 待删除的敏感词，一次请求最多支持10个敏感词添加
     */
    @JsonProperty("LocalAuditWords")
    private List<LocalAuditWord> localAuditWords;

    public DeleteLocalAuditKeywordsRequest() {
    }

    public DeleteLocalAuditKeywordsRequest(Integer sdkAppId, List<LocalAuditWord> localAuditWords) {
        this.sdkAppId = sdkAppId;
        this.localAuditWords = localAuditWords;
    }

    private DeleteLocalAuditKeywordsRequest(Builder builder) {
        this.sdkAppId = builder.sdkAppId;
        this.localAuditWords = builder.localAuditWords;
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

    public List<LocalAuditWord> getLocalAuditWords() {
        return localAuditWords;
    }

    public void setLocalAuditWords(List<LocalAuditWord> localAuditWords) {
        this.localAuditWords = localAuditWords;
    }


    public static final class Builder {
        private Integer sdkAppId;
        private List<LocalAuditWord> localAuditWords;

        private Builder() {
        }

        public DeleteLocalAuditKeywordsRequest build() {
            return new DeleteLocalAuditKeywordsRequest(this);
        }

        public Builder sdkAppId(Integer sdkAppId) {
            this.sdkAppId = sdkAppId;
            return this;
        }

        public Builder localAuditWords(List<LocalAuditWord> localAuditWords) {
            this.localAuditWords = localAuditWords;
            return this;
        }
    }
}
