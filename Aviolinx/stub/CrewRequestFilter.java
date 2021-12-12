
package com.Aviolinx.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CrewRequestFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CrewRequestFilter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://raido.aviolinx.com/api/}BasicRequestFilter">
 *       &lt;sequence>
 *         &lt;element name="ReferenceDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OnlyActiveCrew" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="OnlyActiveRecords" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CrewNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CrewRequestFilter", propOrder = {
    "referenceDate",
    "onlyActiveCrew",
    "onlyActiveRecords",
    "crewNumber"
})
public class CrewRequestFilter
    extends BasicRequestFilter
{

    @XmlElement(name = "ReferenceDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar referenceDate;
    @XmlElement(name = "OnlyActiveCrew")
    protected boolean onlyActiveCrew;
    @XmlElement(name = "OnlyActiveRecords")
    protected boolean onlyActiveRecords;
    @XmlElement(name = "CrewNumber")
    protected String crewNumber;

    /**
     * Gets the value of the referenceDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReferenceDate() {
        return referenceDate;
    }

    /**
     * Sets the value of the referenceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReferenceDate(XMLGregorianCalendar value) {
        this.referenceDate = value;
    }

    /**
     * Gets the value of the onlyActiveCrew property.
     * 
     */
    public boolean isOnlyActiveCrew() {
        return onlyActiveCrew;
    }

    /**
     * Sets the value of the onlyActiveCrew property.
     * 
     */
    public void setOnlyActiveCrew(boolean value) {
        this.onlyActiveCrew = value;
    }

    /**
     * Gets the value of the onlyActiveRecords property.
     * 
     */
    public boolean isOnlyActiveRecords() {
        return onlyActiveRecords;
    }

    /**
     * Sets the value of the onlyActiveRecords property.
     * 
     */
    public void setOnlyActiveRecords(boolean value) {
        this.onlyActiveRecords = value;
    }

    /**
     * Gets the value of the crewNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrewNumber() {
        return crewNumber;
    }

    /**
     * Sets the value of the crewNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrewNumber(String value) {
        this.crewNumber = value;
    }

}
