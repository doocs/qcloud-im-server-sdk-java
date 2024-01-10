package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 拉取公众号用户历史消息-结果
 *
 * @author bingo
 * @since 2024/1/10 10:25
 */
public class OfficialAccountMsgGetSimpleResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = -661932033057889042L;

    /**
     * 请求中的公众号用户
     */
    @JsonProperty("Official_Account")
    private String officialAccount;

    /**
     * 是否返回了请求区间的全部消息
     * 当成功返回了请求区间的全部消息时，值为1
     * 当消息长度太长或者区间太大（超过20）导致无法返回全部消息时，值为0
     * 当请求区间之前的所有消息都过期时，值为2
     */
    @JsonProperty("IsFinished")
    private Integer isFinished;

    /**
     * 返回的消息列表
     */
    @JsonProperty("RspMsgList")
    private List<RspMsgItem> rspMsgList;

    /**
     * 续拉的key
     */
    @JsonProperty("LastMsgKey")
    private String lastMsgKey;

    public String getOfficialAccount() {
        return officialAccount;
    }

    public void setOfficialAccount(String officialAccount) {
        this.officialAccount = officialAccount;
    }

    public Integer getIsFinished() {
        return isFinished;
    }

    public void setIsFinished(Integer isFinished) {
        this.isFinished = isFinished;
    }

    public List<RspMsgItem> getRspMsgList() {
        return rspMsgList;
    }

    public void setRspMsgList(List<RspMsgItem> rspMsgList) {
        this.rspMsgList = rspMsgList;
    }

    public String getLastMsgKey() {
        return lastMsgKey;
    }

    public void setLastMsgKey(String lastMsgKey) {
        this.lastMsgKey = lastMsgKey;
    }

    @Override
    public String toString() {
        return "OfficialAccountMsgGetSimpleResult{" +
                "officialAccount='" + officialAccount + '\'' +
                ", isFinished=" + isFinished +
                ", rspMsgList=" + rspMsgList +
                ", lastMsgKey='" + lastMsgKey + '\'' +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
