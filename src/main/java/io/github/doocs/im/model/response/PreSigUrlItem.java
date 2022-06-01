package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 聊天资源结果项
 *
 * @author bingo
 * @since 2022/6/1 19:05
 */
public class PreSigUrlItem {
    /**
     * 指定资源 ID 对应的查询结果
     */
    @JsonProperty("Code")
    private Integer code;

    /**
     * 指定资源 ID 对应的查询结果的描述
     */
    @JsonProperty("Desc")
    private String desc;

    /**
     * 同批查询的资源 ID
     */
    @JsonProperty("ResourceID")
    private Integer resourceId;

    /**
     * 指定资源 ID 对应的最高权限的签名 URL，可以下载封禁的文件，有效期15分钟
     */
    @JsonProperty("PreSigURL")
    private String preSigUrl;

    /**
     * 指定资源 ID 对应的文件状态:
     * 0-文件正常，SDK 可访问
     * 1-文件被封禁，SDK 访问无权限，可使用 PreSigURL 访问;
     * 2-文件不存在，可能过期被删除；
     */
    @JsonProperty("Status")
    private Integer status;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getResourceId() {
        return resourceId;
    }

    public void setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
    }

    public String getPreSigUrl() {
        return preSigUrl;
    }

    public void setPreSigUrl(String preSigUrl) {
        this.preSigUrl = preSigUrl;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "PreSigUrlItem{" +
                "code=" + code +
                ", desc='" + desc + '\'' +
                ", resourceId=" + resourceId +
                ", preSigUrl='" + preSigUrl + '\'' +
                ", status=" + status +
                '}';
    }
}
