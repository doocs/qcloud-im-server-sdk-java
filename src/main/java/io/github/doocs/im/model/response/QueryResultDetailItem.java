package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author bingo
 * @since 2021/10/31 19:57
 */
public class QueryResultDetailItem {
    /**
     * 登录的平台类型。可能的返回值有："iPhone", "Android", "Web", "PC", "iPad", "Mac"。
     */
    @JsonProperty("Platform")
    private String platform;

    /**
     * 该登录平台的状态
     */
    @JsonProperty("Status")
    private String status;

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "QueryResultDetailItem{" +
                "platform='" + platform + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
