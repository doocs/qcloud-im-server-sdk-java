package io.github.doocs.im.model.response;

/**
 * 在群组中发送系统通知-结果
 *
 * @author bingo
 * @since 2021/8/4 11:32
 */
public class SendGroupSystemNotificationResult extends GenericResult {
    @Override
    public String toString() {
        return "SendGroupSystemNotificationResult{" +
                "actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
