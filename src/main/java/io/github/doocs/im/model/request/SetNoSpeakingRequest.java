package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author xy
 * @since 2021/07/31 11:39
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SetNoSpeakingRequest extends GenericRequest {
    @JsonProperty("Set_Account")
    private String setAccount;

    @JsonProperty("C2CmsgNospeakingTime")
    private Long msgNoSpeakingTime;

    @JsonProperty("GroupmsgNospeakingTime")
    private Long groupMsgNoSpeakingTime;

    public SetNoSpeakingRequest(String setAccount) {
        this.setAccount = setAccount;
    }

    public SetNoSpeakingRequest(String setAccount, Long msgNoSpeakingTime, Long groupMsgNoSpeakingTime) {
        this.setAccount = setAccount;
        this.msgNoSpeakingTime = msgNoSpeakingTime;
        this.groupMsgNoSpeakingTime = groupMsgNoSpeakingTime;
    }

    public String getSetAccount() {
        return setAccount;
    }

    public void setSetAccount(String setAccount) {
        this.setAccount = setAccount;
    }

    public Long getMsgNoSpeakingTime() {
        return msgNoSpeakingTime;
    }

    public void setMsgNoSpeakingTime(Long msgNoSpeakingTime) {
        this.msgNoSpeakingTime = msgNoSpeakingTime;
    }

    public Long getGroupMsgNoSpeakingTime() {
        return groupMsgNoSpeakingTime;
    }

    public void setGroupMsgNoSpeakingTime(Long groupMsgNoSpeakingTime) {
        this.groupMsgNoSpeakingTime = groupMsgNoSpeakingTime;
    }
}
