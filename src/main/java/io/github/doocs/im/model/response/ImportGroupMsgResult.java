package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 导入群消息-结果
 *
 * @author bingo
 * @since 2021/8/4 11:45
 */
public class ImportGroupMsgResult extends GenericResult {
    /**
     * 具体的消息导入结果
     */
    @JsonProperty("ImportMsgResult")
    private List<ImportMsgResultItem> importMsgResult;

    public List<ImportMsgResultItem> getImportMsgResult() {
        return importMsgResult;
    }

    public void setImportMsgResult(List<ImportMsgResultItem> importMsgResult) {
        this.importMsgResult = importMsgResult;
    }

    @Override
    public String toString() {
        return "ImportGroupMsgResult{" +
                "importMsgResult=" + importMsgResult +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
