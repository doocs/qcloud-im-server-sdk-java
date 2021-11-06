package io.github.doocs.im.model.response;

/**
 * @author hyh
 * @since 2021/08/01 13:58
 */
public class SetUnreadMsgNumResult extends GenericResult {
    @Override
    public String toString() {
        return "SetUnreadMsgNumResult{" +
                "actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
