package io.github.doocs.im.model.response;

/**
 * @author hyh
 * @since 2021/08/02 19:27
 */
public class ModifyGroupBaseInfoResult extends GenericResult {
    @Override
    public String toString() {
        return "ModifyGroupBaseInfoResult{" +
                "actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
