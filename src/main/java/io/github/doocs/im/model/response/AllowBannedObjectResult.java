package io.github.doocs.im.model.response;

/**
 * 聊天文件解封-结果
 *
 * @author bingo
 * @since 2022/6/1 17:40
 */
public class AllowBannedObjectResult extends GenericResult {
    @Override
    public String toString() {
        return "AllowBannedObjectResult{" +
                "actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
