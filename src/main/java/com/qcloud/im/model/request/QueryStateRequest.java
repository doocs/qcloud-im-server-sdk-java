package com.qcloud.im.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author bingo
 * @since 2021/7/30 17:35
 */
public class QueryStateRequest extends GenericRequest {
    @JsonProperty("IsNeedDetail")
    private Integer isNeedDetail;

    @JsonProperty("To_Account")
    private List<String> toAccount;

    public Integer getIsNeedDetail() {
        return isNeedDetail;
    }

    public void setIsNeedDetail(Integer isNeedDetail) {
        this.isNeedDetail = isNeedDetail;
    }

    public List<String> getToAccount() {
        return toAccount;
    }

    public void setToAccount(List<String> toAccount) {
        this.toAccount = toAccount;
    }
}
