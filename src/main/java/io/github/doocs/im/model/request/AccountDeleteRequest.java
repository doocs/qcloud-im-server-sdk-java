package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author bingo
 * @since 2021/7/30 17:08
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountDeleteRequest extends GenericRequest {
    @JsonProperty("DeleteItem")
    private List<AccountDeleteItem> deleteItemList;

    public List<AccountDeleteItem> getDeleteItemList() {
        return deleteItemList;
    }

    public void setDeleteItemList(List<AccountDeleteItem> deleteItemList) {
        this.deleteItemList = deleteItemList;
    }
}
