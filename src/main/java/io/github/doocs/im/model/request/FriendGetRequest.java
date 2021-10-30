package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author hyh
 * @since 2021/07/31 14:34
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FriendGetRequest extends GenericRequest {
    @JsonProperty("From_Account")
    private String fromAccount;

    @JsonProperty("StartIndex")
    private Integer startIndex;

    @JsonProperty("StandardSequence")
    private Integer standardSequence;

    @JsonProperty("CustomSequence")
    private Integer customSequence;

    public FriendGetRequest(String fromAccount, Integer startIndex) {
        this(fromAccount, startIndex, null, null);
    }

    public FriendGetRequest(String fromAccount, Integer startIndex, Integer standardSequence, Integer customSequence) {
        this.fromAccount = fromAccount;
        this.startIndex = startIndex;
        this.standardSequence = standardSequence;
        this.customSequence = customSequence;
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

    public Integer getStandardSequence() {
        return standardSequence;
    }

    public void setStandardSequence(Integer standardSequence) {
        this.standardSequence = standardSequence;
    }

    public Integer getCustomSequence() {
        return customSequence;
    }

    public void setCustomSequence(Integer customSequence) {
        this.customSequence = customSequence;
    }
}
