package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * @author bingo
 * @since 2023/3/16 15:31
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MarkContactItem implements Serializable {
    private static final long serialVersionUID = -5554775904886723407L;
    /**
     * 操作类型：1-设置标准会话标记 2-设置自定义会话标记 3-同时设置标准/自定义会话标记
     */
    @JsonProperty("OptType")
    private Integer optType;

    /**
     * 操作的会话对象
     */
    @JsonProperty("ContactItem")
    private ContactItem contactItem;

    /**
     * 取消标配标记的位，n表示取消第n位标记值
     */
    @JsonProperty("ClearMark")
    private List<Integer> clearMark;

    /**
     * 设置标配标记的位，n表示设置第n位标记值
     */
    @JsonProperty("SetMark")
    private List<Integer> setMark;

    /**
     * 设置会话自定义会话标记，最大256个字节
     */
    @JsonProperty("CustomMark")
    private String customMark;

    public MarkContactItem() {
    }

    private MarkContactItem(Builder builder) {
        this.optType = builder.optType;
        this.contactItem = builder.contactItem;
        this.clearMark = builder.clearMark;
        this.setMark = builder.setMark;
        this.customMark = builder.customMark;
    }

    public static Builder builder() {
        return new Builder();
    }

    public Integer getOptType() {
        return optType;
    }

    public void setOptType(Integer optType) {
        this.optType = optType;
    }

    public ContactItem getContactItem() {
        return contactItem;
    }

    public void setContactItem(ContactItem contactItem) {
        this.contactItem = contactItem;
    }

    public List<Integer> getClearMark() {
        return clearMark;
    }

    public void setClearMark(List<Integer> clearMark) {
        this.clearMark = clearMark;
    }

    public List<Integer> getSetMark() {
        return setMark;
    }

    public void setSetMark(List<Integer> setMark) {
        this.setMark = setMark;
    }

    public String getCustomMark() {
        return customMark;
    }

    public void setCustomMark(String customMark) {
        this.customMark = customMark;
    }


    public static final class Builder {
        private Integer optType;
        private ContactItem contactItem;
        private List<Integer> clearMark;
        private List<Integer> setMark;
        private String customMark;

        private Builder() {
        }

        public MarkContactItem build() {
            return new MarkContactItem(this);
        }

        public Builder optType(Integer optType) {
            this.optType = optType;
            return this;
        }

        public Builder contactItem(ContactItem contactItem) {
            this.contactItem = contactItem;
            return this;
        }

        public Builder clearMark(List<Integer> clearMark) {
            this.clearMark = clearMark;
            return this;
        }

        public Builder setMark(List<Integer> setMark) {
            this.setMark = setMark;
            return this;
        }

        public Builder customMark(String customMark) {
            this.customMark = customMark;
            return this;
        }
    }
}
