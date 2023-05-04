package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 导入群成员-结果
 *
 * @author bingo
 * @since 2021/8/4 11:50
 */
public class ImportGroupMemberResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = -1100313085183522981L;
    /**
     * 返回添加的群成员结果
     */
    @JsonProperty("MemberList")
    private List<MemberListResultItem> memberList;

    public List<MemberListResultItem> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<MemberListResultItem> memberList) {
        this.memberList = memberList;
    }

    @Override
    public String toString() {
        return "ImportGroupMemberResult{" +
                "memberList=" + memberList +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
