package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author bingo
 * @since 2021/8/4 11:45
 */
public class ImportGroupMsgResult extends GenericResult {
    @JsonProperty("ImportMsgResult")
    private List<ImportMsgResultItem> importMsgResult;

    @Override
    public String toString() {
        return "ImportGroupMsgResult{" +
                "importMsgResult=" + importMsgResult +
                '}';
    }
}
