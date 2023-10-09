package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 查询全局禁言-请求参数
 *
 * @author xy
 * @since 2021/07/31 11:48
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetNoSpeakingRequest extends GenericRequest implements Serializable {
    private static final long serialVersionUID = 7998575166889463951L;
    /**
     * 查询禁言信息的账号
     */
    @JsonProperty("Get_Account")
    private String getAccount;

    public GetNoSpeakingRequest() {
    }

    public GetNoSpeakingRequest(String getAccount) {
        this.getAccount = getAccount;
    }

    private GetNoSpeakingRequest(Builder builder) {
        this.getAccount = builder.getAccount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getGetAccount() {
        return getAccount;
    }

    public void setGetAccount(String getAccount) {
        this.getAccount = getAccount;
    }


    public static final class Builder {
        private String getAccount;

        private Builder() {
        }

        public GetNoSpeakingRequest build() {
            return new GetNoSpeakingRequest(this);
        }

        public Builder getAccount(String getAccount) {
            this.getAccount = getAccount;
            return this;
        }
    }
}
