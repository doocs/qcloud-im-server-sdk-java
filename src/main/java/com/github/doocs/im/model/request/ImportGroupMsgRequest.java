package com.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.doocs.im.model.response.MsgListItem;

import java.util.List;

/**
 * @author hyh
 * @since 2021/08/02 17:45
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImportGroupMsgRequest extends GenericRequest {
    @JsonProperty("GroupId")
    private String groupId;

    @JsonProperty("MsgList")
    private List<MsgListItem> msgList;
}
