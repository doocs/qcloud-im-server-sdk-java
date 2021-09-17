package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author xy
 * @since 2021/07/31 11:51:01
 */
public class GetNoSpeakingResult {
    /**
     * 失败原因
     */
    @JsonProperty("ErrorInfo")
    private String errorInfo;

    /**
     * 错误码，0为成功，其他为失败，错误码表：https://cloud.tencent.com/document/product/269/1671
     */
    @JsonProperty("ErrorCode")
    private Integer errorCode;

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


    public String getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(String errorInfo) {
        this.errorInfo = errorInfo;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

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
        return "GetNoSpeakingResult{"
                + "errorInfo='"
                + errorInfo
                + '\''
                + ", errorCode="
                + errorCode
                + ", c2CMsgNoSpeakingTime="
                + c2CMsgNoSpeakingTime
                + ", groupMsgNoSpeakingTime="
                + groupMsgNoSpeakingTime
                + '}';
    }
}
