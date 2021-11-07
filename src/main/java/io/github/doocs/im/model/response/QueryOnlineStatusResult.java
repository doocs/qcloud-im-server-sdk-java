package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author bingo
 * @since 2021/7/28 11:07
 */
public class QueryOnlineStatusResult extends GenericResult {
    @JsonProperty("QueryResult")
    private List<QueryResultItem> queryResult;

    @JsonProperty("ErrorList")
    private List<QueryResultErrorItem> errorList;

    public List<QueryResultItem> getQueryResult() {
        return queryResult;
    }

    public void setQueryResult(List<QueryResultItem> queryResult) {
        this.queryResult = queryResult;
    }

    public List<QueryResultErrorItem> getErrorList() {
        return errorList;
    }

    public void setErrorList(List<QueryResultErrorItem> errorList) {
        this.errorList = errorList;
    }

    @Override
    public String toString() {
        return "QueryOnlineStatusResult{" +
                "queryResult=" + queryResult +
                ", errorList=" + errorList +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
