package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author bingo
 * @since 2021/7/31 20:25
 */
public class FileResultItem {
    @JsonProperty("URL")
    private String url;

    @JsonProperty("ExpireTime")
    private String expireTime;

    @JsonProperty("FileSize")
    private Integer fileSize;

    @JsonProperty("FileMD5")
    private String fileMd5;

    @JsonProperty("GzipSize")
    private Integer gzipSize;

    @JsonProperty("GzipMD5")
    private String gzipMd5;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public Integer getFileSize() {
        return fileSize;
    }

    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    public String getFileMd5() {
        return fileMd5;
    }

    public void setFileMd5(String fileMd5) {
        this.fileMd5 = fileMd5;
    }

    public Integer getGzipSize() {
        return gzipSize;
    }

    public void setGzipSize(Integer gzipSize) {
        this.gzipSize = gzipSize;
    }

    public String getGzipMd5() {
        return gzipMd5;
    }

    public void setGzipMd5(String gzipMd5) {
        this.gzipMd5 = gzipMd5;
    }

    @Override
    public String toString() {
        return "FileResultItem{" +
                "url='" + url + '\'' +
                ", expireTime='" + expireTime + '\'' +
                ", fileSize='" + fileSize + '\'' +
                ", fileMd5='" + fileMd5 + '\'' +
                ", gzipSize='" + gzipSize + '\'' +
                ", gzipMd5='" + gzipMd5 + '\'' +
                '}';
    }
}
