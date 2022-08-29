package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 获取封禁群成员列表-结果
 *
 * @author bingo
 * @since 2021/8/29 11:47
 */
public class GetGroupBanMemberResult extends GenericResult {
    /**
     * 封禁成员信息，BannedUntil 为封禁成员的封禁截止时间，Member_Account 为封禁成员账号 id
     */
    @JsonProperty("BannedAccountList")
    private List<BannedAccountItem> bannedAccountList;

    /**
     * 下次请求的 Offset 值，如果此值为0，表示该 AVChatRoom 群的封禁成员列表已经拉取完毕
     */
    @JsonProperty("NextOffset")
    private Integer nextOffset;

    public List<BannedAccountItem> getBannedAccountList() {
        return bannedAccountList;
    }

    public void setBannedAccountList(List<BannedAccountItem> bannedAccountList) {
        this.bannedAccountList = bannedAccountList;
    }

    public Integer getNextOffset() {
        return nextOffset;
    }

    public void setNextOffset(Integer nextOffset) {
        this.nextOffset = nextOffset;
    }

    @Override
    public String toString() {
        return "GetGroupBanMemberResult{" +
                "bannedAccountList=" + bannedAccountList +
                ", nextOffset=" + nextOffset +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
