package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 查询单聊消息-请求参数
 *
 * @author bingo
 * @since 2021/7/31 14:27
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdminGetRoamMsgRequest extends GenericRequest {
    /**
     * 会话其中一方的 UserID，若已指定发送消息方帐号，则为消息发送方
     */
    @JsonProperty("From_Account")
    private String fromAccount;

    /**
     * 会话其中一方的 UserID
     */
    @JsonProperty("To_Account")
    private String toAccount;

    /**
     * 请求的消息条数
     */
    @JsonProperty("MaxCnt")
    private Integer maxCnt;

    /**
     * 请求的消息时间范围的最小值
     */
    @JsonProperty("MinTime")
    private Integer minTime;

    /**
     * 请求的消息时间范围的最大值
     */
    @JsonProperty("MaxTime")
    private Integer maxTime;

    /**
     * 上一次拉取到的最后一条消息的 MsgKey，续拉时需要填该字段
     */
    @JsonProperty("LastMsgKey")
    private String lastMsgKey;

    public AdminGetRoamMsgRequest() {
    }

    public AdminGetRoamMsgRequest(String fromAccount, String toAccount, Integer maxCnt, Integer minTime, Integer maxTime) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.maxCnt = maxCnt;
        this.minTime = minTime;
        this.maxTime = maxTime;
    }

    public AdminGetRoamMsgRequest(String fromAccount, String toAccount, Integer maxCnt, Integer minTime,
                                  Integer maxTime, String lastMsgKey) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.maxCnt = maxCnt;
        this.minTime = minTime;
        this.maxTime = maxTime;
        this.lastMsgKey = lastMsgKey;
    }

    private AdminGetRoamMsgRequest(Builder builder) {
        this.fromAccount = builder.fromAccount;
        this.toAccount = builder.toAccount;
        this.maxCnt = builder.maxCnt;
        this.minTime = builder.minTime;
        this.maxTime = builder.maxTime;
        this.lastMsgKey = builder.lastMsgKey;
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

    public String getToAccount() {
        return toAccount;
    }

    public void setToAccount(String toAccount) {
        this.toAccount = toAccount;
    }

    public Integer getMaxCnt() {
        return maxCnt;
    }

    public void setMaxCnt(Integer maxCnt) {
        this.maxCnt = maxCnt;
    }

    public Integer getMinTime() {
        return minTime;
    }

    public void setMinTime(Integer minTime) {
        this.minTime = minTime;
    }

    public Integer getMaxTime() {
        return maxTime;
    }

    public void setMaxTime(Integer maxTime) {
        this.maxTime = maxTime;
    }

    public String getLastMsgKey() {
        return lastMsgKey;
    }

    public void setLastMsgKey(String lastMsgKey) {
        this.lastMsgKey = lastMsgKey;
    }


    public static final class Builder {
        private String fromAccount;
        private String toAccount;
        private Integer maxCnt;
        private Integer minTime;
        private Integer maxTime;
        private String lastMsgKey;

        private Builder() {
        }

        public AdminGetRoamMsgRequest build() {
            return new AdminGetRoamMsgRequest(this);
        }

        public Builder fromAccount(String fromAccount) {
            this.fromAccount = fromAccount;
            return this;
        }

        public Builder toAccount(String toAccount) {
            this.toAccount = toAccount;
            return this;
        }

        public Builder maxCnt(Integer maxCnt) {
            this.maxCnt = maxCnt;
            return this;
        }

        public Builder minTime(Integer minTime) {
            this.minTime = minTime;
            return this;
        }

        public Builder maxTime(Integer maxTime) {
            this.maxTime = maxTime;
            return this;
        }

        public Builder lastMsgKey(String lastMsgKey) {
            this.lastMsgKey = lastMsgKey;
            return this;
        }
    }
}
