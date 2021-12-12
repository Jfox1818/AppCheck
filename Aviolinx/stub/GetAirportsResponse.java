
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
 *         &lt;element name="GetAirportsResult" type="{http://raido.aviolinx.com/api/}ArrayOfAirport" minOccurs="0"/>
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
    "getAirportsResult"
})
@XmlRootElement(name = "GetAirportsResponse")
public class GetAirportsResponse {

    @XmlElement(name = "GetAirportsResult")
    protected ArrayOfAirport getAirportsResult;

    /**
     * Gets the value of the getAirportsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAirport }
     *     
     */
    public ArrayOfAirport getGetAirportsResult() {
        return getAirportsResult;
    }

    /**
     * Sets the value of the getAirportsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAirport }
     *     
     */
    public void setGetAirportsResult(ArrayOfAirport value) {
        this.getAirportsResult = value;
    }

}
