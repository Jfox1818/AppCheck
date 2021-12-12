
package com.Aviolinx.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Username" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AircraftRequestFilter" type="{http://raido.aviolinx.com/api/}AircraftRequestFilter"/>
 *         &lt;element name="AircraftRequestData" type="{http://raido.aviolinx.com/api/}AircraftRequestData"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "username",
    "password",
    "aircraftRequestFilter",
    "aircraftRequestData"
})
@XmlRootElement(name = "GetAircrafts")
public class GetAircrafts {

    @XmlElement(name = "Username", required = true, nillable = true)
    protected String username;
    @XmlElement(name = "Password", required = true, nillable = true)
    protected String password;
    @XmlElement(name = "AircraftRequestFilter", required = true, nillable = true)
    protected AircraftRequestFilter aircraftRequestFilter;
    @XmlElement(name = "AircraftRequestData", required = true, nillable = true)
    protected AircraftRequestData aircraftRequestData;

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the aircraftRequestFilter property.
     * 
     * @return
     *     possible object is
     *     {@link AircraftRequestFilter }
     *     
     */
    public AircraftRequestFilter getAircraftRequestFilter() {
        return aircraftRequestFilter;
    }

    /**
     * Sets the value of the aircraftRequestFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link AircraftRequestFilter }
     *     
     */
    public void setAircraftRequestFilter(AircraftRequestFilter value) {
        this.aircraftRequestFilter = value;
    }

    /**
     * Gets the value of the aircraftRequestData property.
     * 
     * @return
     *     possible object is
     *     {@link AircraftRequestData }
     *     
     */
    public AircraftRequestData getAircraftRequestData() {
        return aircraftRequestData;
    }

    /**
     * Sets the value of the aircraftRequestData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AircraftRequestData }
     *     
     */
    public void setAircraftRequestData(AircraftRequestData value) {
        this.aircraftRequestData = value;
    }

}
