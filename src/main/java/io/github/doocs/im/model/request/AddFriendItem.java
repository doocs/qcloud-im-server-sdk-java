package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author hyh
 * @since 2021/07/29 15:37
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddFriendItem {
    @JsonProperty("To_Account")
    private String toAccount;

    @JsonProperty("Remark")
    private String remark;

    @JsonProperty("GroupName")
    private String groupName;

    @JsonProperty("AddSource")
    private String addSource;

    @JsonProperty("AddWording")
    private String addWording;

    public AddFriendItem() {
    }

    public AddFriendItem(String toAccount, String remark, String groupName, String addSource, String addWording) {
        this.toAccount = toAccount;
        this.remark = remark;
        this.groupName = groupName;
        this.addSource = addSource;
        this.addWording = addWording;
    }

    public String getToAccount() {
        return toAccount;
    }

    public void setToAccount(String toAccount) {
        this.toAccount = toAccount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getAddSource() {
        return addSource;
    }

    public void setAddSource(String addSource) {
        this.addSource = addSource;
    }

    public String getAddWording() {
        return addWording;
    }

    public void setAddWording(String addWording) {
        this.addWording = addWording;
    }
}
