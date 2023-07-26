package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 敏感词
 *
 * @author bingo
 * @since 2023/7/26 10:25
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LocalAuditWord implements Serializable {
    private static final long serialVersionUID = -485591943379681570L;

    /**
     * 待删除的敏感词内容
     */
    @JsonProperty("Keyword")
    private String keyword;

    /**
     * 待删除的敏感词类型
     * {@link io.github.doocs.im.constant.AuditWordType}
     */
    @JsonProperty("WordType")
    private Integer wordType;

    /**
     * 敏感词处理类型
     * <p>
     * {@link io.github.doocs.im.constant.AuditFilterType}
     */
    @JsonProperty("FilterType")
    private Integer filterType;

    /**
     * 敏感词 ID
     */
    @JsonProperty("Id")
    private Long id;

    /**
     * 敏感词替换内容
     */
    @JsonProperty("ReplacedContent")
    private String replacedContent;

    /**
     * 对应敏感词更新时间
     */
    @JsonProperty("UpdateTime")
    private String updateTime;

    public LocalAuditWord() {
    }

    public LocalAuditWord(String keyword, Integer wordType, Integer filterType, String replacedContent) {
        this.keyword = keyword;
        this.wordType = wordType;
        this.filterType = filterType;
        this.replacedContent = replacedContent;
    }

    public LocalAuditWord(String keyword, Integer wordType, Integer filterType, Long id, String replacedContent) {
        this.keyword = keyword;
        this.wordType = wordType;
        this.filterType = filterType;
        this.id = id;
        this.replacedContent = replacedContent;
    }

    public LocalAuditWord(String keyword, Integer wordType, Integer filterType, Long id, String replacedContent, String updateTime) {
        this.keyword = keyword;
        this.wordType = wordType;
        this.filterType = filterType;
        this.id = id;
        this.replacedContent = replacedContent;
        this.updateTime = updateTime;
    }

    private LocalAuditWord(Builder builder) {
        this.keyword = builder.keyword;
        this.wordType = builder.wordType;
        this.filterType = builder.filterType;
        this.id = builder.id;
        this.replacedContent = builder.replacedContent;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Integer getWordType() {
        return wordType;
    }

    public void setWordType(Integer wordType) {
        this.wordType = wordType;
    }

    public Integer getFilterType() {
        return filterType;
    }

    public void setFilterType(Integer filterType) {
        this.filterType = filterType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReplacedContent() {
        return replacedContent;
    }

    public void setReplacedContent(String replacedContent) {
        this.replacedContent = replacedContent;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public static final class Builder {
        private String keyword;
        private Integer wordType;
        private Integer filterType;
        private Long id;
        private String replacedContent;
        private String updateTime;

        private Builder() {
        }

        public LocalAuditWord build() {
            return new LocalAuditWord(this);
        }

        public Builder keyword(String keyword) {
            this.keyword = keyword;
            return this;
        }

        public Builder wordType(Integer wordType) {
            this.wordType = wordType;
            return this;
        }

        public Builder filterType(Integer filterType) {
            this.filterType = filterType;
            return this;
        }

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder replacedContent(String replacedContent) {
            this.replacedContent = replacedContent;
            return this;
        }

        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
    }
}
