package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * <p>
 * 查询隐藏搜索对象-请求参数
 * </p>
 *
 * @author MC.Yang
 * @version V1.0
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetNoVisibilityRequest extends GenericRequest implements Serializable {
    private static final long serialVersionUID = 8616458085271489051L;

    /**
     * 搜索对象类型：
     * 1=用户搜索。
     * 2=群组搜索。
     * 3=群成员搜索。
     */
    @JsonProperty("SetType")
    private Integer setType;

    /**
     * 当次查询搜索对象的数量。
     */
    @JsonProperty("Count")
    private Integer count;

    /**
     * 续拉参数，上个请求的 Response 中带回，首次请求为空。
     */
    @JsonProperty("Cursor")
    private String cursor;

    public GetNoVisibilityRequest() {
    }

    public GetNoVisibilityRequest(Integer setType) {
        this.setType = setType;
    }

    public GetNoVisibilityRequest(Integer setType, Integer count, String cursor) {
        this.setType = setType;
        this.count = count;
        this.cursor = cursor;
    }

    private GetNoVisibilityRequest(Builder builder) {
        this.setType = builder.setType;
        this.count = builder.count;
        this.cursor = builder.cursor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public Integer getSetType() {
        return setType;
    }

    public void setSetType(Integer setType) {
        this.setType = setType;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getCursor() {
        return cursor;
    }

    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public static final class Builder {
        private Integer setType;
        private Integer count;
        private String cursor;

        private Builder() {
        }

        public GetNoVisibilityRequest build() {
            return new GetNoVisibilityRequest(this);
        }

        public Builder setType(Integer setType) {
            this.setType = setType;
            return this;
        }

        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        public Builder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }
    }
}
