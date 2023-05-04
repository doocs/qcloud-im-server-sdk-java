package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 解散话题-结果
 *
 * @author bingo
 * @since 2022/8/2 11:10
 */
public class DestroyGroupTopicResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = 4809671774349707562L;
    /**
     * 返回解散话题的结果，每一项对应解散一个话题的执行结果
     */
    @JsonProperty("DestroyResultItem")
    private List<DestroyGroupTopicResultItem> destroyResultItems;

    public List<DestroyGroupTopicResultItem> getDestroyResultItems() {
        return destroyResultItems;
    }

    public void setDestroyResultItems(List<DestroyGroupTopicResultItem> destroyResultItems) {
        this.destroyResultItems = destroyResultItems;
    }

    @Override
    public String toString() {
        return "DestroyGroupTopicResult{" +
                "destroyResultItems=" + destroyResultItems +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
