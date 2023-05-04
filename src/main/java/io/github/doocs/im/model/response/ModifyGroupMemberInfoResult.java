package io.github.doocs.im.model.response;

import java.io.Serializable;

/**
 * 修改群成员资料-结果
 *
 * @author bingo
 * @since 2021/8/4 10:42
 */
public class ModifyGroupMemberInfoResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = -4695723265060368322L;

    @Override
    public String toString() {
        return "ModifyGroupMemberInfoResult{" +
                "actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
