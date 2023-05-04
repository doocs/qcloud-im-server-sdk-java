package io.github.doocs.im.model.response;

import java.io.Serializable;

/**
 * 群成员解封-结果
 *
 * @author bingo
 * @since 2022/8/29 14:07
 */
public class UnbanGroupMemberResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = -4483529902609203658L;

    @Override
    public String toString() {
        return "UnbanGroupMemberResult{" +
                "actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
