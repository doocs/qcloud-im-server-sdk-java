package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author bingo
 * @since 2021/7/28 11:07
 */
public class QueryStateResult extends GenericResult {
    @JsonProperty("QueryStateResult")
    private List<QueryStateResultItem> queryStateResult;

    @JsonProperty("QueryStateErrorList")
    private List<QueryStateErrorItem> queryStateErrorList;

    public List<QueryStateResultItem> getQueryStateResult() {
        return queryStateResult;
    }

    public void setQueryStateResult(List<QueryStateResultItem> queryStateResult) {
        this.queryStateResult = queryStateResult;
    }

    public List<QueryStateErrorItem> getQueryStateErrorList() {
        return queryStateErrorList;
    }

    public void setQueryStateErrorList(List<QueryStateErrorItem> queryStateErrorList) {
        this.queryStateErrorList = queryStateErrorList;
    }

    @Override
    public String toString() {
        return "QueryStateResult{" +
                "queryStateResult=" + queryStateResult +
                ", queryStateErrorList=" + queryStateErrorList +
                '}';
    }
}
