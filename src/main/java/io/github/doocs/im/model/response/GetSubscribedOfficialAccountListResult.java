package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 获取订阅的公众号列表-结果
 *
 * @author hyh
 * @since 2024/01/10 15:52
 */
public class GetSubscribedOfficialAccountListResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = 7006682821018096443L;
    /**
     * 拉取到的公众号信息, 返回的结果是根据过滤器中设置的过滤字段进行过滤后的信息
     */
    @JsonProperty("OfficialAccountInfoList")
    private List<OfficialAccountInfoItem> officialAccountInfoList;

    /**
     * 用户所订阅的公众号数量
     */
    @JsonProperty("TotalCount")
    private Integer totalCount;

    /**
     * 拉取是否结束的标志，
     * 1：代表已拉取完毕
     * 0：代表未拉取结束
     */
    @JsonProperty("CompleteFlag")
    private Integer completeFlag;

    /**
     * 下一次拉取的标识。若本次拉取未结束可以填入下一次拉取的 Offset 中作为分页拉取的偏移量
     */
    @JsonProperty("Next")
    private Integer next;

    public List<OfficialAccountInfoItem> getOfficialAccountInfoList() {
        return officialAccountInfoList;
    }

    public void setOfficialAccountInfoList(List<OfficialAccountInfoItem> officialAccountInfoList) {
        this.officialAccountInfoList = officialAccountInfoList;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getCompleteFlag() {
        return completeFlag;
    }

    public void setCompleteFlag(Integer completeFlag) {
        this.completeFlag = completeFlag;
    }

    public Integer getNext() {
        return next;
    }

    public void setNext(Integer next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "GetSubscribedOfficialAccountListResult{" +
                "officialAccountInfoList=" + officialAccountInfoList +
                ", totalCount=" + totalCount +
                ", completeFlag=" + completeFlag +
                ", next=" + next +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
