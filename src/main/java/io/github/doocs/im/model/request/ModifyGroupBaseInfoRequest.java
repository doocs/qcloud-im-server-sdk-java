package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.doocs.im.constant.MuteAllMember;
import io.github.doocs.im.model.group.AppDefinedDataItem;

import java.io.Serializable;
import java.util.List;

/**
 * 修改群基础资料-请求参数
 *
 * @author hyh
 * @since 2021/08/02 16:11
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModifyGroupBaseInfoRequest extends GenericRequest implements Serializable {
    private static final long serialVersionUID = -532498699781129907L;
    /**
     * 需要修改基础信息的群组的 ID
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * 群名称，最长30字节，使用 UTF-8 编码，1个汉字占3个字节
     */
    @JsonProperty("Name")
    private String name;

    /**
     * 群简介，最长240字节，使用 UTF-8 编码，1个汉字占3个字节
     */
    @JsonProperty("Introduction")
    private String introduction;

    /**
     * 群公告，最长300字节，使用 UTF-8 编码，1个汉字占3个字节
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
     * 好友工作群（Work），陌生人社交群（Public），临时会议群（Meeting）及社群（Community）：该字段阈值请参见 群组系统 中的群成员人数上限相关说明
     * 直播群（AVChatRoom）：该字段为无效字段，无需填写
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
     * {@link MuteAllMember}
     */
    @JsonProperty("MuteAllMember")
    private String muteAllMember;

    /**
     * 邀请加群处理方式，包含
     * FreeAccess （直接邀请用户进群，不需要审批等操作），
     * NeedPermission 需要群管理员或者群主审批，
     * DisableInvite 不支持 SDK 邀请邀请进群， 该选项 AVChatRoom 群类型不支持
     */
    @JsonProperty("InviteJoinOption")
    private String inviteJoinOption;

    /**
     * 操作者来源账号，选填。如果不填写该字段，则修改群资料的操作者为调用该接口时使用的 App 管理员账号。除此之外，App 亦可通过该字段“伪造”修改群资料的操作者，从而实现一些特殊的功能需求。需要注意的是，如果指定该字段，必须要确保字段中的账号是存在的
     */
    @JsonProperty("From_Account")
    private String fromAccount;

    /**
     * 仅支持话题的社群可以设置该字段
     * 是否启用权限组作为权限判断依据
     * 0：不启用
     * 1：启用
     */
    @JsonProperty("EnablePermission")
    private Integer enablePermission;

    /**
     * 仅启用权限组作为权限判断依据的群可以设置该字段
     * 群成员在该群中的默认权限
     */
    @JsonProperty("DefaultPermission")
    private Integer defaultPermission;

    /**
     * 仅支持 Work，Public， Meeting 群，表示是否支持群成员拉进群前消息。
     * Off：表示关闭
     * On：表示打开
     */
    @JsonProperty("HistoryMsgBeforeJoin")
    private String historyMsgBeforeJoin;

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
                                      String muteAllMember, List<AppDefinedDataItem> appDefinedData,
                                      String inviteJoinOption, String fromAccount, Integer enablePermission,
                                      Integer defaultPermission, String historyMsgBeforeJoin) {
        this.groupId = groupId;
        this.name = name;
        this.introduction = introduction;
        this.notification = notification;
        this.faceUrl = faceUrl;
        this.maxMemberNum = maxMemberNum;
        this.applyJoinOption = applyJoinOption;
        this.muteAllMember = muteAllMember;
        this.appDefinedData = appDefinedData;
        this.inviteJoinOption = inviteJoinOption;
        this.fromAccount = fromAccount;
        this.enablePermission = enablePermission;
        this.defaultPermission = defaultPermission;
        this.historyMsgBeforeJoin = historyMsgBeforeJoin;
    }

    private ModifyGroupBaseInfoRequest(Builder builder) {
        this.groupId = builder.groupId;
        this.name = builder.name;
        this.introduction = builder.introduction;
        this.notification = builder.notification;
        this.faceUrl = builder.faceUrl;
        this.maxMemberNum = builder.maxMemberNum;
        this.applyJoinOption = builder.applyJoinOption;
        this.muteAllMember = builder.muteAllMember;
        this.appDefinedData = builder.appDefinedData;
        this.inviteJoinOption = builder.inviteJoinOption;
        this.fromAccount = builder.fromAccount;
        this.enablePermission = builder.enablePermission;
        this.defaultPermission = builder.defaultPermission;
        this.historyMsgBeforeJoin = builder.historyMsgBeforeJoin;
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

    public String getMuteAllMember() {
        return muteAllMember;
    }

    public void setMuteAllMember(String muteAllMember) {
        this.muteAllMember = muteAllMember;
    }

    public List<AppDefinedDataItem> getAppDefinedData() {
        return appDefinedData;
    }

    public void setAppDefinedData(List<AppDefinedDataItem> appDefinedData) {
        this.appDefinedData = appDefinedData;
    }

    public String getInviteJoinOption() {
        return inviteJoinOption;
    }

    public void setInviteJoinOption(String inviteJoinOption) {
        this.inviteJoinOption = inviteJoinOption;
    }

    public String getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
    }

    public Integer getEnablePermission() {
        return enablePermission;
    }

    public void setEnablePermission(Integer enablePermission) {
        this.enablePermission = enablePermission;
    }

    public Integer getDefaultPermission() {
        return defaultPermission;
    }

    public void setDefaultPermission(Integer defaultPermission) {
        this.defaultPermission = defaultPermission;
    }

    public String getHistoryMsgBeforeJoin() {
        return historyMsgBeforeJoin;
    }

    public void setHistoryMsgBeforeJoin(String historyMsgBeforeJoin) {
        this.historyMsgBeforeJoin = historyMsgBeforeJoin;
    }

    public static final class Builder {
        private String groupId;
        private String name;
        private String introduction;
        private String notification;
        private String faceUrl;
        private Integer maxMemberNum;
        private String applyJoinOption;
        private String muteAllMember;
        private List<AppDefinedDataItem> appDefinedData;
        private String inviteJoinOption;
        private String fromAccount;
        private Integer enablePermission;
        private Integer defaultPermission;
        private String historyMsgBeforeJoin;

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

        public Builder muteAllMember(String muteAllMember) {
            this.muteAllMember = muteAllMember;
            return this;
        }

        public Builder appDefinedData(List<AppDefinedDataItem> appDefinedData) {
            this.appDefinedData = appDefinedData;
            return this;
        }

        public Builder inviteJoinOption(String inviteJoinOption) {
            this.inviteJoinOption = inviteJoinOption;
            return this;
        }

        public Builder fromAccount(String fromAccount) {
            this.fromAccount = fromAccount;
            return this;
        }

        public Builder enablePermission(Integer enablePermission) {
            this.enablePermission = enablePermission;
            return this;
        }

        public Builder defaultPermission(Integer defaultPermission) {
            this.defaultPermission = defaultPermission;
            return this;
        }

        public Builder historyMsgBeforeJoin(String historyMsgBeforeJoin) {
            this.historyMsgBeforeJoin = historyMsgBeforeJoin;
            return this;
        }
    }
}
