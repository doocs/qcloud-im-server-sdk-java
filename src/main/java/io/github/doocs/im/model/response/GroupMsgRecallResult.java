package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 撤回群消息-结果
 *
 * @author bingo
 * @since 2021/8/4 11:39
 */
public class GroupMsgRecallResult extends GenericResult {
    /**
     * 消息撤回请求的详细结果
     */
    @JsonProperty("RecallRetList")
    private List<RecallRetItem> recallRetList;

    public List<RecallRetItem> getRecallRetList() {
        return recallRetList;
    }

    public void setRecallRetList(List<RecallRetItem> recallRetList) {
        this.recallRetList = recallRetList;
    }

    @Override
    public String toString() {
        return "GroupMsgRecallResult{" +
                "recallRetList=" + recallRetList +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
