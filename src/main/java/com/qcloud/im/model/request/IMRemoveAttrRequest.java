package com.qcloud.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.qcloud.im.model.response.UserAttrItem;

import java.util.List;

/**
 * @author bingo
 * @since 2021/7/31 17:01
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class IMRemoveAttrRequest extends GenericRequest {
    @JsonProperty("UserAttrs")
    private List<UserAttrItem> userAttrs;

    public List<UserAttrItem> getUserAttrs() {
        return userAttrs;
    }

    public void setUserAttrs(List<UserAttrItem> userAttrs) {
        this.userAttrs = userAttrs;
    }
}
