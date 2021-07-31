package com.qcloud.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author hyh
 * @since 2021/07/31 14:41
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FriendGetListRequest extends GenericRequest {
    @JsonProperty("From_Account")
    private String fromAccount;

    @JsonProperty("To_Account")
    private List<String> toAccount;

    @JsonProperty("TagList")
    private List<String> tagList;

    public FriendGetListRequest() {
    }

    public FriendGetListRequest(String fromAccount, List<String> toAccount, List<String> tagList) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.tagList = tagList;
    }

    public String getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
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
