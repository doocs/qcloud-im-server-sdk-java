package io.github.doocs.im.model.response;

/**
 * 群成员解封-结果
 *
 * @author bingo
 * @since 2022/8/29 14:07
 */
public class UnbanGroupMemberResult extends GenericResult {
    @Override
    public String toString() {
        return "UnbanGroupMemberResult{" +
                "actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
