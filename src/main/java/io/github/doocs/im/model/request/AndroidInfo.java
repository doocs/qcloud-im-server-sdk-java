package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author bingo
 * @since 2021/7/31 10:55
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AndroidInfo {
    @JsonProperty("Sound")
    private String sound;

    @JsonProperty("HuaWeiChannelID")
    private String huaweiChannelId;

    @JsonProperty("XiaoMiChannelID")
    private String xiaomiChannelId;

    @JsonProperty("OPPOChannelID")
    private String oppoChannelId;

    @JsonProperty("GoogleChannelID")
    private String googleChannelId;

    @JsonProperty("VIVOClassification")
    private Integer vivoClassification;

    @JsonProperty("HuaWeiImportance")
    private String huaweiImportance;

    @JsonProperty("ExtAsHuaweiIntentParam")
    private Integer extAsHuaweiIntentParam;

    private AndroidInfo(Builder builder) {
        this.sound = builder.sound;
        this.huaweiChannelId = builder.huaweiChannelId;
        this.xiaomiChannelId = builder.xiaomiChannelId;
        this.oppoChannelId = builder.oppoChannelId;
        this.googleChannelId = builder.googleChannelId;
        this.vivoClassification = builder.vivoClassification;
        this.huaweiImportance = builder.huaweiImportance;
        this.extAsHuaweiIntentParam = builder.extAsHuaweiIntentParam;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getHuaweiChannelId() {
        return huaweiChannelId;
    }

    public void setHuaweiChannelId(String huaweiChannelId) {
        this.huaweiChannelId = huaweiChannelId;
    }

    public String getXiaomiChannelId() {
        return xiaomiChannelId;
    }

    public void setXiaomiChannelId(String xiaomiChannelId) {
        this.xiaomiChannelId = xiaomiChannelId;
    }

    public String getOppoChannelId() {
        return oppoChannelId;
    }

    public void setOppoChannelId(String oppoChannelId) {
        this.oppoChannelId = oppoChannelId;
    }

    public String getGoogleChannelId() {
        return googleChannelId;
    }

    public void setGoogleChannelId(String googleChannelId) {
        this.googleChannelId = googleChannelId;
    }

    public Integer getVivoClassification() {
        return vivoClassification;
    }

    public void setVivoClassification(Integer vivoClassification) {
        this.vivoClassification = vivoClassification;
    }

    public String getHuaweiImportance() {
        return huaweiImportance;
    }

    public void setHuaweiImportance(String huaweiImportance) {
        this.huaweiImportance = huaweiImportance;
    }

    public Integer getExtAsHuaweiIntentParam() {
        return extAsHuaweiIntentParam;
    }

    public void setExtAsHuaweiIntentParam(Integer extAsHuaweiIntentParam) {
        this.extAsHuaweiIntentParam = extAsHuaweiIntentParam;
    }


    public static final class Builder {
        private String sound;
        private String huaweiChannelId;
        private String xiaomiChannelId;
        private String oppoChannelId;
        private String googleChannelId;
        private Integer vivoClassification;
        private String huaweiImportance;
        private Integer extAsHuaweiIntentParam;

        private Builder() {
        }

        public AndroidInfo build() {
            return new AndroidInfo(this);
        }

        public Builder sound(String sound) {
            this.sound = sound;
            return this;
        }

        public Builder huaweiChannelId(String huaweiChannelId) {
            this.huaweiChannelId = huaweiChannelId;
            return this;
        }

        public Builder xiaomiChannelId(String xiaomiChannelId) {
            this.xiaomiChannelId = xiaomiChannelId;
            return this;
        }

        public Builder oppoChannelId(String oppoChannelId) {
            this.oppoChannelId = oppoChannelId;
            return this;
        }

        public Builder googleChannelId(String googleChannelId) {
            this.googleChannelId = googleChannelId;
            return this;
        }

        public Builder vivoClassification(Integer vivoClassification) {
            this.vivoClassification = vivoClassification;
            return this;
        }

        public Builder huaweiImportance(String huaweiImportance) {
            this.huaweiImportance = huaweiImportance;
            return this;
        }

        public Builder extAsHuaweiIntentParam(Integer extAsHuaweiIntentParam) {
            this.extAsHuaweiIntentParam = extAsHuaweiIntentParam;
            return this;
        }
    }
}
