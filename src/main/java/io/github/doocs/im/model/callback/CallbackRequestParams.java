package io.github.doocs.im.model.callback;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author bingo
 * @since 2021/11/16 14:17
 */
public class CallbackRequestParams {
    @JsonProperty("SdkAppid")
    private long sdkAppId;

    @JsonProperty("CallbackCommand")
    private String callbackCommand;

    @JsonProperty("contenttype")
    private String contentType;

    @JsonProperty("ClientIP")
    private String clientIp;

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
