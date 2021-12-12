
package com.Aviolinx.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HotelDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UniqueId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReservationComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReservationNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PickupFrom" type="{http://raido.aviolinx.com/api/}HotelPickup" minOccurs="0"/>
 *         &lt;element name="PickupTo" type="{http://raido.aviolinx.com/api/}HotelPickup" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelDetail", propOrder = {
    "uniqueId",
    "name",
    "reservationComment",
    "reservationNo",
    "pickupFrom",
    "pickupTo"
})
public class HotelDetail {

    @XmlElement(name = "UniqueId")
    protected int uniqueId;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "ReservationComment")
    protected String reservationComment;
    @XmlElement(name = "ReservationNo")
    protected String reservationNo;
    @XmlElement(name = "PickupFrom")
    protected HotelPickup pickupFrom;
    @XmlElement(name = "PickupTo")
    protected HotelPickup pickupTo;

    /**
     * Gets the value of the uniqueId property.
     * 
     */
    public int getUniqueId() {
        return uniqueId;
    }

    /**
     * Sets the value of the uniqueId property.
     * 
     */
    public void setUniqueId(int value) {
        this.uniqueId = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the reservationComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservationComment() {
        return reservationComment;
    }

    /**
     * Sets the value of the reservationComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservationComment(String value) {
        this.reservationComment = value;
    }

    /**
     * Gets the value of the reservationNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservationNo() {
        return reservationNo;
    }

    /**
     * Sets the value of the reservationNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservationNo(String value) {
        this.reservationNo = value;
    }

    /**
     * Gets the value of the pickupFrom property.
     * 
     * @return
     *     possible object is
     *     {@link HotelPickup }
     *     
     */
    public HotelPickup getPickupFrom() {
        return pickupFrom;
    }

    /**
     * Sets the value of the pickupFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelPickup }
     *     
     */
    public void setPickupFrom(HotelPickup value) {
        this.pickupFrom = value;
    }

    /**
     * Gets the value of the pickupTo property.
     * 
     * @return
     *     possible object is
     *     {@link HotelPickup }
     *     
     */
    public HotelPickup getPickupTo() {
        return pickupTo;
    }

    /**
     * Sets the value of the pickupTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelPickup }
     *     
     */
    public void setPickupTo(HotelPickup value) {
        this.pickupTo = value;
    }

}
