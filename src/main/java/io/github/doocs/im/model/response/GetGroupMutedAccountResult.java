package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 获取被禁言群成员列表-结果
 *
 * @author bingo
 * @since 2021/8/4 11:22
 */
public class GetGroupMutedAccountResult extends GenericResult {
    /**
     * 返回结果为禁言用户信息数组，内容包括被禁言的成员 ID，及其被禁言到的时间（使用 UTC 时间，即世界协调时间）
     */
    @JsonProperty("MutedAccountList")
    private List<MutedAccountItem> mutedAccountList;

    public List<MutedAccountItem> getMutedAccountList() {
        return mutedAccountList;
    }

    public void setMutedAccountList(List<MutedAccountItem> mutedAccountList) {
        this.mutedAccountList = mutedAccountList;
    }

    @Override
    public String toString() {
        return "GetGroupMutedAccountResult{" +
                "mutedAccountList=" + mutedAccountList +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
