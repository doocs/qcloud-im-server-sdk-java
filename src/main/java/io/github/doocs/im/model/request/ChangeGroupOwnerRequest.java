package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author hyh
 * @since 2021/08/02 17:12
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChangeGroupOwnerRequest extends GenericRequest {
    @JsonProperty("GroupId")
    private String groupId;

    @JsonProperty("NewOwner_Account")
    private String newOwnerAccount;

    public ChangeGroupOwnerRequest(String groupId, String newOwnerAccount) {
        this.groupId = groupId;
        this.newOwnerAccount = newOwnerAccount;
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
}
