package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author bingo
 * @since 2021/7/31 19:07
 */
public class AppInfoResultItem {
    /**
     * 应用名称
     */
    @JsonProperty("AppName")
    private String appName;

    /**
     * 应用 SDKAppID
     */
    @JsonProperty("AppId")
    private String appId;

    /**
     * 所属客户名称
     */
    @JsonProperty("Company")
    private String company;

    /**
     * 活跃用户数
     */
    @JsonProperty("ActiveUserNum")
    private String activeUserNum;

    /**
     * 新增注册人数
     */
    @JsonProperty("RegistUserNumOneDay")
    private String registerUserNumOneDay;

    /**
     * 累计注册人数
     */
    @JsonProperty("RegistUserNumTotal")
    private String registerUserNumTotal;

    /**
     * 登录次数
     */
    @JsonProperty("LoginTimes")
    private String loginTimes;

    /**
     * 登录人数
     */
    @JsonProperty("LoginUserNum")
    private String loginUserNum;

    /**
     * 上行消息数
     */
    @JsonProperty("UpMsgNum")
    private String upMsgNum;

    /**
     * 发消息人数
     */
    @JsonProperty("SendMsgUserNum")
    private String sendMsgUserNum;

    /**
     * APNs 推送数
     */
    @JsonProperty("APNSMsgNum")
    private String apnsMsgNum;

    /**
     * 上行消息数（C2C）
     */
    @JsonProperty("C2CUpMsgNum")
    private String c2cUpMsgNum;

    /**
     * 下行消息数（C2C）
     */
    @JsonProperty("C2CDownMsgNum")
    private String c2cDownMsgNum;

    /**
     * 发消息人数（C2C）
     */
    @JsonProperty("C2CSendMsgUserNum")
    private String c2cSendMsgUserNum;

    /**
     * APNs 推送数（C2C）
     */
    @JsonProperty("C2CAPNSMsgNum")
    private String c2cApnsMsgNum;

    /**
     * 最高在线人数
     */
    @JsonProperty("MaxOnlineNum")
    private String maxOnlineNum;

    /**
     * 下行消息总数（C2C和群）
     */
    @JsonProperty("DownMsgNum")
    private String downMsgNum;

    /**
     * 关系链对数增加量
     */
    @JsonProperty("ChainIncrease")
    private String chainIncrease;

    /**
     * 关系链对数删除量
     */
    @JsonProperty("ChainDecrease")
    private String chainDecrease;

    /**
     * 上行消息数（群）
     */
    @JsonProperty("GroupUpMsgNum")
    private String groupUpMsgNum;

    /**
     * 下行消息数（群）
     */
    @JsonProperty("GroupDownMsgNum")
    private String groupDownMsgNum;

    /**
     * 发消息人数（群）
     */
    @JsonProperty("GroupSendMsgUserNum")
    private String groupSendMsgUserNum;

    /**
     * APNs 推送数（群）
     */
    @JsonProperty("GroupAPNSMsgNum")
    private String groupAPNSMsgNum;

    /**
     * 发消息群组数
     */
    @JsonProperty("GroupSendMsgGroupNum")
    private String groupSendMsgGroupNum;

    /**
     * 入群总数
     */
    @JsonProperty("GroupJoinGroupTimes")
    private String groupJoinGroupTimes;

    /**
     * 退群总数
     */
    @JsonProperty("GroupQuitGroupTimes")
    private String groupQuitGroupTimes;

    /**
     * 新增群组数
     */
    @JsonProperty("GroupNewGroupNum")
    private String groupNewGroupNum;

    /**
     * 累计群组数
     */
    @JsonProperty("GroupAllGroupNum")
    private String groupAllGroupNum;

    /**
     * 解散群个数
     */
    @JsonProperty("GroupDestroyGroupNum")
    private String groupDestroyGroupNum;

    /**
     * 回调请求数
     */
    @JsonProperty("CallBackReq")
    private String callBackReq;

    /**
     * 回调应答数
     */
    @JsonProperty("CallBackRsp")
    private String callBackRsp;

    /**
     * 日期
     */
    @JsonProperty("Date")
    private String date;

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getActiveUserNum() {
        return activeUserNum;
    }

    public void setActiveUserNum(String activeUserNum) {
        this.activeUserNum = activeUserNum;
    }

    public String getRegisterUserNumOneDay() {
        return registerUserNumOneDay;
    }

    public void setRegisterUserNumOneDay(String registerUserNumOneDay) {
        this.registerUserNumOneDay = registerUserNumOneDay;
    }

    public String getRegisterUserNumTotal() {
        return registerUserNumTotal;
    }

    public void setRegisterUserNumTotal(String registerUserNumTotal) {
        this.registerUserNumTotal = registerUserNumTotal;
    }

    public String getLoginTimes() {
        return loginTimes;
    }

    public void setLoginTimes(String loginTimes) {
        this.loginTimes = loginTimes;
    }

    public String getLoginUserNum() {
        return loginUserNum;
    }

    public void setLoginUserNum(String loginUserNum) {
        this.loginUserNum = loginUserNum;
    }

    public String getUpMsgNum() {
        return upMsgNum;
    }

    public void setUpMsgNum(String upMsgNum) {
        this.upMsgNum = upMsgNum;
    }

    public String getSendMsgUserNum() {
        return sendMsgUserNum;
    }

    public void setSendMsgUserNum(String sendMsgUserNum) {
        this.sendMsgUserNum = sendMsgUserNum;
    }

    public String getApnsMsgNum() {
        return apnsMsgNum;
    }

    public void setApnsMsgNum(String apnsMsgNum) {
        this.apnsMsgNum = apnsMsgNum;
    }

    public String getC2cUpMsgNum() {
        return c2cUpMsgNum;
    }

    public void setC2cUpMsgNum(String c2cUpMsgNum) {
        this.c2cUpMsgNum = c2cUpMsgNum;
    }

    public String getC2cDownMsgNum() {
        return c2cDownMsgNum;
    }

    public void setC2cDownMsgNum(String c2cDownMsgNum) {
        this.c2cDownMsgNum = c2cDownMsgNum;
    }

    public String getC2cSendMsgUserNum() {
        return c2cSendMsgUserNum;
    }

    public void setC2cSendMsgUserNum(String c2cSendMsgUserNum) {
        this.c2cSendMsgUserNum = c2cSendMsgUserNum;
    }

    public String getC2cApnsMsgNum() {
        return c2cApnsMsgNum;
    }

    public void setC2cApnsMsgNum(String c2cApnsMsgNum) {
        this.c2cApnsMsgNum = c2cApnsMsgNum;
    }

    public String getMaxOnlineNum() {
        return maxOnlineNum;
    }

    public void setMaxOnlineNum(String maxOnlineNum) {
        this.maxOnlineNum = maxOnlineNum;
    }

    public String getDownMsgNum() {
        return downMsgNum;
    }

    public void setDownMsgNum(String downMsgNum) {
        this.downMsgNum = downMsgNum;
    }

    public String getChainIncrease() {
        return chainIncrease;
    }

    public void setChainIncrease(String chainIncrease) {
        this.chainIncrease = chainIncrease;
    }

    public String getChainDecrease() {
        return chainDecrease;
    }

    public void setChainDecrease(String chainDecrease) {
        this.chainDecrease = chainDecrease;
    }

    public String getGroupUpMsgNum() {
        return groupUpMsgNum;
    }

    public void setGroupUpMsgNum(String groupUpMsgNum) {
        this.groupUpMsgNum = groupUpMsgNum;
    }

    public String getGroupDownMsgNum() {
        return groupDownMsgNum;
    }

    public void setGroupDownMsgNum(String groupDownMsgNum) {
        this.groupDownMsgNum = groupDownMsgNum;
    }

    public String getGroupSendMsgUserNum() {
        return groupSendMsgUserNum;
    }

    public void setGroupSendMsgUserNum(String groupSendMsgUserNum) {
        this.groupSendMsgUserNum = groupSendMsgUserNum;
    }

    public String getGroupAPNSMsgNum() {
        return groupAPNSMsgNum;
    }

    public void setGroupAPNSMsgNum(String groupAPNSMsgNum) {
        this.groupAPNSMsgNum = groupAPNSMsgNum;
    }

    public String getGroupSendMsgGroupNum() {
        return groupSendMsgGroupNum;
    }

    public void setGroupSendMsgGroupNum(String groupSendMsgGroupNum) {
        this.groupSendMsgGroupNum = groupSendMsgGroupNum;
    }

    public String getGroupJoinGroupTimes() {
        return groupJoinGroupTimes;
    }

    public void setGroupJoinGroupTimes(String groupJoinGroupTimes) {
        this.groupJoinGroupTimes = groupJoinGroupTimes;
    }

    public String getGroupQuitGroupTimes() {
        return groupQuitGroupTimes;
    }

    public void setGroupQuitGroupTimes(String groupQuitGroupTimes) {
        this.groupQuitGroupTimes = groupQuitGroupTimes;
    }

    public String getGroupNewGroupNum() {
        return groupNewGroupNum;
    }

    public void setGroupNewGroupNum(String groupNewGroupNum) {
        this.groupNewGroupNum = groupNewGroupNum;
    }

    public String getGroupAllGroupNum() {
        return groupAllGroupNum;
    }

    public void setGroupAllGroupNum(String groupAllGroupNum) {
        this.groupAllGroupNum = groupAllGroupNum;
    }

    public String getGroupDestroyGroupNum() {
        return groupDestroyGroupNum;
    }

    public void setGroupDestroyGroupNum(String groupDestroyGroupNum) {
        this.groupDestroyGroupNum = groupDestroyGroupNum;
    }

    public String getCallBackReq() {
        return callBackReq;
    }

    public void setCallBackReq(String callBackReq) {
        this.callBackReq = callBackReq;
    }

    public String getCallBackRsp() {
        return callBackRsp;
    }

    public void setCallBackRsp(String callBackRsp) {
        this.callBackRsp = callBackRsp;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "AppInfoResultItem{" +
                "appName='" + appName + '\'' +
                ", appId='" + appId + '\'' +
                ", company='" + company + '\'' +
                ", activeUserNum='" + activeUserNum + '\'' +
                ", registerUserNumOneDay='" + registerUserNumOneDay + '\'' +
                ", registerUserNumTotal='" + registerUserNumTotal + '\'' +
                ", loginTimes='" + loginTimes + '\'' +
                ", loginUserNum='" + loginUserNum + '\'' +
                ", upMsgNum='" + upMsgNum + '\'' +
                ", sendMsgUserNum='" + sendMsgUserNum + '\'' +
                ", apnsMsgNum='" + apnsMsgNum + '\'' +
                ", c2cUpMsgNum='" + c2cUpMsgNum + '\'' +
                ", c2cDownMsgNum='" + c2cDownMsgNum + '\'' +
                ", c2cSendMsgUserNum='" + c2cSendMsgUserNum + '\'' +
                ", c2cApnsMsgNum='" + c2cApnsMsgNum + '\'' +
                ", maxOnlineNum='" + maxOnlineNum + '\'' +
                ", downMsgNum='" + downMsgNum + '\'' +
                ", chainIncrease='" + chainIncrease + '\'' +
                ", chainDecrease='" + chainDecrease + '\'' +
                ", groupUpMsgNum='" + groupUpMsgNum + '\'' +
                ", groupDownMsgNum='" + groupDownMsgNum + '\'' +
                ", groupSendMsgUserNum='" + groupSendMsgUserNum + '\'' +
                ", groupAPNSMsgNum='" + groupAPNSMsgNum + '\'' +
                ", groupSendMsgGroupNum='" + groupSendMsgGroupNum + '\'' +
                ", groupJoinGroupTimes='" + groupJoinGroupTimes + '\'' +
                ", groupQuitGroupTimes='" + groupQuitGroupTimes + '\'' +
                ", groupNewGroupNum='" + groupNewGroupNum + '\'' +
                ", groupAllGroupNum='" + groupAllGroupNum + '\'' +
                ", groupDestroyGroupNum='" + groupDestroyGroupNum + '\'' +
                ", callBackReq='" + callBackReq + '\'' +
                ", callBackRsp='" + callBackRsp + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
