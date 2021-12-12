
package com.Aviolinx.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AircraftRequestData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AircraftRequestData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MinimumEquipmentList" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AircraftRequestData", propOrder = {
    "minimumEquipmentList"
})
public class AircraftRequestData {

    @XmlElement(name = "MinimumEquipmentList")
    protected boolean minimumEquipmentList;

    /**
     * Gets the value of the minimumEquipmentList property.
     * 
     */
    public boolean isMinimumEquipmentList() {
        return minimumEquipmentList;
    }

    /**
     * Sets the value of the minimumEquipmentList property.
     * 
     */
    public void setMinimumEquipmentList(boolean value) {
        this.minimumEquipmentList = value;
    }

}
