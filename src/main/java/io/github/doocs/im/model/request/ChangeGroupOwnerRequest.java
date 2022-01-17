package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 转让群主-请求参数
 *
 * @author hyh
 * @since 2021/08/02 17:12
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChangeGroupOwnerRequest extends GenericRequest {
    /**
     * 要被转移的群组 ID
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * 新群主 ID
     */
    @JsonProperty("NewOwner_Account")
    private String newOwnerAccount;

    public ChangeGroupOwnerRequest() {
    }

    public ChangeGroupOwnerRequest(String groupId, String newOwnerAccount) {
        this.groupId = groupId;
        this.newOwnerAccount = newOwnerAccount;
    }

    private ChangeGroupOwnerRequest(Builder builder) {
        this.groupId = builder.groupId;
        this.newOwnerAccount = builder.newOwnerAccount;
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

    public String getNewOwnerAccount() {
        return newOwnerAccount;
    }

    public void setNewOwnerAccount(String newOwnerAccount) {
        this.newOwnerAccount = newOwnerAccount;
    }


    public static final class Builder {
        private String groupId;
        private String newOwnerAccount;

        private Builder() {
        }

        public ChangeGroupOwnerRequest build() {
            return new ChangeGroupOwnerRequest(this);
        }

        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        public Builder newOwnerAccount(String newOwnerAccount) {
            this.newOwnerAccount = newOwnerAccount;
            return this;
        }
    }
}
