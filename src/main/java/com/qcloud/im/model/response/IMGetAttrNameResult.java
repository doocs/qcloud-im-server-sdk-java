package com.qcloud.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

/**
 * @author hyh
 * @since 2021/07/30 11:23
 */
public class IMGetAttrNameResult extends GenericResult {
    @JsonProperty("AttrNames")
    private Map<String,String> attrNames;

    public Map<String, String> getAttrNames() {
        return attrNames;
    }

    public void setAttrNames(Map<String, String> attrNames) {
        this.attrNames = attrNames;
    }
}


