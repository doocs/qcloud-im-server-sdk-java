package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 创建公众号-请求参数
 *
 * @author hyh
 * @since 2024/1/9 21:54
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateOfficialAccountRequest extends GenericRequest implements Serializable {
    private static final long serialVersionUID = -4787413705241959236L;

    /**
     * 公众号所属的账号 ID（需是 已导入 的账号），代表公众号的拥有者
     */
    @JsonProperty("Owner_Account")
    private String ownerAccount;

    /**
     * 公众号的 ID。为了使公众号 ID 更加简单，便于记忆传播，腾讯云支持 App 在通过 REST API 创建公众号时 自定义公众号 ID。
     * 若不填，则系统会默认生成一个公众号 ID 返回
     */
    @JsonProperty("OfficialAccountUserID")
    private String officialAccountUserID;

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
     * 公众号头像，最长500字节
     */
    @JsonProperty("FaceUrl")
    private String faceUrl;

    /**
     * 一个公众号的最大可订阅人数，缺省时的默认值为 100000
     */
    @JsonProperty("MaxSubscriberNum")
    private Integer maxSubscriberNum;

    /**
     * 公众号所属的团体组织，最长 500 字节，使用 UTF-8 编码，1 个汉字占 3 个字节
     */
    @JsonProperty("Organization")
    private String organization;

    /**
     * 公众号的自定义字段，最长 3000 字节，业务层可以使用此字段来实现特殊场景的需求
     */
    @JsonProperty("CustomString")
    private String customString;

    public CreateOfficialAccountRequest() {
    }

    public CreateOfficialAccountRequest(String ownerAccount, String name) {
        this.ownerAccount = ownerAccount;
        this.name = name;
    }

    public CreateOfficialAccountRequest(String ownerAccount, String officialAccountUserID, String name,
                                        String introduction, String faceUrl, Integer maxSubscriberNum,
                                        String organization, String customString) {
        this.ownerAccount = ownerAccount;
        this.officialAccountUserID = officialAccountUserID;
        this.name = name;
        this.introduction = introduction;
        this.faceUrl = faceUrl;
        this.maxSubscriberNum = maxSubscriberNum;
        this.organization = organization;
        this.customString = customString;
    }

    private CreateOfficialAccountRequest(Builder builder) {
        this.ownerAccount = builder.ownerAccount;
        this.officialAccountUserID = builder.officialAccountUserID;
        this.name = builder.name;
        this.introduction = builder.introduction;
        this.faceUrl = builder.faceUrl;
        this.maxSubscriberNum = builder.maxSubscriberNum;
        this.organization = builder.organization;
        this.customString = builder.customString;
    }

    public String getOwnerAccount() {
        return ownerAccount;
    }

    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

    public String getOfficialAccountUserID() {
        return officialAccountUserID;
    }

    public void setOfficialAccountUserID(String officialAccountUserID) {
        this.officialAccountUserID = officialAccountUserID;
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

    public Integer getMaxSubscriberNum() {
        return maxSubscriberNum;
    }

    public void setMaxSubscriberNum(Integer maxSubscriberNum) {
        this.maxSubscriberNum = maxSubscriberNum;
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

    public static Builder builder() {
        return new Builder();
    }


    public static final class Builder {
        private String ownerAccount;
        private String officialAccountUserID;
        private String name;
        private String introduction;
        private String faceUrl;
        private Integer maxSubscriberNum;
        private String organization;
        private String customString;

        private Builder() {
        }

        public CreateOfficialAccountRequest build() {
            return new CreateOfficialAccountRequest(this);
        }

        public Builder ownerAccount(String ownerAccount) {
            this.ownerAccount = ownerAccount;
            return this;
        }

        public Builder officialAccountUserID(String officialAccountUserID) {
            this.officialAccountUserID = officialAccountUserID;
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

        public Builder maxSubscriberNum(Integer maxSubscriberNum) {
            this.maxSubscriberNum = maxSubscriberNum;
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
    }
}
