package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author bingo
 * @since 2021/7/27 15:59
 */
public class AccountCheckResult extends GenericResult {
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
                '}';
    }
}
