package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 获取用户的关注、粉丝与互关数-请求参数
 * </p>
 *
 * @author MC.Yang
 * @version V1.0
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FollowGetInfoRequest extends GenericRequest implements Serializable {
    private static final long serialVersionUID = 198471997889646572L;

    /**
     * 发起拉取操作的用户的 UserID
     */
    @JsonProperty("From_Account")
    private String fromAccount;

    /**
     * 待拉取计数的用户的 UserID，单次请求的 To_Account 数不得超过20
     */
    @JsonProperty("To_Account")
    private List<String> toAccount;

    public FollowGetInfoRequest() {
    }

    public FollowGetInfoRequest(String fromAccount, List<String> toAccount) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
    }

    private FollowGetInfoRequest(FollowGetInfoRequest.Builder builder) {
        this.fromAccount = builder.fromAccount;
        this.toAccount = builder.toAccount;
    }

    public static FollowGetInfoRequest.Builder builder() {
        return new FollowGetInfoRequest.Builder();
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

        public FollowGetInfoRequest build() {
            return new FollowGetInfoRequest(this);
        }

        public FollowGetInfoRequest.Builder fromAccount(String fromAccount) {
            this.fromAccount = fromAccount;
            return this;
        }

        public FollowGetInfoRequest.Builder toAccount(List<String> toAccount) {
            this.toAccount = toAccount;
            return this;
        }
    }
}
