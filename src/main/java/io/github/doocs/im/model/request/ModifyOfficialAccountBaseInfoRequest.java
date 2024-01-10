package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 修改公众号资料-请求参数
 *
 * @author hyh
 * @since 2024/1/9 22:14
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModifyOfficialAccountBaseInfoRequest extends GenericRequest implements Serializable {
    private static final long serialVersionUID = 268724526044842052L;

    /**
     * 需要修改的公众号ID. 使用创建时接口返回的 OfficialAccountUserID 字段
     */
    @JsonProperty("OfficialAccount")
    private String officialAccount;

    /**
     * 公众号的名称，最长 150 字节，使用 UTF-8 编码，1 个汉字占 3 个字节
     */
    @JsonProperty("Name")
    private String name;

    /**
     * 公众号简介，最长 400 字节，使用 UTF-8 编码，1 个汉字占 3 个字节
     */
    @JsonProperty("Introduction")
    private String introduction;

    /**
     * 公众号头像，最长 500 字节
     */
    @JsonProperty("FaceUrl")
    private String faceUrl;

    /**
     * 公众号所属的团体组织，最长 500 字节，使用 UTF-8 编码，1 个汉字占 3 个字节
     */
    @JsonProperty("Organization")
    private String organization;

    /**
     * 公众号的自定义字段，最长 3000 字节，应用层可以使用此字段来实现特殊场景的需求
     */
    @JsonProperty("CustomString")
    private String customString;

    /**
     * 一个公众号支持的最大可订阅人数。缺省时的默认值为 100000
     */
    @JsonProperty("MaxSubscriberNum")
    private Integer maxSubscriberNum;

    public ModifyOfficialAccountBaseInfoRequest() {
    }

    public ModifyOfficialAccountBaseInfoRequest(String officialAccount) {
        this.officialAccount = officialAccount;
    }

    public ModifyOfficialAccountBaseInfoRequest(String officialAccount, String name, String introduction,
                                                String faceUrl, String organization, String customString,
                                                Integer maxSubscriberNum) {
        this.officialAccount = officialAccount;
        this.name = name;
        this.introduction = introduction;
        this.faceUrl = faceUrl;
        this.organization = organization;
        this.customString = customString;
        this.maxSubscriberNum = maxSubscriberNum;
    }

    private ModifyOfficialAccountBaseInfoRequest(Builder builder) {
        this.officialAccount = builder.officialAccount;
        this.name = builder.name;
        this.introduction = builder.introduction;
        this.faceUrl = builder.faceUrl;
        this.organization = builder.organization;
        this.customString = builder.customString;
        this.maxSubscriberNum = builder.maxSubscriberNum;
    }

    public String getOfficialAccount() {
        return officialAccount;
    }

    public void setOfficialAccount(String officialAccount) {
        this.officialAccount = officialAccount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getFaceUrl() {
        return faceUrl;
    }

    public void setFaceUrl(String faceUrl) {
        this.faceUrl = faceUrl;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getCustomString() {
        return customString;
    }

    public void setCustomString(String customString) {
        this.customString = customString;
    }

    public Integer getMaxSubscriberNum() {
        return maxSubscriberNum;
    }

    public void setMaxSubscriberNum(Integer maxSubscriberNum) {
        this.maxSubscriberNum = maxSubscriberNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private String officialAccount;
        private String name;
        private String introduction;
        private String faceUrl;
        private String organization;
        private String customString;
        private Integer maxSubscriberNum;

        private Builder() {
        }

        public ModifyOfficialAccountBaseInfoRequest build() {
            return new ModifyOfficialAccountBaseInfoRequest(this);
        }

        public Builder officialAccount(String officialAccount) {
            this.officialAccount = officialAccount;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder introduction(String introduction) {
            this.introduction = introduction;
            return this;
        }

        public Builder faceUrl(String faceUrl) {
            this.faceUrl = faceUrl;
            return this;
        }

        public Builder organization(String organization) {
            this.organization = organization;
            return this;
        }

        public Builder customString(String customString) {
            this.customString = customString;
            return this;
        }

        public Builder maxSubscriberNum(Integer maxSubscriberNum) {
            this.maxSubscriberNum = maxSubscriberNum;
            return this;
        }
    }
}
