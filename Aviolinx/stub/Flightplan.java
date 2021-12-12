
package com.Aviolinx.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Flightplan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Flightplan">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Callsign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Route" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EstimatedElapsedTime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CruisingSpeedLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Flightplan", propOrder = {
    "callsign",
    "route",
    "estimatedElapsedTime",
    "cruisingSpeedLevel"
})
public class Flightplan {

    @XmlElement(name = "Callsign")
    protected String callsign;
    @XmlElement(name = "Route")
    protected String route;
    @XmlElement(name = "EstimatedElapsedTime", required = true, type = Integer.class, nillable = true)
    protected Integer estimatedElapsedTime;
    @XmlElement(name = "CruisingSpeedLevel")
    protected String cruisingSpeedLevel;

    /**
     * Gets the value of the callsign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallsign() {
        return callsign;
    }

    /**
     * Sets the value of the callsign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallsign(String value) {
        this.callsign = value;
    }

    /**
     * Gets the value of the route property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoute() {
        return route;
    }

    /**
     * Sets the value of the route property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoute(String value) {
        this.route = value;
    }

    /**
     * Gets the value of the estimatedElapsedTime property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEstimatedElapsedTime() {
        return estimatedElapsedTime;
    }

    /**
     * Sets the value of the estimatedElapsedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEstimatedElapsedTime(Integer value) {
        this.estimatedElapsedTime = value;
    }

    /**
     * Gets the value of the cruisingSpeedLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCruisingSpeedLevel() {
        return cruisingSpeedLevel;
    }

    /**
     * Sets the value of the cruisingSpeedLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCruisingSpeedLevel(String value) {
        this.cruisingSpeedLevel = value;
    }

}
