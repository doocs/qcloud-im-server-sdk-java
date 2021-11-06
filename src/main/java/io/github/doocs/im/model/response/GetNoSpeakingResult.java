package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author xy
 * @since 2021/07/31 11:51:01
 */
public class GetNoSpeakingResult extends GenericResult {
    /**
     * 单聊消息禁言时长，单位为秒
     */
    @JsonProperty("C2CmsgNospeakingTime")
    private Long c2CMsgNoSpeakingTime;

    /**
     * 群组消息禁言时长，单位为秒
     */
    @JsonProperty("GroupmsgNospeakingTime")
    private Long groupMsgNoSpeakingTime;


    public Long getC2CMsgNoSpeakingTime() {
        return c2CMsgNoSpeakingTime;
    }

    public void setC2CMsgNoSpeakingTime(Long c2CMsgNoSpeakingTime) {
        this.c2CMsgNoSpeakingTime = c2CMsgNoSpeakingTime;
    }

    public Long getGroupMsgNoSpeakingTime() {
        return groupMsgNoSpeakingTime;
    }

    public void setGroupMsgNoSpeakingTime(Long groupMsgNoSpeakingTime) {
        this.groupMsgNoSpeakingTime = groupMsgNoSpeakingTime;
    }

    @Override
    public String toString() {
        return "GetNoSpeakingResult{" +
                "c2CMsgNoSpeakingTime=" + c2CMsgNoSpeakingTime +
                ", groupMsgNoSpeakingTime=" + groupMsgNoSpeakingTime +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
