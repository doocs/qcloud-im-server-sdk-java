package io.github.doocs.im.model.response;

/**
 * 添加用户标签-结果
 *
 * @author hyh
 * @since 2021/07/30 14:27
 */
public class ImAddTagResult extends GenericResult {
    @Override
    public String toString() {
        return "ImAddTagResult{" +
                "actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
