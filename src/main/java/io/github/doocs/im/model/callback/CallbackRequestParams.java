package io.github.doocs.im.model.callback;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * @author bingo
 * @since 2021/11/16 14:17
 */
public class CallbackRequestParams implements Serializable {
    private static final long serialVersionUID = 3873269807641013358L;
    /**
     * App 在即时通信 IM 分配的应用标识
     */
    @JsonProperty("SdkAppid")
    private long sdkAppId;

    /**
     * 回调命令字
     */
    @JsonProperty("CallbackCommand")
    private String callbackCommand;

    /**
     * 可选，通常值为 JSON
     */
    @JsonProperty("contenttype")
    private String contentType;

    /**
     * 客户端 IP 地址
     */
    @JsonProperty("ClientIP")
    private String clientIp;

    /**
     * 客户端平台，对应不同的平台类型，可能的取值有：
     * RESTAPI（使用 REST API 发送请求）、Web（使用 Web SDK 发送请求）、
     * Android、iOS、Windows、Mac、iPad、Unknown（使用未知类型的设备发送请求）
     */
    @JsonProperty("OptPlatform")
    private String optPlatform;

    public long getSdkAppId() {
        return sdkAppId;
    }

    public void setSdkAppId(long sdkAppId) {
        this.sdkAppId = sdkAppId;
    }

    public String getCallbackCommand() {
        return callbackCommand;
    }

    public void setCallbackCommand(String callbackCommand) {
        this.callbackCommand = callbackCommand;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    public String getOptPlatform() {
        return optPlatform;
    }

    public void setOptPlatform(String optPlatform) {
        this.optPlatform = optPlatform;
    }

    @Override
    public String toString() {
        return "CallbackParams{" +
                "sdkAppId=" + sdkAppId +
                ", callbackCommand='" + callbackCommand + '\'' +
                ", contentType='" + contentType + '\'' +
                ", clientIp='" + clientIp + '\'' +
                ", optPlatform='" + optPlatform + '\'' +
                '}';
    }
}
