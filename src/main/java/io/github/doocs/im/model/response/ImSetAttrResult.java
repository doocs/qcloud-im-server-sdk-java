package io.github.doocs.im.model.response;

/**
 * @author hyh
 * @since 2021/07/30 11:54
 */
public class ImSetAttrResult extends GenericResult {
    @Override
    public String toString() {
        return "ImSetAttrResult{" +
                "actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
