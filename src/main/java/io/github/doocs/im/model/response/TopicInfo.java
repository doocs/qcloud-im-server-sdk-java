package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 话题信息
 *
 * @author bingo
 * @since 2022/8/2 10:45
 */
public class TopicInfo implements Serializable {
    private static final long serialVersionUID = -522887436297174684L;
    /**
     * 话题的名称
     */
    @JsonProperty("TopicName")
    private String topicName;

    /**
     * 话题所在的群组ID
     */
    @JsonProperty("GroupID")
    private String groupId;

    /**
     * 话题头像 URL
     */
    @JsonProperty("FaceUrl")
    private String faceUrl;

    /**
     * 话题的ID
     */
    @JsonProperty("TopicId")
    private String topicId;

    /**
     * 下一条消息的 Seq
     */
    @JsonProperty("NextMsgSeq")
    private Long nextMsgSeq;

    /**
     * 话题公告
     */
    @JsonProperty("Notification")
    private String notification;

    /**
     * 话题简介
     */
    @JsonProperty("Introduction")
    private String introduction;

    /**
     * 话题的创建时间 （UTC 时间）
     */
    @JsonProperty("CreateTime")
    private Integer createTime;

    /**
     * 话题内最后一条消息的时间（UTC 时间）
     */
    @JsonProperty("LastMsgTime")
    private Integer lastMsgTime;

    /**
     * 话题全员禁言标志
     */
    @JsonProperty("ShutUpAllFlag")
    private Integer shutUpAllFlag;

    /**
     * 话题中的自定义字符串
     */
    @JsonProperty("CustomString")
    private String customString;

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getFaceUrl() {
        return faceUrl;
    }

    public void setFaceUrl(String faceUrl) {
        this.faceUrl = faceUrl;
    }

    public String getTopicId() {
        return topicId;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }

    public Long getNextMsgSeq() {
        return nextMsgSeq;
    }

    public void setNextMsgSeq(Long nextMsgSeq) {
        this.nextMsgSeq = nextMsgSeq;
    }

    public String getNotification() {
        return notification;
    }

    public void setNotification(String notification) {
        this.notification = notification;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Integer getLastMsgTime() {
        return lastMsgTime;
    }

    public void setLastMsgTime(Integer lastMsgTime) {
        this.lastMsgTime = lastMsgTime;
    }

    public Integer getShutUpAllFlag() {
        return shutUpAllFlag;
    }

    public void setShutUpAllFlag(Integer shutUpAllFlag) {
        this.shutUpAllFlag = shutUpAllFlag;
    }

    public String getCustomString() {
        return customString;
    }

    public void setCustomString(String customString) {
        this.customString = customString;
    }

    @Override
    public String toString() {
        return "TopicInfo{" +
                "topicName='" + topicName + '\'' +
                ", groupId='" + groupId + '\'' +
                ", faceUrl='" + faceUrl + '\'' +
                ", topicId='" + topicId + '\'' +
                ", nextMsgSeq=" + nextMsgSeq +
                ", notification='" + notification + '\'' +
                ", introduction='" + introduction + '\'' +
                ", createTime=" + createTime +
                ", lastMsgTime=" + lastMsgTime +
                ", shutUpAllFlag=" + shutUpAllFlag +
                ", customString='" + customString + '\'' +
                '}';
    }
}
