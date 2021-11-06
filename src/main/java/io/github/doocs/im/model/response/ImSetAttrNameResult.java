package io.github.doocs.im.model.response;

/**
 * @author hyh
 * @since 2021/07/30 11:22
 */
public class ImSetAttrNameResult extends GenericResult {
    @Override
    public String toString() {
        return "ImSetAttrNameResult{" +
                "actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
