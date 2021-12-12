
package com.Aviolinx.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HotelInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniqueId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Stations" type="{http://raido.aviolinx.com/api/}ArrayOfString2" minOccurs="0"/>
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Company" type="{http://raido.aviolinx.com/api/}Company" minOccurs="0"/>
 *         &lt;element name="Street" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Zip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PickupToHotel" type="{http://raido.aviolinx.com/api/}Pickup" minOccurs="0"/>
 *         &lt;element name="PickupFromHotel" type="{http://raido.aviolinx.com/api/}Pickup" minOccurs="0"/>
 *         &lt;element name="EarliestCheckIn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LatestCheckOut" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Active" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelInfo", propOrder = {
    "name",
    "uniqueId",
    "stations",
    "code",
    "company",
    "street",
    "zip",
    "city",
    "country",
    "priority",
    "pickupToHotel",
    "pickupFromHotel",
    "earliestCheckIn",
    "latestCheckOut"
})
public class HotelInfo {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "UniqueId")
    protected int uniqueId;
    @XmlElement(name = "Stations")
    protected ArrayOfString2 stations;
    @XmlElement(name = "Code")
    protected String code;
    @XmlElement(name = "Company")
    protected Company company;
    @XmlElement(name = "Street")
    protected String street;
    @XmlElement(name = "Zip")
    protected String zip;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "Country")
    protected String country;
    @XmlElement(name = "Priority")
    protected int priority;
    @XmlElement(name = "PickupToHotel")
    protected Pickup pickupToHotel;
    @XmlElement(name = "PickupFromHotel")
    protected Pickup pickupFromHotel;
    @XmlElement(name = "EarliestCheckIn")
    protected String earliestCheckIn;
    @XmlElement(name = "LatestCheckOut")
    protected String latestCheckOut;
    @XmlAttribute(name = "Active", required = true)
    protected boolean active;

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
     * Gets the value of the stations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString2 }
     *     
     */
    public ArrayOfString2 getStations() {
        return stations;
    }

    /**
     * Sets the value of the stations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString2 }
     *     
     */
    public void setStations(ArrayOfString2 value) {
        this.stations = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link Company }
     *     
     */
    public Company getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link Company }
     *     
     */
    public void setCompany(Company value) {
        this.company = value;
    }

    /**
     * Gets the value of the street property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the value of the street property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet(String value) {
        this.street = value;
    }

    /**
     * Gets the value of the zip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZip() {
        return zip;
    }

    /**
     * Sets the value of the zip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZip(String value) {
        this.zip = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     */
    public int getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     */
    public void setPriority(int value) {
        this.priority = value;
    }

    /**
     * Gets the value of the pickupToHotel property.
     * 
     * @return
     *     possible object is
     *     {@link Pickup }
     *     
     */
    public Pickup getPickupToHotel() {
        return pickupToHotel;
    }

    /**
     * Sets the value of the pickupToHotel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pickup }
     *     
     */
    public void setPickupToHotel(Pickup value) {
        this.pickupToHotel = value;
    }

    /**
     * Gets the value of the pickupFromHotel property.
     * 
     * @return
     *     possible object is
     *     {@link Pickup }
     *     
     */
    public Pickup getPickupFromHotel() {
        return pickupFromHotel;
    }

    /**
     * Sets the value of the pickupFromHotel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pickup }
     *     
     */
    public void setPickupFromHotel(Pickup value) {
        this.pickupFromHotel = value;
    }

    /**
     * Gets the value of the earliestCheckIn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEarliestCheckIn() {
        return earliestCheckIn;
    }

    /**
     * Sets the value of the earliestCheckIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEarliestCheckIn(String value) {
        this.earliestCheckIn = value;
    }

    /**
     * Gets the value of the latestCheckOut property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatestCheckOut() {
        return latestCheckOut;
    }

    /**
     * Sets the value of the latestCheckOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatestCheckOut(String value) {
        this.latestCheckOut = value;
    }

    /**
     * Gets the value of the active property.
     * 
     */
    public boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     */
    public void setActive(boolean value) {
        this.active = value;
    }

}
