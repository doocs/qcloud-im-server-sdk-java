package io.github.doocs.im.model.response;

import java.io.Serializable;

/**
 * 修改公众号资料-结果
 *
 * @author hyh
 * @since 2024/1/9 22:13
 */
public class ModifyOfficialAccountBaseInfoResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = -2965487435988184051L;

    @Override
    public String toString() {
        return "ModifyOfficialAccountBaseInfoResult{" +
                "actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
