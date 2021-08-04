package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author bingo
 * @since 2021/8/4 11:44
 */
public class ImportGroupResult extends GenericResult {
    @JsonProperty("GroupId")
    private String groupId;
}
