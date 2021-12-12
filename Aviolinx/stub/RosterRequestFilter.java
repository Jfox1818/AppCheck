
package com.Aviolinx.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RosterRequestFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RosterRequestFilter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://raido.aviolinx.com/api/}DateRangeBasicRequestFilter">
 *       &lt;sequence>
 *         &lt;element name="RosterFilterId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RosterFilterName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RosterType" type="{http://raido.aviolinx.com/api/}RosterType"/>
 *         &lt;element name="ReferenceActivity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OnlyActive" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RosterRequestFilter", propOrder = {
    "rosterFilterId",
    "rosterFilterName",
    "rosterType",
    "referenceActivity",
    "onlyActive"
})
public class RosterRequestFilter
    extends DateRangeBasicRequestFilter
{

    @XmlElement(name = "RosterFilterId", required = true, type = Integer.class, nillable = true)
    protected Integer rosterFilterId;
    @XmlElement(name = "RosterFilterName")
    protected String rosterFilterName;
    @XmlElement(name = "RosterType", required = true)
    @XmlSchemaType(name = "string")
    protected RosterType rosterType;
    @XmlElement(name = "ReferenceActivity")
    protected String referenceActivity;
    @XmlElement(name = "OnlyActive")
    protected boolean onlyActive;

    /**
     * Gets the value of the rosterFilterId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRosterFilterId() {
        return rosterFilterId;
    }

    /**
     * Sets the value of the rosterFilterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRosterFilterId(Integer value) {
        this.rosterFilterId = value;
    }

    /**
     * Gets the value of the rosterFilterName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRosterFilterName() {
        return rosterFilterName;
    }

    /**
     * Sets the value of the rosterFilterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRosterFilterName(String value) {
        this.rosterFilterName = value;
    }

    /**
     * Gets the value of the rosterType property.
     * 
     * @return
     *     possible object is
     *     {@link RosterType }
     *     
     */
    public RosterType getRosterType() {
        return rosterType;
    }

    /**
     * Sets the value of the rosterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RosterType }
     *     
     */
    public void setRosterType(RosterType value) {
        this.rosterType = value;
    }

    /**
     * Gets the value of the referenceActivity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceActivity() {
        return referenceActivity;
    }

    /**
     * Sets the value of the referenceActivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceActivity(String value) {
        this.referenceActivity = value;
    }

    /**
     * Gets the value of the onlyActive property.
     * 
     */
    public boolean isOnlyActive() {
        return onlyActive;
    }

    /**
     * Sets the value of the onlyActive property.
     * 
     */
    public void setOnlyActive(boolean value) {
        this.onlyActive = value;
    }

}
