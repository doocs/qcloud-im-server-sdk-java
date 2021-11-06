package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author hyh
 * @since 2021/08/01 13:33
 */
public class GetGroupAttrItem {

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
        return "GetGroupAttrItem{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
