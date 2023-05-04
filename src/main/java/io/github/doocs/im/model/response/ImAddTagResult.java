package io.github.doocs.im.model.response;

import java.io.Serializable;

/**
 * 添加用户标签-结果
 *
 * @author hyh
 * @since 2021/07/30 14:27
 */
public class ImAddTagResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = -6327269078316462037L;

    @Override
    public String toString() {
        return "ImAddTagResult{" +
                "actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
