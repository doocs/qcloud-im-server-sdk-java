package io.github.doocs.im.model.response;

import java.io.Serializable;

/**
 * 在群组中发送系统通知-结果
 *
 * @author bingo
 * @since 2021/8/4 11:32
 */
public class SendGroupSystemNotificationResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = 7726044667357214249L;

    @Override
    public String toString() {
        return "SendGroupSystemNotificationResult{" +
                "actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
