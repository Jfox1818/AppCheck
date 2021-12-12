
package com.Aviolinx.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SetRostersFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetRostersFilter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="From" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="To" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="RemoveCarryInActivities" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="RemoveCarryOutActivities" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetRostersFilter", propOrder = {
    "from",
    "to",
    "removeCarryInActivities",
    "removeCarryOutActivities"
})
public class SetRostersFilter {

    @XmlElement(name = "From", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar from;
    @XmlElement(name = "To", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar to;
    @XmlElement(name = "RemoveCarryInActivities")
    protected boolean removeCarryInActivities;
    @XmlElement(name = "RemoveCarryOutActivities")
    protected boolean removeCarryOutActivities;

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFrom(XMLGregorianCalendar value) {
        this.from = value;
    }

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTo(XMLGregorianCalendar value) {
        this.to = value;
    }

    /**
     * Gets the value of the removeCarryInActivities property.
     * 
     */
    public boolean isRemoveCarryInActivities() {
        return removeCarryInActivities;
    }

    /**
     * Sets the value of the removeCarryInActivities property.
     * 
     */
    public void setRemoveCarryInActivities(boolean value) {
        this.removeCarryInActivities = value;
    }

    /**
     * Gets the value of the removeCarryOutActivities property.
     * 
     */
    public boolean isRemoveCarryOutActivities() {
        return removeCarryOutActivities;
    }

    /**
     * Sets the value of the removeCarryOutActivities property.
     * 
     */
    public void setRemoveCarryOutActivities(boolean value) {
        this.removeCarryOutActivities = value;
    }

}
