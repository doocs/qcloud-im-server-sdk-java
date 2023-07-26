package io.github.doocs.im.core;

import io.github.doocs.im.ClientFactory;
import io.github.doocs.im.ImClient;
import io.github.doocs.im.constant.ActionStatus;
import io.github.doocs.im.model.request.CreateRobotRequest;
import io.github.doocs.im.model.request.DeleteRobotRequest;
import io.github.doocs.im.model.request.GetAllRobotsRequest;
import io.github.doocs.im.model.response.CreateRobotResult;
import io.github.doocs.im.model.response.DeleteRobotResult;
import io.github.doocs.im.model.response.GetAllRobotsResult;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;

/**
 * 机器人测试类 {@link io.github.doocs.im.core.Robot}
 *
 * @author bingo
 * @since 2023/7/26 10:56
 */
class RobotTest {
    private static ImClient client;

    @BeforeAll
    static void setup() {
        client = ClientFactory.getInstance();
        Assertions.assertNotNull(client, "client is null");
    }

    @Test
    void testCreateRobot() throws IOException {
        CreateRobotRequest request = new CreateRobotRequest();
        request.setNick("bingo");
        request.setFaceUrl("https://avatars.githubusercontent.com/u/2784452?v=4");
        request.setSelfSignature("hah");
        request.setUserId("@RBT#1233232");
        CreateRobotResult result = client.robot.createRobot(request);
        System.out.println(result);
        Assertions.assertEquals(ActionStatus.OK, result.getActionStatus());
    }

    @Test
    void testGetAllRobots() throws IOException {
        GetAllRobotsRequest request = new GetAllRobotsRequest();
        GetAllRobotsResult result = client.robot.getAllRobots(request);
        System.out.println(result);
        Assertions.assertFalse(result.getRobotAccount().isEmpty());
    }

    @Test
    void testDeleteRobot() throws IOException {
        DeleteRobotRequest request = DeleteRobotRequest.builder().robotAccount("@RBT#1233232").build();
        DeleteRobotResult result = client.robot.deleteRobot(request);
        System.out.println(result);
        Assertions.assertEquals(ActionStatus.OK, result.getActionStatus());
    }
}
