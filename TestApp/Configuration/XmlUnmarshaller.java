package com.TestApp.Configuration;


import com.TestApp.model.PerformanceReport;

import javax.xml.bind.*;
import java.io.File;

// reference: https://howtodoinjava.com/jaxb/read-xml-to-java-object/
public class XmlUnmarshaller {



    public XmlUnmarshaller() throws JAXBException {
    }



    File performanceXmlFile = new File("D:\\My Documents\\JONNY\\OneDrive - National College of Ireland\\Project\\AppCheck\\AppCheck\\AppCheck\\src\\main\\resources\\CsvFiles\\connection_report.xml");

  //  try {
        JAXBContext jc = JAXBContext.newInstance(PerformanceReport.class);

        Unmarshaller jaxbUnmarshaller = jc.createUnmarshaller();

        PerformanceReport report = (PerformanceReport) jaxbUnmarshaller.unmarshal(performanceXmlFile);

//            for (XMLImport.PerformanceInfos infos : report.getConnectionInfos()){
//                System.out.println(report.getConnectionInfos());
//            }

//        } catch (JAXBException e) {
//            e.printStackTrace();
//  }
//
}


