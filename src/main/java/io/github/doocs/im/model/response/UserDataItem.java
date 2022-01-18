package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author hyh
 * @since 2021/07/30 16:53
 */
public class UserDataItem {
    /**
     * 好友的 UserID
     */
    @JsonProperty("To_Account")
    private String toAccount;

    /**
     * 保存好友数据的数组，数组每一个元素都包含一个 Tag 字段和一个 Value 字段
     */
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
