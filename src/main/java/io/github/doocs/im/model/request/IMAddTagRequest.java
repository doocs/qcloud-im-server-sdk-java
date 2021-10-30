package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.doocs.im.model.response.UserTagItem;

import java.util.List;

/**
 * @author bingo
 * @since 2021/7/31 17:05
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class IMAddTagRequest extends GenericRequest {
    @JsonProperty("UserTags")
    private List<UserTagItem> userTags;

    public IMAddTagRequest(List<UserTagItem> userTags) {
        this.userTags = userTags;
    }

    public List<UserTagItem> getUserTags() {
        return userTags;
    }

    public void setUserTags(List<UserTagItem> userTags) {
        this.userTags = userTags;
    }
}
