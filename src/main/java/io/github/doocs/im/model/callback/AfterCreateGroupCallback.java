package io.github.doocs.im.model.callback;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 创建群组之后回调
 *
 * @author bingo
 * @since 2021/11/16 17:18
 */
public class AfterCreateGroupCallback {
    @JsonProperty("CallbackCommand")
    private String callbackCommand;

    @JsonProperty("GroupId")
    private String groupId;

    @JsonProperty("Operator_Account")
    private String operatorAccount;

    @JsonProperty("Owner_Account")
    private String ownerAccount;

    @JsonProperty("Type")
    private String type;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("MemberList")
    private List<MemberItem> memberList;

    @JsonProperty("UserDefinedDataList")
    private List<UserDefinedDataItem> userDefinedDataList;

    public static class MemberItem {
        @JsonProperty("Member_Account")
        private String memberAccount;

        public String getMemberAccount() {
            return memberAccount;
        }

        public void setMemberAccount(String memberAccount) {
            this.memberAccount = memberAccount;
        }
    }

    public static class UserDefinedDataItem {
        @JsonProperty("Key")
        private String key;

        @JsonProperty("Value")
        private Object value;

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public Object getValue() {
            return value;
        }

        public void setValue(Object value) {
            this.value = value;
        }
    }
}
