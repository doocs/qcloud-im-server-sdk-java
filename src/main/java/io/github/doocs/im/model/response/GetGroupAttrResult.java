package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author hyh
 * @since 2021/08/01 13:33
 */
public class GetGroupAttrResult extends GenericResult {

    @JsonProperty("GroupAttrAry")
    private List<GetGroupAttrItem> groupAttrAry;

    public List<GetGroupAttrItem> getGroupAttrAry() {
        return groupAttrAry;
    }

    public void setGroupAttrAry(List<GetGroupAttrItem> groupAttrAry) {
        this.groupAttrAry = groupAttrAry;
    }

    @Override
    public String toString() {
        return "GetGroupAttrResult{" +
                "groupAttrAry=" + groupAttrAry +
                '}';
    }
}
