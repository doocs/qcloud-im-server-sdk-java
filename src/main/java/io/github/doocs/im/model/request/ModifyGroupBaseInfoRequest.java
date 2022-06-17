package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.doocs.im.model.group.AppDefinedDataItem;

import java.util.List;

/**
 * 修改群基础资料-请求参数
 *
 * @author hyh
 * @since 2021/08/02 16:11
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModifyGroupBaseInfoRequest extends GenericRequest {
    /**
     * 需要修改基础信息的群组的 ID
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * 群名称，最长30字节
     */
    @JsonProperty("Name")
    private String name;

    /**
     * 群简介，最长240字节
     */
    @JsonProperty("Introduction")
    private String introduction;

    /**
     * 群公告，最长300字节
     */
    @JsonProperty("Notification")
    private String notification;

    /**
     * 群头像 URL，最长100字节
     */
    @JsonProperty("FaceUrl")
    private String faceUrl;

    /**
     * 最大群成员数量
     * 私有群、公开群和聊天室：该字段阈值请参考 群组系统 和 计费概述 中的群成员人数上限相关说明
     * 音视频聊天室和在线成员广播大群：该字段为无效字段，无需填写
     */
    @JsonProperty("MaxMemberNum")
    private Integer maxMemberNum;

    /**
     * 申请加群处理方式。包含 FreeAccess（自由加入），NeedPermission（需要验证），DisableApply（禁止加群）
     * {@link io.github.doocs.im.constant.ApplyJoinOption}
     */
    @JsonProperty("ApplyJoinOption")
    private String applyJoinOption;

    /**
     * 默认情况是没有的。开通群组维度的自定义字段详情请参见 自定义字段
     * {@link io.github.doocs.im.constant.ShutUpAllMember}
     */
    @JsonProperty("ShutUpAllMember")
    private String shutUpAllMember;

    /**
     * 群内群成员禁言，只有群管理员和群主以及系统管理员可以发言
     */
    @JsonProperty("AppDefinedData")
    private List<AppDefinedDataItem> appDefinedData;

    public ModifyGroupBaseInfoRequest() {
    }

    public ModifyGroupBaseInfoRequest(String groupId) {
        this.groupId = groupId;
    }

    public ModifyGroupBaseInfoRequest(String groupId, String name, String introduction, String notification,
                                      String faceUrl, Integer maxMemberNum, String applyJoinOption,
                                      String shutUpAllMember, List<AppDefinedDataItem> appDefinedData) {
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

    private ModifyGroupBaseInfoRequest(Builder builder) {
        this.groupId = builder.groupId;
        this.name = builder.name;
        this.introduction = builder.introduction;
        this.notification = builder.notification;
        this.faceUrl = builder.faceUrl;
        this.maxMemberNum = builder.maxMemberNum;
        this.applyJoinOption = builder.applyJoinOption;
        this.shutUpAllMember = builder.shutUpAllMember;
        this.appDefinedData = builder.appDefinedData;
    }

    public static Builder builder() {
        return new Builder();
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

    public List<AppDefinedDataItem> getAppDefinedData() {
        return appDefinedData;
    }

    public void setAppDefinedData(List<AppDefinedDataItem> appDefinedData) {
        this.appDefinedData = appDefinedData;
    }


    public static final class Builder {
        private String groupId;
        private String name;
        private String introduction;
        private String notification;
        private String faceUrl;
        private Integer maxMemberNum;
        private String applyJoinOption;
        private String shutUpAllMember;
        private List<AppDefinedDataItem> appDefinedData;

        private Builder() {
        }

        public ModifyGroupBaseInfoRequest build() {
            return new ModifyGroupBaseInfoRequest(this);
        }

        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder introduction(String introduction) {
            this.introduction = introduction;
            return this;
        }

        public Builder notification(String notification) {
            this.notification = notification;
            return this;
        }

        public Builder faceUrl(String faceUrl) {
            this.faceUrl = faceUrl;
            return this;
        }

        public Builder maxMemberNum(Integer maxMemberNum) {
            this.maxMemberNum = maxMemberNum;
            return this;
        }

        public Builder applyJoinOption(String applyJoinOption) {
            this.applyJoinOption = applyJoinOption;
            return this;
        }

        public Builder shutUpAllMember(String shutUpAllMember) {
            this.shutUpAllMember = shutUpAllMember;
            return this;
        }

        public Builder appDefinedData(List<AppDefinedDataItem> appDefinedData) {
            this.appDefinedData = appDefinedData;
            return this;
        }
    }
}
