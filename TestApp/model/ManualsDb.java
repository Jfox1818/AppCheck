package com.TestApp.model;

import com.opencsv.bean.CsvBindByName;

// POJO class
public class ManualsDb {

    private static final long serialVersionUID = 2L;

    @CsvBindByName(column = "Name", required = true)
    public String name;

    @CsvBindByName(column = "Email", required = true)
    public String email;

    @CsvBindByName(column = "Last sync")
    public String lastSyncDate;

    @CsvBindByName(column = "Last install")
    public String lastInstallDate;

    @CsvBindByName(column = "Not installed count", required = true)
    public int notInstalledCount;

    @CsvBindByName(column = "Out of date count", required = true)
    public int outOfDateCount;

    @CsvBindByName(column = "Ni+OD count", required = true)
    public int notInstalledOutOfDateCount;

    @CsvBindByName(column = "Total count", required = true)
    public int totalCount;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastSyncDate() {
        return lastSyncDate;
    }

    public void setLastSyncDate(String lastSyncDate) {
        this.lastSyncDate = lastSyncDate;
    }

    public String getLastInstallDate() {
        return lastInstallDate;
    }

    public void setLastInstallDate(String lastInstallDate) {
        this.lastInstallDate = lastInstallDate;
    }

    public int getNotInstalledCount() {
        return notInstalledCount;
    }

    public void setNotInstalledCount(int notInstalledCount) {
        this.notInstalledCount = notInstalledCount;
    }

    public int getOutOfDateCount() {
        return outOfDateCount;
    }

    public void setOutOfDateCount(int outOfDateCount) {
        this.outOfDateCount = outOfDateCount;
    }

    public int getNotInstalledOutOfDateCount() {
        return notInstalledOutOfDateCount;
    }

    public void setNotInstalledOutOfDateCount(int notInstalledOutOfDateCount) {
        this.notInstalledOutOfDateCount = notInstalledOutOfDateCount;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public String toString() {
        return "ManualsDb{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", lastSyncDate='" + lastSyncDate + '\'' +
                ", lastInstallDate='" + lastInstallDate + '\'' +
                ", notInstalledCount=" + notInstalledCount +
                ", outOfDateCount=" + outOfDateCount +
                ", notInstalledOutOfDateCount=" + notInstalledOutOfDateCount +
                ", totalCount=" + totalCount +
                '}';
    }
}

