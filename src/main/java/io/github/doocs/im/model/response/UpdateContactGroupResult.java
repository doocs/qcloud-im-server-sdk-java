package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 更新会话分组数据-结果
 *
 * @author bingo
 * @since 2023/3/16 11:33
 */
public class UpdateContactGroupResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = -1874267480499239938L;
    /**
     * 更新类型：1 - 更新分组名； 2 - 更新会话分组
     */
    @JsonProperty("UpdateType")
    private Integer updateType;

    /**
     * 	分组维度更新结果
     */
    @JsonProperty("UpdateGroupResult")
    private UpdateGroupResult updateGroupResult;

    public Integer getUpdateType() {
        return updateType;
    }

    public void setUpdateType(Integer updateType) {
        this.updateType = updateType;
    }

    public UpdateGroupResult getUpdateGroupResult() {
        return updateGroupResult;
    }

    public void setUpdateGroupResult(UpdateGroupResult updateGroupResult) {
        this.updateGroupResult = updateGroupResult;
    }


}
