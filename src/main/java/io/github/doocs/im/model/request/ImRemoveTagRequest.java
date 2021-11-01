package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.doocs.im.model.response.UserTagItem;

import java.util.List;

/**
 * @author bingo
 * @since 2021/7/31 17:07
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImRemoveTagRequest extends GenericRequest {
    @JsonProperty("UserTags")
    private List<UserTagItem> userTags;

    public ImRemoveTagRequest() {
    }

    public ImRemoveTagRequest(List<UserTagItem> userTags) {
        this.userTags = userTags;
    }

    private ImRemoveTagRequest(Builder builder) {
        this.userTags = builder.userTags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public List<UserTagItem> getUserTags() {
        return userTags;
    }

    public void setUserTags(List<UserTagItem> userTags) {
        this.userTags = userTags;
    }


    public static final class Builder {
        private List<UserTagItem> userTags;

        private Builder() {
        }

        public ImRemoveTagRequest build() {
            return new ImRemoveTagRequest(this);
        }

        public Builder userTags(List<UserTagItem> userTags) {
            this.userTags = userTags;
            return this;
        }
    }
}
