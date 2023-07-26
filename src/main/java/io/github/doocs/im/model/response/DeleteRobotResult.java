package io.github.doocs.im.model.response;

import java.io.Serializable;

/**
 * 删除机器人-结果
 *
 * @author bingo
 * @since 2023/7/26 10:25
 */
public class DeleteRobotResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = -3827850724399774512L;

    @Override
    public String toString() {
        return "DeleteRobotResult{" +
                "actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
