package com.TestApp.Configuration;

import com.TestApp.model.ChartsDb;
import com.TestApp.model.ManualsDb;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class CsvToBean {

    public CsvToBean() throws FileNotFoundException {
    }

    //public static void main(String[] args) {

    File chartsCsvFile = new File("D:\\My Documents\\JONNY\\OneDrive - National College of Ireland\\Project\\AppCheck\\AppCheck\\AppCheck\\src\\main\\resources\\CsvFiles\\UserDeviceExport_SAS Ireland NCDIS.csv");
    File manualsCsvFile = new File("D:\\My Documents\\JONNY\\OneDrive - National College of Ireland\\Project\\AppCheck\\AppCheck\\AppCheck\\src\\main\\resources\\CsvFiles\\tracking_users_2021_10_12_23_12_05_summary.csv");

    // try{

    FileReader chartsReader = new FileReader(chartsCsvFile);

    List<ChartsDb> chartsDbBean = new CsvToBeanBuilder(chartsReader).withType(ChartsDb.class).build().parse();


//    for(ChartsDb chartElement : chartsDbBean) {
//        System.out.println(chartElement.getUserName());
//    }
//    System.out.println("End of Charts CSV import");

//    chartsReader.close();



    FileReader manualsReader = new FileReader(manualsCsvFile);
    List<ManualsDb> manualsDbBean = new CsvToBeanBuilder(manualsReader).withType(ManualsDb.class).build().parse();




//    for(ManualsDb manualElement : manualsDbBean) {
//        System.out.println(manualElement);
//    }
//    System.out.println("End of Manuals CSV import");

//    manualsReader.close();

//    } catch (FileNotFoundException e) {
//        e.printStackTrace();
//    } catch (IOException e) {
//        e.printStackTrace();
//    }
//    }
}
