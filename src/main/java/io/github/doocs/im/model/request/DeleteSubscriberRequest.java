package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 删除订阅者-请求参数
 *
 * @author hyh
 * @since 2024/01/10 15:28
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteSubscriberRequest extends GenericRequest implements Serializable {
    private static final long serialVersionUID = -4604299710168815132L;
    /**
     * 需要订阅的公众号 ID。使用创建时接口返回的 OfficialAccountUserID 字段
     */
    @JsonProperty("Official_Account")
    private String officialAccount;

    /**
     * 待删除的的订阅者 UserID 集合
     */
    @JsonProperty("SubscriberToDel_Account")
    private List<String> subscriberToDelAccount;

    public DeleteSubscriberRequest() {
    }

    public DeleteSubscriberRequest(String officialAccount, List<String> subscriberToDelAccount) {
        this.officialAccount = officialAccount;
        this.subscriberToDelAccount = subscriberToDelAccount;
    }

    private DeleteSubscriberRequest(Builder builder) {
        this.officialAccount = builder.officialAccount;
        this.subscriberToDelAccount = builder.subscriberToDelAccount;
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

    public List<String> getSubscriberToDelAccount() {
        return subscriberToDelAccount;
    }

    public void setSubscriberToDelAccount(List<String> subscriberToDelAccount) {
        this.subscriberToDelAccount = subscriberToDelAccount;
    }

    public static final class Builder {
        private String officialAccount;
        private List<String> subscriberToDelAccount;

        private Builder() {
        }

        public DeleteSubscriberRequest build() {
            return new DeleteSubscriberRequest(this);
        }

        public Builder officialAccount(String officialAccount) {
            this.officialAccount = officialAccount;
            return this;
        }

        public Builder subscriberToDelAccount(List<String> subscriberToDelAccount) {
            this.subscriberToDelAccount = subscriberToDelAccount;
            return this;
        }
    }
}
