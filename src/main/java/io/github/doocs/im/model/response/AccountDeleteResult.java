package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * @author bingo
 * @since 2021/7/28 11:04
 */
public class AccountDeleteResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = -1099478082198095520L;
    /**
     * 单个帐号的结果对象数组
     */
    @JsonProperty("ResultItem")
    private List<AccountDeleteResultItem> resultItems;

    public List<AccountDeleteResultItem> getResultItems() {
        return resultItems;
    }

    public void setResultItems(List<AccountDeleteResultItem> resultItems) {
        this.resultItems = resultItems;
    }

    @Override
    public String toString() {
        return "AccountDeleteResult{" +
                "resultItems=" + resultItems +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
