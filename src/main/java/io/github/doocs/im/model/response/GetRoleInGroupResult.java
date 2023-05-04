package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 查询用户在群组中的身份-结果
 *
 * @author bingo
 * @since 2021/8/4 11:05
 */
public class GetRoleInGroupResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = -5747943512450483306L;
    /**
     * 拉取到的成员角色，包括：Owner(群主)，Admin(群管理员)，Member(普通群成员），NotMember(非群成员)
     */
    @JsonProperty("UserIdList")
    private List<UserIdListItem> userIdList;

    public List<UserIdListItem> getUserIdList() {
        return userIdList;
    }

    public void setUserIdList(List<UserIdListItem> userIdList) {
        this.userIdList = userIdList;
    }

    @Override
    public String toString() {
        return "GetRoleInGroupResult{" +
                "userIdList=" + userIdList +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
