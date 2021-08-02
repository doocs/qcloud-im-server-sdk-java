package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author hyh
 * @since 2021/07/30 17:03
 */
public class FriendGetListInfoItem {
    @JsonProperty("To_Account")
    private String toAccount;

    @JsonProperty("SnsProfileItem")
    private List<SnsProfileItem> snsProfileItemList;

    @JsonProperty("ResultCode")
    private Integer resultCode;

    @JsonProperty("ResultInfo")
    private String resultInfo;

    public String getToAccount() {
        return toAccount;
    }

    public void setToAccount(String toAccount) {
        this.toAccount = toAccount;
    }

    public List<SnsProfileItem> getSnsProfileItemList() {
        return snsProfileItemList;
    }

    public void setSnsProfileItemList(List<SnsProfileItem> snsProfileItemList) {
        this.snsProfileItemList = snsProfileItemList;
    }

    public Integer getResultCode() {
        return resultCode;
    }

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultInfo() {
        return resultInfo;
    }

    public void setResultInfo(String resultInfo) {
        this.resultInfo = resultInfo;
    }
}
