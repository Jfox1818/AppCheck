
package com.Aviolinx.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConfigurationData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfigurationData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Reasons" type="{http://raido.aviolinx.com/api/}ArrayOfReason" minOccurs="0"/>
 *         &lt;element name="ReasonCategories" type="{http://raido.aviolinx.com/api/}ArrayOfReasonCategory" minOccurs="0"/>
 *         &lt;element name="HotelInfos" type="{http://raido.aviolinx.com/api/}ArrayOfHotelInfo" minOccurs="0"/>
 *         &lt;element name="CrewComplements" type="{http://raido.aviolinx.com/api/}ArrayOfCrewComplement" minOccurs="0"/>
 *         &lt;element name="ReferenceActivities" type="{http://raido.aviolinx.com/api/}ArrayOfReferenceActivity" minOccurs="0"/>
 *         &lt;element name="AircraftTypes" type="{http://raido.aviolinx.com/api/}ArrayOfAircraftType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfigurationData", propOrder = {
    "reasons",
    "reasonCategories",
    "hotelInfos",
    "crewComplements",
    "referenceActivities",
    "aircraftTypes"
})
public class ConfigurationData {

    @XmlElement(name = "Reasons")
    protected ArrayOfReason reasons;
    @XmlElement(name = "ReasonCategories")
    protected ArrayOfReasonCategory reasonCategories;
    @XmlElement(name = "HotelInfos")
    protected ArrayOfHotelInfo hotelInfos;
    @XmlElement(name = "CrewComplements")
    protected ArrayOfCrewComplement crewComplements;
    @XmlElement(name = "ReferenceActivities")
    protected ArrayOfReferenceActivity referenceActivities;
    @XmlElement(name = "AircraftTypes")
    protected ArrayOfAircraftType aircraftTypes;

    /**
     * Gets the value of the reasons property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfReason }
     *     
     */
    public ArrayOfReason getReasons() {
        return reasons;
    }

    /**
     * Sets the value of the reasons property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfReason }
     *     
     */
    public void setReasons(ArrayOfReason value) {
        this.reasons = value;
    }

    /**
     * Gets the value of the reasonCategories property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfReasonCategory }
     *     
     */
    public ArrayOfReasonCategory getReasonCategories() {
        return reasonCategories;
    }

    /**
     * Sets the value of the reasonCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfReasonCategory }
     *     
     */
    public void setReasonCategories(ArrayOfReasonCategory value) {
        this.reasonCategories = value;
    }

    /**
     * Gets the value of the hotelInfos property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHotelInfo }
     *     
     */
    public ArrayOfHotelInfo getHotelInfos() {
        return hotelInfos;
    }

    /**
     * Sets the value of the hotelInfos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHotelInfo }
     *     
     */
    public void setHotelInfos(ArrayOfHotelInfo value) {
        this.hotelInfos = value;
    }

    /**
     * Gets the value of the crewComplements property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCrewComplement }
     *     
     */
    public ArrayOfCrewComplement getCrewComplements() {
        return crewComplements;
    }

    /**
     * Sets the value of the crewComplements property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCrewComplement }
     *     
     */
    public void setCrewComplements(ArrayOfCrewComplement value) {
        this.crewComplements = value;
    }

    /**
     * Gets the value of the referenceActivities property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfReferenceActivity }
     *     
     */
    public ArrayOfReferenceActivity getReferenceActivities() {
        return referenceActivities;
    }

    /**
     * Sets the value of the referenceActivities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfReferenceActivity }
     *     
     */
    public void setReferenceActivities(ArrayOfReferenceActivity value) {
        this.referenceActivities = value;
    }

    /**
     * Gets the value of the aircraftTypes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAircraftType }
     *     
     */
    public ArrayOfAircraftType getAircraftTypes() {
        return aircraftTypes;
    }

    /**
     * Sets the value of the aircraftTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAircraftType }
     *     
     */
    public void setAircraftTypes(ArrayOfAircraftType value) {
        this.aircraftTypes = value;
    }

}
