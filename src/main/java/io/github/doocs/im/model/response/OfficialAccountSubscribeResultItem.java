package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 公众号-订阅结果
 *
 * @author hyh
 * @since 2024/01/10 15:17
 */
public class OfficialAccountSubscribeResultItem implements Serializable {
    private static final long serialVersionUID = 7163994845153821772L;
    /**
     * 订阅者 UserID
     */
    @JsonProperty("Subscriber_Account")
    private String subscriberAccount;

    /**
     * 订阅操作结果：0 为失败；1 为成功；2 为已经订阅
     * 删除操作结果：0 为失败；1 为成功；2 为未订阅此公众号
     */
    @JsonProperty("Result")
    private Integer result;

    public String getSubscriberAccount() {
        return subscriberAccount;
    }

    public void setSubscriberAccount(String subscriberAccount) {
        this.subscriberAccount = subscriberAccount;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "OfficialAccountSubscribeResultItem{" +
                "subscriberAccount='" + subscriberAccount + '\'' +
                ", result=" + result +
                '}';
    }
}
