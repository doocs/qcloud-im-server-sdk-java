package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 设置全局禁言-请求参数
 *
 * @author xy
 * @since 2021/07/31 11:39
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SetNoSpeakingRequest extends GenericRequest implements Serializable {
    private static final long serialVersionUID = -8089460902798391631L;
    /**
     * 设置禁言配置的账号
     */
    @JsonProperty("Set_Account")
    private String setAccount;

    /**
     * 单聊消息禁言时间，单位为秒，非负整数，最大值为4294967295（十六进制 0xFFFFFFFF）
     * 0表示取消该账号的单聊消息禁言
     * 4294967295表示该账号被设置永久禁言
     * 其它值表示该账号具体的禁言时间
     * {@link io.github.doocs.im.constant.NoSpeakingTime}
     */
    @JsonProperty("C2CmsgNospeakingTime")
    private Long msgNoSpeakingTime;

    /**
     * 群组消息禁言时间，单位为秒，非负整数，最大值为4294967295（十六进制 0xFFFFFFFF）
     * 0表示取消该账号的群组消息禁言
     * 4294967295表示该账号被设置永久禁言
     * 其它值表示该账号的具体禁言时间
     * {@link io.github.doocs.im.constant.NoSpeakingTime}
     */
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
