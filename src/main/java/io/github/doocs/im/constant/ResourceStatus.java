package io.github.doocs.im.constant;

/**
 * 某个资源 ID 对应的文件状态
 *
 * @author bingo
 * @since 2022/6/1 19:31
 */
public class ResourceStatus {
    /**
     * 文件正常，SDK 可访问
     */
    public static final int NORMAL = 0;

    /**
     * 文件被封禁，SDK 访问无权限，可使用 PreSigURL 访问
     */
    public static final int FORBIDDEN = 1;

    /**
     * 文件不存在，可能过期被删除
     */
    public static final int NOT_EXISTS = 2;

    private ResourceStatus() {
    }
}
