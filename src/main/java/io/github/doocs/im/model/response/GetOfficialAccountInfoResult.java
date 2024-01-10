package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 获取公众号详细资料-结果
 *
 * @author hyh
 * @since 2024/01/10 11:12
 */
public class GetOfficialAccountInfoResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = 2061255233382910667L;
    /**
     * 返回的公众号列表字段，返回的结果是根据过滤器中设置的过滤字段进行过滤后的信息。
     */
    @JsonProperty("OfficialAccountInfoList")
    private List<OfficialAccountInfoResult> officialAccountInfoList;

    public List<OfficialAccountInfoResult> getOfficialAccountInfoList() {
        return officialAccountInfoList;
    }

    public void setOfficialAccountInfoList(List<OfficialAccountInfoResult> officialAccountInfoList) {
        this.officialAccountInfoList = officialAccountInfoList;
    }

    @Override
    public String toString() {
        return "GetOfficialAccountInfoResult{" +
                "officialAccountInfoList=" + officialAccountInfoList +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
