package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 拉取群消息已读回执信息-结果
 *
 * @author bingo
 * @since 2022/7/24 20:05
 */
public class GetGroupMsgReceiptResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = -4238461635576039390L;
    /**
     * 已读回执信息
     */
    @JsonProperty("GroupMsgReceiptList")
    private List<GroupMsgReceiptResultItem> groupMsgReceiptList;

    public List<GroupMsgReceiptResultItem> getGroupMsgReceiptList() {
        return groupMsgReceiptList;
    }

    public void setGroupMsgReceiptList(List<GroupMsgReceiptResultItem> groupMsgReceiptList) {
        this.groupMsgReceiptList = groupMsgReceiptList;
    }

    @Override
    public String toString() {
        return "GetGroupMsgReceiptResult{" +
                "groupMsgReceiptList=" + groupMsgReceiptList +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
