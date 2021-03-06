package com.cskaoyan.bean;

import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public class DeviceCheck {
    private String deviceCheckId;

    private String deviceId;

    private String deviceCheckEmpId;

    private Date deviceCheckDate;

    private String deviceCheckResult;

    private String deviceCheckFaultId;

    public DeviceCheck() {
    }

    public DeviceCheck(String deviceCheckId, String deviceId,
                       String deviceCheckEmpId, Date deviceCheckDate,
                       String deviceCheckResult, String deviceCheckFaultId) {
        this.deviceCheckId = deviceCheckId;
        this.deviceId = deviceId;
        this.deviceCheckEmpId = deviceCheckEmpId;
        this.deviceCheckDate = deviceCheckDate;
        this.deviceCheckResult = deviceCheckResult;
        this.deviceCheckFaultId = deviceCheckFaultId;
    }

    @Override
    public String toString() {
        return "DeviceCheck{" +
                "deviceCheckId='" + deviceCheckId + '\'' +
                ", deviceId='" + deviceId + '\'' +
                ", deviceCheckEmpId='" + deviceCheckEmpId + '\'' +
                ", deviceCheckDate=" + deviceCheckDate +
                ", deviceCheckResult='" + deviceCheckResult + '\'' +
                ", deviceCheckFaultId='" + deviceCheckFaultId + '\'' +
                '}';
    }

    public String getDeviceCheckId() {
        return deviceCheckId;
    }

    public void setDeviceCheckId(String deviceCheckId) {
        this.deviceCheckId = deviceCheckId == null ? null : deviceCheckId.trim();
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId == null ? null : deviceId.trim();
    }

    public String getDeviceCheckEmpId() {
        return deviceCheckEmpId;
    }

    public void setDeviceCheckEmpId(String deviceCheckEmpId) {
        this.deviceCheckEmpId = deviceCheckEmpId == null ? null : deviceCheckEmpId.trim();
    }

    public Date getDeviceCheckDate() {
        return deviceCheckDate;
    }

    public void setDeviceCheckDate(Date deviceCheckDate) {
        this.deviceCheckDate = deviceCheckDate;
    }

    public String getDeviceCheckResult() {
        return deviceCheckResult;
    }

    public void setDeviceCheckResult(String deviceCheckResult) {
        this.deviceCheckResult = deviceCheckResult == null ? null : deviceCheckResult.trim();
    }

    public String getDeviceCheckFaultId() {
        return deviceCheckFaultId;
    }

    public void setDeviceCheckFaultId(String deviceCheckFaultId) {
        this.deviceCheckFaultId = deviceCheckFaultId == null ? null : deviceCheckFaultId.trim();
    }
}