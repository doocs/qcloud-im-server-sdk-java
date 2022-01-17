package io.github.doocs.im.model.response;

/**
 * 重置群自定义属性-结果
 *
 * @author bingo
 * @since 2021/12/31 11:06
 */
public class SetGroupAttrResult extends GenericResult {
    @Override
    public String toString() {
        return "SetGroupAttrResult{" +
                "actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
