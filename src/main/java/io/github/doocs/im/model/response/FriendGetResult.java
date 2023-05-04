package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 拉取好友-结果
 *
 * @author hyh
 * @since 2021/07/30 16:47
 */
public class FriendGetResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = -3861928554756570393L;
    /**
     * 好友对象数组，每一个好友对象都包含一个 To_Account 字段和一个 ValueItem 数组
     */
    @JsonProperty("UserDataItem")
    private List<UserDataItem> userDataItemList;

    /**
     * 标配好友数据的 Sequence，客户端可以保存该 Sequence，下次请求时通过请求的 StandardSequence 字段返回给后台
     */
    @JsonProperty("StandardSequence")
    private Integer standardSequence;

    /**
     * 自定义好友数据的 Sequence，客户端可以保存该 Sequence，下次请求时通过请求的 CustomSequence 字段返回给后台
     */
    @JsonProperty("CustomSequence")
    private Integer customSequence;

    /**
     * 好友总数
     */
    @JsonProperty("FriendNum")
    private Integer friendNum;

    /**
     * 分页的结束标识，非0值表示已完成全量拉取
     */
    @JsonProperty("CompleteFlag")
    private Integer completeFlag;

    /**
     * 分页接口下一页的起始位置
     */
    @JsonProperty("NextStartIndex")
    private Integer nextStartIndex;

    /**
     * 详细的客户端展示信息
     */
    @JsonProperty("ErrorDisplay")
    private String errorDisplay;

    public List<UserDataItem> getUserDataItemList() {
        return userDataItemList;
    }

    public void setUserDataItemList(List<UserDataItem> userDataItemList) {
        this.userDataItemList = userDataItemList;
    }

    public Integer getStandardSequence() {
        return standardSequence;
    }

    public void setStandardSequence(Integer standardSequence) {
        this.standardSequence = standardSequence;
    }

    public Integer getCustomSequence() {
        return customSequence;
    }

    public void setCustomSequence(Integer customSequence) {
        this.customSequence = customSequence;
    }

    public Integer getFriendNum() {
        return friendNum;
    }

    public void setFriendNum(Integer friendNum) {
        this.friendNum = friendNum;
    }

    public Integer getCompleteFlag() {
        return completeFlag;
    }

    public void setCompleteFlag(Integer completeFlag) {
        this.completeFlag = completeFlag;
    }

    public Integer getNextStartIndex() {
        return nextStartIndex;
    }

    public void setNextStartIndex(Integer nextStartIndex) {
        this.nextStartIndex = nextStartIndex;
    }

    public String getErrorDisplay() {
        return errorDisplay;
    }

    public void setErrorDisplay(String errorDisplay) {
        this.errorDisplay = errorDisplay;
    }

    @Override
    public String toString() {
        return "FriendGetResult{" +
                "userDataItemList=" + userDataItemList +
                ", standardSequence=" + standardSequence +
                ", customSequence=" + customSequence +
                ", friendNum=" + friendNum +
                ", completeFlag=" + completeFlag +
                ", nextStartIndex=" + nextStartIndex +
                ", errorDisplay='" + errorDisplay + '\'' +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
