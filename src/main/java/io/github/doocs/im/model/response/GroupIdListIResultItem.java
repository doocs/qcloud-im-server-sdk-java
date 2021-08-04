package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author bingo
 * @since 2021/8/4 10:48
 */
public class GroupIdListIResultItem {
    @JsonProperty("GroupId")
    private String groupId;

    @JsonProperty("Type")
    private String type;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Introduction")
    private String introduction;

    @JsonProperty("Notification")
    private String notification;

    @JsonProperty("FaceUrl")
    private String faceUrl;

    @JsonProperty("Owner_Account")
    private String ownerAccount;

    @JsonProperty("CreateTime")
    private Integer createTime;

    @JsonProperty("InfoSeq")
    private Integer infoSeq;

    @JsonProperty("LastInfoTime")
    private Integer lastInfoTime;

    @JsonProperty("LastMsgTime")
    private Integer lastMsgTime;

    @JsonProperty("NextMsgSeq")
    private Integer nextMsgSeq;

    @JsonProperty("MemberNum")
    private Integer memberNum;

    @JsonProperty("MaxMemberNum")
    private Integer maxMemberNum;

    @JsonProperty("ApplyJoinOption")
    private String applyJoinOption;

    @Override
    public String toString() {
        return "GroupIdListIResultItem{" +
                "groupId='" + groupId + '\'' +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", introduction='" + introduction + '\'' +
                ", notification='" + notification + '\'' +
                ", faceUrl='" + faceUrl + '\'' +
                ", ownerAccount='" + ownerAccount + '\'' +
                ", createTime=" + createTime +
                ", infoSeq=" + infoSeq +
                ", lastInfoTime=" + lastInfoTime +
                ", lastMsgTime=" + lastMsgTime +
                ", nextMsgSeq=" + nextMsgSeq +
                ", memberNum=" + memberNum +
                ", maxMemberNum=" + maxMemberNum +
                ", applyJoinOption='" + applyJoinOption + '\'' +
                '}';
    }
}
