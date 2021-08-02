package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author hyh
 * @since 2021/07/30 11:27
 */
public class IMGetAttrResult extends GenericResult {
    @JsonProperty("UserAttrs")
    private List<UserAttrItem> userAttrs;

    public List<UserAttrItem> getUserAttrs() {
        return userAttrs;
    }

    public void setUserAttrs(List<UserAttrItem> userAttrs) {
        this.userAttrs = userAttrs;
    }

    @Override
    public String toString() {
        return "IMGetAttrResult{" +
                "userAttrs=" + userAttrs +
                '}';
    }
}
