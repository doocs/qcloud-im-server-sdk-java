package io.github.doocs.im.model.response;

import java.io.Serializable;

/**
 * 聊天文件封禁-结果
 *
 * @author bingo
 * @since 2022/6/1 17:14
 */
public class ForbidIllegalObjectResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = 5221170518505773566L;

    @Override
    public String toString() {
        return "ForbidIllegalObjectResult{" +
                "actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
