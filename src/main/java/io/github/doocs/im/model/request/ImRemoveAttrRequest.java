package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.doocs.im.model.response.UserAttrItem;

import java.util.List;

/**
 * @author bingo
 * @since 2021/7/31 17:01
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImRemoveAttrRequest extends GenericRequest {
    @JsonProperty("UserAttrs")
    private List<UserAttrItem> userAttrs;

    public ImRemoveAttrRequest() {
    }

    public ImRemoveAttrRequest(List<UserAttrItem> userAttrs) {
        this.userAttrs = userAttrs;
    }

    private ImRemoveAttrRequest(Builder builder) {
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

        public ImRemoveAttrRequest build() {
            return new ImRemoveAttrRequest(this);
        }

        public Builder userAttrs(List<UserAttrItem> userAttrs) {
            this.userAttrs = userAttrs;
            return this;
        }
    }
}
