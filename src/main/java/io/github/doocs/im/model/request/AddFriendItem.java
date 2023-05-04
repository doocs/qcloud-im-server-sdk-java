package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * @author hyh
 * @since 2021/07/29 15:37
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddFriendItem implements Serializable {
    private static final long serialVersionUID = -135614617516032120L;
    /**
     * 好友的 UserID
     */
    @JsonProperty("To_Account")
    private String toAccount;

    /**
     * From_Account 对 To_Account 的好友备注，详情可参见 标配好友字段
     */
    @JsonProperty("Remark")
    private String remark;

    /**
     * From_Account 对 To_Account 的分组信息，添加好友时只允许设置一个分组，因此使用 String 类型即可，详情可参见 标配好友字段
     */
    @JsonProperty("GroupName")
    private String groupName;

    /**
     * 加好友来源字段，详情可参见 标配好友字段
     */
    @JsonProperty("AddSource")
    private String addSource;

    /**
     * From_Account 和 To_Account 形成好友关系时的附言信息，详情可参见 标配好友字段
     */
    @JsonProperty("AddWording")
    private String addWording;

    public AddFriendItem() {
    }

    public AddFriendItem(String toAccount, String addSource) {
        this.toAccount = toAccount;
        this.addSource = addSource;
    }

    public AddFriendItem(String toAccount, String remark, String groupName, String addSource, String addWording) {
        this.toAccount = toAccount;
        this.remark = remark;
        this.groupName = groupName;
        this.addSource = addSource;
        this.addWording = addWording;
    }

    private AddFriendItem(Builder builder) {
        this.toAccount = builder.toAccount;
        this.remark = builder.remark;
        this.groupName = builder.groupName;
        this.addSource = builder.addSource;
        this.addWording = builder.addWording;
    }

    public static Builder builder() {
        return new Builder();
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


    public static final class Builder {
        private String toAccount;
        private String remark;
        private String groupName;
        private String addSource;
        private String addWording;

        private Builder() {
        }

        public AddFriendItem build() {
            return new AddFriendItem(this);
        }

        public Builder toAccount(String toAccount) {
            this.toAccount = toAccount;
            return this;
        }

        public Builder remark(String remark) {
            this.remark = remark;
            return this;
        }

        public Builder groupName(String groupName) {
            this.groupName = groupName;
            return this;
        }

        public Builder addSource(String addSource) {
            this.addSource = addSource;
            return this;
        }

        public Builder addWording(String addWording) {
            this.addWording = addWording;
            return this;
        }
    }
}
