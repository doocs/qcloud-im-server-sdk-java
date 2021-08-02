package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

/**
 * @author hyh
 * @since 2021/07/30 11:23
 */
public class IMGetAttrNameResult extends GenericResult {
    @JsonProperty("AttrNames")
    private Map<String, Object> attrNames;

    public Map<String, Object> getAttrNames() {
        return attrNames;
    }

    public void setAttrNames(Map<String, Object> attrNames) {
        this.attrNames = attrNames;
    }

    @Override
    public String toString() {
        return "IMGetAttrNameResult{" +
                "attrNames=" + attrNames +
                '}';
    }
}


