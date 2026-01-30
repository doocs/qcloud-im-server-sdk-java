package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 查询隐藏搜索对象-结果
 * </p>
 *
 * @author MC.Yang
 * @version V1.0
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetNoVisibilitySearchResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = 2158713832423564373L;

    /**
     * 搜索是否结束
     */
    @JsonProperty("IsFinish")
    private Boolean isFinish;

    /**
     * 命中的搜索结果个数
     */
    @JsonProperty("TotalCount")
    private Integer totalCount;

    /**
     * 命中的隐藏搜索对象
     */
    @JsonProperty("NoVisibleData")
    private List<NoVisibleDataItem> noVisibleData;

    /**
     * 续拉参数，下个请求的 Response 中带回
     */
    @JsonProperty("Cursor")
    private Integer cursor;

    public Boolean getIsFinish() {
        return isFinish;
    }

    public void setIsFinish(Boolean isFinish) {
        this.isFinish = isFinish;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<NoVisibleDataItem> getNoVisibleData() {
        return noVisibleData;
    }

    public void setNoVisibleData(List<NoVisibleDataItem> noVisibleData) {
        this.noVisibleData = noVisibleData;
    }

    public Integer getCursor() {
        return cursor;
    }

    public void setCursor(Integer cursor) {
        this.cursor = cursor;
    }

    @Override
    public String toString() {
        return "GetNoVisibilitySearchResult{" +
                "isFinish=" + isFinish +
                ", totalCount=" + totalCount +
                ", noVisibleData=" + noVisibleData +
                ", cursor=" + cursor +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
