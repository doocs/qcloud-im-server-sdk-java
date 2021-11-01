package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author hyh
 * @since 2021/08/01 13:59
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SetUnreadMsgNumRequest extends GenericRequest {
    @JsonProperty("GroupId")
    private String groupId;

    @JsonProperty("Member_Account")
    private String memberAccount;

    @JsonProperty("UnreadMsgNum")
    private Integer unreadMsgNum;

    public SetUnreadMsgNumRequest() {
    }

    public SetUnreadMsgNumRequest(String groupId, String memberAccount, Integer unreadMsgNum) {
        this.groupId = groupId;
        this.memberAccount = memberAccount;
        this.unreadMsgNum = unreadMsgNum;
    }

    private SetUnreadMsgNumRequest(Builder builder) {
        this.groupId = builder.groupId;
        this.memberAccount = builder.memberAccount;
        this.unreadMsgNum = builder.unreadMsgNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getMemberAccount() {
        return memberAccount;
    }

    public void setMemberAccount(String memberAccount) {
        this.memberAccount = memberAccount;
    }

    public Integer getUnreadMsgNum() {
        return unreadMsgNum;
    }

    public void setUnreadMsgNum(Integer unreadMsgNum) {
        this.unreadMsgNum = unreadMsgNum;
    }


    public static final class Builder {
        private String groupId;
        private String memberAccount;
        private Integer unreadMsgNum;

        private Builder() {
        }

        public SetUnreadMsgNumRequest build() {
            return new SetUnreadMsgNumRequest(this);
        }

        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        public Builder memberAccount(String memberAccount) {
            this.memberAccount = memberAccount;
            return this;
        }

        public Builder unreadMsgNum(Integer unreadMsgNum) {
            this.unreadMsgNum = unreadMsgNum;
            return this;
        }
    }
}
