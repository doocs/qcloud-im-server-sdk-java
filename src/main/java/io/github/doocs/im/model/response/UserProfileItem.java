package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.doocs.im.model.request.ProfileItem;

import java.io.Serializable;
import java.util.List;

/**
 * @author hyh
 * @since 2021/07/30 15:04
 */
public class UserProfileItem implements Serializable {
    private static final long serialVersionUID = -2219782653659082019L;
    /**
     * 返回的用户的 UserID
     */
    @JsonProperty("To_Account")
    private String toAccount;

    /**
     * 返回的用户的资料对象数组，数组中每一个对象都包含了 Tag 和 Value
     */
    @JsonProperty("ProfileItem")
    private List<ProfileItem> profileItemList;

    /**
     * To_Account 的处理结果，0表示成功，非0表示失败
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

    public List<ProfileItem> getProfileItemList() {
        return profileItemList;
    }

    public void setProfileItemList(List<ProfileItem> profileItemList) {
        this.profileItemList = profileItemList;
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
        return "UserProfileItem{" +
                "toAccount='" + toAccount + '\'' +
                ", profileItemList=" + profileItemList +
                ", resultCode=" + resultCode +
                ", resultInfo='" + resultInfo + '\'' +
                '}';
    }
}
