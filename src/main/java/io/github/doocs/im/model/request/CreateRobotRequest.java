package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 创建机器人-请求参数
 *
 * @author bingo
 * @since 2023/7/26 10:25
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateRobotRequest extends GenericRequest implements Serializable {
    private static final long serialVersionUID = -4898027632420099806L;

    /**
     * 机器人用户名，长度不超过32字节，必须以@RBT#开头
     */
    @JsonProperty("UserID")
    private String userId;

    /**
     * 机器人昵称
     */
    @JsonProperty("Nick")
    private String nick;

    /**
     * 机器人头像 URL
     */
    @JsonProperty("FaceUrl")
    private String faceUrl;

    /**
     * 机器人签名，不超过500字节
     */
    @JsonProperty("SelfSignature")
    private String selfSignature;

    public CreateRobotRequest() {
    }

    public CreateRobotRequest(String userId) {
        this.userId = userId;
    }

    public CreateRobotRequest(String userId, String nick, String faceUrl, String selfSignature) {
        this.userId = userId;
        this.nick = nick;
        this.faceUrl = faceUrl;
        this.selfSignature = selfSignature;
    }

    private CreateRobotRequest(Builder builder) {
        this.userId = builder.userId;
        this.nick = builder.nick;
        this.faceUrl = builder.faceUrl;
        this.selfSignature = builder.selfSignature;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getFaceUrl() {
        return faceUrl;
    }

    public void setFaceUrl(String faceUrl) {
        this.faceUrl = faceUrl;
    }

    public String getSelfSignature() {
        return selfSignature;
    }

    public void setSelfSignature(String selfSignature) {
        this.selfSignature = selfSignature;
    }

    public static final class Builder {
        private String userId;
        private String nick;
        private String faceUrl;
        private String selfSignature;

        private Builder() {
        }

        public CreateRobotRequest build() {
            return new CreateRobotRequest(this);
        }

        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public Builder nick(String nick) {
            this.nick = nick;
            return this;
        }

        public Builder faceUrl(String faceUrl) {
            this.faceUrl = faceUrl;
            return this;
        }

        public Builder selfSignature(String selfSignature) {
            this.selfSignature = selfSignature;
            return this;
        }
    }
}
