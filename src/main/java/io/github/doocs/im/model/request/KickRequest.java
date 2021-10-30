package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author bingo
 * @since 2021/7/30 17:31
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class KickRequest extends GenericRequest {
    @JsonProperty("Identifier")
    private String identifier;

    public KickRequest(String identifier) {
        this.identifier = identifier;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
}
