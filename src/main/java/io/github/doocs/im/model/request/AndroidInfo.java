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
     * Android通知栏样式，“0”代表默认样式，“1”代表大文本样式，不填默认为0。仅对
     * 华为/荣耀/OPPO生效。
     */
    @JsonProperty("PushStyle")
    private Integer pushStyle;

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
     * vivo 手机用来标识消息类型，该字段不为空时，会覆盖控制台配置的 category 值；该字段为空时，不会覆盖控制台配置的 category 值。
     */
    @JsonProperty("VIVOCategory")
    private String vivoCategory;

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

    /**
     * 华为手机用来标识消息类型，该字段不为空时，会覆盖控制台配置的 category 值；该字段为空时，不会覆盖控制台配置的 category 值。
     */
    @JsonProperty("HuaWeiCategory")
    private String huaweiCategory;

    /**
     * 华为推送通知栏消息右侧小图标URL，URL必须使用HTTPS协议，取值样例：https://example.com/image.png。
     * 图片文件须小于512KB，规格建议为40dp x 40dp，弧角大小为8dp。超出建议规格的图片会存在图片压缩或图片显示不全的情况。
     * 图片格式建议使用JPG/JPEG/PNG。
     */
    @JsonProperty("HuaWeiImage")
    private String huaweiImage;

    /**
     * 荣耀推送通知栏消息右侧小图标 URL，URL 必须使用 HTTPS 协议，取值样例：https://example.com/image.png。
     * 图标文件须小于512KB，图标建议规格大小：40dp x 40dp，弧角大小为8dp，超出建议规格大小的图标会存在图片压缩或显示不全的情况。
     */
    @JsonProperty("HonorImage")
    private String honorImage;

    /**
     * 荣耀推送通知消息分类，取值为 LOW、NORMAL，不填默认为 NORMAL。
     */
    @JsonProperty("HonorImportance")
    private String honorImportance;

    /**
     * Google 推送通知栏消息右侧图标 URL，图片资源不超过1M，支持 JPG/JPEG/PNG 格式，
     * 取值样例：https://example.com/image.png。
     */
    @JsonProperty("GoogleImage")
    private String googleImage;

    private AndroidInfo(Builder builder) {
        this.sound = builder.sound;
        this.pushStyle = builder.pushStyle;
        this.huaweiChannelId = builder.huaweiChannelId;
        this.xiaomiChannelId = builder.xiaomiChannelId;
        this.oppoChannelId = builder.oppoChannelId;
        this.googleChannelId = builder.googleChannelId;
        this.vivoClassification = builder.vivoClassification;
        this.vivoCategory = builder.vivoCategory;
        this.huaweiImportance = builder.huaweiImportance;
        this.extAsHuaweiIntentParam = builder.extAsHuaweiIntentParam;
        this.huaweiCategory = builder.huaweiCategory;
        this.huaweiImage = builder.huaweiImage;
        this.honorImage = builder.honorImage;
        this.honorImportance = builder.honorImportance;
        this.googleImage = builder.googleImage;
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

    public Integer getPushStyle() {
        return pushStyle;
    }

    public void setPushStyle(Integer pushStyle) {
        this.pushStyle = pushStyle;
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

    public String getVivoCategory() {
        return vivoCategory;
    }

    public void setVivoCategory(String vivoCategory) {
        this.vivoCategory = vivoCategory;
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

    public String getHuaweiCategory() {
        return huaweiCategory;
    }

    public void setHuaweiCategory(String huaweiCategory) {
        this.huaweiCategory = huaweiCategory;
    }

    public String getHuaweiImage() {
        return huaweiImage;
    }

    public void setHuaweiImage(String huaweiImage) {
        this.huaweiImage = huaweiImage;
    }

    public String getHonorImage() {
        return honorImage;
    }

    public void setHonorImage(String honorImage) {
        this.honorImage = honorImage;
    }

    public String getHonorImportance() {
        return honorImportance;
    }

    public void setHonorImportance(String honorImportance) {
        this.honorImportance = honorImportance;
    }

    public String getGoogleImage() {
        return googleImage;
    }

    public void setGoogleImage(String googleImage) {
        this.googleImage = googleImage;
    }

    public static final class Builder {
        private String sound;
        private Integer pushStyle;
        private String huaweiChannelId;
        private String xiaomiChannelId;
        private String oppoChannelId;
        private String googleChannelId;
        private Integer vivoClassification;
        private String vivoCategory;
        private String huaweiImportance;
        private Integer extAsHuaweiIntentParam;
        private String huaweiCategory;
        private String huaweiImage;
        private String honorImage;
        private String honorImportance;
        private String googleImage;


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

        public Builder pushStyle(Integer pushStyle) {
            this.pushStyle = pushStyle;
            return this;
        }

        public Builder vivoCategory(String vivoCategory) {
            this.vivoCategory = vivoCategory;
            return this;
        }

        public Builder huaweiCategory(String huaweiCategory) {
            this.huaweiCategory = huaweiCategory;
            return this;
        }

        public Builder huaweiImage(String huaweiImage) {
            this.huaweiImage = huaweiImage;
            return this;
        }

        public Builder honorImage(String honorImage) {
            this.honorImage = honorImage;
            return this;
        }

        public Builder honorImportance(String honorImportance) {
            this.honorImportance = honorImportance;
            return this;
        }

        public Builder googleImage(String googleImage) {
            this.googleImage = googleImage;
            return this;
        }
    }
}
