package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 获取公众号详细资料-请求参数
 *
 * @author hyh
 * @since 2024/01/10 10:34
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetOfficialAccountInfoRequest extends GenericRequest implements Serializable {
    private static final long serialVersionUID = -7046784535464765710L;
    /**
     * 需要获取的公众号列表 ID
     */
    @JsonProperty("OfficialAccountIdList")
    private List<OfficialAccountItem> officialAccountIdList;
    
    /**
     * 过滤返回的公众号信息字段，不填时默认返回全部字段，包括 OfficialAccountBaseInfoFilter 过滤器，主要可取以下值：
     * CreateTime 公众号的创建时间
     * Name 公众号名称
     * Owner_Account公众号所属的用户
     * LastMsgTime 公众号内的最后一条消息时间
     * SubscriberNum 公众号目前的订阅者人数
     * Introduction 公众号简介
     * FaceUrl  公众号的头像Url
     * Organization 公众号的所在组织
     * CustomString 公众号维度的自定义字段
     */
    @JsonProperty("ResponseFilter")
    private ResponseFilter responseFilter;

    public GetOfficialAccountInfoRequest() {
    }

    public GetOfficialAccountInfoRequest(List<OfficialAccountItem> officialAccountIdList) {
        this.officialAccountIdList = officialAccountIdList;
    }

    public GetOfficialAccountInfoRequest(List<OfficialAccountItem> officialAccountIdList, ResponseFilter responseFilter) {
        this.officialAccountIdList = officialAccountIdList;
        this.responseFilter = responseFilter;
    }

    private GetOfficialAccountInfoRequest(Builder builder) {
        this.officialAccountIdList = builder.officialAccountIdList;
        this.responseFilter = builder.responseFilter;
    }

    public static Builder builder() {
        return new Builder();
    }

    public List<OfficialAccountItem> getOfficialAccountIdList() {
        return officialAccountIdList;
    }

    public void setOfficialAccountIdList(List<OfficialAccountItem> officialAccountIdList) {
        this.officialAccountIdList = officialAccountIdList;
    }

    public ResponseFilter getResponseFilter() {
        return responseFilter;
    }

    public void setResponseFilter(ResponseFilter responseFilter) {
        this.responseFilter = responseFilter;
    }


    public static final class Builder {
        private List<OfficialAccountItem> officialAccountIdList;
        private ResponseFilter responseFilter;

        private Builder() {
        }

        public GetOfficialAccountInfoRequest build() {
            return new GetOfficialAccountInfoRequest(this);
        }

        public Builder officialAccountIdList(List<OfficialAccountItem> officialAccountIdList) {
            this.officialAccountIdList = officialAccountIdList;
            return this;
        }

        public Builder responseFilter(ResponseFilter responseFilter) {
            this.responseFilter = responseFilter;
            return this;
        }
    }
}
