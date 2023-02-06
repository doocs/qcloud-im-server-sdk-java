package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.doocs.im.model.group.GroupCounterItem;

import java.util.List;

/**
 * 获取群计数器-结果
 *
 * @author bingo
 * @since 2023/2/6 11:33
 */
public class GetGroupCounterResult extends GenericResult {
    /**
     * 获取的群计数器最新键值列表
     */
    @JsonProperty("GroupCounter")
    private List<GroupCounterItem> groupCounter;

    public List<GroupCounterItem> getGroupCounter() {
        return groupCounter;
    }

    public void setGroupCounter(List<GroupCounterItem> groupCounter) {
        this.groupCounter = groupCounter;
    }

    @Override
    public String toString() {
        return "GetGroupCounterResult{" +
                "groupCounter=" + groupCounter +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                "} " + super.toString();
    }
}
