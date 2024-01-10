package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * @author bingo
 * @since 2024/1/9 11:36
 */
public class AdminResultItem implements Serializable {
    private static final long serialVersionUID = 6608743524050558356L;

    @JsonProperty("Admin_Account")
    private String adminAccount;

    @JsonProperty("Avatar")
    private String avatar;

    @JsonProperty("NickName")
    private String nickname;

    public String getAdminAccount() {
        return adminAccount;
    }

    public void setAdminAccount(String adminAccount) {
        this.adminAccount = adminAccount;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "AdminResultItem{" +
                "adminAccount='" + adminAccount + '\'' +
                ", avatar='" + avatar + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
