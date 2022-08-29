package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.doocs.im.model.group.GroupMemberItem;

import java.util.List;

/**
 * 设置直播群成员标记-请求参数
 *
 * @author bingo
 * @since 2022/8/29 10:34
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModifyGroupUserInfoRequest {
    /**
     * 操作的群 ID
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * 1 为设置标记，2 为删除标记
     */
    @JsonProperty("CommandType")
    private Integer commandType;

    /**
     * 需要设置的账号列表，每次可以设置最多不超过500个账号，每个群最多只能设置10个不同的标记。标记为大于等于1000的数字
     */
    @JsonProperty("MemberList")
    private List<GroupMemberItem> memberList;

    public ModifyGroupUserInfoRequest() {
    }

    public ModifyGroupUserInfoRequest(String groupId, Integer commandType, List<GroupMemberItem> memberList) {
        this.groupId = groupId;
        this.commandType = commandType;
        this.memberList = memberList;
    }

    private ModifyGroupUserInfoRequest(Builder builder) {
        this.groupId = builder.groupId;
        this.commandType = builder.commandType;
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

    public Integer getCommandType() {
        return commandType;
    }

    public void setCommandType(Integer commandType) {
        this.commandType = commandType;
    }

    public List<GroupMemberItem> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<GroupMemberItem> memberList) {
        this.memberList = memberList;
    }


    public static final class Builder {
        private String groupId;
        private Integer commandType;
        private List<GroupMemberItem> memberList;

        private Builder() {
        }

        public ModifyGroupUserInfoRequest build() {
            return new ModifyGroupUserInfoRequest(this);
        }

        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        public Builder commandType(Integer commandType) {
            this.commandType = commandType;
            return this;
        }

        public Builder memberList(List<GroupMemberItem> memberList) {
            this.memberList = memberList;
            return this;
        }
    }
}
