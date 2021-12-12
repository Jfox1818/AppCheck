package com.TestApp.model;


import com.TestApp.model.PerformanceInfos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

// POJO classes


@XmlRootElement(name = "connectionReport")
@XmlAccessorType(XmlAccessType.FIELD)
public class PerformanceReport {

    @XmlElement
    private List<PerformanceInfos> connectionInfos;

    public PerformanceReport(){
    }

    public List<PerformanceInfos> getConnectionInfos() {
        return connectionInfos;
    }

    public void setConnectionReport(List<PerformanceInfos> connectionInfos) {
        this.connectionInfos = connectionInfos;
    }

}

