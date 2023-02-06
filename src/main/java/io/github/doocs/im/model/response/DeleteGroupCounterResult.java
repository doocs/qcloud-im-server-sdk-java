package io.github.doocs.im.model.response;

/**
 * 删除群计数器-结果
 *
 * @author bingo
 * @since 2023/2/6 11:33
 */
public class DeleteGroupCounterResult extends GenericResult {
    @Override
    public String toString() {
        return "DeleteGroupCounterResult{" +
                "actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                "} " + super.toString();
    }
}
