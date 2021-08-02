package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author hyh
 * @since 2021/07/31 15:41
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GroupDeleteRequest extends GenericRequest {
    @JsonProperty("From_Account")
    private String fromAccount;

    @JsonProperty("GroupName")
    private List<String> groupName;

    public GroupDeleteRequest() {
    }

    public GroupDeleteRequest(String fromAccount, List<String> groupName) {
        this.fromAccount = fromAccount;
        this.groupName = groupName;
    }

    public String getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
    }

    public List<String> getGroupName() {
        return groupName;
    }

    public void setGroupName(List<String> groupName) {
        this.groupName = groupName;
    }
}
