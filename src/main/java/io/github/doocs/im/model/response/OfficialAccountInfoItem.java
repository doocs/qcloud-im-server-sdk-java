package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * @author hyh
 * @since 2024/01/10 15:59
 */
public class OfficialAccountInfoItem implements Serializable {
    private static final long serialVersionUID = 5679877352590877974L;
    /**
     * 公众号名称
     */
    @JsonProperty("Name")
    private String name;

    /**
     * 公众号所属的用户
     */
    @JsonProperty("Owner_Account")
    private String ownerAccount;

    /**
     * 公众号内的最后一条消息时间
     */
    @JsonProperty("LastMsgTime")
    private Integer lastMsgTime;

    /**
     * 公众号目前的订阅者人数
     */
    @JsonProperty("SubscriberNum")
    private Integer subscriberNum;

    /**
     * 公众号简介
     */
    @JsonProperty("Introduction")
    private String introduction;

    /**
     * 公众号的头像Url
     */
    @JsonProperty("FaceUrl")
    private String faceUrl;

    /**
     * 公众号的所在组织
     */
    @JsonProperty("Organization")
    private String organization;

    /**
     * 公众号维度的自定义字段
     */
    @JsonProperty("CustomString")
    private String customString;

    /**
     * 订阅者自己的相关信息
     */
    @JsonProperty("SelfInfo")
    private SubscriberSelfInfo selfInfo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwnerAccount() {
        return ownerAccount;
    }

    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

    public Integer getLastMsgTime() {
        return lastMsgTime;
    }

    public void setLastMsgTime(Integer lastMsgTime) {
        this.lastMsgTime = lastMsgTime;
    }

    public Integer getSubscriberNum() {
        return subscriberNum;
    }

    public void setSubscriberNum(Integer subscriberNum) {
        this.subscriberNum = subscriberNum;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getFaceUrl() {
        return faceUrl;
    }

    public void setFaceUrl(String faceUrl) {
        this.faceUrl = faceUrl;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getCustomString() {
        return customString;
    }

    public void setCustomString(String customString) {
        this.customString = customString;
    }

    public SubscriberSelfInfo getSelfInfo() {
        return selfInfo;
    }

    public void setSelfInfo(SubscriberSelfInfo selfInfo) {
        this.selfInfo = selfInfo;
    }

    @Override
    public String toString() {
        return "OfficialAccountInfoItem{" +
                "name='" + name + '\'' +
                ", ownerAccount='" + ownerAccount + '\'' +
                ", lastMsgTime=" + lastMsgTime +
                ", subscriberNum=" + subscriberNum +
                ", introduction='" + introduction + '\'' +
                ", faceUrl='" + faceUrl + '\'' +
                ", organization='" + organization + '\'' +
                ", customString='" + customString + '\'' +
                ", selfInfo=" + selfInfo +
                '}';
    }
}
