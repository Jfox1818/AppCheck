
package com.Aviolinx.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Maintenance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Maintenance">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UniqueId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ExternalReferenceId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MaintenanceType" type="{http://raido.aviolinx.com/api/}MaintenanceType"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AirportCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EndDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="AircraftRegistration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Aircraft" type="{http://raido.aviolinx.com/api/}Aircraft" minOccurs="0"/>
 *         &lt;element name="Airport" type="{http://raido.aviolinx.com/api/}Airport" minOccurs="0"/>
 *         &lt;element name="Notes" type="{http://raido.aviolinx.com/api/}ArrayOfNote" minOccurs="0"/>
 *         &lt;element name="Times" type="{http://raido.aviolinx.com/api/}ArrayOfTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Maintenance", propOrder = {
    "uniqueId",
    "externalReferenceId",
    "maintenanceType",
    "type",
    "airportCode",
    "startDateTime",
    "endDateTime",
    "aircraftRegistration",
    "name",
    "aircraft",
    "airport",
    "notes",
    "times"
})
public class Maintenance {

    @XmlElement(name = "UniqueId")
    protected int uniqueId;
    @XmlElement(name = "ExternalReferenceId")
    protected int externalReferenceId;
    @XmlElement(name = "MaintenanceType", required = true)
    @XmlSchemaType(name = "string")
    protected MaintenanceType maintenanceType;
    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "AirportCode")
    protected String airportCode;
    @XmlElement(name = "StartDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDateTime;
    @XmlElement(name = "EndDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDateTime;
    @XmlElement(name = "AircraftRegistration")
    protected String aircraftRegistration;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Aircraft")
    protected Aircraft aircraft;
    @XmlElement(name = "Airport")
    protected Airport airport;
    @XmlElement(name = "Notes")
    protected ArrayOfNote notes;
    @XmlElement(name = "Times")
    protected ArrayOfTime times;

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
     * Gets the value of the externalReferenceId property.
     * 
     */
    public int getExternalReferenceId() {
        return externalReferenceId;
    }

    /**
     * Sets the value of the externalReferenceId property.
     * 
     */
    public void setExternalReferenceId(int value) {
        this.externalReferenceId = value;
    }

    /**
     * Gets the value of the maintenanceType property.
     * 
     * @return
     *     possible object is
     *     {@link MaintenanceType }
     *     
     */
    public MaintenanceType getMaintenanceType() {
        return maintenanceType;
    }

    /**
     * Sets the value of the maintenanceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaintenanceType }
     *     
     */
    public void setMaintenanceType(MaintenanceType value) {
        this.maintenanceType = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the airportCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirportCode() {
        return airportCode;
    }

    /**
     * Sets the value of the airportCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirportCode(String value) {
        this.airportCode = value;
    }

    /**
     * Gets the value of the startDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDateTime() {
        return startDateTime;
    }

    /**
     * Sets the value of the startDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDateTime(XMLGregorianCalendar value) {
        this.startDateTime = value;
    }

    /**
     * Gets the value of the endDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDateTime() {
        return endDateTime;
    }

    /**
     * Sets the value of the endDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDateTime(XMLGregorianCalendar value) {
        this.endDateTime = value;
    }

    /**
     * Gets the value of the aircraftRegistration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAircraftRegistration() {
        return aircraftRegistration;
    }

    /**
     * Sets the value of the aircraftRegistration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAircraftRegistration(String value) {
        this.aircraftRegistration = value;
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
     * Gets the value of the aircraft property.
     * 
     * @return
     *     possible object is
     *     {@link Aircraft }
     *     
     */
    public Aircraft getAircraft() {
        return aircraft;
    }

    /**
     * Sets the value of the aircraft property.
     * 
     * @param value
     *     allowed object is
     *     {@link Aircraft }
     *     
     */
    public void setAircraft(Aircraft value) {
        this.aircraft = value;
    }

    /**
     * Gets the value of the airport property.
     * 
     * @return
     *     possible object is
     *     {@link Airport }
     *     
     */
    public Airport getAirport() {
        return airport;
    }

    /**
     * Sets the value of the airport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Airport }
     *     
     */
    public void setAirport(Airport value) {
        this.airport = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNote }
     *     
     */
    public ArrayOfNote getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNote }
     *     
     */
    public void setNotes(ArrayOfNote value) {
        this.notes = value;
    }

    /**
     * Gets the value of the times property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTime }
     *     
     */
    public ArrayOfTime getTimes() {
        return times;
    }

    /**
     * Sets the value of the times property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTime }
     *     
     */
    public void setTimes(ArrayOfTime value) {
        this.times = value;
    }

}
