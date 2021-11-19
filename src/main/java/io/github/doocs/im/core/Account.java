package io.github.doocs.im.core;

import io.github.doocs.im.ImClient;
import io.github.doocs.im.model.request.*;
import io.github.doocs.im.model.response.*;
import io.github.doocs.im.util.HttpUtil;

import java.io.IOException;

/**
 * 帐号管理
 *
 * @author hyh
 * @since 2021/07/29 14:52
 */
public class Account {
    /**
     * 帐号管理服务名
     */
    private static final String SERVICE_NAME = "im_open_login_svc";
    private static final String SERVICE_NAME_OPEN_IM = "openim";

    /**
     * 帐号管理相关命令字
     */
    private static final String ACCOUNT_IMPORT_COMMAND = "account_import";
    private static final String MULTI_ACCOUNT_IMPORT_COMMAND = "multiaccount_import";
    private static final String ACCOUNT_DELETE_COMMAND = "account_delete";
    private static final String ACCOUNT_CHECK_COMMAND = "account_check";
    private static final String KICK_COMMAND = "kick";
    private static final String QUERY_ONLINE_STATUS_COMMAND = "query_online_status";

    private final ImClient imClient;

    public Account(ImClient imClient) {
        this.imClient = imClient;
    }

    /**
     * 导入单个帐号
     *
     * @param accountImportRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public AccountImportResult accountImport(AccountImportRequest accountImportRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, ACCOUNT_IMPORT_COMMAND);
        return HttpUtil.post(url, accountImportRequest, AccountImportResult.class, imClient.getConfig());
    }

    /**
     * 导入多个帐号
     *
     * @param multiAccountImportRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public MultiAccountImportResult multiAccountImport(MultiAccountImportRequest multiAccountImportRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, MULTI_ACCOUNT_IMPORT_COMMAND);
        return HttpUtil.post(url, multiAccountImportRequest, MultiAccountImportResult.class, imClient.getConfig());
    }

    /**
     * 删除帐号
     *
     * @param accountDeleteRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public AccountDeleteResult accountDelete(AccountDeleteRequest accountDeleteRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, ACCOUNT_DELETE_COMMAND);
        return HttpUtil.post(url, accountDeleteRequest, AccountDeleteResult.class, imClient.getConfig());
    }

    /**
     * 查询帐号
     *
     * @param accountCheckRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public AccountCheckResult accountCheck(AccountCheckRequest accountCheckRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, ACCOUNT_CHECK_COMMAND);
        return HttpUtil.post(url, accountCheckRequest, AccountCheckResult.class, imClient.getConfig());
    }

    /**
     * 失效帐号登录状态
     *
     * @param kickRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public KickResult kick(KickRequest kickRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, KICK_COMMAND);
        return HttpUtil.post(url, kickRequest, KickResult.class, imClient.getConfig());
    }

    /**
     * 查询帐号在线状态
     *
     * @param queryOnlineStatusRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public QueryOnlineStatusResult queryOnlineStatus(QueryOnlineStatusRequest queryOnlineStatusRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_OPEN_IM, QUERY_ONLINE_STATUS_COMMAND);
        return HttpUtil.post(url, queryOnlineStatusRequest, QueryOnlineStatusResult.class, imClient.getConfig());
    }
}
