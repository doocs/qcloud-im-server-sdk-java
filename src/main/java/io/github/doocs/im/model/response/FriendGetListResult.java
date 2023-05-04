package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 拉取指定好友-结果
 *
 * @author hyh
 * @since 2021/07/30 16:56
 */
public class FriendGetListResult extends GroupGetResult implements Serializable {
    private static final long serialVersionUID = 4883743340608271686L;
    /**
     * 好友对象数组，每一个好友对象都包含一个 To_Account 字段和一个 SnsProfileItem 数组
     */
    @JsonProperty("InfoItem")
    private List<FriendGetListInfoItem> infoItemList;

    /**
     * 返回处理失败的 UserID 列表，仅当存在失败用户时才返回该字段
     */
    @JsonProperty("Fail_Account")
    private List<String> failAccount;

    /**
     * 详细的客户端展示信息
     */
    @JsonProperty("ErrorDisplay")
    private String errorDisplay;

    public List<FriendGetListInfoItem> getInfoItemList() {
        return infoItemList;
    }

    public void setInfoItemList(List<FriendGetListInfoItem> infoItemList) {
        this.infoItemList = infoItemList;
    }

    public List<String> getFailAccount() {
        return failAccount;
    }

    public void setFailAccount(List<String> failAccount) {
        this.failAccount = failAccount;
    }

    @Override
    public String getErrorDisplay() {
        return errorDisplay;
    }

    @Override
    public void setErrorDisplay(String errorDisplay) {
        this.errorDisplay = errorDisplay;
    }

    @Override
    public String toString() {
        return "FriendGetListResult{" +
                "infoItemList=" + infoItemList +
                ", failAccount=" + failAccount +
                ", errorDisplay='" + errorDisplay + '\'' +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
