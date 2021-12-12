
package com.Aviolinx.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Revision complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Revision">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UniqueId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CrewNotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreviousRosterActivities" type="{http://raido.aviolinx.com/api/}ArrayOfRosterActivity" minOccurs="0"/>
 *         &lt;element name="NewRosterActivities" type="{http://raido.aviolinx.com/api/}ArrayOfRosterActivity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Revision", propOrder = {
    "uniqueId",
    "crewNotes",
    "previousRosterActivities",
    "newRosterActivities"
})
public class Revision {

    @XmlElement(name = "UniqueId")
    protected String uniqueId;
    @XmlElement(name = "CrewNotes")
    protected String crewNotes;
    @XmlElement(name = "PreviousRosterActivities")
    protected ArrayOfRosterActivity previousRosterActivities;
    @XmlElement(name = "NewRosterActivities")
    protected ArrayOfRosterActivity newRosterActivities;

    /**
     * Gets the value of the uniqueId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueId() {
        return uniqueId;
    }

    /**
     * Sets the value of the uniqueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueId(String value) {
        this.uniqueId = value;
    }

    /**
     * Gets the value of the crewNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrewNotes() {
        return crewNotes;
    }

    /**
     * Sets the value of the crewNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrewNotes(String value) {
        this.crewNotes = value;
    }

    /**
     * Gets the value of the previousRosterActivities property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRosterActivity }
     *     
     */
    public ArrayOfRosterActivity getPreviousRosterActivities() {
        return previousRosterActivities;
    }

    /**
     * Sets the value of the previousRosterActivities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRosterActivity }
     *     
     */
    public void setPreviousRosterActivities(ArrayOfRosterActivity value) {
        this.previousRosterActivities = value;
    }

    /**
     * Gets the value of the newRosterActivities property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRosterActivity }
     *     
     */
    public ArrayOfRosterActivity getNewRosterActivities() {
        return newRosterActivities;
    }

    /**
     * Sets the value of the newRosterActivities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRosterActivity }
     *     
     */
    public void setNewRosterActivities(ArrayOfRosterActivity value) {
        this.newRosterActivities = value;
    }

}
