package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 获取公众号的订阅成员资料-请求参数
 *
 * @author hyh
 * @since 2024/01/10 11:20
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetSubscriberInfoRequest extends GenericRequest implements Serializable {
    private static final long serialVersionUID = -1051719195312598750L;
    /**
     * 需要获取的公众号 ID。使用创建时接口返回的 OfficialAccountUserID 字段
     */
    @JsonProperty("Official_Account")
    private String officialAccount;

    /**
     * 一次最多获取多少个成员的资料，不得超过200。如果不填，则获取群内全部成员的信息
     */
    @JsonProperty("Limit")
    private Integer limit;

    /**
     * 上一次拉取到的订阅者位置，首次调用填写""，续拉使用返回中的 Next 值
     */
    @JsonProperty("Next")
    private String next;

    public GetSubscriberInfoRequest() {
    }

    public GetSubscriberInfoRequest(String officialAccount, String next) {
        this.officialAccount = officialAccount;
        this.next = next;
    }

    public GetSubscriberInfoRequest(String officialAccount, Integer limit, String next) {
        this.officialAccount = officialAccount;
        this.limit = limit;
        this.next = next;
    }

    private GetSubscriberInfoRequest(Builder builder) {
        this.officialAccount = builder.officialAccount;
        this.limit = builder.limit;
        this.next = builder.next;
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

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public static final class Builder {
        private String officialAccount;
        private Integer limit;
        private String next;

        private Builder() {
        }

        public GetSubscriberInfoRequest build() {
            return new GetSubscriberInfoRequest(this);
        }

        public Builder officialAccount(String officialAccount) {
            this.officialAccount = officialAccount;
            return this;
        }

        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public Builder next(String next) {
            this.next = next;
            return this;
        }
    }
}
