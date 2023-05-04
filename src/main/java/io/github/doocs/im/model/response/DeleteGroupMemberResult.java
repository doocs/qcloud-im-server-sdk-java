package io.github.doocs.im.model.response;

import java.io.Serializable;

/**
 * 删除群成员-结果
 *
 * @author bingo
 * @since 2021/8/4 10:40
 */
public class DeleteGroupMemberResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = -5320798896805170858L;

    @Override
    public String toString() {
        return "DeleteGroupMemberResult{" +
                "actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
