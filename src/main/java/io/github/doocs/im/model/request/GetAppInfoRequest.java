package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author bingo
 * @since 2021/7/31 19:05
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetAppInfoRequest extends GenericRequest {
    @JsonProperty("RequestField")
    private List<String> requestField;

    public GetAppInfoRequest() {
    }

    public GetAppInfoRequest(List<String> requestField) {
        this.requestField = requestField;
    }

    public List<String> getRequestField() {
        return requestField;
    }

    public void setRequestField(List<String> requestField) {
        this.requestField = requestField;
    }
}
