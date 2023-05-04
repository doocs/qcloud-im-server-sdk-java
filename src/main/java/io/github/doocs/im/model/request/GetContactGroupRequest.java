package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 拉取会话分组标记数据-请求参数
 *
 * @author bingo
 * @since 2023/3/16 15:31
 */
public class GetContactGroupRequest extends GenericRequest implements Serializable {
    private static final long serialVersionUID = 6482055291416088303L;
    /**
     * 请求方uid
     */
    @JsonProperty("From_Account")
    private String fromAccount;

    /**
     * 当前分页拉取的起始索引，首次拉取填0，后续填上次返回的NextStartIndex
     */
    @JsonProperty("StartIndex")
    private Integer startIndex;

    public GetContactGroupRequest() {
    }

    public GetContactGroupRequest(String fromAccount, Integer startIndex) {
        this.fromAccount = fromAccount;
        this.startIndex = startIndex;
    }

    private GetContactGroupRequest(Builder builder) {
        this.fromAccount = builder.fromAccount;
        this.startIndex = builder.startIndex;
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


    public static final class Builder {
        private String fromAccount;
        private Integer startIndex;

        private Builder() {
        }

        public GetContactGroupRequest build() {
            return new GetContactGroupRequest(this);
        }

        public Builder fromAccount(String fromAccount) {
            this.fromAccount = fromAccount;
            return this;
        }

        public Builder startIndex(Integer startIndex) {
            this.startIndex = startIndex;
            return this;
        }
    }
}
