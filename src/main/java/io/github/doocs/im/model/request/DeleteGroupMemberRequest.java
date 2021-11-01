package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author hyh
 * @since 2021/08/02 16:19
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteGroupMemberRequest extends GenericRequest {
    @JsonProperty("GroupId")
    private String groupId;

    @JsonProperty("Silence")
    private Integer silence;

    @JsonProperty("Reason")
    private String reason;

    @JsonProperty("MemberToDel_Account")
    private List<String> memberToDelAccount;

    public DeleteGroupMemberRequest() {
    }

    public DeleteGroupMemberRequest(String groupId, List<String> memberToDelAccount) {
        this.groupId = groupId;
        this.memberToDelAccount = memberToDelAccount;
    }

    public DeleteGroupMemberRequest(String groupId, Integer silence, String reason, List<String> memberToDelAccount) {
        this.groupId = groupId;
        this.silence = silence;
        this.reason = reason;
        this.memberToDelAccount = memberToDelAccount;
    }

    private DeleteGroupMemberRequest(Builder builder) {
        this.groupId = builder.groupId;
        this.silence = builder.silence;
        this.reason = builder.reason;
        this.memberToDelAccount = builder.memberToDelAccount;
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

    public Integer getSilence() {
        return silence;
    }

    public void setSilence(Integer silence) {
        this.silence = silence;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public List<String> getMemberToDelAccount() {
        return memberToDelAccount;
    }

    public void setMemberToDelAccount(List<String> memberToDelAccount) {
        this.memberToDelAccount = memberToDelAccount;
    }


    public static final class Builder {
        private String groupId;
        private Integer silence;
        private String reason;
        private List<String> memberToDelAccount;

        private Builder() {
        }

        public DeleteGroupMemberRequest build() {
            return new DeleteGroupMemberRequest(this);
        }

        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        public Builder silence(Integer silence) {
            this.silence = silence;
            return this;
        }

        public Builder reason(String reason) {
            this.reason = reason;
            return this;
        }

        public Builder memberToDelAccount(List<String> memberToDelAccount) {
            this.memberToDelAccount = memberToDelAccount;
            return this;
        }
    }
}
