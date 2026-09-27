package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 群组搜索结果中的单个群组信息
 *
 * @author MC.Yang
 * @version V1.0
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GroupSearchItem implements Serializable {
    private static final long serialVersionUID = -42884255649710655L;

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
     * 群组人数
     */
    @JsonProperty("GroupMemberNum")
    private Integer groupMemberNum;

    /**
     * 群组头像
     */
    @JsonProperty("GroupFaceUrl")
    private String groupFaceUrl;

    /**
     * 群组简介
     */
    @JsonProperty("GroupIntroduction")
    private String groupIntroduction;

    /**
     * 群主 UserID
     */
    @JsonProperty("GroupOwnerUserID")
    private String groupOwnerUserId;

    /**
     * 群主 TinyID
     */
    @JsonProperty("GroupOwnerTinyID")
    private Integer groupOwnerTinyId;

    /**
     * 群主昵称
     */
    @JsonProperty("GroupOwnerUserName")
    private String groupOwnerUserName;

    public GroupSearchItem() {
    }

    public GroupSearchItem(String groupType, String groupId, String groupName, Integer groupMemberNum,
                           String groupFaceUrl, String groupIntroduction, String groupOwnerUserId,
                           Integer groupOwnerTinyId, String groupOwnerUserName) {
        this.groupType = groupType;
        this.groupId = groupId;
        this.groupName = groupName;
        this.groupMemberNum = groupMemberNum;
        this.groupFaceUrl = groupFaceUrl;
        this.groupIntroduction = groupIntroduction;
        this.groupOwnerUserId = groupOwnerUserId;
        this.groupOwnerTinyId = groupOwnerTinyId;
        this.groupOwnerUserName = groupOwnerUserName;
    }

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

    public Integer getGroupMemberNum() {
        return groupMemberNum;
    }

    public void setGroupMemberNum(Integer groupMemberNum) {
        this.groupMemberNum = groupMemberNum;
    }

    public String getGroupFaceUrl() {
        return groupFaceUrl;
    }

    public void setGroupFaceUrl(String groupFaceUrl) {
        this.groupFaceUrl = groupFaceUrl;
    }

    public String getGroupIntroduction() {
        return groupIntroduction;
    }

    public void setGroupIntroduction(String groupIntroduction) {
        this.groupIntroduction = groupIntroduction;
    }

    public String getGroupOwnerUserId() {
        return groupOwnerUserId;
    }

    public void setGroupOwnerUserId(String groupOwnerUserId) {
        this.groupOwnerUserId = groupOwnerUserId;
    }

    public Integer getGroupOwnerTinyId() {
        return groupOwnerTinyId;
    }

    public void setGroupOwnerTinyId(Integer groupOwnerTinyId) {
        this.groupOwnerTinyId = groupOwnerTinyId;
    }

    public String getGroupOwnerUserName() {
        return groupOwnerUserName;
    }

    public void setGroupOwnerUserName(String groupOwnerUserName) {
        this.groupOwnerUserName = groupOwnerUserName;
    }

    @Override
    public String toString() {
        return "GroupSearchItem{" +
                "groupType='" + groupType + '\'' +
                ", groupId='" + groupId + '\'' +
                ", groupName='" + groupName + '\'' +
                ", groupMemberNum=" + groupMemberNum +
                ", groupFaceUrl='" + groupFaceUrl + '\'' +
                ", groupIntroduction='" + groupIntroduction + '\'' +
                ", groupOwnerUserId='" + groupOwnerUserId + '\'' +
                ", groupOwnerTinyId=" + groupOwnerTinyId +
                ", groupOwnerUserName='" + groupOwnerUserName + '\'' +
                '}';
    }
}