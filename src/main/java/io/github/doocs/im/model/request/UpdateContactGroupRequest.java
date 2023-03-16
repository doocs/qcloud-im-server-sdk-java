package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 更新会话分组数据-请求参数
 *
 * @author bingo
 * @since 2023/3/16 11:33
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateContactGroupRequest extends GenericRequest {
    /**
     * 请求方uid
     */
    @JsonProperty("From_Account")
    private String fromAccount;

    /**
     * 1 - 分组添加或删除会话
     */
    @JsonProperty("UpdateType")
    private Integer updateType;

    /**
     * 分组纬度增删会话
     */
    @JsonProperty("UpdateGroup")
    private UpdateGroup updateGroup;

    public UpdateContactGroupRequest() {
    }

    public UpdateContactGroupRequest(String fromAccount, Integer updateType, UpdateGroup updateGroup) {
        this.fromAccount = fromAccount;
        this.updateType = updateType;
        this.updateGroup = updateGroup;
    }

    private UpdateContactGroupRequest(Builder builder) {
        this.fromAccount = builder.fromAccount;
        this.updateType = builder.updateType;
        this.updateGroup = builder.updateGroup;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
    }

    public Integer getUpdateType() {
        return updateType;
    }

    public void setUpdateType(Integer updateType) {
        this.updateType = updateType;
    }

    public UpdateGroup getUpdateGroup() {
        return updateGroup;
    }

    public void setUpdateGroup(UpdateGroup updateGroup) {
        this.updateGroup = updateGroup;
    }


    public static final class Builder {
        private String fromAccount;
        private Integer updateType;
        private UpdateGroup updateGroup;

        private Builder() {
        }

        public UpdateContactGroupRequest build() {
            return new UpdateContactGroupRequest(this);
        }

        public Builder fromAccount(String fromAccount) {
            this.fromAccount = fromAccount;
            return this;
        }

        public Builder updateType(Integer updateType) {
            this.updateType = updateType;
            return this;
        }

        public Builder updateGroup(UpdateGroup updateGroup) {
            this.updateGroup = updateGroup;
            return this;
        }
    }
}
