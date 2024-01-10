package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * @author hyh
 * @since 2024/01/10 15:34
 */
public class DeleteSubscriberResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = -171125317379526646L;
    /**
     * 删除的订阅者结果
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
        return "DeleteSubscriberResult{" +
                "subscriberList=" + subscriberList +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
