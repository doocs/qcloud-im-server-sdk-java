package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 用户搜索-结果
 * </p>
 *
 * @author MC.Yang
 * @version V1.0
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserSearchResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = 42884255649710653L;

    /**
     * 搜索是否结束
     */
    @JsonProperty("IsFinish")
    private Boolean isFinish;

    /**
     * 命中的搜索结果个数
     */
    @JsonProperty("TotalCount")
    private Integer totalCount;

    /**
     * 命中的用户数
     */
    @JsonProperty("Users")
    private List<UserProfileResultItem> users;

    /**
     * 续拉参数，下个请求的 Response 中带回
     */
    @JsonProperty("Cursor")
    private Integer cursor;

    public Boolean getIsFinish() {
        return isFinish;
    }

    public void setIsFinish(Boolean isFinish) {
        this.isFinish = isFinish;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<UserProfileResultItem> getUsers() {
        return users;
    }

    public void setUsers(List<UserProfileResultItem> users) {
        this.users = users;
    }

    public Integer getCursor() {
        return cursor;
    }

    public void setCursor(Integer cursor) {
        this.cursor = cursor;
    }

    @Override
    public String toString() {
        return "UserSearchResult{" +
                "isFinish=" + isFinish +
                ", totalCount=" + totalCount +
                ", users=" + users +
                ", cursor=" + cursor +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
