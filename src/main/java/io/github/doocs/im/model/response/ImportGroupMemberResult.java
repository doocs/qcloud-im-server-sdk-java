package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author bingo
 * @since 2021/8/4 11:50
 */
public class ImportGroupMemberResult extends GenericResult {
    @JsonProperty("MemberList")
    private List<MemberListResultItem> memberList;

    @Override
    public String toString() {
        return "ImportGroupMemberResult{" +
                "memberList=" + memberList +
                '}';
    }
}
