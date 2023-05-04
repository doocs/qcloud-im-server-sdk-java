package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 添加好友-请求参数
 *
 * @author hyh
 * @since 2021/07/31 14:08
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FriendAddRequest extends GenericRequest implements Serializable {
    private static final long serialVersionUID = -5393541553321653455L;
    /**
     * 需要为该 UserID 添加好友
     */
    @JsonProperty("From_Account")
    private String fromAccount;

    /**
     * 好友结构体对象
     */
    @JsonProperty("AddFriendItem")
    private List<AddFriendItem> addFriendItemList;

    /**
     * 加好友方式（默认双向加好友方式）：
     * Add_Type_Single 表示单向加好友
     * Add_Type_Both 表示双向加好友
     * {@link io.github.doocs.im.constant.AddType}
     */
    @JsonProperty("AddType")
    private String addType;

    /**
     * 管理员强制加好友标记：1表示强制加好友，0表示常规加好友方式
     * {@link io.github.doocs.im.constant.ForceAddFlags}
     */
    @JsonProperty("ForceAddFlags")
    private Integer forceAddFlags;

    public FriendAddRequest() {
    }

    public FriendAddRequest(String fromAccount, List<AddFriendItem> addFriendItemList) {
        this.fromAccount = fromAccount;
        this.addFriendItemList = addFriendItemList;
    }

    public FriendAddRequest(String fromAccount, List<AddFriendItem> addFriendItemList, String addType, Integer forceAddFlags) {
        this.fromAccount = fromAccount;
        this.addFriendItemList = addFriendItemList;
        this.addType = addType;
        this.forceAddFlags = forceAddFlags;
    }

    private FriendAddRequest(Builder builder) {
        this.fromAccount = builder.fromAccount;
        this.addFriendItemList = builder.addFriendItemList;
        this.addType = builder.addType;
        this.forceAddFlags = builder.forceAddFlags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
    }

    public List<AddFriendItem> getAddFriendItemList() {
        return addFriendItemList;
    }

    public void setAddFriendItemList(List<AddFriendItem> addFriendItemList) {
        this.addFriendItemList = addFriendItemList;
    }

    public String getAddType() {
        return addType;
    }

    public void setAddType(String addType) {
        this.addType = addType;
    }

    public Integer getForceAddFlags() {
        return forceAddFlags;
    }

    public void setForceAddFlags(Integer forceAddFlags) {
        this.forceAddFlags = forceAddFlags;
    }


    public static final class Builder {
        private String fromAccount;
        private List<AddFriendItem> addFriendItemList;
        private String addType;
        private Integer forceAddFlags;

        private Builder() {
        }

        public FriendAddRequest build() {
            return new FriendAddRequest(this);
        }

        public Builder fromAccount(String fromAccount) {
            this.fromAccount = fromAccount;
            return this;
        }

        public Builder addFriendItemList(List<AddFriendItem> addFriendItemList) {
            this.addFriendItemList = addFriendItemList;
            return this;
        }

        public Builder addType(String addType) {
            this.addType = addType;
            return this;
        }

        public Builder forceAddFlags(Integer forceAddFlags) {
            this.forceAddFlags = forceAddFlags;
            return this;
        }
    }
}
