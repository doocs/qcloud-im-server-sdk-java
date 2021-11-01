package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author hyh
 * @since 2021/07/29 14:56
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountImportRequest extends GenericRequest {
    @JsonProperty("Identifier")
    private String identifier;

    @JsonProperty("Nick")
    private String nick;

    @JsonProperty("FaceUrl")
    private String faceUrl;

    public AccountImportRequest() {
    }

    public AccountImportRequest(String identifier) {
        this.identifier = identifier;
    }

    public AccountImportRequest(String identifier, String nick, String faceUrl) {
        this.identifier = identifier;
        this.nick = nick;
        this.faceUrl = faceUrl;
    }

    private AccountImportRequest(Builder builder) {
        this.identifier = builder.identifier;
        this.nick = builder.nick;
        this.faceUrl = builder.faceUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
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
        private String identifier;
        private String nick;
        private String faceUrl;

        private Builder() {
        }

        public AccountImportRequest build() {
            return new AccountImportRequest(this);
        }

        public Builder identifier(String identifier) {
            this.identifier = identifier;
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
