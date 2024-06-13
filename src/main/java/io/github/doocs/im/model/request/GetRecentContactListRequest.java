package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 拉取会话列表-请求参数
 *
 * @author bingo
 * @since 2021/10/11 10:28
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetRecentContactListRequest extends GenericRequest implements Serializable {
    private static final long serialVersionUID = -8638848898376939482L;
    /**
     * 填 UserID，请求拉取该用户的会话列表
     */
    @JsonProperty("From_Account")
    private String fromAccount;

    /**
     * 普通会话的起始时间，第一页填 0
     */
    @JsonProperty("TimeStamp")
    private Long timestamp;

    /**
     * 普通会话的起始位置，第一页填 0
     */
    @JsonProperty("StartIndex")
    private Integer startIndex;

    /**
     * 置顶会话的起始时间，第一页填 0
     */
    @JsonProperty("TopTimeStamp")
    private Long topTimestamp;

    /**
     * 置顶会话的起始位置，第一页填 0
     */
    @JsonProperty("TopStartIndex")
    private Integer topStartIndex;

    /**
     * 会话辅助标志位:
     * bit 0 - 是否支持置顶会话
     * bit 1 - 是否返回空会话
     * bit 2 - 是否支持置顶会话分页
     * {@link io.github.doocs.im.constant.AssistFlags}
     */
    @JsonProperty("AssistFlags")
    private Integer assistFlags;

    public GetRecentContactListRequest() {
    }

    public GetRecentContactListRequest(String fromAccount, Long timestamp, Integer startIndex,
                                       Long topTimestamp, Integer topStartIndex, Integer assistFlags) {
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

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }

    public Long getTopTimestamp() {
        return topTimestamp;
    }

    public void setTopTimestamp(Long topTimestamp) {
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
        private Long timestamp;
        private Integer startIndex;
        private Long topTimestamp;
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

        public Builder timestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public Builder startIndex(Integer startIndex) {
            this.startIndex = startIndex;
            return this;
        }

        public Builder topTimestamp(Long topTimestamp) {
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
