package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author hyh
 * @since 2021/07/31 15:27
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BlackListGetRequest extends GenericRequest {
    @JsonProperty("From_Account")
    private String fromAccount;

    @JsonProperty("StartIndex")
    private Integer startIndex;

    @JsonProperty("MaxLimited")
    private Integer maxLimited;

    @JsonProperty("LastSequence")
    private Integer lastSequence;

    public BlackListGetRequest() {
    }

    public BlackListGetRequest(String fromAccount, Integer startIndex, Integer maxLimited, Integer lastSequence) {
        this.fromAccount = fromAccount;
        this.startIndex = startIndex;
        this.maxLimited = maxLimited;
        this.lastSequence = lastSequence;
    }

    public String getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
    }

    public Integer getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }

    public Integer getMaxLimited() {
        return maxLimited;
    }

    public void setMaxLimited(Integer maxLimited) {
        this.maxLimited = maxLimited;
    }

    public Integer getLastSequence() {
        return lastSequence;
    }

    public void setLastSequence(Integer lastSequence) {
        this.lastSequence = lastSequence;
    }
}
