package io.github.doocs.im.model.response;

/**
 * @author bingo
 * @since 2021/8/4 10:43
 */
public class DestroyGroupResult extends GenericResult {
    @Override
    public String toString() {
        return "DestroyGroupResult{" +
                "actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
