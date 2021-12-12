
package com.Aviolinx.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ActivityBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActivityBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UniqueId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ActivityType" type="{http://raido.aviolinx.com/api/}ActivityType"/>
 *         &lt;element name="ActivitySubType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ActivityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartAirportCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndAirportCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Start" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="End" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="StartLocalTimeDiff" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EndLocalTimeDiff" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="StartBaseTimeDiff" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EndBaseTimeDiff" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EquipmentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EquipmentVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Complement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RosterDesignator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LegalException" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Credit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivityBase", propOrder = {
    "uniqueId",
    "activityType",
    "activitySubType",
    "activityCode",
    "startAirportCode",
    "endAirportCode",
    "start",
    "end",
    "startLocalTimeDiff",
    "endLocalTimeDiff",
    "startBaseTimeDiff",
    "endBaseTimeDiff",
    "equipmentType",
    "equipmentVersion",
    "complement",
    "rosterDesignator",
    "legalException",
    "credit",
    "comment"
})
@XmlSeeAlso({
    RosterActivity.class,
    PairingActivity.class
})
public abstract class ActivityBase {

    @XmlElement(name = "UniqueId")
    protected int uniqueId;
    @XmlElement(name = "ActivityType", required = true)
    @XmlSchemaType(name = "string")
    protected ActivityType activityType;
    @XmlElement(name = "ActivitySubType")
    protected String activitySubType;
    @XmlElement(name = "ActivityCode")
    protected String activityCode;
    @XmlElement(name = "StartAirportCode")
    protected String startAirportCode;
    @XmlElement(name = "EndAirportCode")
    protected String endAirportCode;
    @XmlElement(name = "Start", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar start;
    @XmlElement(name = "End", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar end;
    @XmlElement(name = "StartLocalTimeDiff")
    protected int startLocalTimeDiff;
    @XmlElement(name = "EndLocalTimeDiff")
    protected int endLocalTimeDiff;
    @XmlElement(name = "StartBaseTimeDiff")
    protected int startBaseTimeDiff;
    @XmlElement(name = "EndBaseTimeDiff")
    protected int endBaseTimeDiff;
    @XmlElement(name = "EquipmentType")
    protected String equipmentType;
    @XmlElement(name = "EquipmentVersion")
    protected String equipmentVersion;
    @XmlElement(name = "Complement")
    protected String complement;
    @XmlElement(name = "RosterDesignator")
    protected String rosterDesignator;
    @XmlElement(name = "LegalException")
    protected String legalException;
    @XmlElement(name = "Credit")
    protected int credit;
    @XmlElement(name = "Comment")
    protected String comment;

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
     * Gets the value of the activityType property.
     * 
     * @return
     *     possible object is
     *     {@link ActivityType }
     *     
     */
    public ActivityType getActivityType() {
        return activityType;
    }

    /**
     * Sets the value of the activityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityType }
     *     
     */
    public void setActivityType(ActivityType value) {
        this.activityType = value;
    }

    /**
     * Gets the value of the activitySubType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivitySubType() {
        return activitySubType;
    }

    /**
     * Sets the value of the activitySubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivitySubType(String value) {
        this.activitySubType = value;
    }

    /**
     * Gets the value of the activityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityCode() {
        return activityCode;
    }

    /**
     * Sets the value of the activityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityCode(String value) {
        this.activityCode = value;
    }

    /**
     * Gets the value of the startAirportCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartAirportCode() {
        return startAirportCode;
    }

    /**
     * Sets the value of the startAirportCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartAirportCode(String value) {
        this.startAirportCode = value;
    }

    /**
     * Gets the value of the endAirportCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndAirportCode() {
        return endAirportCode;
    }

    /**
     * Sets the value of the endAirportCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndAirportCode(String value) {
        this.endAirportCode = value;
    }

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStart(XMLGregorianCalendar value) {
        this.start = value;
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEnd() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEnd(XMLGregorianCalendar value) {
        this.end = value;
    }

    /**
     * Gets the value of the startLocalTimeDiff property.
     * 
     */
    public int getStartLocalTimeDiff() {
        return startLocalTimeDiff;
    }

    /**
     * Sets the value of the startLocalTimeDiff property.
     * 
     */
    public void setStartLocalTimeDiff(int value) {
        this.startLocalTimeDiff = value;
    }

    /**
     * Gets the value of the endLocalTimeDiff property.
     * 
     */
    public int getEndLocalTimeDiff() {
        return endLocalTimeDiff;
    }

    /**
     * Sets the value of the endLocalTimeDiff property.
     * 
     */
    public void setEndLocalTimeDiff(int value) {
        this.endLocalTimeDiff = value;
    }

    /**
     * Gets the value of the startBaseTimeDiff property.
     * 
     */
    public int getStartBaseTimeDiff() {
        return startBaseTimeDiff;
    }

    /**
     * Sets the value of the startBaseTimeDiff property.
     * 
     */
    public void setStartBaseTimeDiff(int value) {
        this.startBaseTimeDiff = value;
    }

    /**
     * Gets the value of the endBaseTimeDiff property.
     * 
     */
    public int getEndBaseTimeDiff() {
        return endBaseTimeDiff;
    }

    /**
     * Sets the value of the endBaseTimeDiff property.
     * 
     */
    public void setEndBaseTimeDiff(int value) {
        this.endBaseTimeDiff = value;
    }

    /**
     * Gets the value of the equipmentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipmentType() {
        return equipmentType;
    }

    /**
     * Sets the value of the equipmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipmentType(String value) {
        this.equipmentType = value;
    }

    /**
     * Gets the value of the equipmentVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipmentVersion() {
        return equipmentVersion;
    }

    /**
     * Sets the value of the equipmentVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipmentVersion(String value) {
        this.equipmentVersion = value;
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
     * Gets the value of the rosterDesignator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRosterDesignator() {
        return rosterDesignator;
    }

    /**
     * Sets the value of the rosterDesignator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRosterDesignator(String value) {
        this.rosterDesignator = value;
    }

    /**
     * Gets the value of the legalException property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalException() {
        return legalException;
    }

    /**
     * Sets the value of the legalException property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalException(String value) {
        this.legalException = value;
    }

    /**
     * Gets the value of the credit property.
     * 
     */
    public int getCredit() {
        return credit;
    }

    /**
     * Sets the value of the credit property.
     * 
     */
    public void setCredit(int value) {
        this.credit = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

}
