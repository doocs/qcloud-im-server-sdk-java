package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author hyh
 * @since 2021/08/01 14:12
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddGroupMemberRequest extends GenericRequest {
    @JsonProperty("GroupId")
    private String groupId;

    @JsonProperty("Silence")
    private Integer silence;

    @JsonProperty("MemberList")
    private List<MemberRequestItem> memberList;

    public AddGroupMemberRequest() {
    }

    public AddGroupMemberRequest(String groupId, List<MemberRequestItem> memberList) {
        this.groupId = groupId;
        this.memberList = memberList;
    }

    public AddGroupMemberRequest(String groupId, Integer silence, List<MemberRequestItem> memberList) {
        this.groupId = groupId;
        this.silence = silence;
        this.memberList = memberList;
    }

    private AddGroupMemberRequest(Builder builder) {
        this.groupId = builder.groupId;
        this.silence = builder.silence;
        this.memberList = builder.memberList;
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

    public List<MemberRequestItem> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<MemberRequestItem> memberList) {
        this.memberList = memberList;
    }


    public static final class Builder {
        private String groupId;
        private Integer silence;
        private List<MemberRequestItem> memberList;

        private Builder() {
        }

        public AddGroupMemberRequest build() {
            return new AddGroupMemberRequest(this);
        }

        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        public Builder silence(Integer silence) {
            this.silence = silence;
            return this;
        }

        public Builder memberList(List<MemberRequestItem> memberList) {
            this.memberList = memberList;
            return this;
        }
    }
}
