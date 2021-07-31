package com.qcloud.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author bingo
 * @since 2021/7/31 19:07
 */
public class AppInfoResultItem {
    @JsonProperty("AppName")
    private String appName;

    @JsonProperty("AppId")
    private String appId;

    @JsonProperty("Company")
    private String company;

    @JsonProperty("ActiveUserNum")
    private String activeUserNum;

    @JsonProperty("RegistUserNumOneDay")
    private String registerUserNumOneDay;

    @JsonProperty("RegistUserNumTotal")
    private String registerUserNumTotal;

    @JsonProperty("LoginTimes")
    private String loginTimes;

    @JsonProperty("LoginUserNum")
    private String loginUserNum;

    @JsonProperty("UpMsgNum")
    private String upMsgNum;

    @JsonProperty("SendMsgUserNum")
    private String sendMsgUserNum;

    @JsonProperty("APNSMsgNum")
    private String apnsMsgNum;

    @JsonProperty("C2CUpMsgNum")
    private String c2cUpMsgNum;

    @JsonProperty("C2CSendMsgUserNum")
    private String c2cSendMsgUserNum;

    @JsonProperty("C2CAPNSMsgNum")
    private String c2cApnsMsgNum;

    @JsonProperty("MaxOnlineNum")
    private String maxOnlineNum;

    @JsonProperty("ChainIncrease")
    private String chainIncrease;

    @JsonProperty("ChainDecrease")
    private String chainDecrease;

    @JsonProperty("GroupUpMsgNum")
    private String groupUpMsgNum;

    @JsonProperty("GroupSendMsgUserNum")
    private String groupSendMsgUserNum;

    @JsonProperty("GroupAPNSMsgNum")
    private String groupAPNSMsgNum;

    @JsonProperty("GroupSendMsgGroupNum")
    private String groupSendMsgGroupNum;

    @JsonProperty("GroupJoinGroupTimes")
    private String groupJoinGroupTimes;

    @JsonProperty("GroupQuitGroupTimes")
    private String groupQuitGroupTimes;

    @JsonProperty("GroupNewGroupNum")
    private String groupNewGroupNum;

    @JsonProperty("GroupAllGroupNum")
    private String groupAllGroupNum;

    @JsonProperty("GroupDestroyGroupNum")
    private String groupDestroyGroupNum;

    @JsonProperty("CallBackReq")
    private String callBackReq;

    @JsonProperty("CallBackRsp")
    private String callBackRsp;

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
                ", c2cSendMsgUserNum='" + c2cSendMsgUserNum + '\'' +
                ", c2cApnsMsgNum='" + c2cApnsMsgNum + '\'' +
                ", maxOnlineNum='" + maxOnlineNum + '\'' +
                ", chainIncrease='" + chainIncrease + '\'' +
                ", chainDecrease='" + chainDecrease + '\'' +
                ", groupUpMsgNum='" + groupUpMsgNum + '\'' +
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
