
package com.Aviolinx.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for HotelBooking complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelBooking">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Start" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="End" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HotelUniqueId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EmpNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PickupsFrom" type="{http://raido.aviolinx.com/api/}ArrayOfPickup" minOccurs="0"/>
 *         &lt;element name="PickupsTo" type="{http://raido.aviolinx.com/api/}ArrayOfPickup" minOccurs="0"/>
 *         &lt;element name="BookingDatas" type="{http://raido.aviolinx.com/api/}ArrayOfBookingData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelBooking", propOrder = {
    "start",
    "end",
    "hotelName",
    "hotelUniqueId",
    "empNo",
    "pickupsFrom",
    "pickupsTo",
    "bookingDatas"
})
public class HotelBooking {

    @XmlElement(name = "Start", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar start;
    @XmlElement(name = "End", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar end;
    @XmlElement(name = "HotelName")
    protected String hotelName;
    @XmlElement(name = "HotelUniqueId")
    protected int hotelUniqueId;
    @XmlElement(name = "EmpNo")
    protected String empNo;
    @XmlElement(name = "PickupsFrom")
    protected ArrayOfPickup pickupsFrom;
    @XmlElement(name = "PickupsTo")
    protected ArrayOfPickup pickupsTo;
    @XmlElement(name = "BookingDatas")
    protected ArrayOfBookingData bookingDatas;

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStart(XMLGregorianCalendar value) {
        this.start = value;
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEnd() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEnd(XMLGregorianCalendar value) {
        this.end = value;
    }

    /**
     * Gets the value of the hotelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelName() {
        return hotelName;
    }

    /**
     * Sets the value of the hotelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelName(String value) {
        this.hotelName = value;
    }

    /**
     * Gets the value of the hotelUniqueId property.
     * 
     */
    public int getHotelUniqueId() {
        return hotelUniqueId;
    }

    /**
     * Sets the value of the hotelUniqueId property.
     * 
     */
    public void setHotelUniqueId(int value) {
        this.hotelUniqueId = value;
    }

    /**
     * Gets the value of the empNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpNo() {
        return empNo;
    }

    /**
     * Sets the value of the empNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpNo(String value) {
        this.empNo = value;
    }

    /**
     * Gets the value of the pickupsFrom property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPickup }
     *     
     */
    public ArrayOfPickup getPickupsFrom() {
        return pickupsFrom;
    }

    /**
     * Sets the value of the pickupsFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPickup }
     *     
     */
    public void setPickupsFrom(ArrayOfPickup value) {
        this.pickupsFrom = value;
    }

    /**
     * Gets the value of the pickupsTo property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPickup }
     *     
     */
    public ArrayOfPickup getPickupsTo() {
        return pickupsTo;
    }

    /**
     * Sets the value of the pickupsTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPickup }
     *     
     */
    public void setPickupsTo(ArrayOfPickup value) {
        this.pickupsTo = value;
    }

    /**
     * Gets the value of the bookingDatas property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBookingData }
     *     
     */
    public ArrayOfBookingData getBookingDatas() {
        return bookingDatas;
    }

    /**
     * Sets the value of the bookingDatas property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBookingData }
     *     
     */
    public void setBookingDatas(ArrayOfBookingData value) {
        this.bookingDatas = value;
    }

}
