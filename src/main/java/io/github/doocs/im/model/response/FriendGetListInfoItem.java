package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author hyh
 * @since 2021/07/30 17:03
 */
public class FriendGetListInfoItem {
    /**
     * 好友的 UserID
     */
    @JsonProperty("To_Account")
    private String toAccount;

    /**
     * 保存好友数据的数组，数组每一个元素都包含一个 Tag 字段和一个 Value 字段
     */
    @JsonProperty("SnsProfileItem")
    private List<SnsProfileItem> snsProfileItemList;

    /**
     * To_Account 的处理结果，0表示成功，非0表示失败，非0取值的详细描述请参见 错误码说明
     */
    @JsonProperty("ResultCode")
    private Integer resultCode;

    /**
     * To_Account 的错误描述信息，成功时该字段为空
     */
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

    @Override
    public String toString() {
        return "FriendGetListInfoItem{" +
                "toAccount='" + toAccount + '\'' +
                ", snsProfileItemList=" + snsProfileItemList +
                ", resultCode=" + resultCode +
                ", resultInfo='" + resultInfo + '\'' +
                '}';
    }
}
