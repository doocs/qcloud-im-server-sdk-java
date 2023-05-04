package io.github.doocs.im.model.response;

import java.io.Serializable;

/**
 * 修改群基础资料-结果
 *
 * @author hyh
 * @since 2021/08/02 19:27
 */
public class ModifyGroupBaseInfoResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = -3886947312643222300L;

    @Override
    public String toString() {
        return "ModifyGroupBaseInfoResult{" +
                "actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
