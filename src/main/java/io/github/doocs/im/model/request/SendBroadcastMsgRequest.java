package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.doocs.im.model.message.TIMMsgElement;

import java.util.List;

/**
 * 直播群广播消息-请求参数
 *
 * @author bingo
 * @since 2022/7/20 11:04
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SendBroadcastMsgRequest extends GenericRequest {
    /**
     * 消息来源帐号，选填。如果不填写该字段，则默认消息的发送者为调用该接口时使用的 App 管理员帐号。
     * 除此之外，App 亦可通过该字段“伪造”消息的发送者，从而实现一些特殊的功能需求。
     * 需要注意的是，如果指定该字段，必须要确保字段中的帐号是存在的
     */
    @JsonProperty("From_Account")
    private String fromAccount;

    /**
     * 无符号32位整数。如果5分钟内两条消息的内容和 Random 随机值都相同的情况下，后一条消息将被当做重复消息而丢弃
     */
    @JsonProperty("Random")
    private Long random;

    /**
     * 消息体
     */
    @JsonProperty("MsgBody")
    private List<TIMMsgElement> msgBody;

    /**
     * 消息自定义数据
     */
    @JsonProperty("CloudCustomData")
    private String cloudCustomData;

    public SendBroadcastMsgRequest() {
    }

    public SendBroadcastMsgRequest(Long random, List<TIMMsgElement> msgBody) {
        this.random = random;
        this.msgBody = msgBody;
    }

    public SendBroadcastMsgRequest(String fromAccount, Long random, List<TIMMsgElement> msgBody, String cloudCustomData) {
        this.fromAccount = fromAccount;
        this.random = random;
        this.msgBody = msgBody;
        this.cloudCustomData = cloudCustomData;
    }

    private SendBroadcastMsgRequest(Builder builder) {
        this.fromAccount = builder.fromAccount;
        this.random = builder.random;
        this.msgBody = builder.msgBody;
        this.cloudCustomData = builder.cloudCustomData;
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

    public Long getRandom() {
        return random;
    }

    public void setRandom(Long random) {
        this.random = random;
    }

    public List<TIMMsgElement> getMsgBody() {
        return msgBody;
    }

    public void setMsgBody(List<TIMMsgElement> msgBody) {
        this.msgBody = msgBody;
    }

    public String getCloudCustomData() {
        return cloudCustomData;
    }

    public void setCloudCustomData(String cloudCustomData) {
        this.cloudCustomData = cloudCustomData;
    }


    public static final class Builder {
        private String fromAccount;
        private Long random;
        private List<TIMMsgElement> msgBody;
        private String cloudCustomData;

        private Builder() {
        }

        public SendBroadcastMsgRequest build() {
            return new SendBroadcastMsgRequest(this);
        }

        public Builder fromAccount(String fromAccount) {
            this.fromAccount = fromAccount;
            return this;
        }

        public Builder random(Long random) {
            this.random = random;
            return this;
        }

        public Builder msgBody(List<TIMMsgElement> msgBody) {
            this.msgBody = msgBody;
            return this;
        }

        public Builder cloudCustomData(String cloudCustomData) {
            this.cloudCustomData = cloudCustomData;
            return this;
        }
    }
}
