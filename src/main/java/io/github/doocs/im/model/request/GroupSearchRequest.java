package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 群组搜索-请求参数
 * </p>
 *
 * @author MC.Yang
 * @version V1.0
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GroupSearchRequest extends GenericRequest implements Serializable {
    private static final long serialVersionUID = 2674240830817188609L;

    /**
     * 群组类型
     * {@link io.github.doocs.im.constant.GroupType}
     */
    @JsonProperty("GroupType")
    private List<String> groupType;

    /**
     * 逻辑运算符。
     * 1：and
     * 0：or
     * 默认为 or。
     */
    @JsonProperty("KeywordMatchType")
    private Integer keywordMatchType;

    /**
     * 模糊搜索的 Keywords。
     */
    @JsonProperty("Keywords")
    private List<String> keywords;

    /**
     * 一次请求最大记录数，最大100条，超过100条按100条处理。
     */
    @JsonProperty("Count")
    private Integer count;

    /**
     * 续拉参数，上个请求的 Response 中带回，首次请求为空。
     */
    @JsonProperty("Cursor")
    private String cursor;

    public GroupSearchRequest() {
    }

    public GroupSearchRequest(List<String> groupType, Integer keywordMatchType, List<String> keywords, Integer count, String cursor) {
        this.groupType = groupType;
        this.keywordMatchType = keywordMatchType;
        this.keywords = keywords;
        this.count = count;
        this.cursor = cursor;
    }

    private GroupSearchRequest(Builder builder) {
        this.groupType = builder.groupType;
        this.keywordMatchType = builder.keywordMatchType;
        this.keywords = builder.keywords;
        this.count = builder.count;
        this.cursor = builder.cursor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public List<String> getGroupType() {
        return groupType;
    }

    public void setGroupType(List<String> groupType) {
        this.groupType = groupType;
    }

    public Integer getKeywordMatchType() {
        return keywordMatchType;
    }

    public void setKeywordMatchType(Integer keywordMatchType) {
        this.keywordMatchType = keywordMatchType;
    }

    public List<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getCursor() {
        return cursor;
    }

    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public static final class Builder {
        private List<String> groupType;
        private Integer keywordMatchType;
        private List<String> keywords;
        private Integer count;
        private String cursor;

        private Builder() {
        }

        public GroupSearchRequest build() {
            return new GroupSearchRequest(this);
        }

        public Builder groupType(List<String> groupType) {
            this.groupType = groupType;
            return this;
        }

        public Builder keywordMatchType(Integer keywordMatchType) {
            this.keywordMatchType = keywordMatchType;
            return this;
        }

        public Builder keywords(List<String> keywords) {
            this.keywords = keywords;
            return this;
        }

        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        public Builder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }
    }
}
