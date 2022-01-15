package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author hyh
 * @since 2021/07/29 14:56
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountImportRequest extends GenericRequest {
    @JsonProperty("UserID")
    private String userId;

    @JsonProperty("Nick")
    private String nick;

    @JsonProperty("FaceUrl")
    private String faceUrl;

    public AccountImportRequest() {
    }

    public AccountImportRequest(String userId) {
        this.userId = userId;
    }

    public AccountImportRequest(String userId, String nick, String faceUrl) {
        this.userId = userId;
        this.nick = nick;
        this.faceUrl = faceUrl;
    }

    private AccountImportRequest(Builder builder) {
        this.userId = builder.userId;
        this.nick = builder.nick;
        this.faceUrl = builder.faceUrl;
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


    public static final class Builder {
        private String userId;
        private String nick;
        private String faceUrl;

        private Builder() {
        }

        public AccountImportRequest build() {
            return new AccountImportRequest(this);
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
    }
}
