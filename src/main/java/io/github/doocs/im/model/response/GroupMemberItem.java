package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 群成员搜索结果项
 *
 * @author MC.Yang
 * @since 2024/01/29
 */
public class GroupMemberItem implements Serializable {
    private static final long serialVersionUID = 7517968104472517297L;

    /**
     * 群组类型
     */
    @JsonProperty("GroupType")
    private String groupType;

    /**
     * 群组 ID
     */
    @JsonProperty("GroupID")
    private String groupId;

    /**
     * 群组名称
     */
    @JsonProperty("GroupName")
    private String groupName;

    /**
     * 群成员 UserID
     */
    @JsonProperty("GroupMemberUserID")
    private String groupMemberUserId;

    /**
     * 群成员 TinyID
     */
    @JsonProperty("GroupMemberTinyID")
    private Long groupMemberTinyId;

    /**
     * 群成员用户名
     */
    @JsonProperty("GroupMemberUserName")
    private String groupMemberUserName;

    /**
     * 群成员名片
     */
    @JsonProperty("GroupMemberNameCard")
    private String groupMemberNameCard;

    public String getGroupType() {
        return groupType;
    }

    public void setGroupType(String groupType) {
        this.groupType = groupType;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupMemberUserId() {
        return groupMemberUserId;
    }

    public void setGroupMemberUserId(String groupMemberUserId) {
        this.groupMemberUserId = groupMemberUserId;
    }

    public Long getGroupMemberTinyId() {
        return groupMemberTinyId;
    }

    public void setGroupMemberTinyId(Long groupMemberTinyId) {
        this.groupMemberTinyId = groupMemberTinyId;
    }

    public String getGroupMemberUserName() {
        return groupMemberUserName;
    }

    public void setGroupMemberUserName(String groupMemberUserName) {
        this.groupMemberUserName = groupMemberUserName;
    }

    public String getGroupMemberNameCard() {
        return groupMemberNameCard;
    }

    public void setGroupMemberNameCard(String groupMemberNameCard) {
        this.groupMemberNameCard = groupMemberNameCard;
    }

    @Override
    public String toString() {
        return "GroupMemberItem{" +
                "groupType='" + groupType + '\'' +
                ", groupId='" + groupId + '\'' +
                ", groupName='" + groupName + '\'' +
                ", groupMemberUserId='" + groupMemberUserId + '\'' +
                ", groupMemberTinyId=" + groupMemberTinyId +
                ", groupMemberUserName='" + groupMemberUserName + '\'' +
                ", groupMemberNameCard='" + groupMemberNameCard + '\'' +
                '}';
    }
}