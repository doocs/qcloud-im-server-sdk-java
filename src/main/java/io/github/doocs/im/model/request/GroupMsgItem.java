package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.doocs.im.model.message.TIMMsgElement;

import java.util.List;

/**
 * @author bingo
 * @since 2021/8/4 15:23
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GroupMsgItem {
    @JsonProperty("From_Account")
    private String fromAccount;

    @JsonProperty("SendTime")
    private Integer sendTime;

    @JsonProperty("Random")
    private Integer random;

    @JsonProperty("MsgBody")
    private List<TIMMsgElement> msgBody;

    public GroupMsgItem() {
    }

    public GroupMsgItem(String fromAccount, Integer sendTime, List<TIMMsgElement> msgBody) {
        this.fromAccount = fromAccount;
        this.sendTime = sendTime;
        this.msgBody = msgBody;
    }

    public GroupMsgItem(String fromAccount, Integer sendTime, Integer random, List<TIMMsgElement> msgBody) {
        this.fromAccount = fromAccount;
        this.sendTime = sendTime;
        this.random = random;
        this.msgBody = msgBody;
    }

    private GroupMsgItem(Builder builder) {
        this.fromAccount = builder.fromAccount;
        this.sendTime = builder.sendTime;
        this.random = builder.random;
        this.msgBody = builder.msgBody;
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

    public Integer getSendTime() {
        return sendTime;
    }

    public void setSendTime(Integer sendTime) {
        this.sendTime = sendTime;
    }

    public Integer getRandom() {
        return random;
    }

    public void setRandom(Integer random) {
        this.random = random;
    }

    public List<TIMMsgElement> getMsgBody() {
        return msgBody;
    }

    public void setMsgBody(List<TIMMsgElement> msgBody) {
        this.msgBody = msgBody;
    }


    public static final class Builder {
        private String fromAccount;
        private Integer sendTime;
        private Integer random;
        private List<TIMMsgElement> msgBody;

        private Builder() {
        }

        public GroupMsgItem build() {
            return new GroupMsgItem(this);
        }

        public Builder fromAccount(String fromAccount) {
            this.fromAccount = fromAccount;
            return this;
        }

        public Builder sendTime(Integer sendTime) {
            this.sendTime = sendTime;
            return this;
        }

        public Builder random(Integer random) {
            this.random = random;
            return this;
        }

        public Builder msgBody(List<TIMMsgElement> msgBody) {
            this.msgBody = msgBody;
            return this;
        }
    }
}
