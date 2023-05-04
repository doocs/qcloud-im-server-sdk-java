package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 拉取运营数据-请求参数
 *
 * @author bingo
 * @since 2021/7/31 19:05
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetAppInfoRequest extends GenericRequest implements Serializable {
    private static final long serialVersionUID = 4578696092830832153L;
    /**
     * 该字段用来指定需要拉取的运营数据，不填默认拉取所有字段。
     */
    @JsonProperty("RequestField")
    private List<String> requestField;

    public GetAppInfoRequest() {
    }

    public GetAppInfoRequest(List<String> requestField) {
        this.requestField = requestField;
    }

    private GetAppInfoRequest(Builder builder) {
        this.requestField = builder.requestField;
    }

    public static Builder builder() {
        return new Builder();
    }

    public List<String> getRequestField() {
        return requestField;
    }

    public void setRequestField(List<String> requestField) {
        this.requestField = requestField;
    }


    public static final class Builder {
        private List<String> requestField;

        private Builder() {
        }

        public GetAppInfoRequest build() {
            return new GetAppInfoRequest(this);
        }

        public Builder requestField(List<String> requestField) {
            this.requestField = requestField;
            return this;
        }
    }
}
