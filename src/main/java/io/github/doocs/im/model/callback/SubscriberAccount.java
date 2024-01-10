package io.github.doocs.im.model.callback;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * @author bingo
 * @since 2024/1/10 10:18
 */
public class SubscriberAccount implements Serializable {
    private static final long serialVersionUID = -5583912014592310406L;

    @JsonProperty("Subscriber_Account")
    private String subscriberAccount;

    public String getSubscriberAccount() {
        return subscriberAccount;
    }

    public void setSubscriberAccount(String subscriberAccount) {
        this.subscriberAccount = subscriberAccount;
    }
}
