package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

/**
 * @author hyh
 * @since 2021/08/02 16:32
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModifyGroupMemberInfoRequest extends GenericRequest {
    @JsonProperty("GroupId")
    private String groupId;

    @JsonProperty("Member_Account")
    private String memberAccount;

    @JsonProperty("Role")
    private String role;

    @JsonProperty("MsgFlag")
    private String msgFlag;

    @JsonProperty("NameCard")
    private String nameCard;

    @JsonProperty("AppMemberDefinedData")
    private List<Map<String, Object>> appMemberDefinedData;

    @JsonProperty("ShutUpTime")
    private Integer shutUpTime;

    public ModifyGroupMemberInfoRequest() {
    }

    public ModifyGroupMemberInfoRequest(String groupId, String memberAccount) {
        this.groupId = groupId;
        this.memberAccount = memberAccount;
    }

    public ModifyGroupMemberInfoRequest(String groupId, String memberAccount, String role, String msgFlag,
                                        String nameCard, List<Map<String, Object>> appMemberDefinedData, Integer shutUpTime) {
        this.groupId = groupId;
        this.memberAccount = memberAccount;
        this.role = role;
        this.msgFlag = msgFlag;
        this.nameCard = nameCard;
        this.appMemberDefinedData = appMemberDefinedData;
        this.shutUpTime = shutUpTime;
    }

    private ModifyGroupMemberInfoRequest(Builder builder) {
        this.groupId = builder.groupId;
        this.memberAccount = builder.memberAccount;
        this.role = builder.role;
        this.msgFlag = builder.msgFlag;
        this.nameCard = builder.nameCard;
        this.appMemberDefinedData = builder.appMemberDefinedData;
        this.shutUpTime = builder.shutUpTime;
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

    public Integer getShutUpTime() {
        return shutUpTime;
    }

    public void setShutUpTime(Integer shutUpTime) {
        this.shutUpTime = shutUpTime;
    }


    public static final class Builder {
        private String groupId;
        private String memberAccount;
        private String role;
        private String msgFlag;
        private String nameCard;
        private List<Map<String, Object>> appMemberDefinedData;
        private Integer shutUpTime;

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

        public Builder shutUpTime(Integer shutUpTime) {
            this.shutUpTime = shutUpTime;
            return this;
        }
    }
}
