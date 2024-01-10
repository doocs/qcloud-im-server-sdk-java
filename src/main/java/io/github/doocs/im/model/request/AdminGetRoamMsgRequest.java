package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 查询单聊消息-请求参数
 *
 * @author bingo
 * @since 2021/7/31 14:27
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdminGetRoamMsgRequest extends GenericRequest implements Serializable {
    private static final long serialVersionUID = -1979505757549864474L;

    /**
     * 会话其中一方的 UserID，以该 UserID 的角度去查询消息。同一个会话，分别以会话双方的角度去查询消息，结果可能会不一样，请参考本接口的接口说明
     */
    @JsonProperty("Operator_Account")
    private String operatorAccount;

    /**
     * 会话的另一方 UserID
     */
    @JsonProperty("Peer_Account")
    private String peerAccount;

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

    public AdminGetRoamMsgRequest(String operatorAccount, String peerAccount, Integer maxCnt, Integer minTime, Integer maxTime) {
        this.operatorAccount = operatorAccount;
        this.peerAccount = peerAccount;
        this.maxCnt = maxCnt;
        this.minTime = minTime;
        this.maxTime = maxTime;
    }

    public AdminGetRoamMsgRequest(String operatorAccount, String peerAccount, Integer maxCnt, Integer minTime, Integer maxTime, String lastMsgKey) {
        this.operatorAccount = operatorAccount;
        this.peerAccount = peerAccount;
        this.maxCnt = maxCnt;
        this.minTime = minTime;
        this.maxTime = maxTime;
        this.lastMsgKey = lastMsgKey;
    }

    private AdminGetRoamMsgRequest(Builder builder) {
        this.operatorAccount = builder.operatorAccount;
        this.peerAccount = builder.peerAccount;
        this.maxCnt = builder.maxCnt;
        this.minTime = builder.minTime;
        this.maxTime = builder.maxTime;
        this.lastMsgKey = builder.lastMsgKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getOperatorAccount() {
        return operatorAccount;
    }

    public void setOperatorAccount(String operatorAccount) {
        this.operatorAccount = operatorAccount;
    }

    public String getPeerAccount() {
        return peerAccount;
    }

    public void setPeerAccount(String peerAccount) {
        this.peerAccount = peerAccount;
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
        private String operatorAccount;
        private String peerAccount;
        private Integer maxCnt;
        private Integer minTime;
        private Integer maxTime;
        private String lastMsgKey;

        private Builder() {
        }

        public AdminGetRoamMsgRequest build() {
            return new AdminGetRoamMsgRequest(this);
        }

        public Builder operatorAccount(String operatorAccount) {
            this.operatorAccount = operatorAccount;
            return this;
        }

        public Builder peerAccount(String peerAccount) {
            this.peerAccount = peerAccount;
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
