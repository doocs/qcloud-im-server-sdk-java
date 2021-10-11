package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author bingo
 * @since 2021/10/11 10:37
 */
public class RecentContactSessionItem {
    @JsonProperty("Type")
    private Integer type;

    @JsonProperty("To_Account")
    private String toAccount;

    @JsonProperty("GroupId")
    private String groupId;

    @JsonProperty("MsgTime")
    private String msgTime;

    @JsonProperty("TopFlag")
    private Integer topFlag;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getToAccount() {
        return toAccount;
    }

    public void setToAccount(String toAccount) {
        this.toAccount = toAccount;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getMsgTime() {
        return msgTime;
    }

    public void setMsgTime(String msgTime) {
        this.msgTime = msgTime;
    }

    public Integer getTopFlag() {
        return topFlag;
    }

    public void setTopFlag(Integer topFlag) {
        this.topFlag = topFlag;
    }

    @Override
    public String toString() {
        return "RecentContactSessionItem{" +
                "type=" + type +
                ", toAccount='" + toAccount + '\'' +
                ", groupId='" + groupId + '\'' +
                ", msgTime='" + msgTime + '\'' +
                ", topFlag=" + topFlag +
                '}';
    }
}
