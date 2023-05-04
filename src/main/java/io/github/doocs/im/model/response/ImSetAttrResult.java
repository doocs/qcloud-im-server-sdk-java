package io.github.doocs.im.model.response;

import java.io.Serializable;

/**
 * 设置用户属性-结果
 *
 * @author hyh
 * @since 2021/07/30 11:54
 */
public class ImSetAttrResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = 8508747738225595619L;

    @Override
    public String toString() {
        return "ImSetAttrResult{" +
                "actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
