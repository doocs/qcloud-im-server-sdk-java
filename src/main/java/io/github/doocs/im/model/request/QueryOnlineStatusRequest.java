package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 查询帐号在线状态-请求参数
 *
 * @author bingo
 * @since 2021/7/30 17:35
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryOnlineStatusRequest extends GenericRequest {
    /**
     * 是否需要返回详细的登录平台信息。0表示不需要，1表示需要
     */
    @JsonProperty("IsNeedDetail")
    private Integer isNeedDetail;

    /**
     * 需要查询这些 UserID 的登录状态，一次最多查询500个 UserID 的状态
     */
    @JsonProperty("To_Account")
    private List<String> toAccount;

    public QueryOnlineStatusRequest() {
    }

    public QueryOnlineStatusRequest(List<String> toAccount) {
        this.toAccount = toAccount;
    }

    public QueryOnlineStatusRequest(Integer isNeedDetail, List<String> toAccount) {
        this.isNeedDetail = isNeedDetail;
        this.toAccount = toAccount;
    }

    private QueryOnlineStatusRequest(Builder builder) {
        this.isNeedDetail = builder.isNeedDetail;
        this.toAccount = builder.toAccount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public Integer getIsNeedDetail() {
        return isNeedDetail;
    }

    public void setIsNeedDetail(Integer isNeedDetail) {
        this.isNeedDetail = isNeedDetail;
    }

    public List<String> getToAccount() {
        return toAccount;
    }

    public void setToAccount(List<String> toAccount) {
        this.toAccount = toAccount;
    }


    public static final class Builder {
        private Integer isNeedDetail;
        private List<String> toAccount;

        private Builder() {
        }

        public QueryOnlineStatusRequest build() {
            return new QueryOnlineStatusRequest(this);
        }

        public Builder isNeedDetail(Integer isNeedDetail) {
            this.isNeedDetail = isNeedDetail;
            return this;
        }

        public Builder toAccount(List<String> toAccount) {
            this.toAccount = toAccount;
            return this;
        }
    }
}
