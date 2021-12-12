
package com.Aviolinx.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PairingRequestFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PairingRequestFilter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://raido.aviolinx.com/api/}DateRangeBasicRequestFilter">
 *       &lt;sequence>
 *         &lt;element name="Station" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RosterType" type="{http://raido.aviolinx.com/api/}RosterType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PairingRequestFilter", propOrder = {
    "station",
    "rosterType"
})
public class PairingRequestFilter
    extends DateRangeBasicRequestFilter
{

    @XmlElement(name = "Station")
    protected String station;
    @XmlElement(name = "RosterType", required = true)
    @XmlSchemaType(name = "string")
    protected RosterType rosterType;

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
     * Gets the value of the rosterType property.
     * 
     * @return
     *     possible object is
     *     {@link RosterType }
     *     
     */
    public RosterType getRosterType() {
        return rosterType;
    }

    /**
     * Sets the value of the rosterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RosterType }
     *     
     */
    public void setRosterType(RosterType value) {
        this.rosterType = value;
    }

}
