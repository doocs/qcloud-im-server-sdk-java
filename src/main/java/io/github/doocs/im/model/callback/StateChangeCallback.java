package io.github.doocs.im.model.callback;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 状态变更回调
 *
 * @author bingo
 * @since 2021/11/16 15:02
 */
public class StateChangeCallback {
    @JsonProperty("CallbackCommand")
    private String callbackCommand;

    @JsonProperty("Info")
    private Info info;

    @JsonProperty("KickedDevice")
    private List<KickedDeviceItem> kickedDevice;

    @JsonProperty("EventTime")
    private Long eventTime;

    public String getCallbackCommand() {
        return callbackCommand;
    }

    public void setCallbackCommand(String callbackCommand) {
        this.callbackCommand = callbackCommand;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public List<KickedDeviceItem> getKickedDevice() {
        return kickedDevice;
    }

    public void setKickedDevice(List<KickedDeviceItem> kickedDevice) {
        this.kickedDevice = kickedDevice;
    }

    public Long getEventTime() {
        return eventTime;
    }

    public void setEventTime(Long eventTime) {
        this.eventTime = eventTime;
    }

    public static class Info {
        @JsonProperty("Action")
        private String action;

        @JsonProperty("To_Account")
        private String toAccount;

        @JsonProperty("Reason")
        private String reason;

        public String getAction() {
            return action;
        }

        public void setAction(String action) {
            this.action = action;
        }

        public String getToAccount() {
            return toAccount;
        }

        public void setToAccount(String toAccount) {
            this.toAccount = toAccount;
        }

        public String getReason() {
            return reason;
        }

        public void setReason(String reason) {
            this.reason = reason;
        }
    }

    public static class KickedDeviceItem {
        @JsonProperty("Platform")
        private String platform;

        public String getPlatform() {
            return platform;
        }

        public void setPlatform(String platform) {
            this.platform = platform;
        }
    }
}
