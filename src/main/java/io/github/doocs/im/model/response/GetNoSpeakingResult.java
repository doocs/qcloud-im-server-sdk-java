package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 查询全局禁言-结果
 *
 * @author xy
 * @since 2021/07/31 11:51:01
 */
public class GetNoSpeakingResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = -1229860666181738842L;
    /**
     * 单聊消息禁言时长，单位为秒，非负整数。
     */
    @JsonProperty("C2CmsgNospeakingTime")
    private Long c2cMsgNoSpeakingTime;

    /**
     * 群组消息禁言时长，单位为秒，非负整数。
     */
    @JsonProperty("GroupmsgNospeakingTime")
    private Long groupMsgNoSpeakingTime;


    public Long getC2cMsgNoSpeakingTime() {
        return c2cMsgNoSpeakingTime;
    }

    public void setC2cMsgNoSpeakingTime(Long c2cMsgNoSpeakingTime) {
        this.c2cMsgNoSpeakingTime = c2cMsgNoSpeakingTime;
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
                "c2cMsgNoSpeakingTime=" + c2cMsgNoSpeakingTime +
                ", groupMsgNoSpeakingTime=" + groupMsgNoSpeakingTime +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
