
package com.Aviolinx.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RosterTime complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RosterTime">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CheckInTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CheckOutTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RosterTime", propOrder = {
    "checkInTime",
    "checkOutTime"
})
public class RosterTime {

    @XmlElement(name = "CheckInTime")
    protected String checkInTime;
    @XmlElement(name = "CheckOutTime")
    protected String checkOutTime;

    /**
     * Gets the value of the checkInTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckInTime() {
        return checkInTime;
    }

    /**
     * Sets the value of the checkInTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckInTime(String value) {
        this.checkInTime = value;
    }

    /**
     * Gets the value of the checkOutTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckOutTime() {
        return checkOutTime;
    }

    /**
     * Sets the value of the checkOutTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckOutTime(String value) {
        this.checkOutTime = value;
    }

}
