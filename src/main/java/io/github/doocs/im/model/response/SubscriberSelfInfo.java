package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 公众号订阅者自己的相关信息
 *
 * @author hyh
 * @since 2024/01/10 16:01
 */
public class SubscriberSelfInfo implements Serializable {
    private static final long serialVersionUID = -4652600014352332246L;
    /**
     * 订阅者订阅公众号的时间
     */
    @JsonProperty("SubscribeTime")
    private Integer subscribeTime;

    /**
     * 订阅者维度的自定义字段
     */
    @JsonProperty("CustomString")
    private String customString;

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

    @Override
    public String toString() {
        return "SubscriberSelfInfo{" +
                "subscribeTime=" + subscribeTime +
                ", customString='" + customString + '\'' +
                '}';
    }
}
