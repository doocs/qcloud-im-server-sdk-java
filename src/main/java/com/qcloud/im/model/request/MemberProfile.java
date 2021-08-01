package com.qcloud.im.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author bingo
 * @since 2021/8/1 11:20
 */
public class MemberProfile {
    @JsonProperty("Member_Account")
    private String memberAccount;

    @JsonProperty("Role")
    private String role;

    @JsonProperty("JoinTime")
    private Integer joinTime;

    @JsonProperty("MsgSeq")
    private Integer msgSeq;

    @JsonProperty("MsgFlag")
    private String msgFlag;

    @JsonProperty("LastSendMsgTime")
    private Integer lastSendMsgTime;

    @JsonProperty("NameCard")
    private String nameCard;
}
