
package com.Aviolinx.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RosterActivity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RosterActivity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://raido.aviolinx.com/api/}ActivityBase">
 *       &lt;sequence>
 *         &lt;element name="AssignedRank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Times" type="{http://raido.aviolinx.com/api/}ArrayOfTime" minOccurs="0"/>
 *         &lt;element name="Notes" type="{http://raido.aviolinx.com/api/}ArrayOfNote" minOccurs="0"/>
 *         &lt;element name="PairingId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PairingName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TrainingSession" type="{http://raido.aviolinx.com/api/}TrainingSession" minOccurs="0"/>
 *         &lt;element name="HotelDetail" type="{http://raido.aviolinx.com/api/}HotelDetail" minOccurs="0"/>
 *         &lt;element name="RefUniqueId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CrewOnBoard" type="{http://raido.aviolinx.com/api/}ArrayOfCrewOnBoard" minOccurs="0"/>
 *         &lt;element name="DeadHeadBookingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RosterActivity", propOrder = {
    "assignedRank",
    "times",
    "notes",
    "pairingId",
    "pairingName",
    "code",
    "trainingSession",
    "hotelDetail",
    "refUniqueId",
    "crewOnBoard",
    "deadHeadBookingNumber"
})
public class RosterActivity
    extends ActivityBase
{

    @XmlElement(name = "AssignedRank")
    protected String assignedRank;
    @XmlElement(name = "Times")
    protected ArrayOfTime times;
    @XmlElement(name = "Notes")
    protected ArrayOfNote notes;
    @XmlElement(name = "PairingId")
    protected int pairingId;
    @XmlElement(name = "PairingName")
    protected String pairingName;
    @XmlElement(name = "Code")
    protected String code;
    @XmlElement(name = "TrainingSession")
    protected TrainingSession trainingSession;
    @XmlElement(name = "HotelDetail")
    protected HotelDetail hotelDetail;
    @XmlElement(name = "RefUniqueId")
    protected int refUniqueId;
    @XmlElement(name = "CrewOnBoard")
    protected ArrayOfCrewOnBoard crewOnBoard;
    @XmlElement(name = "DeadHeadBookingNumber")
    protected String deadHeadBookingNumber;

    /**
     * Gets the value of the assignedRank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignedRank() {
        return assignedRank;
    }

    /**
     * Sets the value of the assignedRank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignedRank(String value) {
        this.assignedRank = value;
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
     * Gets the value of the pairingId property.
     * 
     */
    public int getPairingId() {
        return pairingId;
    }

    /**
     * Sets the value of the pairingId property.
     * 
     */
    public void setPairingId(int value) {
        this.pairingId = value;
    }

    /**
     * Gets the value of the pairingName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPairingName() {
        return pairingName;
    }

    /**
     * Sets the value of the pairingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPairingName(String value) {
        this.pairingName = value;
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
     * Gets the value of the trainingSession property.
     * 
     * @return
     *     possible object is
     *     {@link TrainingSession }
     *     
     */
    public TrainingSession getTrainingSession() {
        return trainingSession;
    }

    /**
     * Sets the value of the trainingSession property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainingSession }
     *     
     */
    public void setTrainingSession(TrainingSession value) {
        this.trainingSession = value;
    }

    /**
     * Gets the value of the hotelDetail property.
     * 
     * @return
     *     possible object is
     *     {@link HotelDetail }
     *     
     */
    public HotelDetail getHotelDetail() {
        return hotelDetail;
    }

    /**
     * Sets the value of the hotelDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelDetail }
     *     
     */
    public void setHotelDetail(HotelDetail value) {
        this.hotelDetail = value;
    }

    /**
     * Gets the value of the refUniqueId property.
     * 
     */
    public int getRefUniqueId() {
        return refUniqueId;
    }

    /**
     * Sets the value of the refUniqueId property.
     * 
     */
    public void setRefUniqueId(int value) {
        this.refUniqueId = value;
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

}
