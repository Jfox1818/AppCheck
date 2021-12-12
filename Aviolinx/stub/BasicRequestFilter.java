
package com.Aviolinx.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BasicRequestFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BasicRequestFilter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FilterId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FilterName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniqueId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasicRequestFilter", propOrder = {
    "filterId",
    "filterName",
    "uniqueId"
})
@XmlSeeAlso({
    CrewRequestFilter.class,
    RevisionsRequestFilter.class,
    AircraftRequestFilter.class,
    DateRangeBasicRequestFilter.class
})
public class BasicRequestFilter {

    @XmlElement(name = "FilterId", required = true, type = Integer.class, nillable = true)
    protected Integer filterId;
    @XmlElement(name = "FilterName")
    protected String filterName;
    @XmlElement(name = "UniqueId")
    protected String uniqueId;

    /**
     * Gets the value of the filterId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFilterId() {
        return filterId;
    }

    /**
     * Sets the value of the filterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFilterId(Integer value) {
        this.filterId = value;
    }

    /**
     * Gets the value of the filterName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterName() {
        return filterName;
    }

    /**
     * Sets the value of the filterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterName(String value) {
        this.filterName = value;
    }

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

}
