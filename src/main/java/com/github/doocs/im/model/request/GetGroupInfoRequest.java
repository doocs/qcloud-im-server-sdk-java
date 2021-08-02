package com.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author bingo
 * @since 2021/8/1 11:33
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetGroupInfoRequest extends GenericRequest {
    @JsonProperty("GroupIdList")
    private List<String> groupIdList;

    @JsonProperty("ResponseFilter")
    private ResponseFilter responseFilter;

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
}
