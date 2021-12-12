
package com.Aviolinx.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Airports complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Airports">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DepartureAirport" type="{http://raido.aviolinx.com/api/}Airport" minOccurs="0"/>
 *         &lt;element name="ArrivalAirport" type="{http://raido.aviolinx.com/api/}Airport" minOccurs="0"/>
 *         &lt;element name="DiversionAirport" type="{http://raido.aviolinx.com/api/}Airport" minOccurs="0"/>
 *         &lt;element name="ScheduleDepartureAirport" type="{http://raido.aviolinx.com/api/}Airport" minOccurs="0"/>
 *         &lt;element name="ScheduleArrivalAirport" type="{http://raido.aviolinx.com/api/}Airport" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Airports", propOrder = {
    "departureAirport",
    "arrivalAirport",
    "diversionAirport",
    "scheduleDepartureAirport",
    "scheduleArrivalAirport"
})
public class Airports {

    @XmlElement(name = "DepartureAirport")
    protected Airport departureAirport;
    @XmlElement(name = "ArrivalAirport")
    protected Airport arrivalAirport;
    @XmlElement(name = "DiversionAirport")
    protected Airport diversionAirport;
    @XmlElement(name = "ScheduleDepartureAirport")
    protected Airport scheduleDepartureAirport;
    @XmlElement(name = "ScheduleArrivalAirport")
    protected Airport scheduleArrivalAirport;

    /**
     * Gets the value of the departureAirport property.
     * 
     * @return
     *     possible object is
     *     {@link Airport }
     *     
     */
    public Airport getDepartureAirport() {
        return departureAirport;
    }

    /**
     * Sets the value of the departureAirport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Airport }
     *     
     */
    public void setDepartureAirport(Airport value) {
        this.departureAirport = value;
    }

    /**
     * Gets the value of the arrivalAirport property.
     * 
     * @return
     *     possible object is
     *     {@link Airport }
     *     
     */
    public Airport getArrivalAirport() {
        return arrivalAirport;
    }

    /**
     * Sets the value of the arrivalAirport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Airport }
     *     
     */
    public void setArrivalAirport(Airport value) {
        this.arrivalAirport = value;
    }

    /**
     * Gets the value of the diversionAirport property.
     * 
     * @return
     *     possible object is
     *     {@link Airport }
     *     
     */
    public Airport getDiversionAirport() {
        return diversionAirport;
    }

    /**
     * Sets the value of the diversionAirport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Airport }
     *     
     */
    public void setDiversionAirport(Airport value) {
        this.diversionAirport = value;
    }

    /**
     * Gets the value of the scheduleDepartureAirport property.
     * 
     * @return
     *     possible object is
     *     {@link Airport }
     *     
     */
    public Airport getScheduleDepartureAirport() {
        return scheduleDepartureAirport;
    }

    /**
     * Sets the value of the scheduleDepartureAirport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Airport }
     *     
     */
    public void setScheduleDepartureAirport(Airport value) {
        this.scheduleDepartureAirport = value;
    }

    /**
     * Gets the value of the scheduleArrivalAirport property.
     * 
     * @return
     *     possible object is
     *     {@link Airport }
     *     
     */
    public Airport getScheduleArrivalAirport() {
        return scheduleArrivalAirport;
    }

    /**
     * Sets the value of the scheduleArrivalAirport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Airport }
     *     
     */
    public void setScheduleArrivalAirport(Airport value) {
        this.scheduleArrivalAirport = value;
    }

}
