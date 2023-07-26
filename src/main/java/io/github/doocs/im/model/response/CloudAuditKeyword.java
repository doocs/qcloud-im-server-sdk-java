package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 云端审核词库
 *
 * @author bingo
 * @since 2023/7/26 10:25
 */
public class CloudAuditKeyword implements Serializable {
    private static final long serialVersionUID = 7829803308554142733L;

    /**
     * 词库 ID，该字段用于词库操作。
     */
    @JsonProperty("ID")
    private String id;

    /**
     * 词库名称。
     */
    @JsonProperty("LibName")
    private String libName;

    /**
     * 词库内容。
     */
    @JsonProperty("Content")
    private String content;

    /**
     * 词库描述。
     */
    @JsonProperty("Describe")
    private String describe;

    /**
     * 词库创建时间。
     */
    @JsonProperty("CreateTime")
    private String createTime;

    /**
     * 词库总数。
     */
    @JsonProperty("Suggestion")
    private String suggestion;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLibName() {
        return libName;
    }

    public void setLibName(String libName) {
        this.libName = libName;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }

    @Override
    public String toString() {
        return "CloudAuditKeyword{" +
                "id='" + id + '\'' +
                ", libName='" + libName + '\'' +
                ", describe='" + describe + '\'' +
                ", createTime='" + createTime + '\'' +
                ", suggestion='" + suggestion + '\'' +
                '}';
    }
}
