package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author hyh
 * @since 2021/08/01 13:53
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteGroupMsgBySenderRequest extends GenericRequest {
    @JsonProperty("GroupId")
    private String groupId;

    @JsonProperty("Sender_Account")
    private String senderAccount;

    public DeleteGroupMsgBySenderRequest() {
    }

    public DeleteGroupMsgBySenderRequest(String groupId, String senderAccount) {
        this.groupId = groupId;
        this.senderAccount = senderAccount;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getSenderAccount() {
        return senderAccount;
    }

    public void setSenderAccount(String senderAccount) {
        this.senderAccount = senderAccount;
    }
}
