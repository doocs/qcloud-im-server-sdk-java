package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 查询账号-结果
 *
 * @author bingo
 * @since 2021/7/27 15:59
 */
public class AccountCheckResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = -7038180546794864942L;
    /**
     * 单个账号的结果对象数组
     */
    @JsonProperty("ResultItem")
    private List<AccountCheckResultItem> resultItems;

    public List<AccountCheckResultItem> getResultItems() {
        return resultItems;
    }

    public void setResultItems(List<AccountCheckResultItem> resultItems) {
        this.resultItems = resultItems;
    }

    @Override
    public String toString() {
        return "AccountCheckResult{" +
                "resultItems=" + resultItems +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
