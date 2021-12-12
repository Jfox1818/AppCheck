
package com.Aviolinx.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScheduleRequestData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScheduleRequestData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Airports" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Slots" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="DataElementIdentifiers" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduleRequestData", propOrder = {
    "airports",
    "slots",
    "dataElementIdentifiers"
})
public class ScheduleRequestData {

    @XmlElement(name = "Airports")
    protected boolean airports;
    @XmlElement(name = "Slots")
    protected boolean slots;
    @XmlElement(name = "DataElementIdentifiers")
    protected boolean dataElementIdentifiers;

    /**
     * Gets the value of the airports property.
     * 
     */
    public boolean isAirports() {
        return airports;
    }

    /**
     * Sets the value of the airports property.
     * 
     */
    public void setAirports(boolean value) {
        this.airports = value;
    }

    /**
     * Gets the value of the slots property.
     * 
     */
    public boolean isSlots() {
        return slots;
    }

    /**
     * Sets the value of the slots property.
     * 
     */
    public void setSlots(boolean value) {
        this.slots = value;
    }

    /**
     * Gets the value of the dataElementIdentifiers property.
     * 
     */
    public boolean isDataElementIdentifiers() {
        return dataElementIdentifiers;
    }

    /**
     * Sets the value of the dataElementIdentifiers property.
     * 
     */
    public void setDataElementIdentifiers(boolean value) {
        this.dataElementIdentifiers = value;
    }

}
