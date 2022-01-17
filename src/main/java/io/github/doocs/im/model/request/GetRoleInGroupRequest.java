package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 查询用户在群组中的身份-请求参数
 *
 * @author hyh
 * @since 2021/08/02 16:40
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetRoleInGroupRequest extends GenericRequest {
    /**
     * 需要查询的群组 ID
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * 表示需要查询的用户帐号，最多支持500个帐号
     */
    @JsonProperty("User_Account")
    private List<String> userAccount;

    public GetRoleInGroupRequest() {
    }

    public GetRoleInGroupRequest(String groupId, List<String> userAccount) {
        this.groupId = groupId;
        this.userAccount = userAccount;
    }

    private GetRoleInGroupRequest(Builder builder) {
        this.groupId = builder.groupId;
        this.userAccount = builder.userAccount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public List<String> getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(List<String> userAccount) {
        this.userAccount = userAccount;
    }


    public static final class Builder {
        private String groupId;
        private List<String> userAccount;

        private Builder() {
        }

        public GetRoleInGroupRequest build() {
            return new GetRoleInGroupRequest(this);
        }

        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        public Builder userAccount(List<String> userAccount) {
            this.userAccount = userAccount;
            return this;
        }
    }
}
