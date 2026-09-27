package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * <p>
 * 隐藏搜索对象-请求参数
 * </p>
 *
 * @author MC.Yang
 * @version V1.0
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SetVisibilityRequest extends GenericRequest implements Serializable {
    private static final long serialVersionUID = -5968159529237231169L;

    /**
     * 搜索对象类型：
     * 1=用户搜索。
     * 2=群组搜索。
     * 3=群成员搜索。
     */
    @JsonProperty("SetType")
    private Integer setType;

    /**
     * 需要隐藏的用户 UserID，SetType为1和3时需要。
     */
    @JsonProperty("UserID")
    private String userId;

    /**
     * 需要隐藏的群组 GroupID，SetType为1和2时需要。
     */
    @JsonProperty("GroupID")
    private String groupId;

    /**
     * 默认为 false，true 表示隐藏对应搜索对象，false 表示显示对应搜索对象。
     */
    @JsonProperty("IsDisable")
    private Boolean isDisable;

    public SetVisibilityRequest() {
    }

    public SetVisibilityRequest(Integer setType) {
        this.setType = setType;
    }

    public SetVisibilityRequest(Integer setType, String userId, String groupId, Boolean isDisable) {
        this.setType = setType;
        this.userId = userId;
        this.groupId = groupId;
        this.isDisable = isDisable;
    }

    private SetVisibilityRequest(Builder builder) {
        this.setType = builder.setType;
        this.userId = builder.userId;
        this.groupId = builder.groupId;
        this.isDisable = builder.isDisable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public Integer getSetType() {
        return setType;
    }

    public void setSetType(Integer setType) {
        this.setType = setType;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public Boolean getIsDisable() {
        return isDisable;
    }

    public void setIsDisable(Boolean isDisable) {
        this.isDisable = isDisable;
    }

    public static final class Builder {
        private Integer setType;
        private String userId;
        private String groupId;
        private Boolean isDisable;

        private Builder() {
        }

        public SetVisibilityRequest build() {
            return new SetVisibilityRequest(this);
        }

        public Builder setType(Integer setType) {
            this.setType = setType;
            return this;
        }

        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        public Builder isDisable(Boolean isDisable) {
            this.isDisable = isDisable;
            return this;
        }
    }
}
