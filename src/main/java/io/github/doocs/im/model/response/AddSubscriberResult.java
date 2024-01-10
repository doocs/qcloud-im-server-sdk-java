package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 公众号添加订阅者-结果
 *
 * @author hyh
 * @since 2024/01/10 15:19
 */
public class AddSubscriberResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = 116168979699422285L;
    /**
     * 添加的订阅者结果
     */
    @JsonProperty("SubscriberList")
    private List<OfficialAccountSubscribeResultItem> subscriberList;

    public List<OfficialAccountSubscribeResultItem> getSubscriberList() {
        return subscriberList;
    }

    public void setSubscriberList(List<OfficialAccountSubscribeResultItem> subscriberList) {
        this.subscriberList = subscriberList;
    }

    @Override
    public String toString() {
        return "AddSubscriberResult{" +
                "subscriberList=" + subscriberList +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
