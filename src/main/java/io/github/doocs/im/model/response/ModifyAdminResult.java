package io.github.doocs.im.model.response;

import java.io.Serializable;

/**
 * 设置/取消直播群管理员-结果
 *
 * @author bingo
 * @since 2024/1/9 11:50
 */
public class ModifyAdminResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = 4929035643301951603L;

    @Override
    public String toString() {
        return "ModifyAdminResult{" +
                "actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
