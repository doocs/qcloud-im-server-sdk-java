package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 云端审核添加敏感词-请求参数
 *
 * @author bingo
 * @since 2023/7/26 10:25
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddCloudAuditKeywordsRequest extends GenericRequest implements Serializable {
    private static final long serialVersionUID = -7839186035027719698L;

    /**
     * 应用 ID
     */
    @JsonProperty("SdkAppId")
    private Integer sdkAppId;

    /**
     * 当前操作的词库 ID
     */
    @JsonProperty("LibID")
    private String libId;

    /**
     * 待添加的敏感词数组。
     */
    @JsonProperty("UserKeywords")
    private List<UserKeyword> userKeywords;

    public AddCloudAuditKeywordsRequest() {
    }

    public AddCloudAuditKeywordsRequest(Integer sdkAppId, String libId, List<UserKeyword> userKeywords) {
        this.sdkAppId = sdkAppId;
        this.libId = libId;
        this.userKeywords = userKeywords;
    }

    private AddCloudAuditKeywordsRequest(Builder builder) {
        this.sdkAppId = builder.sdkAppId;
        this.libId = builder.libId;
        this.userKeywords = builder.userKeywords;
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

    public List<UserKeyword> getUserKeywords() {
        return userKeywords;
    }

    public void setUserKeywords(List<UserKeyword> userKeywords) {
        this.userKeywords = userKeywords;
    }


    public static final class Builder {
        private Integer sdkAppId;
        private String libId;
        private List<UserKeyword> userKeywords;

        private Builder() {
        }

        public AddCloudAuditKeywordsRequest build() {
            return new AddCloudAuditKeywordsRequest(this);
        }

        public Builder sdkAppId(Integer sdkAppId) {
            this.sdkAppId = sdkAppId;
            return this;
        }

        public Builder libId(String libId) {
            this.libId = libId;
            return this;
        }

        public Builder userKeywords(List<UserKeyword> userKeywords) {
            this.userKeywords = userKeywords;
            return this;
        }
    }
}
