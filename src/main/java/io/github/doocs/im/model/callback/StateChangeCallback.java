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
    /**
     * 回调命令
     */
    @JsonProperty("CallbackCommand")
    private String callbackCommand;

    /**
     * 用户上下线的信息
     */
    @JsonProperty("Info")
    private Info info;

    /**
     * 如果本次状态变更为 Login（Register），而且有其他设备被踢下线，才会有此字段。
     * 此字段表示其他被踢下线的设备的信息。
     */
    @JsonProperty("KickedDevice")
    private List<KickedDeviceItem> kickedDevice;

    /**
     * 触发本次回调的时间戳，单位为毫秒
     */
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
        /**
         * 用户上线或者下线的动作。
         * Login 表示上线（TCP 建立）
         * Logout 表示下线（TCP 断开）
         * Disconnect 表示网络断开（TCP 断开）
         */
        @JsonProperty("Action")
        private String action;

        /**
         * 用户 UserID
         */
        @JsonProperty("To_Account")
        private String toAccount;

        /**
         * 用户上下线触发的原因：
         * Login 的原因有 Register：App TCP 连接建立或断网重连
         * Logout 的原因有 Unregister：App 用户注销帐号导致 TCP 断开
         * Disconnect 的原因有
         * - LinkClose：即时通信 IM 检测到 App TCP 连接断开（例如 kill App，客户端发出 TCP 的 FIN 包或 RST 包）；
         * - TimeOut：即时通信 IM 检测到 App 心跳包超时，认为 TCP 已断开（例如客户端网络异常断开，
         * 未发出 TCP 的 FIN 包或 RST 包，也无法发送心跳包）。心跳超时时间为400秒
         */
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
        /**
         * 被踢下线的设备的平台类型，可能的取值有"iOS", "Android", "Web",
         * "Windows", "iPad", "Mac", "Linux"。
         */
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
