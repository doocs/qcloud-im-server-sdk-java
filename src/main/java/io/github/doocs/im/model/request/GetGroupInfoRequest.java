package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 获取群详细资料-请求参数
 *
 * @author bingo
 * @since 2021/8/1 11:33
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetGroupInfoRequest extends GenericRequest implements Serializable {
    private static final long serialVersionUID = 3011394400566500769L;
    /**
     * 需要拉取的群组列表
     */
    @JsonProperty("GroupIdList")
    private List<String> groupIdList;

    /**
     * 包含三个过滤器：GroupBaseInfoFilter，MemberInfoFilter，AppDefinedDataFilter_Group，
     * 分别是基础信息字段过滤器，成员信息字段过滤器，群组维度的自定义字段过滤器
     */
    @JsonProperty("ResponseFilter")
    private ResponseFilter responseFilter;

    public GetGroupInfoRequest() {
    }

    public GetGroupInfoRequest(List<String> groupIdList) {
        this.groupIdList = groupIdList;
    }

    public GetGroupInfoRequest(List<String> groupIdList, ResponseFilter responseFilter) {
        this.groupIdList = groupIdList;
        this.responseFilter = responseFilter;
    }

    private GetGroupInfoRequest(Builder builder) {
        this.groupIdList = builder.groupIdList;
        this.responseFilter = builder.responseFilter;
    }

    public static Builder builder() {
        return new Builder();
    }

    public List<String> getGroupIdList() {
        return groupIdList;
    }

    public void setGroupIdList(List<String> groupIdList) {
        this.groupIdList = groupIdList;
    }

    public ResponseFilter getResponseFilter() {
        return responseFilter;
    }

    public void setResponseFilter(ResponseFilter responseFilter) {
        this.responseFilter = responseFilter;
    }


    public static final class Builder {
        private List<String> groupIdList;
        private ResponseFilter responseFilter;

        private Builder() {
        }

        public GetGroupInfoRequest build() {
            return new GetGroupInfoRequest(this);
        }

        public Builder groupIdList(List<String> groupIdList) {
            this.groupIdList = groupIdList;
            return this;
        }

        public Builder responseFilter(ResponseFilter responseFilter) {
            this.responseFilter = responseFilter;
            return this;
        }
    }
}
