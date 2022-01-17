package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 拉取好友-请求参数
 *
 * @author hyh
 * @since 2021/07/31 14:34
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FriendGetRequest extends GenericRequest {
    /**
     * 指定要拉取好友数据的用户的 UserID
     */
    @JsonProperty("From_Account")
    private String fromAccount;

    /**
     * 分页的起始位置
     */
    @JsonProperty("StartIndex")
    private Integer startIndex;

    /**
     * 上次拉好友数据时返回的 StandardSequence，如果 StandardSequence 字段的值与后台一致，后台不会返回标配好友数据
     */
    @JsonProperty("StandardSequence")
    private Integer standardSequence;

    /**
     * 上次拉好友数据时返回的 CustomSequence，如果 CustomSequence 字段的值与后台一致，后台不会返回自定义好友数据
     */
    @JsonProperty("CustomSequence")
    private Integer customSequence;

    public FriendGetRequest() {
    }

    public FriendGetRequest(String fromAccount, Integer startIndex) {
        this.fromAccount = fromAccount;
        this.startIndex = startIndex;
    }

    public FriendGetRequest(String fromAccount, Integer startIndex, Integer standardSequence, Integer customSequence) {
        this.fromAccount = fromAccount;
        this.startIndex = startIndex;
        this.standardSequence = standardSequence;
        this.customSequence = customSequence;
    }

    private FriendGetRequest(Builder builder) {
        this.fromAccount = builder.fromAccount;
        this.startIndex = builder.startIndex;
        this.standardSequence = builder.standardSequence;
        this.customSequence = builder.customSequence;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
    }

    public Integer getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }

    public Integer getStandardSequence() {
        return standardSequence;
    }

    public void setStandardSequence(Integer standardSequence) {
        this.standardSequence = standardSequence;
    }

    public Integer getCustomSequence() {
        return customSequence;
    }

    public void setCustomSequence(Integer customSequence) {
        this.customSequence = customSequence;
    }


    public static final class Builder {
        private String fromAccount;
        private Integer startIndex;
        private Integer standardSequence;
        private Integer customSequence;

        private Builder() {
        }

        public FriendGetRequest build() {
            return new FriendGetRequest(this);
        }

        public Builder fromAccount(String fromAccount) {
            this.fromAccount = fromAccount;
            return this;
        }

        public Builder startIndex(Integer startIndex) {
            this.startIndex = startIndex;
            return this;
        }

        public Builder standardSequence(Integer standardSequence) {
            this.standardSequence = standardSequence;
            return this;
        }

        public Builder customSequence(Integer customSequence) {
            this.customSequence = customSequence;
            return this;
        }
    }
}
