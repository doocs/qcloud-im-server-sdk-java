package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author bingo
 * @since 2021/7/31 10:52
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OfflinePushInfo {
    @JsonProperty("PushFlag")
    private Integer pushFlag;

    @JsonProperty("Title")
    private String title;

    @JsonProperty("Desc")
    private String desc;

    @JsonProperty("Ext")
    private String ext;

    @JsonProperty("AndroidInfo")
    private AndroidInfo androidInfo;

    @JsonProperty("ApnsInfo")
    private ApnsInfo apnsInfo;

    private OfflinePushInfo(Builder builder) {
        this.pushFlag = builder.pushFlag;
        this.title = builder.title;
        this.desc = builder.desc;
        this.ext = builder.ext;
        this.androidInfo = builder.androidInfo;
        this.apnsInfo = builder.apnsInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public Integer getPushFlag() {
        return pushFlag;
    }

    public void setPushFlag(Integer pushFlag) {
        this.pushFlag = pushFlag;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    public AndroidInfo getAndroidInfo() {
        return androidInfo;
    }

    public void setAndroidInfo(AndroidInfo androidInfo) {
        this.androidInfo = androidInfo;
    }

    public ApnsInfo getApnsInfo() {
        return apnsInfo;
    }

    public void setApnsInfo(ApnsInfo apnsInfo) {
        this.apnsInfo = apnsInfo;
    }


    public static final class Builder {
        private Integer pushFlag;
        private String title;
        private String desc;
        private String ext;
        private AndroidInfo androidInfo;
        private ApnsInfo apnsInfo;

        private Builder() {
        }

        public OfflinePushInfo build() {
            return new OfflinePushInfo(this);
        }

        public Builder pushFlag(Integer pushFlag) {
            this.pushFlag = pushFlag;
            return this;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder desc(String desc) {
            this.desc = desc;
            return this;
        }

        public Builder ext(String ext) {
            this.ext = ext;
            return this;
        }

        public Builder androidInfo(AndroidInfo androidInfo) {
            this.androidInfo = androidInfo;
            return this;
        }

        public Builder apnsInfo(ApnsInfo apnsInfo) {
            this.apnsInfo = apnsInfo;
            return this;
        }
    }
}
