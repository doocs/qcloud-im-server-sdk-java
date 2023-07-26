package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 拉取所有机器人-结果
 *
 * @author bingo
 * @since 2023/7/26 10:25
 */
public class GetAllRobotsResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = -800026398280730966L;

    /**
     * 机器人UserID列表
     */
    @JsonProperty("Robot_Account")
    private List<String> robotAccount;

    public List<String> getRobotAccount() {
        return robotAccount;
    }

    public void setRobotAccount(List<String> robotAccount) {
        this.robotAccount = robotAccount;
    }

    @Override
    public String toString() {
        return "GetAllRobotsResult{" +
                "robotAccount=" + robotAccount +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
