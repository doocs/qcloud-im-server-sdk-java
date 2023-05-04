package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * @author bingo
 * @since 2021/7/31 20:25
 */
public class FileResultItem implements Serializable {
    private static final long serialVersionUID = 1220068997790004860L;
    /**
     * 消息记录文件下载地址
     */
    @JsonProperty("URL")
    private String url;

    /**
     * 下载地址过期时间，请在过期前进行下载，若地址失效，请通过该接口重新获取
     */
    @JsonProperty("ExpireTime")
    private String expireTime;

    /**
     * GZip 压缩前的文件大小（单位 Byte）
     */
    @JsonProperty("FileSize")
    private Integer fileSize;

    /**
     * GZip 压缩前的文件 MD5
     */
    @JsonProperty("FileMD5")
    private String fileMd5;

    /**
     * GZip 压缩后的文件大小（单位 Byte）
     */
    @JsonProperty("GzipSize")
    private Integer gzipSize;

    /**
     * GZip 压缩后的文件 MD5
     */
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
