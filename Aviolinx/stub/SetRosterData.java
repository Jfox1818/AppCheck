
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
 *         &lt;element name="CrewNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DeadHeadBookingNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Designators" type="{http://raido.aviolinx.com/api/}ArrayOfRosterDesignator" minOccurs="0"/>
 *         &lt;element name="RosterTime" type="{http://raido.aviolinx.com/api/}RosterTime" minOccurs="0"/>
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
@XmlType(name = "", propOrder = {
    "username",
    "password",
    "flightNumber",
    "callsign",
    "flightDate",
    "uniqueId",
    "departureAirport",
    "arrivalAirport",
    "crewNumber",
    "deadHeadBookingNumber",
    "designators",
    "rosterTime",
    "times"
})
@XmlRootElement(name = "SetRosterData")
public class SetRosterData {

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
    @XmlElement(name = "CrewNumber", required = true, nillable = true)
    protected String crewNumber;
    @XmlElement(name = "DeadHeadBookingNumber", required = true, nillable = true)
    protected String deadHeadBookingNumber;
    @XmlElement(name = "Designators")
    protected ArrayOfRosterDesignator designators;
    @XmlElement(name = "RosterTime")
    protected RosterTime rosterTime;
    @XmlElement(name = "Times")
    protected ArrayOfTime times;

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
     * Gets the value of the crewNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrewNumber() {
        return crewNumber;
    }

    /**
     * Sets the value of the crewNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrewNumber(String value) {
        this.crewNumber = value;
    }

    /**
     * Gets the value of the deadHeadBookingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeadHeadBookingNumber() {
        return deadHeadBookingNumber;
    }

    /**
     * Sets the value of the deadHeadBookingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeadHeadBookingNumber(String value) {
        this.deadHeadBookingNumber = value;
    }

    /**
     * Gets the value of the designators property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRosterDesignator }
     *     
     */
    public ArrayOfRosterDesignator getDesignators() {
        return designators;
    }

    /**
     * Sets the value of the designators property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRosterDesignator }
     *     
     */
    public void setDesignators(ArrayOfRosterDesignator value) {
        this.designators = value;
    }

    /**
     * Gets the value of the rosterTime property.
     * 
     * @return
     *     possible object is
     *     {@link RosterTime }
     *     
     */
    public RosterTime getRosterTime() {
        return rosterTime;
    }

    /**
     * Sets the value of the rosterTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link RosterTime }
     *     
     */
    public void setRosterTime(RosterTime value) {
        this.rosterTime = value;
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
