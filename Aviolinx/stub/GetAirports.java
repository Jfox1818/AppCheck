
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
 *         &lt;element name="AirportRequestFilter" type="{http://raido.aviolinx.com/api/}AirportRequestFilter" minOccurs="0"/>
 *         &lt;element name="AirportRequestData" type="{http://raido.aviolinx.com/api/}AirportRequestData" minOccurs="0"/>
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
    "airportRequestFilter",
    "airportRequestData"
})
@XmlRootElement(name = "GetAirports")
public class GetAirports {

    @XmlElement(name = "Username", required = true, nillable = true)
    protected String username;
    @XmlElement(name = "Password", required = true, nillable = true)
    protected String password;
    @XmlElement(name = "AirportRequestFilter")
    protected AirportRequestFilter airportRequestFilter;
    @XmlElement(name = "AirportRequestData")
    protected AirportRequestData airportRequestData;

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
     * Gets the value of the airportRequestFilter property.
     * 
     * @return
     *     possible object is
     *     {@link AirportRequestFilter }
     *     
     */
    public AirportRequestFilter getAirportRequestFilter() {
        return airportRequestFilter;
    }

    /**
     * Sets the value of the airportRequestFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirportRequestFilter }
     *     
     */
    public void setAirportRequestFilter(AirportRequestFilter value) {
        this.airportRequestFilter = value;
    }

    /**
     * Gets the value of the airportRequestData property.
     * 
     * @return
     *     possible object is
     *     {@link AirportRequestData }
     *     
     */
    public AirportRequestData getAirportRequestData() {
        return airportRequestData;
    }

    /**
     * Sets the value of the airportRequestData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirportRequestData }
     *     
     */
    public void setAirportRequestData(AirportRequestData value) {
        this.airportRequestData = value;
    }

}
