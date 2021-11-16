package io.github.doocs.im.model.callback;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 群组满员之后回调
 *
 * @author bingo
 * @since 2021/11/16 20:14
 */
public class AfterGroupFullCallback {
    @JsonProperty("CallbackCommand")
    private String callbackCommand;

    @JsonProperty("GroupId")
    private String groupId;

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
}
