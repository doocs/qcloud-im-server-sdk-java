package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author bingo
 * @since 2021/8/4 11:05
 */
public class GetRoleInGroupResult extends GenericResult {
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
                '}';
    }
}
