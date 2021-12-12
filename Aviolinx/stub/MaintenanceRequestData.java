
package com.Aviolinx.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MaintenanceRequestData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaintenanceRequestData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Aircraft" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Airport" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Times" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaintenanceRequestData", propOrder = {
    "aircraft",
    "airport",
    "notes",
    "times"
})
public class MaintenanceRequestData {

    @XmlElement(name = "Aircraft")
    protected boolean aircraft;
    @XmlElement(name = "Airport")
    protected boolean airport;
    @XmlElement(name = "Notes")
    protected boolean notes;
    @XmlElement(name = "Times")
    protected boolean times;

    /**
     * Gets the value of the aircraft property.
     * 
     */
    public boolean isAircraft() {
        return aircraft;
    }

    /**
     * Sets the value of the aircraft property.
     * 
     */
    public void setAircraft(boolean value) {
        this.aircraft = value;
    }

    /**
     * Gets the value of the airport property.
     * 
     */
    public boolean isAirport() {
        return airport;
    }

    /**
     * Sets the value of the airport property.
     * 
     */
    public void setAirport(boolean value) {
        this.airport = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     */
    public boolean isNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     */
    public void setNotes(boolean value) {
        this.notes = value;
    }

    /**
     * Gets the value of the times property.
     * 
     */
    public boolean isTimes() {
        return times;
    }

    /**
     * Sets the value of the times property.
     * 
     */
    public void setTimes(boolean value) {
        this.times = value;
    }

}
