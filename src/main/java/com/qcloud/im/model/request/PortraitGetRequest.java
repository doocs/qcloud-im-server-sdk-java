package com.qcloud.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author hyh
 * @since 2021/07/31 10:39
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PortraitGetRequest extends GenericRequest {
    @JsonProperty("To_Account")
    private List<String> toAccount;

    @JsonProperty("TagList")
    private List<String> tagList;

    public PortraitGetRequest() {
    }

    public PortraitGetRequest(List<String> toAccount, List<String> tagList) {
        this.toAccount = toAccount;
        this.tagList = tagList;
    }

    public List<String> getToAccount() {
        return toAccount;
    }

    public void setToAccount(List<String> toAccount) {
        this.toAccount = toAccount;
    }

    public List<String> getTagList() {
        return tagList;
    }

    public void setTagList(List<String> tagList) {
        this.tagList = tagList;
    }
}
