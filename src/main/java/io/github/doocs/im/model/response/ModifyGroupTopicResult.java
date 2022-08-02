package io.github.doocs.im.model.response;

/**
 * 修改话题资料-结果
 *
 * @author bingo
 * @since 2022/8/2 10:38
 */
public class ModifyGroupTopicResult extends GenericResult {
    @Override
    public String toString() {
        return "ModifyGroupTopicResult{" +
                "actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
