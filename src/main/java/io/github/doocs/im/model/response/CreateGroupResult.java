package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 创建群组-结果
 *
 * @author bingo
 * @since 2021/8/1 11:24
 */
public class CreateGroupResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = 4762774469654956033L;
    /**
     * 创建成功之后的群 ID，由即时通信 IM 后台分配
     */
    @JsonProperty("GroupId")
    private String groupId;

    @JsonProperty("Type")
    private String type;

    @JsonProperty("HugeGroupFlag")
    private Integer hugeGroupFlag;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getHugeGroupFlag() {
        return hugeGroupFlag;
    }

    public void setHugeGroupFlag(Integer hugeGroupFlag) {
        this.hugeGroupFlag = hugeGroupFlag;
    }

    @Override
    public String toString() {
        return "CreateGroupResult{" +
                "groupId='" + groupId + '\'' +
                ", type='" + type + '\'' +
                ", hugeGroupFlag=" + hugeGroupFlag +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
