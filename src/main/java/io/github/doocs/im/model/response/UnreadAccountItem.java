package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 未读成员
 *
 * @author bingo
 * @since 2022/7/24 20:20
 */
public class UnreadAccountItem implements Serializable {
    private static final long serialVersionUID = 172012500020421284L;
    /**
     * 未读成员
     */
    @JsonProperty("Unread_Account")
    private String unreadAccount;

    public String getUnreadAccount() {
        return unreadAccount;
    }

    public void setUnreadAccount(String unreadAccount) {
        this.unreadAccount = unreadAccount;
    }

    @Override
    public String toString() {
        return "UnreadAccountItem{" +
                "unreadAccount='" + unreadAccount + '\'' +
                '}';
    }
}
