package io.github.doocs.im.model.callback;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 公众号资料变动之后回调
 *
 * @author bingo
 * @since 2024/1/10 10:18
 */
public class AfterOfficialAccountInfoChangedCallback implements Serializable {
    private static final long serialVersionUID = -5249665030462050930L;

    /**
     * 回调命令
     */
    @JsonProperty("CallbackCommand")
    private String callbackCommand;

    /**
     * 创建的公众号 ID
     */
    @JsonProperty("Official_Account")
    private String officialAccount;

    /**
     * 发起请求的操作者 UserID
     */
    @JsonProperty("Operator_Account")
    private String operatorAccount;

    /**
     * 变动后的公众号简介
     */
    @JsonProperty("Introduction")
    private String introduction;

    /**
     * 变动后的公众号名称
     */
    @JsonProperty("Name")
    private String name;

    /**
     * 变动后的公众号头像
     */
    @JsonProperty("FaceUrl")
    private String faceUrl;

    /**
     * 变动后的公众号所属组织
     */
    @JsonProperty("Organization")
    private String organization;

    /**
     * 事件触发的毫秒级别时间戳
     */
    @JsonProperty("EventTime")
    private Long eventTime;

    public String getCallbackCommand() {
        return callbackCommand;
    }

    public void setCallbackCommand(String callbackCommand) {
        this.callbackCommand = callbackCommand;
    }

    public String getOfficialAccount() {
        return officialAccount;
    }

    public void setOfficialAccount(String officialAccount) {
        this.officialAccount = officialAccount;
    }

    public String getOperatorAccount() {
        return operatorAccount;
    }

    public void setOperatorAccount(String operatorAccount) {
        this.operatorAccount = operatorAccount;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Long getEventTime() {
        return eventTime;
    }

    public void setEventTime(Long eventTime) {
        this.eventTime = eventTime;
    }
}
