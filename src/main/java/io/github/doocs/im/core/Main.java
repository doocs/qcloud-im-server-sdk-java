package io.github.doocs.im.core;

import io.github.doocs.im.IMClient;
import io.github.doocs.im.model.request.AccountImportRequest;
import io.github.doocs.im.model.response.AccountImportResult;

import java.io.IOException;

/**
 * @author bingo
 * @since 2021/8/4 15:40
 */
public class Main {
    public static void main(String[] args) {
        // type your sdkAppId here
        long appId = 1400554812;

        // type your adminUserId here
        String identifier = "test";

        // type your applicationKey here
        String key = "60c6c5925f3ae52c7325ac5a8ec78e44c056d1dd84d54e12ffa39911267a2a70";

        // create ImClient instance
        IMClient client = IMClient.getInstance(appId, identifier, key);

        // import account
        AccountImportRequest request = new AccountImportRequest();
        request.setFaceUrl("https://avatars.githubusercontent.com/u/21008209?v=4");
        request.setIdentifier("ylb");
        request.setNick("nickname");
        try {
            AccountImportResult result = client.account.accountImport(request);
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
