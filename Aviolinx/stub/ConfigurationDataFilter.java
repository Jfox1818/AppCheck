
package com.Aviolinx.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConfigurationDataFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfigurationDataFilter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReasonFilter" type="{http://raido.aviolinx.com/api/}ReasonRequestFilter" minOccurs="0"/>
 *         &lt;element name="ReasonCategoryFilter" type="{http://raido.aviolinx.com/api/}ReasonCategoryRequestFilter" minOccurs="0"/>
 *         &lt;element name="HotelInfoFilter" type="{http://raido.aviolinx.com/api/}HotelInfoRequestFilter" minOccurs="0"/>
 *         &lt;element name="CrewComplementFilter" type="{http://raido.aviolinx.com/api/}CrewComplementFilter" minOccurs="0"/>
 *         &lt;element name="ReferenceActivityFilter" type="{http://raido.aviolinx.com/api/}ReferenceActivityRequestFilter" minOccurs="0"/>
 *         &lt;element name="AircraftTypeFilter" type="{http://raido.aviolinx.com/api/}AircraftTypeFilter" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfigurationDataFilter", propOrder = {
    "reasonFilter",
    "reasonCategoryFilter",
    "hotelInfoFilter",
    "crewComplementFilter",
    "referenceActivityFilter",
    "aircraftTypeFilter"
})
public class ConfigurationDataFilter {

    @XmlElement(name = "ReasonFilter")
    protected ReasonRequestFilter reasonFilter;
    @XmlElement(name = "ReasonCategoryFilter")
    protected ReasonCategoryRequestFilter reasonCategoryFilter;
    @XmlElement(name = "HotelInfoFilter")
    protected HotelInfoRequestFilter hotelInfoFilter;
    @XmlElement(name = "CrewComplementFilter")
    protected CrewComplementFilter crewComplementFilter;
    @XmlElement(name = "ReferenceActivityFilter")
    protected ReferenceActivityRequestFilter referenceActivityFilter;
    @XmlElement(name = "AircraftTypeFilter")
    protected AircraftTypeFilter aircraftTypeFilter;

    /**
     * Gets the value of the reasonFilter property.
     * 
     * @return
     *     possible object is
     *     {@link ReasonRequestFilter }
     *     
     */
    public ReasonRequestFilter getReasonFilter() {
        return reasonFilter;
    }

    /**
     * Sets the value of the reasonFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReasonRequestFilter }
     *     
     */
    public void setReasonFilter(ReasonRequestFilter value) {
        this.reasonFilter = value;
    }

    /**
     * Gets the value of the reasonCategoryFilter property.
     * 
     * @return
     *     possible object is
     *     {@link ReasonCategoryRequestFilter }
     *     
     */
    public ReasonCategoryRequestFilter getReasonCategoryFilter() {
        return reasonCategoryFilter;
    }

    /**
     * Sets the value of the reasonCategoryFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReasonCategoryRequestFilter }
     *     
     */
    public void setReasonCategoryFilter(ReasonCategoryRequestFilter value) {
        this.reasonCategoryFilter = value;
    }

    /**
     * Gets the value of the hotelInfoFilter property.
     * 
     * @return
     *     possible object is
     *     {@link HotelInfoRequestFilter }
     *     
     */
    public HotelInfoRequestFilter getHotelInfoFilter() {
        return hotelInfoFilter;
    }

    /**
     * Sets the value of the hotelInfoFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelInfoRequestFilter }
     *     
     */
    public void setHotelInfoFilter(HotelInfoRequestFilter value) {
        this.hotelInfoFilter = value;
    }

    /**
     * Gets the value of the crewComplementFilter property.
     * 
     * @return
     *     possible object is
     *     {@link CrewComplementFilter }
     *     
     */
    public CrewComplementFilter getCrewComplementFilter() {
        return crewComplementFilter;
    }

    /**
     * Sets the value of the crewComplementFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrewComplementFilter }
     *     
     */
    public void setCrewComplementFilter(CrewComplementFilter value) {
        this.crewComplementFilter = value;
    }

    /**
     * Gets the value of the referenceActivityFilter property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceActivityRequestFilter }
     *     
     */
    public ReferenceActivityRequestFilter getReferenceActivityFilter() {
        return referenceActivityFilter;
    }

    /**
     * Sets the value of the referenceActivityFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceActivityRequestFilter }
     *     
     */
    public void setReferenceActivityFilter(ReferenceActivityRequestFilter value) {
        this.referenceActivityFilter = value;
    }

    /**
     * Gets the value of the aircraftTypeFilter property.
     * 
     * @return
     *     possible object is
     *     {@link AircraftTypeFilter }
     *     
     */
    public AircraftTypeFilter getAircraftTypeFilter() {
        return aircraftTypeFilter;
    }

    /**
     * Sets the value of the aircraftTypeFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link AircraftTypeFilter }
     *     
     */
    public void setAircraftTypeFilter(AircraftTypeFilter value) {
        this.aircraftTypeFilter = value;
    }

}
