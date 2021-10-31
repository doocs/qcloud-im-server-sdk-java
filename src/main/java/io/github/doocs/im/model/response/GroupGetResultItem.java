package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author hyh
 * @since 2021/07/30 17:43
 */
public class GroupGetResultItem {
    @JsonProperty("GroupName")
    private String groupName;

    @JsonProperty("FriendNumber")
    private Integer friendNumber;

    @JsonProperty("To_Account")
    private List<String> toAccount;

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Integer getFriendNumber() {
        return friendNumber;
    }

    public void setFriendNumber(Integer friendNumber) {
        this.friendNumber = friendNumber;
    }

    public List<String> getToAccount() {
        return toAccount;
    }

    public void setToAccount(List<String> toAccount) {
        this.toAccount = toAccount;
    }

    @Override
    public String toString() {
        return "GroupGetResultItem{" +
                "groupName='" + groupName + '\'' +
                ", friendNumber=" + friendNumber +
                ", toAccount=" + toAccount +
                '}';
    }
}
