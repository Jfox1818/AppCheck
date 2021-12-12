
package com.Aviolinx.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Schedule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Schedule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UniqueId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AirlineCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ICAOAirlineCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Suffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DepartureAirportCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ArrivalAirportCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PeriodStart" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="PeriodEnd" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="Frequency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WeekFrequency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="STD" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="STA" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ServiceTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OnwardAirlineCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OnwardFlightNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OnwardSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AircraftType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AircraftVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AircraftConfig" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DepartureLocalTimeDiff" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ArrivalLocalTimeDiff" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AircraftOwner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CockpitCrewEmployer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CabinCrewEmployer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Airports" type="{http://raido.aviolinx.com/api/}Airports" minOccurs="0"/>
 *         &lt;element name="Notes" type="{http://raido.aviolinx.com/api/}ArrayOfNote" minOccurs="0"/>
 *         &lt;element name="DataElementIdentifiers" type="{http://raido.aviolinx.com/api/}ArrayOfDataElementIdentifier" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Schedule", propOrder = {
    "uniqueId",
    "airlineCode",
    "icaoAirlineCode",
    "flightNumber",
    "suffix",
    "departureAirportCode",
    "arrivalAirportCode",
    "periodStart",
    "periodEnd",
    "frequency",
    "weekFrequency",
    "std",
    "sta",
    "serviceTypeCode",
    "onwardAirlineCode",
    "onwardFlightNumber",
    "onwardSuffix",
    "type",
    "aircraftType",
    "aircraftVersion",
    "aircraftConfig",
    "departureLocalTimeDiff",
    "arrivalLocalTimeDiff",
    "aircraftOwner",
    "cockpitCrewEmployer",
    "cabinCrewEmployer",
    "airports",
    "notes",
    "dataElementIdentifiers"
})
public class Schedule {

    @XmlElement(name = "UniqueId")
    protected int uniqueId;
    @XmlElement(name = "AirlineCode")
    protected String airlineCode;
    @XmlElement(name = "ICAOAirlineCode")
    protected String icaoAirlineCode;
    @XmlElement(name = "FlightNumber")
    protected int flightNumber;
    @XmlElement(name = "Suffix")
    protected String suffix;
    @XmlElement(name = "DepartureAirportCode")
    protected String departureAirportCode;
    @XmlElement(name = "ArrivalAirportCode")
    protected String arrivalAirportCode;
    @XmlElement(name = "PeriodStart", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar periodStart;
    @XmlElement(name = "PeriodEnd", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar periodEnd;
    @XmlElement(name = "Frequency")
    protected String frequency;
    @XmlElement(name = "WeekFrequency")
    protected int weekFrequency;
    @XmlElement(name = "STD")
    protected int std;
    @XmlElement(name = "STA")
    protected int sta;
    @XmlElement(name = "ServiceTypeCode")
    protected String serviceTypeCode;
    @XmlElement(name = "OnwardAirlineCode")
    protected String onwardAirlineCode;
    @XmlElement(name = "OnwardFlightNumber")
    protected int onwardFlightNumber;
    @XmlElement(name = "OnwardSuffix")
    protected String onwardSuffix;
    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "AircraftType")
    protected String aircraftType;
    @XmlElement(name = "AircraftVersion")
    protected String aircraftVersion;
    @XmlElement(name = "AircraftConfig")
    protected String aircraftConfig;
    @XmlElement(name = "DepartureLocalTimeDiff")
    protected int departureLocalTimeDiff;
    @XmlElement(name = "ArrivalLocalTimeDiff")
    protected int arrivalLocalTimeDiff;
    @XmlElement(name = "AircraftOwner")
    protected String aircraftOwner;
    @XmlElement(name = "CockpitCrewEmployer")
    protected String cockpitCrewEmployer;
    @XmlElement(name = "CabinCrewEmployer")
    protected String cabinCrewEmployer;
    @XmlElement(name = "Airports")
    protected Airports airports;
    @XmlElement(name = "Notes")
    protected ArrayOfNote notes;
    @XmlElement(name = "DataElementIdentifiers")
    protected ArrayOfDataElementIdentifier dataElementIdentifiers;

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
     * Gets the value of the airlineCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineCode() {
        return airlineCode;
    }

    /**
     * Sets the value of the airlineCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlineCode(String value) {
        this.airlineCode = value;
    }

    /**
     * Gets the value of the icaoAirlineCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getICAOAirlineCode() {
        return icaoAirlineCode;
    }

    /**
     * Sets the value of the icaoAirlineCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setICAOAirlineCode(String value) {
        this.icaoAirlineCode = value;
    }

    /**
     * Gets the value of the flightNumber property.
     * 
     */
    public int getFlightNumber() {
        return flightNumber;
    }

    /**
     * Sets the value of the flightNumber property.
     * 
     */
    public void setFlightNumber(int value) {
        this.flightNumber = value;
    }

    /**
     * Gets the value of the suffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuffix() {
        return suffix;
    }

    /**
     * Sets the value of the suffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuffix(String value) {
        this.suffix = value;
    }

    /**
     * Gets the value of the departureAirportCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureAirportCode() {
        return departureAirportCode;
    }

    /**
     * Sets the value of the departureAirportCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureAirportCode(String value) {
        this.departureAirportCode = value;
    }

    /**
     * Gets the value of the arrivalAirportCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalAirportCode() {
        return arrivalAirportCode;
    }

    /**
     * Sets the value of the arrivalAirportCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalAirportCode(String value) {
        this.arrivalAirportCode = value;
    }

    /**
     * Gets the value of the periodStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPeriodStart() {
        return periodStart;
    }

    /**
     * Sets the value of the periodStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPeriodStart(XMLGregorianCalendar value) {
        this.periodStart = value;
    }

    /**
     * Gets the value of the periodEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPeriodEnd() {
        return periodEnd;
    }

    /**
     * Sets the value of the periodEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPeriodEnd(XMLGregorianCalendar value) {
        this.periodEnd = value;
    }

    /**
     * Gets the value of the frequency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrequency(String value) {
        this.frequency = value;
    }

    /**
     * Gets the value of the weekFrequency property.
     * 
     */
    public int getWeekFrequency() {
        return weekFrequency;
    }

    /**
     * Sets the value of the weekFrequency property.
     * 
     */
    public void setWeekFrequency(int value) {
        this.weekFrequency = value;
    }

    /**
     * Gets the value of the std property.
     * 
     */
    public int getSTD() {
        return std;
    }

    /**
     * Sets the value of the std property.
     * 
     */
    public void setSTD(int value) {
        this.std = value;
    }

    /**
     * Gets the value of the sta property.
     * 
     */
    public int getSTA() {
        return sta;
    }

    /**
     * Sets the value of the sta property.
     * 
     */
    public void setSTA(int value) {
        this.sta = value;
    }

    /**
     * Gets the value of the serviceTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceTypeCode() {
        return serviceTypeCode;
    }

    /**
     * Sets the value of the serviceTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceTypeCode(String value) {
        this.serviceTypeCode = value;
    }

    /**
     * Gets the value of the onwardAirlineCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnwardAirlineCode() {
        return onwardAirlineCode;
    }

    /**
     * Sets the value of the onwardAirlineCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnwardAirlineCode(String value) {
        this.onwardAirlineCode = value;
    }

    /**
     * Gets the value of the onwardFlightNumber property.
     * 
     */
    public int getOnwardFlightNumber() {
        return onwardFlightNumber;
    }

    /**
     * Sets the value of the onwardFlightNumber property.
     * 
     */
    public void setOnwardFlightNumber(int value) {
        this.onwardFlightNumber = value;
    }

    /**
     * Gets the value of the onwardSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnwardSuffix() {
        return onwardSuffix;
    }

    /**
     * Sets the value of the onwardSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnwardSuffix(String value) {
        this.onwardSuffix = value;
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
     * Gets the value of the aircraftType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAircraftType() {
        return aircraftType;
    }

    /**
     * Sets the value of the aircraftType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAircraftType(String value) {
        this.aircraftType = value;
    }

    /**
     * Gets the value of the aircraftVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAircraftVersion() {
        return aircraftVersion;
    }

    /**
     * Sets the value of the aircraftVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAircraftVersion(String value) {
        this.aircraftVersion = value;
    }

    /**
     * Gets the value of the aircraftConfig property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAircraftConfig() {
        return aircraftConfig;
    }

    /**
     * Sets the value of the aircraftConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAircraftConfig(String value) {
        this.aircraftConfig = value;
    }

    /**
     * Gets the value of the departureLocalTimeDiff property.
     * 
     */
    public int getDepartureLocalTimeDiff() {
        return departureLocalTimeDiff;
    }

    /**
     * Sets the value of the departureLocalTimeDiff property.
     * 
     */
    public void setDepartureLocalTimeDiff(int value) {
        this.departureLocalTimeDiff = value;
    }

    /**
     * Gets the value of the arrivalLocalTimeDiff property.
     * 
     */
    public int getArrivalLocalTimeDiff() {
        return arrivalLocalTimeDiff;
    }

    /**
     * Sets the value of the arrivalLocalTimeDiff property.
     * 
     */
    public void setArrivalLocalTimeDiff(int value) {
        this.arrivalLocalTimeDiff = value;
    }

    /**
     * Gets the value of the aircraftOwner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAircraftOwner() {
        return aircraftOwner;
    }

    /**
     * Sets the value of the aircraftOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAircraftOwner(String value) {
        this.aircraftOwner = value;
    }

    /**
     * Gets the value of the cockpitCrewEmployer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCockpitCrewEmployer() {
        return cockpitCrewEmployer;
    }

    /**
     * Sets the value of the cockpitCrewEmployer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCockpitCrewEmployer(String value) {
        this.cockpitCrewEmployer = value;
    }

    /**
     * Gets the value of the cabinCrewEmployer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinCrewEmployer() {
        return cabinCrewEmployer;
    }

    /**
     * Sets the value of the cabinCrewEmployer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabinCrewEmployer(String value) {
        this.cabinCrewEmployer = value;
    }

    /**
     * Gets the value of the airports property.
     * 
     * @return
     *     possible object is
     *     {@link Airports }
     *     
     */
    public Airports getAirports() {
        return airports;
    }

    /**
     * Sets the value of the airports property.
     * 
     * @param value
     *     allowed object is
     *     {@link Airports }
     *     
     */
    public void setAirports(Airports value) {
        this.airports = value;
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
     * Gets the value of the dataElementIdentifiers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDataElementIdentifier }
     *     
     */
    public ArrayOfDataElementIdentifier getDataElementIdentifiers() {
        return dataElementIdentifiers;
    }

    /**
     * Sets the value of the dataElementIdentifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDataElementIdentifier }
     *     
     */
    public void setDataElementIdentifiers(ArrayOfDataElementIdentifier value) {
        this.dataElementIdentifiers = value;
    }

}
