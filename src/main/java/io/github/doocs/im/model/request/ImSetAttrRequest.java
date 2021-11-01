package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.doocs.im.model.response.UserAttrItem;

import java.util.List;

/**
 * @author bingo
 * @since 2021/7/31 16:58
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImSetAttrRequest extends GenericRequest {
    @JsonProperty("UserAttrs")
    List<UserAttrItem> userAttrs;

    public ImSetAttrRequest() {
    }

    public ImSetAttrRequest(List<UserAttrItem> userAttrs) {
        this.userAttrs = userAttrs;
    }

    private ImSetAttrRequest(Builder builder) {
        this.userAttrs = builder.userAttrs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public List<UserAttrItem> getUserAttrs() {
        return userAttrs;
    }

    public void setUserAttrs(List<UserAttrItem> userAttrs) {
        this.userAttrs = userAttrs;
    }


    public static final class Builder {
        private List<UserAttrItem> userAttrs;

        private Builder() {
        }

        public ImSetAttrRequest build() {
            return new ImSetAttrRequest(this);
        }

        public Builder userAttrs(List<UserAttrItem> userAttrs) {
            this.userAttrs = userAttrs;
            return this;
        }
    }
}
