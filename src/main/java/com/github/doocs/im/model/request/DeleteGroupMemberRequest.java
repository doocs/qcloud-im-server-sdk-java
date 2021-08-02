package com.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author hyh
 * @since 2021/08/02 16:19
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteGroupMemberRequest extends GenericRequest {
    @JsonProperty("GroupId")
    private String groupId;

    @JsonProperty("Silence")
    private Integer silence;

    @JsonProperty("MemberToDel_Account")
    private List<String> memberToDelAccount;

    public DeleteGroupMemberRequest() {
    }

    public DeleteGroupMemberRequest(String groupId, Integer silence, List<String> memberToDelAccount) {
        this.groupId = groupId;
        this.silence = silence;
        this.memberToDelAccount = memberToDelAccount;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public Integer getSilence() {
        return silence;
    }

    public void setSilence(Integer silence) {
        this.silence = silence;
    }

    public List<String> getMemberToDelAccount() {
        return memberToDelAccount;
    }

    public void setMemberToDelAccount(List<String> memberToDelAccount) {
        this.memberToDelAccount = memberToDelAccount;
    }
}
