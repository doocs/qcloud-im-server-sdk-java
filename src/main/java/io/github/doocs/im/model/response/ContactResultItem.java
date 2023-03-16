package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author bingo
 * @since 2023/3/16 10:59
 */
public class ContactResultItem {
    /**
     * 会话类型，c2c=1,group=2
     */
    @JsonProperty("Type")
    private Integer type;

    /**
     * 用户ID
     */
    @JsonProperty("To_Account")
    private String toAccount;

    /**
     * 标准标记能力位，bit位字符串。eg: 011111110
     */
    @JsonProperty("StandardMark")
    private String standardMark;

    /**
     * 自定义标记
     */
    @JsonProperty("CustomMark")
    private String customMark;

    /**
     * 会话所属分组
     */
    @JsonProperty("ContactGroupId")
    private List<Integer> contactGroupId;

    /**
     * 会话分组对应最近更新时间戳
     */
    @JsonProperty("Timestamp")
    private Integer timestamp;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getToAccount() {
        return toAccount;
    }

    public void setToAccount(String toAccount) {
        this.toAccount = toAccount;
    }

    public String getStandardMark() {
        return standardMark;
    }

    public void setStandardMark(String standardMark) {
        this.standardMark = standardMark;
    }

    public String getCustomMark() {
        return customMark;
    }

    public void setCustomMark(String customMark) {
        this.customMark = customMark;
    }

    public List<Integer> getContactGroupId() {
        return contactGroupId;
    }

    public void setContactGroupId(List<Integer> contactGroupId) {
        this.contactGroupId = contactGroupId;
    }

    public Integer getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "ContactResultItem{" +
                "type=" + type +
                ", toAccount='" + toAccount + '\'' +
                ", standardMark='" + standardMark + '\'' +
                ", customMark='" + customMark + '\'' +
                ", contactGroupId=" + contactGroupId +
                ", timestamp=" + timestamp +
                '}';
    }
}
