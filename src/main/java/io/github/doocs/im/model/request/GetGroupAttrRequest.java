package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author: Young
 * @date: 2021-11-05 21:37
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetGroupAttrRequest {

  @JsonProperty("GroupId")
  private String groupId;

  public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }
}
