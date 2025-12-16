package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * <p>
 * 校验结果对象
 * </p>
 *
 * @author MC.Yang
 * @version V1.0
 **/
public class FollowCheckResultItem extends ResultItem implements Serializable {
    private static final long serialVersionUID = -6833184498334647596L;

    /**
     * 校验成功时 To_Account 与 From_Account 之间的关注关系：
     * 0 - From_Account 没有关注 To_Account，To_Account 也没有关注 From_Account。
     * 1 - From_Account 没有关注 To_Account，To_Account 关注了 From_Account。
     * 2 - From_Account 关注了 To_Account，To_Account 没有关注 From_Account。
     * 3 - From_Account 关注了 To_Account，To_Account 也关注了 From_Account。
     */
    @JsonProperty("FollowType")
    private Integer followType;

    public Integer getFollowType() {
        return followType;
    }

    public void setFollowType(Integer followType) {
        this.followType = followType;
    }

    @Override
    public String toString() {
        return "FollowCheckResultItem{" +
                "toAccount='" + getToAccount() + '\'' +
                ", resultCode=" + getResultCode() +
                ", resultInfo='" + getResultInfo() + '\'' +
                ", followType=" + followType +
                '}';
    }
}
