package io.github.doocs.im.model.response;

import java.io.Serializable;

/**
 * 创建机器人-结果
 *
 * @author bingo
 * @since 2023/7/26 10:25
 */
public class CreateRobotResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = -4119303674518409105L;

    @Override
    public String toString() {
        return "CreateRobotResult{" +
                "actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
