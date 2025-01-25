package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 群@消息
 *
 * @author Vensin
 * @since 2025/1/25 13:43
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GroupAtInfo implements Serializable {

    private static final long serialVersionUID = -11238790123456789L;

    /**
     * 为1表示 @all,为0表示 @某个群成员 <br>
     * {@link io.github.doocs.im.constant.GroupAtAllFlag}
     */
    @JsonProperty("GroupAtAllFlag")
    private Integer groupAtAllFlag;

    /**
     * 表示 @的具体的群成员，如果为 @all，则无需填写该字段 <br>
     * 消息体里面@的用户按顺序逐一对应，该字段上送的是用户的userId，消息体里的'@'后面内容任意，一般为用户的昵称
     */
    @JsonProperty("GroupAt_Account")
    private String groupAtAccount;

    public static GroupAtInfo.Builder builder() {
        return new GroupAtInfo.Builder();
    }


    public Integer getGroupAtAllFlag() {
        return groupAtAllFlag;
    }

    public void setGroupAtAllFlag(Integer groupAtAllFlag) {
        this.groupAtAllFlag = groupAtAllFlag;
    }

    public String getGroupAtAccount() {
        return groupAtAccount;
    }

    public void setGroupAtAccount(String groupAtAccount) {
        this.groupAtAccount = groupAtAccount;
    }


    public static class Builder {
        private Integer groupAtAllFlag;
        private String groupAtAccount;

        private Builder() {
        }

        public Builder groupAtAllFlag(Integer groupAtAllFlag) {
            this.groupAtAllFlag = groupAtAllFlag;
            return this;
        }

        public Builder groupAtAccount(String groupAtAccount) {
            this.groupAtAccount = groupAtAccount;
            return this;
        }

        public GroupAtInfo build() {
            GroupAtInfo groupAtInfo = new GroupAtInfo();
            groupAtInfo.groupAtAllFlag = this.groupAtAllFlag;
            groupAtInfo.groupAtAccount = this.groupAtAccount;
            return groupAtInfo;
        }

        public static Builder builder() {
            return new Builder();
        }
    }

}
