package com.qcloud.im.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author hyh
 * @since 2021/07/29 15:37
 */
public class AddFriendItem {
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
    private List<CustomItem> CustomItemList;

    public AddFriendItem() {
    }

    public AddFriendItem(String toAccount, String remark, Integer remarkTime, List<String> groupName, String addSource, String addWording, Integer addTime, List<CustomItem> customItemList) {
        this.toAccount = toAccount;
        this.remark = remark;
        this.remarkTime = remarkTime;
        this.groupName = groupName;
        this.addSource = addSource;
        this.addWording = addWording;
        this.addTime = addTime;
        CustomItemList = customItemList;
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
        return CustomItemList;
    }

    public void setCustomItemList(List<CustomItem> customItemList) {
        CustomItemList = customItemList;
    }
}
