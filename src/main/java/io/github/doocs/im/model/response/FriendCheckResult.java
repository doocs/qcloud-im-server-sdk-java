package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 校验好友-结果
 *
 * @author hyh
 * @since 2021/07/30 16:39
 */
public class FriendCheckResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = -5920589144992366878L;
    /**
     * 校验结果对象数组
     */
    @JsonProperty("InfoItem")
    private List<FriendCheckInfoItem> friendCheckInfoItemList;

    /**
     * 返回处理失败的用户列表，仅当存在失败用户时才返回该字段
     */
    @JsonProperty("Fail_Account")
    private List<String> failAccount;

    /**
     * 详细的客户端展示信息
     */
    @JsonProperty("ErrorDisplay")
    private String errorDisplay;

    public List<FriendCheckInfoItem> getFriendCheckInfoItemList() {
        return friendCheckInfoItemList;
    }

    public void setFriendCheckInfoItemList(List<FriendCheckInfoItem> friendCheckInfoItemList) {
        this.friendCheckInfoItemList = friendCheckInfoItemList;
    }

    public List<String> getFailAccount() {
        return failAccount;
    }

    public void setFailAccount(List<String> failAccount) {
        this.failAccount = failAccount;
    }

    public String getErrorDisplay() {
        return errorDisplay;
    }

    public void setErrorDisplay(String errorDisplay) {
        this.errorDisplay = errorDisplay;
    }

    @Override
    public String toString() {
        return "FriendCheckResult{" +
                "friendCheckInfoItemList=" + friendCheckInfoItemList +
                ", failAccount=" + failAccount +
                ", errorDisplay='" + errorDisplay + '\'' +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
