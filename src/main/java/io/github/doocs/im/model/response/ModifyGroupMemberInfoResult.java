package io.github.doocs.im.model.response;

/**
 * 修改群成员资料-结果
 *
 * @author bingo
 * @since 2021/8/4 10:42
 */
public class ModifyGroupMemberInfoResult extends GenericResult {
    @Override
    public String toString() {
        return "ModifyGroupMemberInfoResult{" +
                "actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
