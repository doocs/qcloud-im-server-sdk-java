package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 查询帐号在线状态-结果
 *
 * @author bingo
 * @since 2021/7/28 11:07
 */
public class QueryOnlineStatusResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = -5590466795212395415L;
    /**
     * 返回的用户在线状态结构化信息
     */
    @JsonProperty("QueryResult")
    private List<QueryResultItem> queryResult;

    /**
     * 状态查询失败的帐号列表，在此列表中的目标帐号，状态查询失败或目标帐号不存在。若状态全部查询成功，则 ErrorList 为空
     */
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
