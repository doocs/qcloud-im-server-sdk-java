package io.github.doocs.im.model.response;

/**
 * @author bingo
 * @since 2021/12/31 11:02
 */
public class ClearGroupAttrResult extends GenericResult {
    @Override
    public String toString() {
        return "ClearGroupAttrResult{" +
                "actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
