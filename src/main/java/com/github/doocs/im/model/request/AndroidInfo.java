package com.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author bingo
 * @since 2021/7/31 10:55
 */
public class AndroidInfo {
    @JsonProperty("Sound")
    private String sound;

    @JsonProperty("HuaWeiChannelID")
    private String huaweiChannelId;

    @JsonProperty("XiaoMiChannelID")
    private String xiaomiChannelId;

    @JsonProperty("OPPOChannelID")
    private String oppoChannelId;

    @JsonProperty("OPPOChannelID")
    private String googleChannelId;

    @JsonProperty("VIVOClassification")
    private String vivoChannelId;

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

    public String getVivoChannelId() {
        return vivoChannelId;
    }

    public void setVivoChannelId(String vivoChannelId) {
        this.vivoChannelId = vivoChannelId;
    }
}
