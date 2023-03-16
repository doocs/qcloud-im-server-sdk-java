package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.doocs.im.model.request.ContactItem;

/**
 * @author bingo
 * @since 2023/3/16 20:21
 */
public class ContactGroupResultItem {
    /**
     * 更新类型: 1 - 分组添加会话; 2 - 分组删除会话
     */
    @JsonProperty("ContactOptType")
    private Integer contactOptType;

    /**
     * 操作类型
     */
    @JsonProperty("OptType")
    private Integer optType;

    /**
     * 会话对象
     */
    @JsonProperty("ContactItem")
    private ContactItem contactItem;

    /**
     * 对应会话的操作结果，错误码，0表示成功
     */
    @JsonProperty("ResultCode")
    private Integer resultCode;

    /**
     * 对应会话的操作结果，错误描述
     */
    @JsonProperty("ResultInfo")
    private String resultInfo;

    public Integer getOptType() {
        return optType;
    }

    public void setOptType(Integer optType) {
        this.optType = optType;
    }

    public Integer getContactOptType() {
        return contactOptType;
    }

    public void setContactOptType(Integer contactOptType) {
        this.contactOptType = contactOptType;
    }

    public ContactItem getContactItem() {
        return contactItem;
    }

    public void setContactItem(ContactItem contactItem) {
        this.contactItem = contactItem;
    }

    public Integer getResultCode() {
        return resultCode;
    }

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultInfo() {
        return resultInfo;
    }

    public void setResultInfo(String resultInfo) {
        this.resultInfo = resultInfo;
    }

    @Override
    public String toString() {
        return "ContactGroupResultItem{" +
                "contactOptType=" + contactOptType +
                ", optType=" + optType +
                ", contactItem=" + contactItem +
                ", resultCode=" + resultCode +
                ", resultInfo='" + resultInfo + '\'' +
                '}';
    }
}
