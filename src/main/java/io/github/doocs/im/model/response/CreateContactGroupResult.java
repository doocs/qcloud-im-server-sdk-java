package io.github.doocs.im.model.response;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 创建会话分组数据-结果
 *
 * @author bingo
 * @since 2023/3/16 10:59
 */
public class CreateContactGroupResult extends GenericResult {
    /**
     * 会话分组添加结果
     */
    @JsonProperty("GroupResultItem")
    private List<GroupResultItem> groupResultItem;

    public List<GroupResultItem> getGroupResultItem() {
        return groupResultItem;
    }

    public void setGroupResultItem(List<GroupResultItem> groupResultItem) {
        this.groupResultItem = groupResultItem;
    }

    @Override
    public String toString() {
        return "CreateContactGroupResult{" +
                "groupResultItem=" + groupResultItem +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                "} " + super.toString();
    }
}
