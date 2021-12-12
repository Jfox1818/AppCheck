
package com.Aviolinx.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AirportRequestData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirportRequestData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DaylightSavingTimes" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Timezones" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SlotLevels" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Facilities" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirportRequestData", propOrder = {
    "daylightSavingTimes",
    "timezones",
    "slotLevels",
    "facilities"
})
public class AirportRequestData {

    @XmlElement(name = "DaylightSavingTimes")
    protected boolean daylightSavingTimes;
    @XmlElement(name = "Timezones")
    protected boolean timezones;
    @XmlElement(name = "SlotLevels")
    protected boolean slotLevels;
    @XmlElement(name = "Facilities")
    protected boolean facilities;

    /**
     * Gets the value of the daylightSavingTimes property.
     * 
     */
    public boolean isDaylightSavingTimes() {
        return daylightSavingTimes;
    }

    /**
     * Sets the value of the daylightSavingTimes property.
     * 
     */
    public void setDaylightSavingTimes(boolean value) {
        this.daylightSavingTimes = value;
    }

    /**
     * Gets the value of the timezones property.
     * 
     */
    public boolean isTimezones() {
        return timezones;
    }

    /**
     * Sets the value of the timezones property.
     * 
     */
    public void setTimezones(boolean value) {
        this.timezones = value;
    }

    /**
     * Gets the value of the slotLevels property.
     * 
     */
    public boolean isSlotLevels() {
        return slotLevels;
    }

    /**
     * Sets the value of the slotLevels property.
     * 
     */
    public void setSlotLevels(boolean value) {
        this.slotLevels = value;
    }

    /**
     * Gets the value of the facilities property.
     * 
     */
    public boolean isFacilities() {
        return facilities;
    }

    /**
     * Sets the value of the facilities property.
     * 
     */
    public void setFacilities(boolean value) {
        this.facilities = value;
    }

}
