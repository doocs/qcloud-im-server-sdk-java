package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 查询用户是否在直播群内-请求参数
 *
 * @author bingo
 * @since 2024/1/9 11:36
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CheckMembersRequest extends GenericRequest implements Serializable {
    private static final long serialVersionUID = 1773060365482346969L;

    /**
     * 操作的群 ID
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * 查询的用户 UserID 列表
     */
    @JsonProperty("Member_Account")
    private List<String> memberAccount;

    public CheckMembersRequest() {
    }

    public CheckMembersRequest(String groupId, List<String> memberAccount) {
        this.groupId = groupId;
        this.memberAccount = memberAccount;
    }

    private CheckMembersRequest(Builder builder) {
        this.groupId = builder.groupId;
        this.memberAccount = builder.memberAccount;
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

    public List<String> getMemberAccount() {
        return memberAccount;
    }

    public void setMemberAccount(List<String> memberAccount) {
        this.memberAccount = memberAccount;
    }


    public static final class Builder {
        private String groupId;
        private List<String> memberAccount;

        private Builder() {
        }

        public CheckMembersRequest build() {
            return new CheckMembersRequest(this);
        }

        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        public Builder memberAccount(List<String> memberAccount) {
            this.memberAccount = memberAccount;
            return this;
        }
    }
}
