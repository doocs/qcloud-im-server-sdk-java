package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author: Young
 * @date: 2021-11-05 21:37
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModifyGroupAttrRequest {

  @JsonProperty("GroupId")
  private String groupId;

  @JsonProperty("GroupAttr")
  List<GroupAttrItem> groupAttr;

  public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  public List<GroupAttrItem> getGroupAttr() {
    return groupAttr;
  }

  public void setGroupAttr(List<GroupAttrItem> groupAttr) {
    this.groupAttr = groupAttr;
  }
}
