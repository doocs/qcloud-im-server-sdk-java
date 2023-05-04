package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * @author hyh
 * @since 2021/08/01 14:14
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MemberRequestItem implements Serializable {
    private static final long serialVersionUID = 8062037175443651110L;
    /**
     * 待添加的群成员 UserID
     */
    @JsonProperty("Member_Account")
    private String memberAccount;

    public MemberRequestItem() {
    }

    public MemberRequestItem(String memberAccount) {
        this.memberAccount = memberAccount;
    }

    private MemberRequestItem(Builder builder) {
        this.memberAccount = builder.memberAccount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getMemberAccount() {
        return memberAccount;
    }

    public void setMemberAccount(String memberAccount) {
        this.memberAccount = memberAccount;
    }


    public static final class Builder {
        private String memberAccount;

        private Builder() {
        }

        public MemberRequestItem build() {
            return new MemberRequestItem(this);
        }

        public Builder memberAccount(String memberAccount) {
            this.memberAccount = memberAccount;
            return this;
        }
    }
}
