package io.github.doocs.im.model.response;

/**
 * @author hyh
 * @since 2021/07/28 17:54
 */
public class ImportMsgResult extends GenericResult {
    @Override
    public String toString() {
        return "ImportMsgResult{" +
                "actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
