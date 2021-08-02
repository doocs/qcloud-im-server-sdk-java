package com.qcloud.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author hyh
 * @since 2021/08/02 17:09
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SendGroupSystemNotificationRequest extends GenericRequest {
    @JsonProperty("GroupId")
    private String groupId;

    @JsonProperty("ToMembers_Account")
    private List<String> toMembersAccount;

    @JsonProperty("Content")
    private String content;

    public SendGroupSystemNotificationRequest() {
    }

    public SendGroupSystemNotificationRequest(String groupId, List<String> toMembersAccount, String content) {
        this.groupId = groupId;
        this.toMembersAccount = toMembersAccount;
        this.content = content;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public List<String> getToMembersAccount() {
        return toMembersAccount;
    }

    public void setToMembersAccount(List<String> toMembersAccount) {
        this.toMembersAccount = toMembersAccount;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
