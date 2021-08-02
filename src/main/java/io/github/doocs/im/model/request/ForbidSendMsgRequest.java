package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author hyh
 * @since 2021/08/02 16:41
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ForbidSendMsgRequest extends GenericRequest {
    @JsonProperty("GroupId")
    private String groupId;

    @JsonProperty("Members_Account")
    private List<String> membersAccount;

    @JsonProperty("ShutUpTime")
    private Integer shutUpTime;

    public ForbidSendMsgRequest() {
    }

    public ForbidSendMsgRequest(String groupId, List<String> membersAccount, Integer shutUpTime) {
        this.groupId = groupId;
        this.membersAccount = membersAccount;
        this.shutUpTime = shutUpTime;
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

    public Integer getShutUpTime() {
        return shutUpTime;
    }

    public void setShutUpTime(Integer shutUpTime) {
        this.shutUpTime = shutUpTime;
    }
}
