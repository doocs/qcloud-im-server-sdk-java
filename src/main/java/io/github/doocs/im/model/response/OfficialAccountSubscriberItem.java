package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 公众号订阅者
 *
 * @author hyh
 * @since 2024/01/10 11:25
 */
public class OfficialAccountSubscriberItem implements Serializable {
    private static final long serialVersionUID = 8429425331353852653L;
    /**
     * 订阅者账号
     */
    @JsonProperty("Subscriber_Account")
    private String subscriberAccount;
    
    /**
     * 订阅的时间
     */
    @JsonProperty("SubscribeTime")
    private Integer subscribeTime;
    
    /**
     * 订阅者维度的自定义字段
     */
    @JsonProperty("CustomString")
    private String customString;
    
    /**
     * 订阅者的消息接收选项，此字段和群成员的消息接收选项类似
     */
    @JsonProperty("MsgFlag")
    private Integer msgFlag;
    
    /**
     * 最后一次发消息的时间
     */
    @JsonProperty("LastSendMsgTime")
    private Integer lastSendMsgTime;

    public String getSubscriberAccount() {
        return subscriberAccount;
    }

    public void setSubscriberAccount(String subscriberAccount) {
        this.subscriberAccount = subscriberAccount;
    }

    public Integer getSubscribeTime() {
        return subscribeTime;
    }

    public void setSubscribeTime(Integer subscribeTime) {
        this.subscribeTime = subscribeTime;
    }

    public String getCustomString() {
        return customString;
    }

    public void setCustomString(String customString) {
        this.customString = customString;
    }

    public Integer getMsgFlag() {
        return msgFlag;
    }

    public void setMsgFlag(Integer msgFlag) {
        this.msgFlag = msgFlag;
    }

    public Integer getLastSendMsgTime() {
        return lastSendMsgTime;
    }

    public void setLastSendMsgTime(Integer lastSendMsgTime) {
        this.lastSendMsgTime = lastSendMsgTime;
    }

    @Override
    public String toString() {
        return "OfficialAccountSubscriberItem{" +
                "subscriberAccount='" + subscriberAccount + '\'' +
                ", subscribeTime=" + subscribeTime +
                ", customString='" + customString + '\'' +
                ", msgFlag=" + msgFlag +
                ", lastSendMsgTime=" + lastSendMsgTime +
                '}';
    }
}
