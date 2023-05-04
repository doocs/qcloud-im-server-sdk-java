package io.github.doocs.im.model.response;

import java.io.Serializable;

/**
 * 设置应用属性名称-结果
 *
 * @author hyh
 * @since 2021/07/30 11:22
 */
public class ImSetAttrNameResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = 3652875017158557936L;

    @Override
    public String toString() {
        return "ImSetAttrNameResult{" +
                "actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
