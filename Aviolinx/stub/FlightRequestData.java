
package com.Aviolinx.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlightRequestData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightRequestData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Aircraft" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Airports" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CrewOnBoards" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Delays" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Flightplan" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Fuels" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Loads" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Times" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ProjectCodes" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Jumpseaters" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="DetailedStatus" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightRequestData", propOrder = {
    "aircraft",
    "airports",
    "crewOnBoards",
    "delays",
    "flightplan",
    "fuels",
    "loads",
    "notes",
    "times",
    "projectCodes",
    "jumpseaters",
    "detailedStatus"
})
public class FlightRequestData {

    @XmlElement(name = "Aircraft")
    protected boolean aircraft;
    @XmlElement(name = "Airports")
    protected boolean airports;
    @XmlElement(name = "CrewOnBoards")
    protected boolean crewOnBoards;
    @XmlElement(name = "Delays")
    protected boolean delays;
    @XmlElement(name = "Flightplan")
    protected boolean flightplan;
    @XmlElement(name = "Fuels")
    protected boolean fuels;
    @XmlElement(name = "Loads")
    protected boolean loads;
    @XmlElement(name = "Notes")
    protected boolean notes;
    @XmlElement(name = "Times")
    protected boolean times;
    @XmlElement(name = "ProjectCodes", required = true, type = Boolean.class, nillable = true)
    protected Boolean projectCodes;
    @XmlElement(name = "Jumpseaters")
    protected boolean jumpseaters;
    @XmlElement(name = "DetailedStatus", required = true, type = Boolean.class, nillable = true)
    protected Boolean detailedStatus;

    /**
     * Gets the value of the aircraft property.
     * 
     */
    public boolean isAircraft() {
        return aircraft;
    }

    /**
     * Sets the value of the aircraft property.
     * 
     */
    public void setAircraft(boolean value) {
        this.aircraft = value;
    }

    /**
     * Gets the value of the airports property.
     * 
     */
    public boolean isAirports() {
        return airports;
    }

    /**
     * Sets the value of the airports property.
     * 
     */
    public void setAirports(boolean value) {
        this.airports = value;
    }

    /**
     * Gets the value of the crewOnBoards property.
     * 
     */
    public boolean isCrewOnBoards() {
        return crewOnBoards;
    }

    /**
     * Sets the value of the crewOnBoards property.
     * 
     */
    public void setCrewOnBoards(boolean value) {
        this.crewOnBoards = value;
    }

    /**
     * Gets the value of the delays property.
     * 
     */
    public boolean isDelays() {
        return delays;
    }

    /**
     * Sets the value of the delays property.
     * 
     */
    public void setDelays(boolean value) {
        this.delays = value;
    }

    /**
     * Gets the value of the flightplan property.
     * 
     */
    public boolean isFlightplan() {
        return flightplan;
    }

    /**
     * Sets the value of the flightplan property.
     * 
     */
    public void setFlightplan(boolean value) {
        this.flightplan = value;
    }

    /**
     * Gets the value of the fuels property.
     * 
     */
    public boolean isFuels() {
        return fuels;
    }

    /**
     * Sets the value of the fuels property.
     * 
     */
    public void setFuels(boolean value) {
        this.fuels = value;
    }

    /**
     * Gets the value of the loads property.
     * 
     */
    public boolean isLoads() {
        return loads;
    }

    /**
     * Sets the value of the loads property.
     * 
     */
    public void setLoads(boolean value) {
        this.loads = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     */
    public boolean isNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     */
    public void setNotes(boolean value) {
        this.notes = value;
    }

    /**
     * Gets the value of the times property.
     * 
     */
    public boolean isTimes() {
        return times;
    }

    /**
     * Sets the value of the times property.
     * 
     */
    public void setTimes(boolean value) {
        this.times = value;
    }

    /**
     * Gets the value of the projectCodes property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProjectCodes() {
        return projectCodes;
    }

    /**
     * Sets the value of the projectCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProjectCodes(Boolean value) {
        this.projectCodes = value;
    }

    /**
     * Gets the value of the jumpseaters property.
     * 
     */
    public boolean isJumpseaters() {
        return jumpseaters;
    }

    /**
     * Sets the value of the jumpseaters property.
     * 
     */
    public void setJumpseaters(boolean value) {
        this.jumpseaters = value;
    }

    /**
     * Gets the value of the detailedStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDetailedStatus() {
        return detailedStatus;
    }

    /**
     * Sets the value of the detailedStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDetailedStatus(Boolean value) {
        this.detailedStatus = value;
    }

}
