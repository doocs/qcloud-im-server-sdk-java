package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.doocs.im.model.request.ProfileItem;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 粉丝/关注/互关列表
 * </p>
 *
 * @author MC.Yang
 * @version V1.0
 **/
public class FollowResultItem implements Serializable {
    private static final long serialVersionUID = -3806086675364942543L;

    /**
     * 粉丝/关注/互关的用户的 UserID
     */
    @JsonProperty("To_Account")
    private String toAccount;

    /**
     * 关注时间
     */
    @JsonProperty("FollowTime")
    private Integer followTime;

    /**
     * 用户资料
     */
    @JsonProperty("ProfileItem")
    private List<ProfileItem> profileItemList;

    public String getToAccount() {
        return toAccount;
    }

    public void setToAccount(String toAccount) {
        this.toAccount = toAccount;
    }

    public Integer getFollowTime() {
        return followTime;
    }

    public void setFollowTime(Integer followTime) {
        this.followTime = followTime;
    }

    public List<ProfileItem> getProfileItemList() {
        return profileItemList;
    }

    public void setProfileItemList(List<ProfileItem> profileItemList) {
        this.profileItemList = profileItemList;
    }

    @Override
    public String toString() {
        return "FollowResultItem{" +
                "toAccount='" + toAccount + '\'' +
                ", followTime=" + followTime +
                ", profileItemList=" + profileItemList +
                '}';
    }
}
