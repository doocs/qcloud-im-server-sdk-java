package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.doocs.im.model.message.TIMMsgElement;

import java.util.List;
import java.util.Map;

/**
 * @author bingo
 * @since 2021/7/31 16:27
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImPushRequest extends GenericRequest {
    @JsonProperty("Condition")
    private Map<String, Object> condition;

    @JsonProperty("MsgRandom")
    private Long msgRandom;

    @JsonProperty("MsgBody")
    private List<TIMMsgElement> msgBody;

    @JsonProperty("MsgLifeTime")
    private Integer msgLifeTime;

    @JsonProperty("From_Account")
    private String fromAccount;

    @JsonProperty("OfflinePushInfo")
    private OfflinePushInfo offlinePushInfo;

    public ImPushRequest() {
    }

    public ImPushRequest(Long msgRandom, List<TIMMsgElement> msgBody) {
        this.msgRandom = msgRandom;
        this.msgBody = msgBody;
    }

    public ImPushRequest(Map<String, Object> condition, Long msgRandom, List<TIMMsgElement> msgBody,
                         Integer msgLifeTime, String fromAccount, OfflinePushInfo offlinePushInfo) {
        this.condition = condition;
        this.msgRandom = msgRandom;
        this.msgBody = msgBody;
        this.msgLifeTime = msgLifeTime;
        this.fromAccount = fromAccount;
        this.offlinePushInfo = offlinePushInfo;
    }

    private ImPushRequest(Builder builder) {
        this.condition = builder.condition;
        this.msgRandom = builder.msgRandom;
        this.msgBody = builder.msgBody;
        this.msgLifeTime = builder.msgLifeTime;
        this.fromAccount = builder.fromAccount;
        this.offlinePushInfo = builder.offlinePushInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public Map<String, Object> getCondition() {
        return condition;
    }

    public void setCondition(Map<String, Object> condition) {
        this.condition = condition;
    }

    public Long getMsgRandom() {
        return msgRandom;
    }

    public void setMsgRandom(Long msgRandom) {
        this.msgRandom = msgRandom;
    }

    public List<TIMMsgElement> getMsgBody() {
        return msgBody;
    }

    public void setMsgBody(List<TIMMsgElement> msgBody) {
        this.msgBody = msgBody;
    }

    public Integer getMsgLifeTime() {
        return msgLifeTime;
    }

    public void setMsgLifeTime(Integer msgLifeTime) {
        this.msgLifeTime = msgLifeTime;
    }

    public String getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
    }

    public OfflinePushInfo getOfflinePushInfo() {
        return offlinePushInfo;
    }

    public void setOfflinePushInfo(OfflinePushInfo offlinePushInfo) {
        this.offlinePushInfo = offlinePushInfo;
    }


    public static final class Builder {
        private Map<String, Object> condition;
        /**
         * 消息随机数，用于标记该条消息，数据范围 [0,4294967295]
         */
        private Long msgRandom;
        private List<TIMMsgElement> msgBody;
        private Integer msgLifeTime;
        private String fromAccount;
        private OfflinePushInfo offlinePushInfo;

        private Builder() {
        }

        public ImPushRequest build() {
            return new ImPushRequest(this);
        }

        public Builder condition(Map<String, Object> condition) {
            this.condition = condition;
            return this;
        }

        public Builder msgRandom(Long msgRandom) {
            this.msgRandom = msgRandom;
            return this;
        }

        public Builder msgBody(List<TIMMsgElement> msgBody) {
            this.msgBody = msgBody;
            return this;
        }

        public Builder msgLifeTime(Integer msgLifeTime) {
            this.msgLifeTime = msgLifeTime;
            return this;
        }

        public Builder fromAccount(String fromAccount) {
            this.fromAccount = fromAccount;
            return this;
        }

        public Builder offlinePushInfo(OfflinePushInfo offlinePushInfo) {
            this.offlinePushInfo = offlinePushInfo;
            return this;
        }
    }
}
