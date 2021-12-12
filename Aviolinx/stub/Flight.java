
package com.Aviolinx.stub;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Flight complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Flight">
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
 *         &lt;element name="DiversionAirportCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FlightDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="STD" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="STA" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="AircraftRegistration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OnwardAirlineCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OnwardFlightNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OnwardSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Canceled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="DepartureLocalTimeDiff" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ArrivalLocalTimeDiff" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ASMReasons" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Complement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CO2" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Aircraft" type="{http://raido.aviolinx.com/api/}Aircraft" minOccurs="0"/>
 *         &lt;element name="Airports" type="{http://raido.aviolinx.com/api/}Airports" minOccurs="0"/>
 *         &lt;element name="CrewOnBoard" type="{http://raido.aviolinx.com/api/}ArrayOfCrewOnBoard" minOccurs="0"/>
 *         &lt;element name="Delays" type="{http://raido.aviolinx.com/api/}Delays" minOccurs="0"/>
 *         &lt;element name="Flightplan" type="{http://raido.aviolinx.com/api/}Flightplan" minOccurs="0"/>
 *         &lt;element name="Fuels" type="{http://raido.aviolinx.com/api/}ArrayOfFuel" minOccurs="0"/>
 *         &lt;element name="Loads" type="{http://raido.aviolinx.com/api/}Loads" minOccurs="0"/>
 *         &lt;element name="Notes" type="{http://raido.aviolinx.com/api/}ArrayOfNote" minOccurs="0"/>
 *         &lt;element name="Times" type="{http://raido.aviolinx.com/api/}ArrayOfTime" minOccurs="0"/>
 *         &lt;element name="ProjectCodes" type="{http://raido.aviolinx.com/api/}ArrayOfProjectCode" minOccurs="0"/>
 *         &lt;element name="Jumpseaters" type="{http://raido.aviolinx.com/api/}ArrayOfJumpseater" minOccurs="0"/>
 *         &lt;element name="FuelData" type="{http://raido.aviolinx.com/api/}FuelData" minOccurs="0"/>
 *         &lt;element name="DetailedStatuses" type="{http://raido.aviolinx.com/api/}ArrayOfString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Flight", propOrder = {
    "uniqueId",
    "airlineCode",
    "icaoAirlineCode",
    "flightNumber",
    "suffix",
    "departureAirportCode",
    "arrivalAirportCode",
    "diversionAirportCode",
    "flightDate",
    "std",
    "sta",
    "aircraftRegistration",
    "serviceTypeCode",
    "onwardAirlineCode",
    "onwardFlightNumber",
    "onwardSuffix",
    "status",
    "type",
    "canceled",
    "departureLocalTimeDiff",
    "arrivalLocalTimeDiff",
    "asmReasons",
    "complement",
    "co2",
    "aircraft",
    "airports",
    "crewOnBoard",
    "delays",
    "flightplan",
    "fuels",
    "loads",
    "notes",
    "times",
    "projectCodes",
    "jumpseaters",
    "fuelData",
    "detailedStatuses"
})
public class Flight {

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
    @XmlElement(name = "DiversionAirportCode")
    protected String diversionAirportCode;
    @XmlElement(name = "FlightDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar flightDate;
    @XmlElement(name = "STD", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar std;
    @XmlElement(name = "STA", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sta;
    @XmlElement(name = "AircraftRegistration")
    protected String aircraftRegistration;
    @XmlElement(name = "ServiceTypeCode")
    protected String serviceTypeCode;
    @XmlElement(name = "OnwardAirlineCode")
    protected String onwardAirlineCode;
    @XmlElement(name = "OnwardFlightNumber")
    protected int onwardFlightNumber;
    @XmlElement(name = "OnwardSuffix")
    protected String onwardSuffix;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "Canceled")
    protected boolean canceled;
    @XmlElement(name = "DepartureLocalTimeDiff")
    protected int departureLocalTimeDiff;
    @XmlElement(name = "ArrivalLocalTimeDiff")
    protected int arrivalLocalTimeDiff;
    @XmlElement(name = "ASMReasons")
    protected String asmReasons;
    @XmlElement(name = "Complement")
    protected String complement;
    @XmlElement(name = "CO2", required = true)
    protected BigDecimal co2;
    @XmlElement(name = "Aircraft")
    protected Aircraft aircraft;
    @XmlElement(name = "Airports")
    protected Airports airports;
    @XmlElement(name = "CrewOnBoard")
    protected ArrayOfCrewOnBoard crewOnBoard;
    @XmlElement(name = "Delays")
    protected Delays delays;
    @XmlElement(name = "Flightplan")
    protected Flightplan flightplan;
    @XmlElement(name = "Fuels")
    protected ArrayOfFuel fuels;
    @XmlElement(name = "Loads")
    protected Loads loads;
    @XmlElement(name = "Notes")
    protected ArrayOfNote notes;
    @XmlElement(name = "Times")
    protected ArrayOfTime times;
    @XmlElement(name = "ProjectCodes")
    protected ArrayOfProjectCode projectCodes;
    @XmlElement(name = "Jumpseaters")
    protected ArrayOfJumpseater jumpseaters;
    @XmlElement(name = "FuelData")
    protected FuelData fuelData;
    @XmlElement(name = "DetailedStatuses")
    protected ArrayOfString detailedStatuses;

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
     * Gets the value of the diversionAirportCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiversionAirportCode() {
        return diversionAirportCode;
    }

    /**
     * Sets the value of the diversionAirportCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiversionAirportCode(String value) {
        this.diversionAirportCode = value;
    }

    /**
     * Gets the value of the flightDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFlightDate() {
        return flightDate;
    }

    /**
     * Sets the value of the flightDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFlightDate(XMLGregorianCalendar value) {
        this.flightDate = value;
    }

    /**
     * Gets the value of the std property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSTD() {
        return std;
    }

    /**
     * Sets the value of the std property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSTD(XMLGregorianCalendar value) {
        this.std = value;
    }

    /**
     * Gets the value of the sta property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSTA() {
        return sta;
    }

    /**
     * Sets the value of the sta property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSTA(XMLGregorianCalendar value) {
        this.sta = value;
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
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
     * Gets the value of the canceled property.
     * 
     */
    public boolean isCanceled() {
        return canceled;
    }

    /**
     * Sets the value of the canceled property.
     * 
     */
    public void setCanceled(boolean value) {
        this.canceled = value;
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
     * Gets the value of the asmReasons property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getASMReasons() {
        return asmReasons;
    }

    /**
     * Sets the value of the asmReasons property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setASMReasons(String value) {
        this.asmReasons = value;
    }

    /**
     * Gets the value of the complement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplement() {
        return complement;
    }

    /**
     * Sets the value of the complement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplement(String value) {
        this.complement = value;
    }

    /**
     * Gets the value of the co2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCO2() {
        return co2;
    }

    /**
     * Sets the value of the co2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCO2(BigDecimal value) {
        this.co2 = value;
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
     * Gets the value of the crewOnBoard property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCrewOnBoard }
     *     
     */
    public ArrayOfCrewOnBoard getCrewOnBoard() {
        return crewOnBoard;
    }

    /**
     * Sets the value of the crewOnBoard property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCrewOnBoard }
     *     
     */
    public void setCrewOnBoard(ArrayOfCrewOnBoard value) {
        this.crewOnBoard = value;
    }

    /**
     * Gets the value of the delays property.
     * 
     * @return
     *     possible object is
     *     {@link Delays }
     *     
     */
    public Delays getDelays() {
        return delays;
    }

    /**
     * Sets the value of the delays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Delays }
     *     
     */
    public void setDelays(Delays value) {
        this.delays = value;
    }

    /**
     * Gets the value of the flightplan property.
     * 
     * @return
     *     possible object is
     *     {@link Flightplan }
     *     
     */
    public Flightplan getFlightplan() {
        return flightplan;
    }

    /**
     * Sets the value of the flightplan property.
     * 
     * @param value
     *     allowed object is
     *     {@link Flightplan }
     *     
     */
    public void setFlightplan(Flightplan value) {
        this.flightplan = value;
    }

    /**
     * Gets the value of the fuels property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFuel }
     *     
     */
    public ArrayOfFuel getFuels() {
        return fuels;
    }

    /**
     * Sets the value of the fuels property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFuel }
     *     
     */
    public void setFuels(ArrayOfFuel value) {
        this.fuels = value;
    }

    /**
     * Gets the value of the loads property.
     * 
     * @return
     *     possible object is
     *     {@link Loads }
     *     
     */
    public Loads getLoads() {
        return loads;
    }

    /**
     * Sets the value of the loads property.
     * 
     * @param value
     *     allowed object is
     *     {@link Loads }
     *     
     */
    public void setLoads(Loads value) {
        this.loads = value;
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

    /**
     * Gets the value of the projectCodes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProjectCode }
     *     
     */
    public ArrayOfProjectCode getProjectCodes() {
        return projectCodes;
    }

    /**
     * Sets the value of the projectCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProjectCode }
     *     
     */
    public void setProjectCodes(ArrayOfProjectCode value) {
        this.projectCodes = value;
    }

    /**
     * Gets the value of the jumpseaters property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfJumpseater }
     *     
     */
    public ArrayOfJumpseater getJumpseaters() {
        return jumpseaters;
    }

    /**
     * Sets the value of the jumpseaters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfJumpseater }
     *     
     */
    public void setJumpseaters(ArrayOfJumpseater value) {
        this.jumpseaters = value;
    }

    /**
     * Gets the value of the fuelData property.
     * 
     * @return
     *     possible object is
     *     {@link FuelData }
     *     
     */
    public FuelData getFuelData() {
        return fuelData;
    }

    /**
     * Sets the value of the fuelData property.
     * 
     * @param value
     *     allowed object is
     *     {@link FuelData }
     *     
     */
    public void setFuelData(FuelData value) {
        this.fuelData = value;
    }

    /**
     * Gets the value of the detailedStatuses property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getDetailedStatuses() {
        return detailedStatuses;
    }

    /**
     * Sets the value of the detailedStatuses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setDetailedStatuses(ArrayOfString value) {
        this.detailedStatuses = value;
    }

}
