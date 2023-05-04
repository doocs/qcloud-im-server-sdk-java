package io.github.doocs.im.model.response;

import java.io.Serializable;

/**
 * 修改话题资料-结果
 *
 * @author bingo
 * @since 2022/8/2 10:38
 */
public class ModifyGroupTopicResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = -7550857576070775269L;

    @Override
    public String toString() {
        return "ModifyGroupTopicResult{" +
                "actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
