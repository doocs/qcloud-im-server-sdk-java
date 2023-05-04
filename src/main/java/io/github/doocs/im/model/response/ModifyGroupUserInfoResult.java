package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.doocs.im.model.group.GroupMemberItem;

import java.io.Serializable;
import java.util.List;

/**
 * 设置直播群成员标记-结果
 *
 * @author bingo
 * @since 2022/8/29 14:00
 */
public class ModifyGroupUserInfoResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = 4223867216179707627L;
    /**
     * 1 为设置标记，2 为删除标记
     */
    @JsonProperty("CommandType")
    private Integer commandType;

    /**
     * 设置成功的成员列表。批量设置多个账号时，如果其中某个账号不在线则该账号不会返回。
     * 当所有被设置的账号不在线/不存在时，后台返回失败。
     */
    @JsonProperty("MemberList")
    private List<GroupMemberItem> memberList;

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

    @Override
    public String toString() {
        return "ModifyGroupUserInfoResult{" +
                "commandType=" + commandType +
                ", memberList=" + memberList +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
