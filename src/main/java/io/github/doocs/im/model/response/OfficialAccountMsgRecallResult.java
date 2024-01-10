package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 撤回公众号消息-结果
 *
 * @author bingo
 * @since 2024/1/10 10:25
 */
public class OfficialAccountMsgRecallResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = 1567110934824930661L;

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
        return "OfficialAccountMsgRecallResult{" +
                "recallRetList=" + recallRetList +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
