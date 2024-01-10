package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 设置/取消直播群管理员-请求参数
 *
 * @author bingo
 * @since 2024/1/9 17:14
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModifyAdminRequest extends GenericRequest implements Serializable {
    private static final long serialVersionUID = 5585650728372773365L;

    /**
     * 操作的群 ID
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * 1: 设置管理员
     * 2: 取消设置管理员
     */
    @JsonProperty("CommandType")
    private Integer commandType;

    /**
     * 要修改的管理员 UserID 列表，一个直播群最多可以设置5个管理员
     */
    @JsonProperty("Admin_Account")
    private List<String> adminAccount;

    public ModifyAdminRequest() {
    }

    public ModifyAdminRequest(String groupId, Integer commandType, List<String> adminAccount) {
        this.groupId = groupId;
        this.commandType = commandType;
        this.adminAccount = adminAccount;
    }

    private ModifyAdminRequest(Builder builder) {
        this.groupId = builder.groupId;
        this.commandType = builder.commandType;
        this.adminAccount = builder.adminAccount;
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

    public Integer getCommandType() {
        return commandType;
    }

    public void setCommandType(Integer commandType) {
        this.commandType = commandType;
    }

    public List<String> getAdminAccount() {
        return adminAccount;
    }

    public void setAdminAccount(List<String> adminAccount) {
        this.adminAccount = adminAccount;
    }


    public static final class Builder {
        private String groupId;
        private Integer commandType;
        private List<String> adminAccount;

        private Builder() {
        }

        public ModifyAdminRequest build() {
            return new ModifyAdminRequest(this);
        }

        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        public Builder commandType(Integer commandType) {
            this.commandType = commandType;
            return this;
        }

        public Builder adminAccount(List<String> adminAccount) {
            this.adminAccount = adminAccount;
            return this;
        }
    }
}
