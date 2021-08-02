package com.github.doocs.im.model.request;

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

    public AccountImportRequest(String identifier, String nick, String faceUrl) {
        this.identifier = identifier;
        this.nick = nick;
        this.faceUrl = faceUrl;
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
}
