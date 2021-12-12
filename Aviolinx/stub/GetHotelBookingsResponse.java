
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
 *         &lt;element name="GetHotelBookingsResult" type="{http://raido.aviolinx.com/api/}ArrayOfHotelBooking" minOccurs="0"/>
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
    "getHotelBookingsResult"
})
@XmlRootElement(name = "GetHotelBookingsResponse")
public class GetHotelBookingsResponse {

    @XmlElement(name = "GetHotelBookingsResult")
    protected ArrayOfHotelBooking getHotelBookingsResult;

    /**
     * Gets the value of the getHotelBookingsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHotelBooking }
     *     
     */
    public ArrayOfHotelBooking getGetHotelBookingsResult() {
        return getHotelBookingsResult;
    }

    /**
     * Sets the value of the getHotelBookingsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHotelBooking }
     *     
     */
    public void setGetHotelBookingsResult(ArrayOfHotelBooking value) {
        this.getHotelBookingsResult = value;
    }

}
