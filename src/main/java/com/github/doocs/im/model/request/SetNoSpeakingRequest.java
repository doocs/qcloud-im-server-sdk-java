package com.github.doocs.im.model.request;

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
    private Integer msgNoSpeakingTime;

    @JsonProperty("GroupmsgNospeakingTime")
    private Integer groupMsgNoSpeakingTime;


    public SetNoSpeakingRequest() {
    }

    public SetNoSpeakingRequest(String setAccount, Integer msgNoSpeakingTime, Integer groupMsgNoSpeakingTime) {
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

    public Integer getMsgNoSpeakingTime() {
        return msgNoSpeakingTime;
    }

    public void setMsgNoSpeakingTime(Integer msgNoSpeakingTime) {
        this.msgNoSpeakingTime = msgNoSpeakingTime;
    }

    public Integer getGroupMsgNoSpeakingTime() {
        return groupMsgNoSpeakingTime;
    }

    public void setGroupMsgNoSpeakingTime(Integer groupMsgNoSpeakingTime) {
        this.groupMsgNoSpeakingTime = groupMsgNoSpeakingTime;
    }
}
