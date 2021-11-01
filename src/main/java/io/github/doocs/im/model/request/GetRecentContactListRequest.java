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

    public GetRecentContactListRequest() {
    }

    public GetRecentContactListRequest(String fromAccount, Integer timestamp, Integer startIndex,
                                       Integer topTimestamp, Integer topStartIndex, Integer assistFlags) {
        this.fromAccount = fromAccount;
        this.timestamp = timestamp;
        this.startIndex = startIndex;
        this.topTimestamp = topTimestamp;
        this.topStartIndex = topStartIndex;
        this.assistFlags = assistFlags;
    }

    private GetRecentContactListRequest(Builder builder) {
        this.fromAccount = builder.fromAccount;
        this.timestamp = builder.timestamp;
        this.startIndex = builder.startIndex;
        this.topTimestamp = builder.topTimestamp;
        this.topStartIndex = builder.topStartIndex;
        this.assistFlags = builder.assistFlags;
    }

    public static Builder builder() {
        return new Builder();
    }

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


    public static final class Builder {
        private String fromAccount;
        private Integer timestamp;
        private Integer startIndex;
        private Integer topTimestamp;
        private Integer topStartIndex;
        private Integer assistFlags;

        private Builder() {
        }

        public GetRecentContactListRequest build() {
            return new GetRecentContactListRequest(this);
        }

        public Builder fromAccount(String fromAccount) {
            this.fromAccount = fromAccount;
            return this;
        }

        public Builder timestamp(Integer timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public Builder startIndex(Integer startIndex) {
            this.startIndex = startIndex;
            return this;
        }

        public Builder topTimestamp(Integer topTimestamp) {
            this.topTimestamp = topTimestamp;
            return this;
        }

        public Builder topStartIndex(Integer topStartIndex) {
            this.topStartIndex = topStartIndex;
            return this;
        }

        public Builder assistFlags(Integer assistFlags) {
            this.assistFlags = assistFlags;
            return this;
        }
    }
}
