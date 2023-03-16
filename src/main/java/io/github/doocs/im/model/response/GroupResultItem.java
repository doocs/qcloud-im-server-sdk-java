package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author bingo
 * @since 2023/3/16 10:59
 */
public class GroupResultItem {
    /**
     * 会话分组对象
     */
    @JsonProperty("GroupItem")
    private GroupItem groupItem;

    /**
     * 操作结果
     */
    @JsonProperty("ResultItem")
    private List<ContactGroupResultItem> resultItem;

    public GroupItem getGroupItem() {
        return groupItem;
    }

    public void setGroupItem(GroupItem groupItem) {
        this.groupItem = groupItem;
    }

    public List<ContactGroupResultItem> getResultItem() {
        return resultItem;
    }

    public void setResultItem(List<ContactGroupResultItem> resultItem) {
        this.resultItem = resultItem;
    }

    @Override
    public String toString() {
        return "GroupResultItem{" +
                "groupItem=" + groupItem +
                ", resultItem=" + resultItem +
                '}';
    }
}
