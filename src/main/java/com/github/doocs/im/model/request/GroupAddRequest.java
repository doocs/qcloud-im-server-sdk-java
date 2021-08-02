package com.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author hyh
 * @since 2021/07/31 15:33
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GroupAddRequest extends GenericRequest {
    @JsonProperty("From_Account")
    private String fromAccount;

    @JsonProperty("GroupName")
    private List<String> groupName;

    @JsonProperty("To_Account")
    private List<String> toAccount;

    public GroupAddRequest() {
    }

    public GroupAddRequest(String fromAccount, List<String> groupName, List<String> toAccount) {
        this.fromAccount = fromAccount;
        this.groupName = groupName;
        this.toAccount = toAccount;
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

    public List<String> getToAccount() {
        return toAccount;
    }

    public void setToAccount(List<String> toAccount) {
        this.toAccount = toAccount;
    }
}
