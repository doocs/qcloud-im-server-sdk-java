package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.doocs.im.model.response.GenericResult;

import java.io.Serializable;

/**
 * 获取订阅的公众号列表-请求参数
 *
 * @author hyh
 * @since 2024/01/10 15:40
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetSubscribedOfficialAccountListRequest extends GenericResult implements Serializable {
    private static final long serialVersionUID = 8734626094487771980L;
    /**
     * 需要修改信息的订阅者用户 ID
     */
    @JsonProperty("Subscriber_Account")
    private String subscriberAccount;

    /**
     * 单次拉取的公众号数目， 目前支持最大值为 200，不填则默认是 200
     */
    @JsonProperty("Limit")
    private Integer limit;

    /**
     * 从第多少个公众号开始拉取
     */
    @JsonProperty("Offset")
    private Integer offset;

    /**
     * 分别包含 OfficialAccountBaseInfoFilter 和 SelfInfoFilter 两个过滤器；
     * OfficialAccountBaseInfoFilter 表示需要拉取哪些公众号的基础信息字段，主要包括：
     * CreateTime 公众号的创建时间
     * Name 公众号名称
     * Owner_Account 公众号所属的用户
     * LastMsgTime 公众号内的最后一条消息时间
     * SubscriberNum 公众号目前的订阅者人数
     * Introduction 公众号简介
     * FaceUrl  公众号的头像Url
     * Organization 公众号的所在组织
     * CustomString 公众号维度的自定义字段
     * 如果不填，则拉取所有字段信息
     *
     * SelfInfoFilter 表示需要拉取订阅者自己的相关信息，主要包括：
     * SubscribeTime 订阅者订阅公众号的时间
     * CustomString 订阅者维度的自定义字段
     * 如果不填，则拉取所有字段信息
     */
    @JsonProperty("ResponseFilter")
    private ResponseFilter responseFilter;

    public GetSubscribedOfficialAccountListRequest() {
    }

    public GetSubscribedOfficialAccountListRequest(String subscriberAccount) {
        this.subscriberAccount = subscriberAccount;
    }

    public GetSubscribedOfficialAccountListRequest(String subscriberAccount, Integer limit, Integer offset, ResponseFilter responseFilter) {
        this.subscriberAccount = subscriberAccount;
        this.limit = limit;
        this.offset = offset;
        this.responseFilter = responseFilter;
    }

    private GetSubscribedOfficialAccountListRequest(Builder builder) {
        this.subscriberAccount = builder.subscriberAccount;
        this.limit = builder.limit;
        this.offset = builder.offset;
        this.responseFilter = builder.responseFilter;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getSubscriberAccount() {
        return subscriberAccount;
    }

    public void setSubscriberAccount(String subscriberAccount) {
        this.subscriberAccount = subscriberAccount;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ResponseFilter getResponseFilter() {
        return responseFilter;
    }

    public void setResponseFilter(ResponseFilter responseFilter) {
        this.responseFilter = responseFilter;
    }


    public static final class Builder {
        private String subscriberAccount;
        private Integer limit;
        private Integer offset;
        private ResponseFilter responseFilter;

        private Builder() {
        }

        public GetSubscribedOfficialAccountListRequest build() {
            return new GetSubscribedOfficialAccountListRequest(this);
        }

        public Builder subscriberAccount(String subscriberAccount) {
            this.subscriberAccount = subscriberAccount;
            return this;
        }

        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public Builder offset(Integer offset) {
            this.offset = offset;
            return this;
        }

        public Builder responseFilter(ResponseFilter responseFilter) {
            this.responseFilter = responseFilter;
            return this;
        }
    }
}
