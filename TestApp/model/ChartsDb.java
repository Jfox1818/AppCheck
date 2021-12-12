package com.TestApp.model;

import com.opencsv.bean.CsvBindByName;
// POJO class
public class ChartsDb {

    private static final long serialVersionUID = 1L;

    @CsvBindByName(column = "User Name", required = true)
    public String userName;

    @CsvBindByName(column = "Device Name", required = true)
    public String deviceName;

    @CsvBindByName(column = "Current Package", required = true)
    public String currentPackage;

    @CsvBindByName(column = "Package Status", required = true)
    public String packageStatus;

    @CsvBindByName(column = "Current Revision", required = true)
    public String currentRevision;
    @CsvBindByName(column = "Revision Status", required = true)
    public String revisionStatus;

    @CsvBindByName(column = "App Version", required = true)
    public String appVersion;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getCurrentPackage() {
        return currentPackage;
    }

    public void setCurrentPackage(String currentPackage) {
        this.currentPackage = currentPackage;
    }

    public String getPackageStatus() {
        return packageStatus;
    }

    public void setPackageStatus(String packageStatus) {
        this.packageStatus = packageStatus;
    }

    public String getCurrentRevision() {
        return currentRevision;
    }

    public void setCurrentRevision(String currentRevision) {
        this.currentRevision = currentRevision;
    }

    public String getRevisionStatus() {
        return revisionStatus;
    }

    public void setRevisionStatus(String revisionStatus) {
        this.revisionStatus = revisionStatus;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    @Override
    public String toString() {
        return "ChartsDb{" +
                "userName='" + userName + '\'' +
                ", deviceName='" + deviceName + '\'' +
                ", currentPackage='" + currentPackage + '\'' +
                ", packageStatus='" + packageStatus + '\'' +
                ", currentRevision='" + currentRevision + '\'' +
                ", revisionStatus='" + revisionStatus + '\'' +
                ", appVersion='" + appVersion + '\'' +
                '}';
    }
}

