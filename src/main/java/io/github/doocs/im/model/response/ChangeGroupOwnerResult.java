package io.github.doocs.im.model.response;

/**
 * @author bingo
 * @since 2021/8/4 11:36
 */
public class ChangeGroupOwnerResult extends GenericResult {
    @Override
    public String toString() {
        return "ChangeGroupOwnerResult{" +
                "actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
