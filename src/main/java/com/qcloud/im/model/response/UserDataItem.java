package com.qcloud.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author hyh
 * @since 2021/07/30 16:53
 */
public class UserDataItem {
    @JsonProperty("To_Account")
    private String toAccount;

    @JsonProperty("ValueItem")
    private List<ValueItem> valueItemList;
}
