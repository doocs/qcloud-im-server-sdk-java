package io.github.doocs.im.model.response;

/**
 * @author hyh
 * @since 2021/08/01 13:55
 */
public class DeleteGroupMsgBySenderResult extends GenericResult {
    @Override
    public String toString() {
        return "DeleteGroupMsgBySenderResult{" +
                "actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
