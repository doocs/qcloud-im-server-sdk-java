package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 搜索会话分组标记-结果
 *
 * @author bingo
 * @since 2023/3/16 11:33
 */
public class SearchContactGroupResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = -455291270470160939L;
    /**
     * 搜索会话分组结果
     */
    @JsonProperty("ContactResultItem")
    private List<ContactResultItem> contactResultItem;

    /**
     * 会话分组对象
     */
    @JsonProperty("GroupItem")
    private List<GroupItem> groupItem;

    public List<ContactResultItem> getContactResultItem() {
        return contactResultItem;
    }

    public void setContactResultItem(List<ContactResultItem> contactResultItem) {
        this.contactResultItem = contactResultItem;
    }

    public List<GroupItem> getGroupItem() {
        return groupItem;
    }

    public void setGroupItem(List<GroupItem> groupItem) {
        this.groupItem = groupItem;
    }

    @Override
    public String toString() {
        return "SearchContactGroupResult{" +
                "contactResultItem=" + contactResultItem +
                ", groupItem=" + groupItem +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                "} " + super.toString();
    }
}
