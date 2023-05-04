package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 创建或更新会话标记数据-结果
 *
 * @author bingo
 * @since 2023/3/16 15:31
 */
public class MarkContactResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = 4635788145113962980L;
    /**
     * 会话标记操作结果
     */
    @JsonProperty("ResultItem")
    private List<ContactGroupResultItem> resultItem;

    public List<ContactGroupResultItem> getResultItem() {
        return resultItem;
    }

    public void setResultItem(List<ContactGroupResultItem> resultItem) {
        this.resultItem = resultItem;
    }

    @Override
    public String toString() {
        return "MarkContactResult{" +
                "resultItem=" + resultItem +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                "} " + super.toString();
    }
}
