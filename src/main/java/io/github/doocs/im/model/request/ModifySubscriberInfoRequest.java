package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 获取订阅的公众号列表-请求参数
 *
 * @author hyh
 * @since 2024/01/10 15:37
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModifySubscriberInfoRequest extends GenericRequest implements Serializable {
    private static final long serialVersionUID = 8412751534682901942L;
    /**
     * 需要修改的公众号 ID。 使用创建时接口返回的 OfficialAccountUserID 字段
     */
    @JsonProperty("Official_Account")
    private String officialAccount;

    /**
     * 需要修改信息的订阅者用户 ID
     */
    @JsonProperty("Subscriber_Account")
    private String subscriberAccount;

    /**
     * 订阅者的自定义字段，应用层可以使用此字段实现一些特殊的功能需求
     */
    @JsonProperty("CustomString")
    private String customString;

    public ModifySubscriberInfoRequest() {
    }

    public ModifySubscriberInfoRequest(String officialAccount, String subscriberAccount, String customString) {
        this.officialAccount = officialAccount;
        this.subscriberAccount = subscriberAccount;
        this.customString = customString;
    }

    private ModifySubscriberInfoRequest(Builder builder) {
        this.officialAccount = builder.officialAccount;
        this.subscriberAccount = builder.subscriberAccount;
        this.customString = builder.customString;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getOfficialAccount() {
        return officialAccount;
    }

    public void setOfficialAccount(String officialAccount) {
        this.officialAccount = officialAccount;
    }

    public String getSubscriberAccount() {
        return subscriberAccount;
    }

    public void setSubscriberAccount(String subscriberAccount) {
        this.subscriberAccount = subscriberAccount;
    }

    public String getCustomString() {
        return customString;
    }

    public void setCustomString(String customString) {
        this.customString = customString;
    }


    public static final class Builder {
        private String officialAccount;
        private String subscriberAccount;
        private String customString;

        private Builder() {
        }

        public ModifySubscriberInfoRequest build() {
            return new ModifySubscriberInfoRequest(this);
        }

        public Builder officialAccount(String officialAccount) {
            this.officialAccount = officialAccount;
            return this;
        }

        public Builder subscriberAccount(String subscriberAccount) {
            this.subscriberAccount = subscriberAccount;
            return this;
        }

        public Builder customString(String customString) {
            this.customString = customString;
            return this;
        }
    }
}
