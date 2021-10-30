package io.github.doocs.im.model.message;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.doocs.im.constant.MsgType;

/**
 * 文件消息元素
 *
 * @author bingo
 * @since 2021/10/29 16:53
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TIMFileMsgElement extends TIMMsgElement {
    @JsonProperty("MsgContent")
    private FileMsgContent msgContent;

    public TIMFileMsgElement() {
        super(MsgType.TIM_FILE_ELEM);
    }

    public TIMFileMsgElement(FileMsgContent msgContent) {
        this();
        this.msgContent = msgContent;
    }

    public TIMFileMsgElement(String url, String uuid, Integer fileSize, String filename, Integer downloadFlag) {
        this(new FileMsgContent(url, uuid, fileSize, filename, downloadFlag));
    }

    public FileMsgContent getMsgContent() {
        return msgContent;
    }

    public void setMsgContent(FileMsgContent msgContent) {
        this.msgContent = msgContent;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class FileMsgContent {
        @JsonProperty("Url")
        private String url;

        @JsonProperty("UUID")
        private String uuid;

        @JsonProperty("FileSize")
        private Integer fileSize;

        @JsonProperty("FileName")
        private String filename;

        @JsonProperty("Download_Flag")
        private Integer downloadFlag;

        public FileMsgContent() {
        }

        public FileMsgContent(String url, String uuid, Integer fileSize, String filename, Integer downloadFlag) {
            this.url = url;
            this.uuid = uuid;
            this.fileSize = fileSize;
            this.filename = filename;
            this.downloadFlag = downloadFlag;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getUuid() {
            return uuid;
        }

        public void setUuid(String uuid) {
            this.uuid = uuid;
        }

        public Integer getFileSize() {
            return fileSize;
        }

        public void setFileSize(Integer fileSize) {
            this.fileSize = fileSize;
        }

        public String getFilename() {
            return filename;
        }

        public void setFilename(String filename) {
            this.filename = filename;
        }

        public Integer getDownloadFlag() {
            return downloadFlag;
        }

        public void setDownloadFlag(Integer downloadFlag) {
            this.downloadFlag = downloadFlag;
        }
    }
}
