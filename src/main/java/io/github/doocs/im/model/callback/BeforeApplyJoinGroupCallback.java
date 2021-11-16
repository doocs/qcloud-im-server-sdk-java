package io.github.doocs.im.model.callback;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 申请入群之前回调
 *
 * @author bingo
 * @since 2021/11/16 17:26
 */
public class BeforeApplyJoinGroupCallback {
    @JsonProperty("CallbackCommand")
    private String callbackCommand;

    @JsonProperty("GroupId")
    private String groupId;

    @JsonProperty("Type")
    private String type;

    @JsonProperty("Requestor_Account")
    private String requestorAccount;

    public String getCallbackCommand() {
        return callbackCommand;
    }

    public void setCallbackCommand(String callbackCommand) {
        this.callbackCommand = callbackCommand;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRequestorAccount() {
        return requestorAccount;
    }

    public void setRequestorAccount(String requestorAccount) {
        this.requestorAccount = requestorAccount;
    }
}
