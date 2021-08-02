package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author hyh
 * @since 2021/07/30 16:53
 */
public class UserDataItem {
    @JsonProperty("To_Account")
    private String toAccount;

    @JsonProperty("ValueItem")
    private List<ValueItem> valueItemList;

    public String getToAccount() {
        return toAccount;
    }

    public void setToAccount(String toAccount) {
        this.toAccount = toAccount;
    }

    public List<ValueItem> getValueItemList() {
        return valueItemList;
    }

    public void setValueItemList(List<ValueItem> valueItemList) {
        this.valueItemList = valueItemList;
    }

    @Override
    public String toString() {
        return "UserDataItem{" +
                "toAccount='" + toAccount + '\'' +
                ", valueItemList=" + valueItemList +
                '}';
    }
}
