package io.github.doocs.im.model.response;

/**
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
