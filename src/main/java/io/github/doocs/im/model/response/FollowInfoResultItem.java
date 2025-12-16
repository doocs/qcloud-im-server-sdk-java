package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * <p>
 * 拉取的结果对象
 * </p>
 *
 * @author MC.Yang
 * @version V1.0
 **/
public class FollowInfoResultItem extends ResultItem implements Serializable {
    private static final long serialVersionUID = 6150410504453879405L;

    /**
     * To_Account 的粉丝数
     */
    @JsonProperty("FollowerCount")
    private Integer followerCount;

    /**
     * To_Account 的关注数
     */
    @JsonProperty("FollowingCount")
    private Integer followingCount;

    /**
     * To_Account 的互关数
     */
    @JsonProperty("MutualFollowingCount")
    private Integer mutualFollowingCount;

    public Integer getFollowerCount() {
        return followerCount;
    }

    public void setFollowerCount(Integer followerCount) {
        this.followerCount = followerCount;
    }

    public Integer getFollowingCount() {
        return followingCount;
    }

    public void setFollowingCount(Integer followingCount) {
        this.followingCount = followingCount;
    }

    public Integer getMutualFollowingCount() {
        return mutualFollowingCount;
    }

    public void setMutualFollowingCount(Integer mutualFollowingCount) {
        this.mutualFollowingCount = mutualFollowingCount;
    }

    @Override
    public String toString() {
        return "FollowInfoResultItem{" +
                "followerCount=" + followerCount +
                ", followingCount=" + followingCount +
                ", mutualFollowingCount=" + mutualFollowingCount +
                ", toAccount='" + getToAccount() + '\'' +
                ", resultCode=" + getResultCode() +
                ", resultInfo='" + getResultInfo() + '\'' +
                '}';
    }

}
