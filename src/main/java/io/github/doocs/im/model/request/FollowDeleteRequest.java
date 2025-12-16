package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 取消关注用户-请求参数
 * </p>
 *
 * @author MC.Yang
 * @version V1.0
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FollowDeleteRequest extends GenericRequest implements Serializable {
    private static final long serialVersionUID = -6307672357208946936L;

    /**
     * 发起取关操作的用户的 UserID
     */
    @JsonProperty("From_Account")
    private String fromAccount;

    /**
     * 待取关的用户的 UserID，单次请求的 To_Account 数不得超过20
     */
    @JsonProperty("To_Account")
    private List<String> toAccount;

    public FollowDeleteRequest() {
    }

    public FollowDeleteRequest(String fromAccount, List<String> toAccount) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
    }

    private FollowDeleteRequest(FollowDeleteRequest.Builder builder) {
        this.fromAccount = builder.fromAccount;
        this.toAccount = builder.toAccount;
    }

    public static FollowDeleteRequest.Builder builder() {
        return new FollowDeleteRequest.Builder();
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

        public FollowDeleteRequest build() {
            return new FollowDeleteRequest(this);
        }

        public FollowDeleteRequest.Builder fromAccount(String fromAccount) {
            this.fromAccount = fromAccount;
            return this;
        }

        public FollowDeleteRequest.Builder toAccount(List<String> toAccount) {
            this.toAccount = toAccount;
            return this;
        }
    }
}
