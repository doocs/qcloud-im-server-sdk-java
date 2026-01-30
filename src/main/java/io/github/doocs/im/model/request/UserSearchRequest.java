package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 用户搜索-请求参数
 * </p>
 *
 * @author MC.Yang
 * @version V1.0
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserSearchRequest extends GenericRequest implements Serializable {
    private static final long serialVersionUID = 5480624981347621262L;
    
    /**
     * 过滤性别，为空表示未指定
     * {@link io.github.doocs.im.constant.GenderType}
     */
    @JsonProperty("UserGenderType")
    private String userGenderType;
    
    /**
     * 过滤起始出生日期，该字段意义由用户决定，我们只保证为整型
     */
    @JsonProperty("UserBirthStart")
    private Integer userBirthStart;
    
    /**
     * 过滤结束出生日期，该字段要比 user_birth_start 大
     */
    @JsonProperty("UserBirthEnd")
    private Integer userBirthEnd;
    
    /**
     * 逻辑运算符。1：and 0：or 默认为 or
     */
    @JsonProperty("KeywordMatchType")
    private Integer keywordMatchType;
    
    /**
     * 模糊搜索的 Keywords
     */
    @JsonProperty("Keywords")
    private List<String> keywords;
    
    /**
     * 一次请求最大记录数，最大100条，超过100条按100处理
     */
    @JsonProperty("Count")
    private Integer count;
    
    /**
     * 续拉参数，上个请求的 Response 中带回，首次请求为空
     */
    @JsonProperty("Cursor")
    private String cursor;
    
    public UserSearchRequest() {
    }
    
    public UserSearchRequest(List<String> keywords, Integer count) {
        this.keywords = keywords;
        this.count = count;
    }
    
    public UserSearchRequest(String userGenderType, Integer userBirthStart, Integer userBirthEnd, 
                           Integer keywordMatchType, List<String> keywords, Integer count, String cursor) {
        this.userGenderType = userGenderType;
        this.userBirthStart = userBirthStart;
        this.userBirthEnd = userBirthEnd;
        this.keywordMatchType = keywordMatchType;
        this.keywords = keywords;
        this.count = count;
        this.cursor = cursor;
    }
    
    private UserSearchRequest(Builder builder) {
        this.userGenderType = builder.userGenderType;
        this.userBirthStart = builder.userBirthStart;
        this.userBirthEnd = builder.userBirthEnd;
        this.keywordMatchType = builder.keywordMatchType;
        this.keywords = builder.keywords;
        this.count = builder.count;
        this.cursor = builder.cursor;
    }
    
    public static Builder builder() {
        return new Builder();
    }
    
    public String getUserGenderType() {
        return userGenderType;
    }
    
    public void setUserGenderType(String userGenderType) {
        this.userGenderType = userGenderType;
    }
    
    public Integer getUserBirthStart() {
        return userBirthStart;
    }
    
    public void setUserBirthStart(Integer userBirthStart) {
        this.userBirthStart = userBirthStart;
    }
    
    public Integer getUserBirthEnd() {
        return userBirthEnd;
    }
    
    public void setUserBirthEnd(Integer userBirthEnd) {
        this.userBirthEnd = userBirthEnd;
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
        private String userGenderType;
        private Integer userBirthStart;
        private Integer userBirthEnd;
        private Integer keywordMatchType;
        private List<String> keywords;
        private Integer count;
        private String cursor;
        
        private Builder() {
        }
        
        public UserSearchRequest build() {
            return new UserSearchRequest(this);
        }
        
        public Builder userGenderType(String userGenderType) {
            this.userGenderType = userGenderType;
            return this;
        }
        
        public Builder userBirthStart(Integer userBirthStart) {
            this.userBirthStart = userBirthStart;
            return this;
        }
        
        public Builder userBirthEnd(Integer userBirthEnd) {
            this.userBirthEnd = userBirthEnd;
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
