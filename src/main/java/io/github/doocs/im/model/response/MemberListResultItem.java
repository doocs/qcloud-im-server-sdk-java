package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * @author bingo
 * @since 2021/8/4 11:50
 */
public class MemberListResultItem implements Serializable {
    private static final long serialVersionUID = -887357867743569302L;
    /**
     * 返回的群成员账号
     */
    @JsonProperty("Member_Account")
    private String memberAccount;

    /**
     * 导入结果：0表示失败；1表示成功；2 表示已经是群成员
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
        return "MemberListResultItem{" +
                "memberAccount='" + memberAccount + '\'' +
                ", result=" + result +
                '}';
    }
}
