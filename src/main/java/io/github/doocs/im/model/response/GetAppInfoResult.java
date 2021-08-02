package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author bingo
 * @since 2021/7/31 19:06
 */
public class GetAppInfoResult extends GenericResult {
    @JsonProperty("Result")
    private List<AppInfoResultItem> result;

    public List<AppInfoResultItem> getResult() {
        return result;
    }

    public void setResult(List<AppInfoResultItem> result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "GetAppInfoResult{" +
                "result=" + result +
                '}';
    }
}
