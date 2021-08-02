package com.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author bingo
 * @since 2021/7/30 17:26
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountCheckRequest extends GenericRequest {
    @JsonProperty("CheckItem")
    private List<AccountCheckItem> checkItemList;

    public List<AccountCheckItem> getCheckItemList() {
        return checkItemList;
    }

    public void setCheckItemList(List<AccountCheckItem> checkItemList) {
        this.checkItemList = checkItemList;
    }
}
