package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 用户搜索结果中的单个用户信息
 *
 * @author MC.Yang
 * @version V1.0
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserProfileResultItem implements Serializable {
    private static final long serialVersionUID = -42884255649710654L;

    /**
     * 命中的用户 UserID
     */
    @JsonProperty("UserID")
    private String userId;

    /**
     * 命中的用户所有标准资料字段
     */
    @JsonProperty("ProfileItems")
    private List<ProfileItemValue> profileItems;

    public UserProfileResultItem() {
    }

    public UserProfileResultItem(String userId, List<ProfileItemValue> profileItems) {
        this.userId = userId;
        this.profileItems = profileItems;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<ProfileItemValue> getProfileItems() {
        return profileItems;
    }

    public void setProfileItems(List<ProfileItemValue> profileItems) {
        this.profileItems = profileItems;
    }

    @Override
    public String toString() {
        return "UserProfileResultItem{" +
                "userId='" + userId + '\'' +
                ", profileItems=" + profileItems +
                '}';
    }
}