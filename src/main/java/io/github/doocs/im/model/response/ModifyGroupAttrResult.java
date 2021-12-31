package io.github.doocs.im.model.response;

/**
 * @author bingo
 * @since 2021/12/31 10:55
 */
public class ModifyGroupAttrResult extends GenericResult {
    @Override
    public String toString() {
        return "ModifyGroupAttrResult{" +
                "actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
