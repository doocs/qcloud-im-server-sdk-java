package io.github.doocs.im.model.response;

/**
 * 设置成员未读消息计数-结果
 *
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
