package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * @author bingo
 * @since 2021/7/31 10:55
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AndroidInfo implements Serializable {
    private static final long serialVersionUID = 7385957761529536492L;
    /**
     * Android 离线推送声音文件路径。
     */
    @JsonProperty("Sound")
    private String sound;

    /**
     * 华为手机 EMUI 10.0 及以上的通知渠道字段。
     * 该字段不为空时，会覆盖控制台配置的 ChannelID 值；该字段为空时，不会覆盖控制台配置的 ChannelID 值。
     */
    @JsonProperty("HuaWeiChannelID")
    private String huaweiChannelId;

    /**
     * 小米手机 MIUI 10 及以上的通知类别（Channel）适配字段。
     * 该字段不为空时，会覆盖控制台配置的 ChannelID 值；该字段为空时，不会覆盖控制台配置的 ChannelID 值。
     */
    @JsonProperty("XiaoMiChannelID")
    private String xiaomiChannelId;

    /**
     * OPPO 手机 Android 8.0 及以上的 NotificationChannel 通知适配字段。
     * 该字段不为空时，会覆盖控制台配置的 ChannelID 值；该字段为空时，不会覆盖控制台配置的 ChannelID 值。
     */
    @JsonProperty("OPPOChannelID")
    private String oppoChannelId;

    /**
     * Google 手机 Android 8.0 及以上的通知渠道字段。
     * Google 推送新接口（上传证书文件）支持 channel id，旧接口（填写服务器密钥）不支持。
     */
    @JsonProperty("GoogleChannelID")
    private String googleChannelId;

    /**
     * VIVO 手机推送消息分类，“0”代表运营消息，“1”代表系统消息，不填默认为1。
     */
    @JsonProperty("VIVOClassification")
    private Integer vivoClassification;

    /**
     * 华为推送通知消息分类，取值为 LOW、NORMAL，不填默认为 NORMAL。
     */
    @JsonProperty("HuaWeiImportance")
    private String huaweiImportance;

    /**
     * 在控制台配置华为推送为“打开应用内指定页面”的前提下，传“1”表示将透传内容 Ext 作为 Intent 的参数，
     * “0”表示将透传内容 Ext 作为 Action 参数。不填默认为0。两种传参区别可参见 华为推送文档。
     */
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
