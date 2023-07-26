package io.github.doocs.im.core;

import io.github.doocs.im.ImClient;
import io.github.doocs.im.model.request.CreateRobotRequest;
import io.github.doocs.im.model.request.DeleteRobotRequest;
import io.github.doocs.im.model.request.GetAllRobotsRequest;
import io.github.doocs.im.model.response.CreateRobotResult;
import io.github.doocs.im.model.response.DeleteRobotResult;
import io.github.doocs.im.model.response.GetAllRobotsResult;
import io.github.doocs.im.util.HttpUtil;

import java.io.IOException;

/**
 * 机器人
 *
 * @author bingo
 * @since 2023/7/26 10:25
 */
public class Robot {
    /**
     * 机器人服务名
     */
    public static final String SERVICE_NAME = "openim_robot_http_svc";

    public static final String CREATE_ROBOT_COMMAND = "create_robot";

    public static final String DELETE_ROBOT_COMMAND = "delete_robot";

    public static final String GET_ALL_ROBOTS_COMMAND = "get_all_robots";

    private final ImClient imClient;

    public Robot(ImClient imClient) {
        this.imClient = imClient;
    }

    /**
     * 创建机器人
     *
     * @param createRobotRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public CreateRobotResult createRobot(CreateRobotRequest createRobotRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, CREATE_ROBOT_COMMAND);
        return HttpUtil.post(url, createRobotRequest, CreateRobotResult.class, imClient.getConfig());
    }

    public CreateRobotResult createRobot(CreateRobotRequest createRobotRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, CREATE_ROBOT_COMMAND, random);
        return HttpUtil.post(url, createRobotRequest, CreateRobotResult.class, imClient.getConfig());
    }

    /**
     * 删除机器人
     *
     * @param deleteRobotRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public DeleteRobotResult deleteRobot(DeleteRobotRequest deleteRobotRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, DELETE_ROBOT_COMMAND);
        return HttpUtil.post(url, deleteRobotRequest, DeleteRobotResult.class, imClient.getConfig());
    }

    public DeleteRobotResult deleteRobot(DeleteRobotRequest deleteRobotRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, DELETE_ROBOT_COMMAND, random);
        return HttpUtil.post(url, deleteRobotRequest, DeleteRobotResult.class, imClient.getConfig());
    }

    /**
     * 拉取所有机器人
     *
     * @param getAllRobotsRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public GetAllRobotsResult getAllRobots(GetAllRobotsRequest getAllRobotsRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, GET_ALL_ROBOTS_COMMAND);
        return HttpUtil.post(url, getAllRobotsRequest, GetAllRobotsResult.class, imClient.getConfig());
    }

    public GetAllRobotsResult getAllRobots(GetAllRobotsRequest getAllRobotsRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, GET_ALL_ROBOTS_COMMAND, random);
        return HttpUtil.post(url, getAllRobotsRequest, GetAllRobotsResult.class, imClient.getConfig());
    }
}
