package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.doocs.im.model.response.GenericResult;

/**
 * @author hyh
 * @since 2021/08/01 13:33
 */
public class GroupAttrItem extends GenericResult {

    @JsonProperty("key")
    private String key;

    @JsonProperty("value")
    private String value;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "GroupAttrItem{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
