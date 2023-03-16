package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 拉取会话分组标记数据-结果
 *
 * @author bingo
 * @since 2023/3/16 15:31
 */
public class GetContactGroupResult extends GenericResult {
    /**
     * 会话分组标记数据列表
     */
    @JsonProperty("ContactItem")
    private List<ContactResultItem> contactItem;

    /**
     * 会话分组对象
     */
    @JsonProperty("GroupItem")
    private List<GroupItem> groupItem;

    /**
     * 必填
     */
    @JsonProperty("CompleteFlag")
    private Integer completeFlag;

    /**
     * 必填
     */
    @JsonProperty("NextStartIndex")
    private Integer nextStartIndex;

    public List<ContactResultItem> getContactItem() {
        return contactItem;
    }

    public void setContactItem(List<ContactResultItem> contactItem) {
        this.contactItem = contactItem;
    }

    public List<GroupItem> getGroupItem() {
        return groupItem;
    }

    public void setGroupItem(List<GroupItem> groupItem) {
        this.groupItem = groupItem;
    }

    public Integer getCompleteFlag() {
        return completeFlag;
    }

    public void setCompleteFlag(Integer completeFlag) {
        this.completeFlag = completeFlag;
    }

    public Integer getNextStartIndex() {
        return nextStartIndex;
    }

    public void setNextStartIndex(Integer nextStartIndex) {
        this.nextStartIndex = nextStartIndex;
    }

    @Override
    public String toString() {
        return "GetContactGroupResult{" +
                "contactItem=" + contactItem +
                ", groupItem=" + groupItem +
                ", completeFlag=" + completeFlag +
                ", nextStartIndex=" + nextStartIndex +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                "} " + super.toString();
    }
}
