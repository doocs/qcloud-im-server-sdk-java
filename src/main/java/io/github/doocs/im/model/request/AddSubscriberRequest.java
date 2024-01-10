package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 添加订阅者-请求参数
 *
 * @author hyh
 * @since 2024/01/10 15:11
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddSubscriberRequest extends GenericRequest implements Serializable {
    private static final long serialVersionUID = 1989326297259052718L;
    /**
     * 需要订阅的公众号 ID。使用创建时接口返回的 OfficialAccountUserID 字段
     */
    @JsonProperty("Official_Account")
    private String officialAccount;

    /**
     * 待添加的订阅者数组
     */
    @JsonProperty("SubscriberList")
    private List<OfficialAccountItem> subscriberList;

    public AddSubscriberRequest() {
    }

    public AddSubscriberRequest(String officialAccount, List<OfficialAccountItem> subscriberList) {
        this.officialAccount = officialAccount;
        this.subscriberList = subscriberList;
    }

    private AddSubscriberRequest(Builder builder) {
        this.officialAccount = builder.officialAccount;
        this.subscriberList = builder.subscriberList;
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

    public List<OfficialAccountItem> getSubscriberList() {
        return subscriberList;
    }

    public void setSubscriberList(List<OfficialAccountItem> subscriberList) {
        this.subscriberList = subscriberList;
    }


    public static final class Builder {
        private String officialAccount;
        private List<OfficialAccountItem> subscriberList;

        private Builder() {
        }

        public AddSubscriberRequest build() {
            return new AddSubscriberRequest(this);
        }

        public Builder officialAccount(String officialAccount) {
            this.officialAccount = officialAccount;
            return this;
        }

        public Builder subscriberList(List<OfficialAccountItem> subscriberList) {
            this.subscriberList = subscriberList;
            return this;
        }
    }
}
