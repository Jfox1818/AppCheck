
package com.Aviolinx.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Airport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Airport">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IATA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ICAO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Gate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Stand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Latitude" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Longitude" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="SlotLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DaylightSavingTimes" type="{http://raido.aviolinx.com/api/}ArrayOfDaylightSavingTime" minOccurs="0"/>
 *         &lt;element name="Timezones" type="{http://raido.aviolinx.com/api/}ArrayOfTimezone" minOccurs="0"/>
 *         &lt;element name="SlotLevels" type="{http://raido.aviolinx.com/api/}ArrayOfSlotLevel" minOccurs="0"/>
 *         &lt;element name="StationFacilities" type="{http://raido.aviolinx.com/api/}ArrayOfStationFacility" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Airport", propOrder = {
    "name",
    "localName",
    "iata",
    "icao",
    "country",
    "gate",
    "stand",
    "latitude",
    "longitude",
    "slotLevel",
    "daylightSavingTimes",
    "timezones",
    "slotLevels",
    "stationFacilities"
})
public class Airport {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "LocalName")
    protected String localName;
    @XmlElement(name = "IATA")
    protected String iata;
    @XmlElement(name = "ICAO")
    protected String icao;
    @XmlElement(name = "Country")
    protected String country;
    @XmlElement(name = "Gate")
    protected String gate;
    @XmlElement(name = "Stand")
    protected String stand;
    @XmlElement(name = "Latitude")
    protected double latitude;
    @XmlElement(name = "Longitude")
    protected double longitude;
    @XmlElement(name = "SlotLevel")
    protected String slotLevel;
    @XmlElement(name = "DaylightSavingTimes")
    protected ArrayOfDaylightSavingTime daylightSavingTimes;
    @XmlElement(name = "Timezones")
    protected ArrayOfTimezone timezones;
    @XmlElement(name = "SlotLevels")
    protected ArrayOfSlotLevel slotLevels;
    @XmlElement(name = "StationFacilities")
    protected ArrayOfStationFacility stationFacilities;

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
     * Gets the value of the localName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalName() {
        return localName;
    }

    /**
     * Sets the value of the localName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalName(String value) {
        this.localName = value;
    }

    /**
     * Gets the value of the iata property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIATA() {
        return iata;
    }

    /**
     * Sets the value of the iata property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIATA(String value) {
        this.iata = value;
    }

    /**
     * Gets the value of the icao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getICAO() {
        return icao;
    }

    /**
     * Sets the value of the icao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setICAO(String value) {
        this.icao = value;
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
     * Gets the value of the gate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGate() {
        return gate;
    }

    /**
     * Sets the value of the gate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGate(String value) {
        this.gate = value;
    }

    /**
     * Gets the value of the stand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStand() {
        return stand;
    }

    /**
     * Sets the value of the stand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStand(String value) {
        this.stand = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     */
    public void setLatitude(double value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     */
    public double getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     */
    public void setLongitude(double value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the slotLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSlotLevel() {
        return slotLevel;
    }

    /**
     * Sets the value of the slotLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSlotLevel(String value) {
        this.slotLevel = value;
    }

    /**
     * Gets the value of the daylightSavingTimes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDaylightSavingTime }
     *     
     */
    public ArrayOfDaylightSavingTime getDaylightSavingTimes() {
        return daylightSavingTimes;
    }

    /**
     * Sets the value of the daylightSavingTimes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDaylightSavingTime }
     *     
     */
    public void setDaylightSavingTimes(ArrayOfDaylightSavingTime value) {
        this.daylightSavingTimes = value;
    }

    /**
     * Gets the value of the timezones property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTimezone }
     *     
     */
    public ArrayOfTimezone getTimezones() {
        return timezones;
    }

    /**
     * Sets the value of the timezones property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTimezone }
     *     
     */
    public void setTimezones(ArrayOfTimezone value) {
        this.timezones = value;
    }

    /**
     * Gets the value of the slotLevels property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSlotLevel }
     *     
     */
    public ArrayOfSlotLevel getSlotLevels() {
        return slotLevels;
    }

    /**
     * Sets the value of the slotLevels property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSlotLevel }
     *     
     */
    public void setSlotLevels(ArrayOfSlotLevel value) {
        this.slotLevels = value;
    }

    /**
     * Gets the value of the stationFacilities property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStationFacility }
     *     
     */
    public ArrayOfStationFacility getStationFacilities() {
        return stationFacilities;
    }

    /**
     * Sets the value of the stationFacilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStationFacility }
     *     
     */
    public void setStationFacilities(ArrayOfStationFacility value) {
        this.stationFacilities = value;
    }

}
