package io.github.doocs.im.model.response;

/**
 * 删除用户标签-结果
 *
 * @author hyh
 * @since 2021/07/30 14:27
 */
public class ImRemoveTagResult extends GenericResult {
    @Override
    public String toString() {
        return "ImRemoveTagResult{" +
                "actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
