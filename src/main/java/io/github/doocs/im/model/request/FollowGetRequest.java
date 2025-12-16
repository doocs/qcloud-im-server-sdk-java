package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * <p>
 * 拉取关注、粉丝与互关列表-请求参数
 * </p>
 *
 * @author MC.Yang
 * @version V1.0
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FollowGetRequest extends GenericRequest implements Serializable {
    private static final long serialVersionUID = 1259725175653532351L;

    /**
     * 用户的 UserID
     */
    @JsonProperty("From_Account")
    private String fromAccount;

    /**
     * 待拉取的类型：
     * 1 - 粉丝
     * 2 - 关注
     * 3 - 互关
     */
    @JsonProperty("FollowType")
    private Integer followType;

    /**
     * 分页的起始位置：首页为空，续拉请求填上一页回包返回的 NextCursor 字段
     */
    @JsonProperty("StartCursor")
    private String startCursor;

    /**
     * 拉取的数量：默认每页返回100条数据，最多支持1000条数据
     */
    @JsonProperty("WantNum")
    private Integer wantNum;

    public FollowGetRequest() {
    }

    public FollowGetRequest(String fromAccount, Integer followType, String startCursor, Integer wantNum) {
        this.fromAccount = fromAccount;
        this.followType = followType;
        this.startCursor = startCursor;
        this.wantNum = wantNum;
    }

    private FollowGetRequest(FollowGetRequest.Builder builder) {
        this.fromAccount = builder.fromAccount;
        this.followType = builder.followType;
        this.startCursor = builder.startCursor;
        this.wantNum = builder.wantNum;
    }

    public static FollowGetRequest.Builder builder() {
        return new FollowGetRequest.Builder();
    }

    public String getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
    }

    public Integer getFollowType() {
        return followType;
    }

    public void setFollowType(Integer followType) {
        this.followType = followType;
    }

    public String getStartCursor() {
        return startCursor;
    }

    public void setStartCursor(String startCursor) {
        this.startCursor = startCursor;
    }

    public Integer getWantNum() {
        return wantNum;
    }

    public void setWantNum(Integer wantNum) {
        this.wantNum = wantNum;
    }

    public static final class Builder {
        private String fromAccount;
        private Integer followType;
        private String startCursor;
        private Integer wantNum;

        private Builder() {
        }

        public FollowGetRequest build() {
            return new FollowGetRequest(this);
        }

        public FollowGetRequest.Builder fromAccount(String fromAccount) {
            this.fromAccount = fromAccount;
            return this;
        }

        public FollowGetRequest.Builder followType(Integer followType) {
            this.followType = followType;
            return this;
        }

        public FollowGetRequest.Builder startCursor(String startCursor) {
            this.startCursor = startCursor;
            return this;
        }

        public FollowGetRequest.Builder wantNum(Integer wantNum) {
            this.wantNum = wantNum;
            return this;
        }

    }
}
