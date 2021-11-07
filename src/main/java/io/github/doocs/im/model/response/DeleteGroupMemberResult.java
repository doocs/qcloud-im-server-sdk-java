package io.github.doocs.im.model.response;

/**
 * @author bingo
 * @since 2021/8/4 10:40
 */
public class DeleteGroupMemberResult extends GenericResult {
    @Override
    public String toString() {
        return "DeleteGroupMemberResult{" +
                "actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
