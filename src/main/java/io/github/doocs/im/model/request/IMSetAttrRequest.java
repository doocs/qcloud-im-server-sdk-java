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
public class IMSetAttrRequest extends GenericRequest {
    @JsonProperty("UserAttrs")
    List<UserAttrItem> userAttrs;

    public IMSetAttrRequest(List<UserAttrItem> userAttrs) {
        this.userAttrs = userAttrs;
    }

    public List<UserAttrItem> getUserAttrs() {
        return userAttrs;
    }

    public void setUserAttrs(List<UserAttrItem> userAttrs) {
        this.userAttrs = userAttrs;
    }
}
