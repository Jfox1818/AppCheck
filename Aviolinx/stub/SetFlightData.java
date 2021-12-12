
package com.Aviolinx.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="Username" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Callsign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FlightDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UniqueId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DepartureAirport" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ArrivalAirport" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Times" type="{http://raido.aviolinx.com/api/}ArrayOfTime" minOccurs="0"/>
 *         &lt;element name="Delays" type="{http://raido.aviolinx.com/api/}Delays" minOccurs="0"/>
 *         &lt;element name="Loads" type="{http://raido.aviolinx.com/api/}Loads" minOccurs="0"/>
 *         &lt;element name="Notes" type="{http://raido.aviolinx.com/api/}ArrayOfNote" minOccurs="0"/>
 *         &lt;element name="Fuels" type="{http://raido.aviolinx.com/api/}ArrayOfFuel" minOccurs="0"/>
 *         &lt;element name="ProjectCodes" type="{http://raido.aviolinx.com/api/}ArrayOfProjectCode" minOccurs="0"/>
 *         &lt;element name="VoyageReport" type="{http://raido.aviolinx.com/api/}VoyageReport" minOccurs="0"/>
 *         &lt;element name="Flightplan" type="{http://raido.aviolinx.com/api/}Flightplan" minOccurs="0"/>
 *         &lt;element name="Airports" type="{http://raido.aviolinx.com/api/}Airports" minOccurs="0"/>
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
    "username",
    "password",
    "flightNumber",
    "callsign",
    "flightDate",
    "uniqueId",
    "departureAirport",
    "arrivalAirport",
    "times",
    "delays",
    "loads",
    "notes",
    "fuels",
    "projectCodes",
    "voyageReport",
    "flightplan",
    "airports"
})
@XmlRootElement(name = "SetFlightData")
public class SetFlightData {

    @XmlElement(name = "Username", required = true, nillable = true)
    protected String username;
    @XmlElement(name = "Password", required = true, nillable = true)
    protected String password;
    @XmlElement(name = "FlightNumber")
    protected String flightNumber;
    @XmlElement(name = "Callsign")
    protected String callsign;
    @XmlElement(name = "FlightDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar flightDate;
    @XmlElement(name = "UniqueId", required = true, type = Integer.class, nillable = true)
    protected Integer uniqueId;
    @XmlElement(name = "DepartureAirport", required = true, nillable = true)
    protected String departureAirport;
    @XmlElement(name = "ArrivalAirport", required = true, nillable = true)
    protected String arrivalAirport;
    @XmlElement(name = "Times")
    protected ArrayOfTime times;
    @XmlElement(name = "Delays")
    protected Delays delays;
    @XmlElement(name = "Loads")
    protected Loads loads;
    @XmlElement(name = "Notes")
    protected ArrayOfNote notes;
    @XmlElement(name = "Fuels")
    protected ArrayOfFuel fuels;
    @XmlElement(name = "ProjectCodes")
    protected ArrayOfProjectCode projectCodes;
    @XmlElement(name = "VoyageReport")
    protected VoyageReport voyageReport;
    @XmlElement(name = "Flightplan")
    protected Flightplan flightplan;
    @XmlElement(name = "Airports")
    protected Airports airports;

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the flightNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /**
     * Sets the value of the flightNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightNumber(String value) {
        this.flightNumber = value;
    }

    /**
     * Gets the value of the callsign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallsign() {
        return callsign;
    }

    /**
     * Sets the value of the callsign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallsign(String value) {
        this.callsign = value;
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
     * Gets the value of the uniqueId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUniqueId() {
        return uniqueId;
    }

    /**
     * Sets the value of the uniqueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUniqueId(Integer value) {
        this.uniqueId = value;
    }

    /**
     * Gets the value of the departureAirport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureAirport() {
        return departureAirport;
    }

    /**
     * Sets the value of the departureAirport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureAirport(String value) {
        this.departureAirport = value;
    }

    /**
     * Gets the value of the arrivalAirport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalAirport() {
        return arrivalAirport;
    }

    /**
     * Sets the value of the arrivalAirport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalAirport(String value) {
        this.arrivalAirport = value;
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
     * Gets the value of the voyageReport property.
     * 
     * @return
     *     possible object is
     *     {@link VoyageReport }
     *     
     */
    public VoyageReport getVoyageReport() {
        return voyageReport;
    }

    /**
     * Sets the value of the voyageReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoyageReport }
     *     
     */
    public void setVoyageReport(VoyageReport value) {
        this.voyageReport = value;
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

}
