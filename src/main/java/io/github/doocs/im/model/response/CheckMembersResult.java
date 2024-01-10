package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 查询用户是否在直播群内-结果
 *
 * @author bingo
 * @since 2024/1/9 11:36
 */
public class CheckMembersResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = 983416554639985218L;

    /**
     * 在直播群内的用户 UserID 列表
     */
    @JsonProperty("Member_Account")
    private List<String> memberAccount;

    public List<String> getMemberAccount() {
        return memberAccount;
    }

    public void setMemberAccount(List<String> memberAccount) {
        this.memberAccount = memberAccount;
    }

    @Override
    public String toString() {
        return "CheckMembersResult{" +
                "memberAccount=" + memberAccount +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
