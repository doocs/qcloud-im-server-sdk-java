package io.github.doocs.im.model.response;

import java.io.Serializable;

/**
 * 修改群自定义属性-结果
 *
 * @author bingo
 * @since 2021/12/31 10:55
 */
public class ModifyGroupAttrResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = 1358502062365432268L;

    @Override
    public String toString() {
        return "ModifyGroupAttrResult{" +
                "actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
