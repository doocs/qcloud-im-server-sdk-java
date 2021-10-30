package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

/**
 * @author hyh
 * @since 2021/08/02 16:11
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModifyGroupBaseInfoRequest extends GenericRequest {
    @JsonProperty("GroupId")
    private String groupId;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Introduction")
    private String introduction;

    @JsonProperty("Notification")
    private String notification;

    @JsonProperty("FaceUrl")
    private String faceUrl;

    @JsonProperty("MaxMemberNum")
    private Integer maxMemberNum;

    @JsonProperty("ApplyJoinOption")
    private String applyJoinOption;

    @JsonProperty("ShutUpAllMember")
    private String shutUpAllMember;

    @JsonProperty("AppDefinedData")
    private List<Map<String, Object>> appDefinedData;

    public ModifyGroupBaseInfoRequest(String groupId) {
        this.groupId = groupId;
    }

    public ModifyGroupBaseInfoRequest(String groupId, String name, String introduction, String notification, String faceUrl, Integer maxMemberNum, String applyJoinOption, String shutUpAllMember, List<Map<String, Object>> appDefinedData) {
        this.groupId = groupId;
        this.name = name;
        this.introduction = introduction;
        this.notification = notification;
        this.faceUrl = faceUrl;
        this.maxMemberNum = maxMemberNum;
        this.applyJoinOption = applyJoinOption;
        this.shutUpAllMember = shutUpAllMember;
        this.appDefinedData = appDefinedData;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getNotification() {
        return notification;
    }

    public void setNotification(String notification) {
        this.notification = notification;
    }

    public String getFaceUrl() {
        return faceUrl;
    }

    public void setFaceUrl(String faceUrl) {
        this.faceUrl = faceUrl;
    }

    public Integer getMaxMemberNum() {
        return maxMemberNum;
    }

    public void setMaxMemberNum(Integer maxMemberNum) {
        this.maxMemberNum = maxMemberNum;
    }

    public String getApplyJoinOption() {
        return applyJoinOption;
    }

    public void setApplyJoinOption(String applyJoinOption) {
        this.applyJoinOption = applyJoinOption;
    }

    public String getShutUpAllMember() {
        return shutUpAllMember;
    }

    public void setShutUpAllMember(String shutUpAllMember) {
        this.shutUpAllMember = shutUpAllMember;
    }

    public List<Map<String, Object>> getAppDefinedData() {
        return appDefinedData;
    }

    public void setAppDefinedData(List<Map<String, Object>> appDefinedData) {
        this.appDefinedData = appDefinedData;
    }
}
