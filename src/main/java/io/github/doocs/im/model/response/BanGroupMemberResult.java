package io.github.doocs.im.model.response;

import java.io.Serializable;

/**
 * 群成员封禁-结果
 *
 * @author bingo
 * @since 2022/8/29 14:07
 */
public class BanGroupMemberResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = -2485296799993801336L;

    @Override
    public String toString() {
        return "BanGroupMemberResult{" +
                "actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
