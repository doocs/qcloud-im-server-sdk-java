package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 群成员解封-请求参数
 *
 * @author bingo
 * @since 2022/8/29 11:33
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UnbanGroupMemberRequest extends GenericRequest {
    /**
     * 解封成员的群 id
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * 解封成员的账号 id，单次请求最大20个
     */
    @JsonProperty("Members_Account")
    private List<String> membersAccount;

    public UnbanGroupMemberRequest() {
    }

    public UnbanGroupMemberRequest(String groupId, List<String> membersAccount) {
        this.groupId = groupId;
        this.membersAccount = membersAccount;
    }

    private UnbanGroupMemberRequest(Builder builder) {
        this.groupId = builder.groupId;
        this.membersAccount = builder.membersAccount;
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

    public List<String> getMembersAccount() {
        return membersAccount;
    }

    public void setMembersAccount(List<String> membersAccount) {
        this.membersAccount = membersAccount;
    }


    public static final class Builder {
        private String groupId;
        private List<String> membersAccount;

        private Builder() {
        }

        public UnbanGroupMemberRequest build() {
            return new UnbanGroupMemberRequest(this);
        }

        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        public Builder membersAccount(List<String> membersAccount) {
            this.membersAccount = membersAccount;
            return this;
        }
    }
}
