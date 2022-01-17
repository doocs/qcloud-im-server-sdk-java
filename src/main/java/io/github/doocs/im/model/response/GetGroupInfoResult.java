package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.doocs.im.model.group.GroupInfo;

import java.util.List;

/**
 * 获取群详细资料-结果
 *
 * @author bingo
 * @since 2021/8/1 11:47
 */
public class GetGroupInfoResult extends GenericResult {
    /**
     * 返回结果为群组信息数组，内容包括群基础资料字段、群成员资料字段、群组维度自定义字段和群成员维度自定义字段，
     * 字段详情请参阅 群组数据结构介绍
     */
    @JsonProperty("GroupInfo")
    private List<GroupInfo> groupInfo;

    public List<GroupInfo> getGroupInfo() {
        return groupInfo;
    }

    public void setGroupInfo(List<GroupInfo> groupInfo) {
        this.groupInfo = groupInfo;
    }

    @Override
    public String toString() {
        return "GetGroupInfoResult{" +
                "groupInfo=" + groupInfo +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
