package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 拉取资料-结果
 *
 * @author hyh
 * @since 2021/07/30 14:57
 */
public class PortraitGetResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = 4961723975445682600L;
    /**
     * 	详细的客户端展示信息
     */
    @JsonProperty("ErrorDisplay")
    private String errorDisplay;

    /**
     * 返回的用户资料结构化信息
     */
    @JsonProperty("UserProfileItem")
    private List<UserProfileItem> userProfileItemList;

    /**
     * 返回处理失败的用户列表，仅当存在失败用户时才返回该字段
     */
    @JsonProperty("Fail_Account")
    private List<String> failAccount;

    public String getErrorDisplay() {
        return errorDisplay;
    }

    public void setErrorDisplay(String errorDisplay) {
        this.errorDisplay = errorDisplay;
    }

    public List<UserProfileItem> getUserProfileItemList() {
        return userProfileItemList;
    }

    public void setUserProfileItemList(List<UserProfileItem> userProfileItemList) {
        this.userProfileItemList = userProfileItemList;
    }

    public List<String> getFailAccount() {
        return failAccount;
    }

    public void setFailAccount(List<String> failAccount) {
        this.failAccount = failAccount;
    }

    @Override
    public String toString() {
        return "PortraitGetResult{" +
                "errorDisplay='" + errorDisplay + '\'' +
                ", userProfileItemList=" + userProfileItemList +
                ", failAccount=" + failAccount +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
