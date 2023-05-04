package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 获取用户所加入的群组-请求参数
 *
 * @author hyh
 * @since 2021/08/02 16:39
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetJoinedGroupListRequest extends GenericRequest implements Serializable {
    private static final long serialVersionUID = -3718958862159545148L;
    /**
     * 需要查询的用户帐号
     */
    @JsonProperty("Member_Account")
    private String memberAccount;

    /**
     * 是否获取用户加入的 AVChatRoom(直播群)，0表示不获取，1表示获取。默认为0
     */
    @JsonProperty("WithHugeGroups")
    private Integer withHugeGroups;

    /**
     * 是否获取用户已加入但未激活的 Private（即新版本中 Work，好友工作群) 群信息，0表示不获取，1表示获取。默认为0
     */
    @JsonProperty("WithNoActiveGroups")
    private Integer withNoActiveGroups;

    /**
     * 单次拉取的群组数量，如果不填代表所有群组
     */
    @JsonProperty("Limit")
    private Integer limit;

    /**
     * 从第多少个群组开始拉取
     */
    @JsonProperty("Offset")
    private Integer offset;

    /**
     * 拉取哪种群组类型，例如 Public(陌生人社交群)，Private（即新版本Work，好友工作群)，
     * ChatRoom （即新版本Meeting，会议群），AVChatRoom(直播群)，Community（社群），不填为拉取所有
     */
    @JsonProperty("GroupType")
    private String groupType;

    /**
     * 分别包含 GroupBaseInfoFilter 和 SelfInfoFilter 两个过滤器；
     * GroupBaseInfoFilter 表示需要拉取哪些基础信息字段，详情请参阅 群组系统；
     * SelfInfoFilter 表示需要拉取用户在每个群组中的哪些个人资料，详情请参阅 群组系统 。
     */
    @JsonProperty("ResponseFilter")
    private ResponseFilter responseFilter;

    public GetJoinedGroupListRequest() {
    }

    public GetJoinedGroupListRequest(String memberAccount) {
        this.memberAccount = memberAccount;
    }

    public GetJoinedGroupListRequest(String memberAccount, Integer withHugeGroups, Integer withNoActiveGroups,
                                     Integer limit, Integer offset, String groupType, ResponseFilter responseFilter) {
        this.memberAccount = memberAccount;
        this.withHugeGroups = withHugeGroups;
        this.withNoActiveGroups = withNoActiveGroups;
        this.limit = limit;
        this.offset = offset;
        this.groupType = groupType;
        this.responseFilter = responseFilter;
    }

    private GetJoinedGroupListRequest(Builder builder) {
        this.memberAccount = builder.memberAccount;
        this.withHugeGroups = builder.withHugeGroups;
        this.withNoActiveGroups = builder.withNoActiveGroups;
        this.limit = builder.limit;
        this.offset = builder.offset;
        this.groupType = builder.groupType;
        this.responseFilter = builder.responseFilter;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getMemberAccount() {
        return memberAccount;
    }

    public void setMemberAccount(String memberAccount) {
        this.memberAccount = memberAccount;
    }

    public Integer getWithHugeGroups() {
        return withHugeGroups;
    }

    public void setWithHugeGroups(Integer withHugeGroups) {
        this.withHugeGroups = withHugeGroups;
    }

    public Integer getWithNoActiveGroups() {
        return withNoActiveGroups;
    }

    public void setWithNoActiveGroups(Integer withNoActiveGroups) {
        this.withNoActiveGroups = withNoActiveGroups;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public String getGroupType() {
        return groupType;
    }

    public void setGroupType(String groupType) {
        this.groupType = groupType;
    }

    public ResponseFilter getResponseFilter() {
        return responseFilter;
    }

    public void setResponseFilter(ResponseFilter responseFilter) {
        this.responseFilter = responseFilter;
    }


    public static final class Builder {
        private String memberAccount;
        private Integer withHugeGroups;
        private Integer withNoActiveGroups;
        private Integer limit;
        private Integer offset;
        private String groupType;
        private ResponseFilter responseFilter;

        private Builder() {
        }

        public GetJoinedGroupListRequest build() {
            return new GetJoinedGroupListRequest(this);
        }

        public Builder memberAccount(String memberAccount) {
            this.memberAccount = memberAccount;
            return this;
        }

        public Builder withHugeGroups(Integer withHugeGroups) {
            this.withHugeGroups = withHugeGroups;
            return this;
        }

        public Builder withNoActiveGroups(Integer withNoActiveGroups) {
            this.withNoActiveGroups = withNoActiveGroups;
            return this;
        }

        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public Builder offset(Integer offset) {
            this.offset = offset;
            return this;
        }

        public Builder groupType(String groupType) {
            this.groupType = groupType;
            return this;
        }

        public Builder responseFilter(ResponseFilter responseFilter) {
            this.responseFilter = responseFilter;
            return this;
        }
    }
}
