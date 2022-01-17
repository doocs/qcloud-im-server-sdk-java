package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 导入群基础资料-结果
 *
 * @author bingo
 * @since 2021/8/4 11:44
 */
public class ImportGroupResult extends GenericResult {
    /**
     * 创建成功之后的群 ID，由 IM 云后台分配或者用户指定
     */
    @JsonProperty("GroupId")
    private String groupId;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    @Override
    public String toString() {
        return "ImportGroupResult{" +
                "groupId='" + groupId + '\'' +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
