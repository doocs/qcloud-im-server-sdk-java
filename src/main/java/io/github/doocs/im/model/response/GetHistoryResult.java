package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 下载最近消息记录-结果
 *
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
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
