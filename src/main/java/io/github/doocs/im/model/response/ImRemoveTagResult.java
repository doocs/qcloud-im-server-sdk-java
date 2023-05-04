package io.github.doocs.im.model.response;

import java.io.Serializable;

/**
 * 删除用户标签-结果
 *
 * @author hyh
 * @since 2021/07/30 14:27
 */
public class ImRemoveTagResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = -1811789588474563891L;

    @Override
    public String toString() {
        return "ImRemoveTagResult{" +
                "actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
