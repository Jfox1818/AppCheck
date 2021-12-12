
package com.Aviolinx.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReferenceActivity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferenceActivity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShortCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShortCode2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WholeDay" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Active" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Filter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DutyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TimeMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReferenceGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DefaultStartTime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DefaultEndTime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DefaultLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferenceActivity", propOrder = {
    "name",
    "shortCode",
    "shortCode2",
    "wholeDay",
    "active",
    "comment",
    "dataType",
    "filter",
    "type",
    "dutyType",
    "timeMode",
    "referenceGroup",
    "defaultStartTime",
    "defaultEndTime",
    "defaultLength"
})
public class ReferenceActivity {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "ShortCode")
    protected String shortCode;
    @XmlElement(name = "ShortCode2")
    protected String shortCode2;
    @XmlElement(name = "WholeDay")
    protected boolean wholeDay;
    @XmlElement(name = "Active")
    protected boolean active;
    @XmlElement(name = "Comment")
    protected String comment;
    @XmlElement(name = "DataType")
    protected String dataType;
    @XmlElement(name = "Filter")
    protected String filter;
    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "DutyType")
    protected String dutyType;
    @XmlElement(name = "TimeMode")
    protected String timeMode;
    @XmlElement(name = "ReferenceGroup")
    protected String referenceGroup;
    @XmlElement(name = "DefaultStartTime", required = true, type = Integer.class, nillable = true)
    protected Integer defaultStartTime;
    @XmlElement(name = "DefaultEndTime", required = true, type = Integer.class, nillable = true)
    protected Integer defaultEndTime;
    @XmlElement(name = "DefaultLength", required = true, type = Integer.class, nillable = true)
    protected Integer defaultLength;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the shortCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortCode() {
        return shortCode;
    }

    /**
     * Sets the value of the shortCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortCode(String value) {
        this.shortCode = value;
    }

    /**
     * Gets the value of the shortCode2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortCode2() {
        return shortCode2;
    }

    /**
     * Sets the value of the shortCode2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortCode2(String value) {
        this.shortCode2 = value;
    }

    /**
     * Gets the value of the wholeDay property.
     * 
     */
    public boolean isWholeDay() {
        return wholeDay;
    }

    /**
     * Sets the value of the wholeDay property.
     * 
     */
    public void setWholeDay(boolean value) {
        this.wholeDay = value;
    }

    /**
     * Gets the value of the active property.
     * 
     */
    public boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     */
    public void setActive(boolean value) {
        this.active = value;
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

    /**
     * Gets the value of the dataType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataType(String value) {
        this.dataType = value;
    }

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilter(String value) {
        this.filter = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the dutyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDutyType() {
        return dutyType;
    }

    /**
     * Sets the value of the dutyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDutyType(String value) {
        this.dutyType = value;
    }

    /**
     * Gets the value of the timeMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeMode() {
        return timeMode;
    }

    /**
     * Sets the value of the timeMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeMode(String value) {
        this.timeMode = value;
    }

    /**
     * Gets the value of the referenceGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceGroup() {
        return referenceGroup;
    }

    /**
     * Sets the value of the referenceGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceGroup(String value) {
        this.referenceGroup = value;
    }

    /**
     * Gets the value of the defaultStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDefaultStartTime() {
        return defaultStartTime;
    }

    /**
     * Sets the value of the defaultStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDefaultStartTime(Integer value) {
        this.defaultStartTime = value;
    }

    /**
     * Gets the value of the defaultEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDefaultEndTime() {
        return defaultEndTime;
    }

    /**
     * Sets the value of the defaultEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDefaultEndTime(Integer value) {
        this.defaultEndTime = value;
    }

    /**
     * Gets the value of the defaultLength property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDefaultLength() {
        return defaultLength;
    }

    /**
     * Sets the value of the defaultLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDefaultLength(Integer value) {
        this.defaultLength = value;
    }

}
