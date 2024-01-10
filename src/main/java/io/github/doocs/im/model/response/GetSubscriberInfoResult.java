package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 获取公众号的订阅成员资料-结果
 *
 * @author hyh
 * @since 2024/01/10 11:23
 */
public class GetSubscriberInfoResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = -8220044320157186722L;
    /**
     * 续拉的标志位，最后一次拉取服务端的应答包返回 Next 为""，代表无后续订阅者信息，客户端应结束查询。
     */
    @JsonProperty("Next")
    private String next;
    
    /**
     * 返回公众号下所有的订阅者人数
     */
    @JsonProperty("SubscriberNum")
    private Integer subscriberNum;
    
    /**
     * 返回的订阅者列表，包括如下信息：
     * Subscriber_Account 订阅者账号
     * SubscribeTime  订阅的时间
     * CustomString 订阅者维度的自定义字段
     * MsgFlag  订阅者的消息接收选项，此字段和群成员的消息接收选项类似
     * LastSendMsgTime 最后一次发消息的时间
     */
    @JsonProperty("SubscriberList")
    private List<OfficialAccountSubscriberItem> subscriberList;

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public Integer getSubscriberNum() {
        return subscriberNum;
    }

    public void setSubscriberNum(Integer subscriberNum) {
        this.subscriberNum = subscriberNum;
    }

    public List<OfficialAccountSubscriberItem> getSubscriberList() {
        return subscriberList;
    }

    public void setSubscriberList(List<OfficialAccountSubscriberItem> subscriberList) {
        this.subscriberList = subscriberList;
    }

    @Override
    public String toString() {
        return "GetSubscriberInfoResult{" +
                "next='" + next + '\'' +
                ", subscriberNum=" + subscriberNum +
                ", subscriberList=" + subscriberList +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
