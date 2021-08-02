package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author hyh
 * @since 2021/07/30 17:24
 */
public class BlackListItem {
    @JsonProperty("To_Account")
    private String toAccount;

    @JsonProperty("AddBlackTimeStamp")
    private Integer addBlackTimeStamp;

    public String getToAccount() {
        return toAccount;
    }

    public void setToAccount(String toAccount) {
        this.toAccount = toAccount;
    }

    public Integer getAddBlackTimeStamp() {
        return addBlackTimeStamp;
    }

    public void setAddBlackTimeStamp(Integer addBlackTimeStamp) {
        this.addBlackTimeStamp = addBlackTimeStamp;
    }
}
