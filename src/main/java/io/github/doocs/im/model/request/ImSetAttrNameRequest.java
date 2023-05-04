package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Map;

/**
 * 设置应用属性名称-请求参数
 *
 * @author bingo
 * @since 2021/7/31 17:14
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImSetAttrNameRequest extends GenericRequest implements Serializable {
    private static final long serialVersionUID = 8916217822996015850L;
    /**
     * 应用属性
     */
    @JsonProperty("AttrNames")
    private Map<String, String> attrNames;

    public ImSetAttrNameRequest() {
    }

    public ImSetAttrNameRequest(Map<String, String> attrNames) {
        this.attrNames = attrNames;
    }

    private ImSetAttrNameRequest(Builder builder) {
        this.attrNames = builder.attrNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public Map<String, String> getAttrNames() {
        return attrNames;
    }

    public void setAttrNames(Map<String, String> attrNames) {
        this.attrNames = attrNames;
    }


    public static final class Builder {
        private Map<String, String> attrNames;

        private Builder() {
        }

        public ImSetAttrNameRequest build() {
            return new ImSetAttrNameRequest(this);
        }

        public Builder attrNames(Map<String, String> attrNames) {
            this.attrNames = attrNames;
            return this;
        }
    }
}
