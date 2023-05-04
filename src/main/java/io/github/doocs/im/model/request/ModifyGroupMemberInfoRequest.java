package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * 修改群成员资料-请求参数
 *
 * @author hyh
 * @since 2021/08/02 16:32
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModifyGroupMemberInfoRequest extends GenericRequest implements Serializable {
    private static final long serialVersionUID = 3677899563772404198L;
    /**
     * 操作的群 ID
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * 要操作的群成员
     */
    @JsonProperty("Member_Account")
    private String memberAccount;

    /**
     * 成员身份，Admin/Member 分别为设置/取消管理员
     */
    @JsonProperty("Role")
    private String role;

    /**
     * 消息屏蔽类型
     */
    @JsonProperty("MsgFlag")
    private String msgFlag;

    /**
     * 群名片（最大不超过50个字节）
     */
    @JsonProperty("NameCard")
    private String nameCard;

    /**
     * 群成员维度的自定义字段，默认情况是没有的，可以通过 即时通信 IM 控制台 进行配置，详情请参阅 群组系统
     */
    @JsonProperty("AppMemberDefinedData")
    private List<Map<String, Object>> appMemberDefinedData;

    /**
     * 需禁言时间，单位为秒，0表示取消禁言
     */
    @JsonProperty("MuteTime")
    private Long muteTime;

    public ModifyGroupMemberInfoRequest() {
    }

    public ModifyGroupMemberInfoRequest(String groupId, String memberAccount) {
        this.groupId = groupId;
        this.memberAccount = memberAccount;
    }

    public ModifyGroupMemberInfoRequest(String groupId, String memberAccount, String role, String msgFlag,
                                        String nameCard, List<Map<String, Object>> appMemberDefinedData, Long muteTime) {
        this.groupId = groupId;
        this.memberAccount = memberAccount;
        this.role = role;
        this.msgFlag = msgFlag;
        this.nameCard = nameCard;
        this.appMemberDefinedData = appMemberDefinedData;
        this.muteTime = muteTime;
    }

    private ModifyGroupMemberInfoRequest(Builder builder) {
        this.groupId = builder.groupId;
        this.memberAccount = builder.memberAccount;
        this.role = builder.role;
        this.msgFlag = builder.msgFlag;
        this.nameCard = builder.nameCard;
        this.appMemberDefinedData = builder.appMemberDefinedData;
        this.muteTime = builder.muteTime;
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

    public String getMemberAccount() {
        return memberAccount;
    }

    public void setMemberAccount(String memberAccount) {
        this.memberAccount = memberAccount;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getMsgFlag() {
        return msgFlag;
    }

    public void setMsgFlag(String msgFlag) {
        this.msgFlag = msgFlag;
    }

    public String getNameCard() {
        return nameCard;
    }

    public void setNameCard(String nameCard) {
        this.nameCard = nameCard;
    }

    public List<Map<String, Object>> getAppMemberDefinedData() {
        return appMemberDefinedData;
    }

    public void setAppMemberDefinedData(List<Map<String, Object>> appMemberDefinedData) {
        this.appMemberDefinedData = appMemberDefinedData;
    }

    public Long getMuteTime() {
        return muteTime;
    }

    public void setMuteTime(Long muteTime) {
        this.muteTime = muteTime;
    }


    public static final class Builder {
        private String groupId;
        private String memberAccount;
        private String role;
        private String msgFlag;
        private String nameCard;
        private List<Map<String, Object>> appMemberDefinedData;
        private Long muteTime;

        private Builder() {
        }

        public ModifyGroupMemberInfoRequest build() {
            return new ModifyGroupMemberInfoRequest(this);
        }

        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        public Builder memberAccount(String memberAccount) {
            this.memberAccount = memberAccount;
            return this;
        }

        public Builder role(String role) {
            this.role = role;
            return this;
        }

        public Builder msgFlag(String msgFlag) {
            this.msgFlag = msgFlag;
            return this;
        }

        public Builder nameCard(String nameCard) {
            this.nameCard = nameCard;
            return this;
        }

        public Builder appMemberDefinedData(List<Map<String, Object>> appMemberDefinedData) {
            this.appMemberDefinedData = appMemberDefinedData;
            return this;
        }

        public Builder muteTime(Long muteTime) {
            this.muteTime = muteTime;
            return this;
        }
    }
}
