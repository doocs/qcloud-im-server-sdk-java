package io.github.doocs.im.model.response;

import java.io.Serializable;

/**
 * 删除用户属性-结果
 *
 * @author hyh
 * @since 2021/07/30 14:03
 */
public class ImRemoveAttrResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = 3003550877985028750L;

    @Override
    public String toString() {
        return "ImRemoveAttrResult{" +
                "actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
