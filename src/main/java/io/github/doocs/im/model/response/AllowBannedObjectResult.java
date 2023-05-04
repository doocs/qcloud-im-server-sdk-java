package io.github.doocs.im.model.response;

import java.io.Serializable;

/**
 * 聊天文件解封-结果
 *
 * @author bingo
 * @since 2022/6/1 17:40
 */
public class AllowBannedObjectResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = 855837798959375275L;

    @Override
    public String toString() {
        return "AllowBannedObjectResult{" +
                "actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
