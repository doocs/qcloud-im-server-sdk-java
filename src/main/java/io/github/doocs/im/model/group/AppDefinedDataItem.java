package io.github.doocs.im.model.group;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author bingo
 * @since 2021/10/31 20:57
 */
public class AppDefinedDataItem {
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

    @Override
    public String toString() {
        return "AppDefinedDataItem{" +
                "key='" + key + '\'' +
                ", value=" + value +
                '}';
    }
}
