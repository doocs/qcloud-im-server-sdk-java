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

    public SetNoSpeakingRequest() {
    }

    public SetNoSpeakingRequest(String setAccount) {
        this.setAccount = setAccount;
    }

    public SetNoSpeakingRequest(String setAccount, Long msgNoSpeakingTime, Long groupMsgNoSpeakingTime) {
        this.setAccount = setAccount;
        this.msgNoSpeakingTime = msgNoSpeakingTime;
        this.groupMsgNoSpeakingTime = groupMsgNoSpeakingTime;
    }

    private SetNoSpeakingRequest(Builder builder) {
        this.setAccount = builder.setAccount;
        this.msgNoSpeakingTime = builder.msgNoSpeakingTime;
        this.groupMsgNoSpeakingTime = builder.groupMsgNoSpeakingTime;
    }

    public static Builder builder() {
        return new Builder();
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


    public static final class Builder {
        private String setAccount;
        private Long msgNoSpeakingTime;
        private Long groupMsgNoSpeakingTime;

        private Builder() {
        }

        public SetNoSpeakingRequest build() {
            return new SetNoSpeakingRequest(this);
        }

        public Builder setAccount(String setAccount) {
            this.setAccount = setAccount;
            return this;
        }

        public Builder msgNoSpeakingTime(Long msgNoSpeakingTime) {
            this.msgNoSpeakingTime = msgNoSpeakingTime;
            return this;
        }

        public Builder groupMsgNoSpeakingTime(Long groupMsgNoSpeakingTime) {
            this.groupMsgNoSpeakingTime = groupMsgNoSpeakingTime;
            return this;
        }
    }
}
