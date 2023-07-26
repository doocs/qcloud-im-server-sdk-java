package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 删除机器人-请求参数
 *
 * @author bingo
 * @since 2023/7/26 10:25
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteRobotRequest extends GenericRequest implements Serializable {
    private static final long serialVersionUID = -5507100851090855260L;

    /**
     * 机器人用户名，长度不超过32字节，必须以@RBT#开头
     */
    @JsonProperty("Robot_Account")
    private String robotAccount;

    public DeleteRobotRequest() {
    }

    public DeleteRobotRequest(String robotAccount) {
        this.robotAccount = robotAccount;
    }

    private DeleteRobotRequest(Builder builder) {
        this.robotAccount = builder.robotAccount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getRobotAccount() {
        return robotAccount;
    }

    public void setRobotAccount(String robotAccount) {
        this.robotAccount = robotAccount;
    }


    public static final class Builder {
        private String robotAccount;

        private Builder() {
        }

        public DeleteRobotRequest build() {
            return new DeleteRobotRequest(this);
        }

        public Builder robotAccount(String robotAccount) {
            this.robotAccount = robotAccount;
            return this;
        }
    }
}
