package io.github.doocs.im.model.response;

/**
 * 删除用户所有标签-结果
 *
 * @author hyh
 * @since 2021/07/30 14:28
 */
public class ImRemoveAllTagsResult extends GenericResult {
    @Override
    public String toString() {
        return "ImRemoveAllTagsResult{" +
                "actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
