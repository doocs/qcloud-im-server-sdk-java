package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author bingo
 * @since 2021/10/11 10:37
 */
public class RecentContactSessionItem {
    /**
     * 会话类型：1 表示 C2C 会话；2 表示 G2C 会话
     */
    @JsonProperty("Type")
    private Integer type;

    /**
     * C2C 会话才会返回，返回会话方的 UserID
     */
    @JsonProperty("To_Account")
    private String toAccount;

    /**
     * G2C 会话才会返回，返回群 ID
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * 会话时间
     */
    @JsonProperty("MsgTime")
    private Integer msgTime;

    /**
     * 置顶标记：0 标识普通会话；1 标识置顶会话
     */
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

    public Integer getMsgTime() {
        return msgTime;
    }

    public void setMsgTime(Integer msgTime) {
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
