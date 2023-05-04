package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 下载最近消息记录-结果
 *
 * @author bingo
 * @since 2021/7/31 20:24
 */
public class GetHistoryResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = 4117600241573025845L;
    /**
     * 消息记录文件下载信息
     */
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
