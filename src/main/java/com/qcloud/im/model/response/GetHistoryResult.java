package com.qcloud.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author bingo
 * @since 2021/7/31 20:24
 */
public class GetHistoryResult extends GenericResult {
    @JsonProperty("File")
    private List<FileResultItem> file;

    public List<FileResultItem> getFile() {
        return file;
    }

    public void setFile(List<FileResultItem> file) {
        this.file = file;
    }

    @Override
    public String toString() {
        return "GetHistoryResult{" +
                "file=" + file +
                '}';
    }
}
