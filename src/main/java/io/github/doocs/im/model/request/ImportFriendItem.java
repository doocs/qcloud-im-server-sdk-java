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
    @JsonProperty("To_Account")
    private String toAccount;

    @JsonProperty("Remark")
    private String remark;

    @JsonProperty("RemarkTime")
    private Integer remarkTime;

    @JsonProperty("GroupName")
    private List<String> groupName;

    @JsonProperty("AddSource")
    private String addSource;

    @JsonProperty("AddWording")
    private String addWording;

    @JsonProperty("AddTime")
    private Integer addTime;

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
