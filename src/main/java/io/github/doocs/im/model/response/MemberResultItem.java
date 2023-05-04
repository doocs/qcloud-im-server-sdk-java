package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * @author hyh
 * @since 2021/08/01 14:19
 */
public class MemberResultItem implements Serializable {
    private static final long serialVersionUID = -6480823364552659013L;
    /**
     * 返回的群成员 UserID
     */
    @JsonProperty("Member_Account")
    private String memberAccount;

    /**
     * 加人结果：0-失败；1-成功；2-已经是群成员；3-等待被邀请者确认
     */
    @JsonProperty("Result")
    private Integer result;

    public String getMemberAccount() {
        return memberAccount;
    }

    public void setMemberAccount(String memberAccount) {
        this.memberAccount = memberAccount;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "MemberResultItem{" +
                "memberAccount='" + memberAccount + '\'' +
                ", result=" + result +
                '}';
    }
}
