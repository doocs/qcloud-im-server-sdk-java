package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 已读成员
 *
 * @author bingo
 * @since 2022/7/24 20:20
 */
public class ReadAccountItem {
    /**
     * 已读成员
     */
    @JsonProperty("Read_Account")
    private String readAccount;

    public String getReadAccount() {
        return readAccount;
    }

    public void setReadAccount(String readAccount) {
        this.readAccount = readAccount;
    }

    @Override
    public String toString() {
        return "ReadAccountItem{" +
                "readAccount='" + readAccount + '\'' +
                '}';
    }
}
