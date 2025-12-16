package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 关注用户-请求参数
 * </p>
 *
 * @author MC.Yang
 * @version V1.0
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FollowAddRequest extends GenericRequest implements Serializable {
    private static final long serialVersionUID = -4998729848603268465L;

    /**
     * 发起关注操作的用户的 UserID
     */
    @JsonProperty("From_Account")
    private String fromAccount;

    /**
     * 关注结构体对象
     */
    @JsonProperty("FollowItem")
    List<FollowRequestItem> followItemList;

    public FollowAddRequest() {
    }

    public FollowAddRequest(String fromAccount, List<FollowRequestItem> followItemList) {
        this.fromAccount = fromAccount;
        this.followItemList = followItemList;
    }

    private FollowAddRequest(Builder builder) {
        this.fromAccount = builder.fromAccount;
        this.followItemList = builder.followItemList;
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

    public List<FollowRequestItem> getFollowItemList() {
        return followItemList;
    }

    public void setFollowItemList(List<FollowRequestItem> followRequestItemList) {
        this.followItemList = followRequestItemList;
    }

    public static final class Builder {
        private String fromAccount;
        private List<FollowRequestItem> followItemList;

        private Builder() {
        }

        public FollowAddRequest build() {
            return new FollowAddRequest(this);
        }

        public Builder fromAccount(String fromAccount) {
            this.fromAccount = fromAccount;
            return this;
        }

        public Builder followItemList(List<FollowRequestItem> followRequestItemList) {
            this.followItemList = followRequestItemList;
            return this;
        }

    }

}
