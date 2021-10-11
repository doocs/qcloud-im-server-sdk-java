package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author bingo
 * @since 2021/10/11 10:28
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetRecentContactListRequest extends GenericRequest {
    @JsonProperty("From_Account")
    private String fromAccount;

    @JsonProperty("TimeStamp")
    private Integer timestamp;

    @JsonProperty("StartIndex")
    private Integer startIndex;

    @JsonProperty("TopTimeStamp")
    private Integer topTimestamp;

    @JsonProperty("TopStartIndex")
    private Integer topStartIndex;

    @JsonProperty("AssistFlags")
    private Integer assistFlags;

    public String getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
    }

    public Integer getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }

    public Integer getTopTimestamp() {
        return topTimestamp;
    }

    public void setTopTimestamp(Integer topTimestamp) {
        this.topTimestamp = topTimestamp;
    }

    public Integer getTopStartIndex() {
        return topStartIndex;
    }

    public void setTopStartIndex(Integer topStartIndex) {
        this.topStartIndex = topStartIndex;
    }

    public Integer getAssistFlags() {
        return assistFlags;
    }

    public void setAssistFlags(Integer assistFlags) {
        this.assistFlags = assistFlags;
    }
}
