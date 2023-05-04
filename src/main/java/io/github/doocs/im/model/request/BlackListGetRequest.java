package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 拉取黑名单-请求参数
 *
 * @author hyh
 * @since 2021/07/31 15:27
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BlackListGetRequest extends GenericRequest implements Serializable {
    private static final long serialVersionUID = -7362383181141861772L;
    /**
     * 需要拉取该 UserID 的黑名单
     */
    @JsonProperty("From_Account")
    private String fromAccount;

    /**
     * 拉取的起始位置
     */
    @JsonProperty("StartIndex")
    private Integer startIndex;

    /**
     * 每页最多拉取的黑名单数
     */
    @JsonProperty("MaxLimited")
    private Integer maxLimited;

    /**
     * 上一次拉黑名单时后台返回给客户端的 Seq，初次拉取时为0；（Rest API 接口拉取填 0 即可）
     */
    @JsonProperty("LastSequence")
    private Integer lastSequence;

    public BlackListGetRequest() {
    }

    public BlackListGetRequest(String fromAccount, Integer startIndex, Integer maxLimited, Integer lastSequence) {
        this.fromAccount = fromAccount;
        this.startIndex = startIndex;
        this.maxLimited = maxLimited;
        this.lastSequence = lastSequence;
    }

    private BlackListGetRequest(Builder builder) {
        this.fromAccount = builder.fromAccount;
        this.startIndex = builder.startIndex;
        this.maxLimited = builder.maxLimited;
        this.lastSequence = builder.lastSequence;
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

    public Integer getMaxLimited() {
        return maxLimited;
    }

    public void setMaxLimited(Integer maxLimited) {
        this.maxLimited = maxLimited;
    }

    public Integer getLastSequence() {
        return lastSequence;
    }

    public void setLastSequence(Integer lastSequence) {
        this.lastSequence = lastSequence;
    }


    public static final class Builder {
        private String fromAccount;
        private Integer startIndex;
        private Integer maxLimited;
        private Integer lastSequence;

        private Builder() {
        }

        public BlackListGetRequest build() {
            return new BlackListGetRequest(this);
        }

        public Builder fromAccount(String fromAccount) {
            this.fromAccount = fromAccount;
            return this;
        }

        public Builder startIndex(Integer startIndex) {
            this.startIndex = startIndex;
            return this;
        }

        public Builder maxLimited(Integer maxLimited) {
            this.maxLimited = maxLimited;
            return this;
        }

        public Builder lastSequence(Integer lastSequence) {
            this.lastSequence = lastSequence;
            return this;
        }
    }
}
