
package com.Aviolinx.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MaintenanceRequestFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaintenanceRequestFilter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://raido.aviolinx.com/api/}DateRangeBasicRequestFilter">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Station" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AircraftRegistration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaintenanceType" type="{http://raido.aviolinx.com/api/}MaintenanceType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaintenanceRequestFilter", propOrder = {
    "type",
    "station",
    "aircraftRegistration",
    "maintenanceType"
})
public class MaintenanceRequestFilter
    extends DateRangeBasicRequestFilter
{

    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "Station")
    protected String station;
    @XmlElement(name = "AircraftRegistration")
    protected String aircraftRegistration;
    @XmlElement(name = "MaintenanceType", required = true)
    @XmlSchemaType(name = "string")
    protected MaintenanceType maintenanceType;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the station property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStation() {
        return station;
    }

    /**
     * Sets the value of the station property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStation(String value) {
        this.station = value;
    }

    /**
     * Gets the value of the aircraftRegistration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAircraftRegistration() {
        return aircraftRegistration;
    }

    /**
     * Sets the value of the aircraftRegistration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAircraftRegistration(String value) {
        this.aircraftRegistration = value;
    }

    /**
     * Gets the value of the maintenanceType property.
     * 
     * @return
     *     possible object is
     *     {@link MaintenanceType }
     *     
     */
    public MaintenanceType getMaintenanceType() {
        return maintenanceType;
    }

    /**
     * Sets the value of the maintenanceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaintenanceType }
     *     
     */
    public void setMaintenanceType(MaintenanceType value) {
        this.maintenanceType = value;
    }

}
