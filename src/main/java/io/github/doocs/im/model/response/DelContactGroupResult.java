package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 删除会话分组数据-结果
 *
 * @author bingo
 * @since 2023/3/16 10:59
 */
public class DelContactGroupResult extends GenericResult {
    /**
     * 删除的分组对象
     */
    @JsonProperty("GroupItem")
    private List<GroupItem> groupItem;

    public List<GroupItem> getGroupItem() {
        return groupItem;
    }

    public void setGroupItem(List<GroupItem> groupItem) {
        this.groupItem = groupItem;
    }

    @Override
    public String toString() {
        return "DelContactGroupResult{" +
                "groupItem=" + groupItem +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                "} " + super.toString();
    }
}
