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

    public KickRequest() {
    }

    public KickRequest(String identifier) {
        this.identifier = identifier;
    }

    private KickRequest(Builder builder) {
        this.identifier = builder.identifier;
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


    public static final class Builder {
        private String identifier;

        private Builder() {
        }

        public KickRequest build() {
            return new KickRequest(this);
        }

        public Builder identifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
    }
}
