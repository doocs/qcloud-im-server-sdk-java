package io.github.doocs.im.model.response;

/**
 * @author hyh
 * @since 2021/07/30 14:03
 */
public class ImRemoveAttrResult extends GenericResult {
    @Override
    public String toString() {
        return "ImRemoveAttrResult{" +
                "actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
