package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

/**
 * @author bingo
 * @since 2021/7/31 17:14
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class IMSetAttrNameRequest extends GenericRequest {
    @JsonProperty("AttrNames")
    private Map<String, String> attrNames;

    public Map<String, String> getAttrNames() {
        return attrNames;
    }

    public void setAttrNames(Map<String, String> attrNames) {
        this.attrNames = attrNames;
    }
}
