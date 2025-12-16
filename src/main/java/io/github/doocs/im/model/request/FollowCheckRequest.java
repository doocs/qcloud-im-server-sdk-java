package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 检查关注关系-请求参数
 * </p>
 *
 * @author MC.Yang
 * @version V1.0
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FollowCheckRequest extends GenericRequest implements Serializable {
    private static final long serialVersionUID = -1540312147327812439L;
    
    /**
     * 请求检查该用户与 To_Account 之间的关注关系
     */
    @JsonProperty("From_Account")
    private String fromAccount;

    /**
     * 待检查的用户列表，单次请求的 To_Account 数不得超过100
     */
    @JsonProperty("To_Account")
    private List<String> toAccount;

    public FollowCheckRequest() {
    }

    public FollowCheckRequest(String fromAccount, List<String> toAccount) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
    }

    private FollowCheckRequest(FollowCheckRequest.Builder builder) {
        this.fromAccount = builder.fromAccount;
        this.toAccount = builder.toAccount;
    }

    public static FollowCheckRequest.Builder builder() {
        return new FollowCheckRequest.Builder();
    }

    public String getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
    }

    public List<String> getToAccount() {
        return toAccount;
    }

    public void setToAccount(List<String> toAccount) {
        this.toAccount = toAccount;
    }


    public static final class Builder {
        private String fromAccount;
        private List<String> toAccount;

        private Builder() {
        }

        public FollowCheckRequest build() {
            return new FollowCheckRequest(this);
        }

        public FollowCheckRequest.Builder fromAccount(String fromAccount) {
            this.fromAccount = fromAccount;
            return this;
        }

        public FollowCheckRequest.Builder toAccount(List<String> toAccount) {
            this.toAccount = toAccount;
            return this;
        }
    }
}
