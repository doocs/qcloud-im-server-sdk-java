package io.github.doocs.im.model.callback;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * @author bingo
 */
public class UserDefinedDataItem implements Serializable {
    private static final long serialVersionUID = 6006163896001405785L;
    @JsonProperty("Key")
    private String key;

    @JsonProperty("Value")
    private Object value;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
