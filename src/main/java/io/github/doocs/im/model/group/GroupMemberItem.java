package io.github.doocs.im.model.group;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * @author bingo
 * @since 2022/08/29 15:37
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GroupMemberItem implements Serializable {
    private static final long serialVersionUID = 1434564355285510258L;
    /**
     * 群成员 UserID
     */
    @JsonProperty("Member_Account")
    private String memberAccount;

    /**
     * 标记列表(标记为大于等于1000的数字)
     */
    @JsonProperty("Marks")
    private List<Integer> marks;

    public GroupMemberItem() {
    }

    public GroupMemberItem(String memberAccount, List<Integer> marks) {
        this.memberAccount = memberAccount;
        this.marks = marks;
    }

    private GroupMemberItem(Builder builder) {
        this.memberAccount = builder.memberAccount;
        this.marks = builder.marks;
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

    public List<Integer> getMarks() {
        return marks;
    }

    public void setMarks(List<Integer> marks) {
        this.marks = marks;
    }


    public static final class Builder {
        private String memberAccount;
        private List<Integer> marks;

        private Builder() {
        }

        public GroupMemberItem build() {
            return new GroupMemberItem(this);
        }

        public Builder memberAccount(String memberAccount) {
            this.memberAccount = memberAccount;
            return this;
        }

        public Builder marks(List<Integer> marks) {
            this.marks = marks;
            return this;
        }
    }
}
