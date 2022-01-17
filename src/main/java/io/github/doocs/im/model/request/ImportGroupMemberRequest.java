package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 导入群成员-请求参数
 *
 * @author hyh
 * @since 2021/08/02 19:13
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImportGroupMemberRequest extends GenericRequest {
    /**
     * 操作的群 ID
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * 待添加的群成员数组
     */
    @JsonProperty("MemberList")
    private List<MemberItem> memberList;

    public ImportGroupMemberRequest() {
    }

    public ImportGroupMemberRequest(String groupId, List<MemberItem> memberList) {
        this.groupId = groupId;
        this.memberList = memberList;
    }

    private ImportGroupMemberRequest(Builder builder) {
        this.groupId = builder.groupId;
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

    public List<MemberItem> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<MemberItem> memberList) {
        this.memberList = memberList;
    }


    public static final class Builder {
        private String groupId;
        private List<MemberItem> memberList;

        private Builder() {
        }

        public ImportGroupMemberRequest build() {
            return new ImportGroupMemberRequest(this);
        }

        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        public Builder memberList(List<MemberItem> memberList) {
            this.memberList = memberList;
            return this;
        }
    }
}
