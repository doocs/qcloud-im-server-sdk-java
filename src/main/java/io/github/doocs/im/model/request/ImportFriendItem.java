package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author hyh
 * @since 2021/07/29 15:37
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImportFriendItem {
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
     * From_Account 对 To_Account 的好友备注时间
     */
    @JsonProperty("RemarkTime")
    private Integer remarkTime;

    /**
     * From_Account 对 To_Account 的分组信息，详情可参见 标配好友字段
     */
    @JsonProperty("GroupName")
    private List<String> groupName;

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

    /**
     * From_Account 和 To_Account 形成好友关系的时间
     */
    @JsonProperty("AddTime")
    private Integer addTime;

    /**
     * From_Account 对 To_Account 的自定义好友数据，每一个成员都包含一个 Tag 字段和一个 Value 字段，详情可参见 自定义好友字段
     */
    @JsonProperty("CustomItem")
    private List<CustomItem> customItemList;

    public ImportFriendItem() {
    }

    public ImportFriendItem(String toAccount, String addSource) {
        this.toAccount = toAccount;
        this.addSource = addSource;
    }

    public ImportFriendItem(String toAccount, String remark, Integer remarkTime, List<String> groupName,
                            String addSource, String addWording, Integer addTime, List<CustomItem> customItemList) {
        this.toAccount = toAccount;
        this.remark = remark;
        this.remarkTime = remarkTime;
        this.groupName = groupName;
        this.addSource = addSource;
        this.addWording = addWording;
        this.addTime = addTime;
        this.customItemList = customItemList;
    }

    private ImportFriendItem(Builder builder) {
        this.toAccount = builder.toAccount;
        this.remark = builder.remark;
        this.remarkTime = builder.remarkTime;
        this.groupName = builder.groupName;
        this.addSource = builder.addSource;
        this.addWording = builder.addWording;
        this.addTime = builder.addTime;
        this.customItemList = builder.customItemList;
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

    public Integer getRemarkTime() {
        return remarkTime;
    }

    public void setRemarkTime(Integer remarkTime) {
        this.remarkTime = remarkTime;
    }

    public List<String> getGroupName() {
        return groupName;
    }

    public void setGroupName(List<String> groupName) {
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

    public Integer getAddTime() {
        return addTime;
    }

    public void setAddTime(Integer addTime) {
        this.addTime = addTime;
    }

    public List<CustomItem> getCustomItemList() {
        return customItemList;
    }

    public void setCustomItemList(List<CustomItem> customItemList) {
        this.customItemList = customItemList;
    }


    public static final class Builder {
        private String toAccount;
        private String remark;
        private Integer remarkTime;
        private List<String> groupName;
        private String addSource;
        private String addWording;
        private Integer addTime;
        private List<CustomItem> customItemList;

        private Builder() {
        }

        public ImportFriendItem build() {
            return new ImportFriendItem(this);
        }

        public Builder toAccount(String toAccount) {
            this.toAccount = toAccount;
            return this;
        }

        public Builder remark(String remark) {
            this.remark = remark;
            return this;
        }

        public Builder remarkTime(Integer remarkTime) {
            this.remarkTime = remarkTime;
            return this;
        }

        public Builder groupName(List<String> groupName) {
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

        public Builder addTime(Integer addTime) {
            this.addTime = addTime;
            return this;
        }

        public Builder customItemList(List<CustomItem> customItemList) {
            this.customItemList = customItemList;
            return this;
        }
    }
}
