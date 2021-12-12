
package com.Aviolinx.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RosterRequestData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RosterRequestData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Times" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="TrainingSessions" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="HotelDetails" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CrewOnBoard" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RosterRequestData", propOrder = {
    "times",
    "notes",
    "trainingSessions",
    "hotelDetails",
    "crewOnBoard"
})
public class RosterRequestData {

    @XmlElement(name = "Times")
    protected boolean times;
    @XmlElement(name = "Notes")
    protected boolean notes;
    @XmlElement(name = "TrainingSessions")
    protected boolean trainingSessions;
    @XmlElement(name = "HotelDetails")
    protected boolean hotelDetails;
    @XmlElement(name = "CrewOnBoard")
    protected boolean crewOnBoard;

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
     * Gets the value of the trainingSessions property.
     * 
     */
    public boolean isTrainingSessions() {
        return trainingSessions;
    }

    /**
     * Sets the value of the trainingSessions property.
     * 
     */
    public void setTrainingSessions(boolean value) {
        this.trainingSessions = value;
    }

    /**
     * Gets the value of the hotelDetails property.
     * 
     */
    public boolean isHotelDetails() {
        return hotelDetails;
    }

    /**
     * Sets the value of the hotelDetails property.
     * 
     */
    public void setHotelDetails(boolean value) {
        this.hotelDetails = value;
    }

    /**
     * Gets the value of the crewOnBoard property.
     * 
     */
    public boolean isCrewOnBoard() {
        return crewOnBoard;
    }

    /**
     * Sets the value of the crewOnBoard property.
     * 
     */
    public void setCrewOnBoard(boolean value) {
        this.crewOnBoard = value;
    }

}
