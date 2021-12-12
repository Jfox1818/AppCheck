
package com.Aviolinx.stub;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Pickup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Pickup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Start" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LengthInMinutes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Type" type="{http://raido.aviolinx.com/api/}PickupType"/>
 *         &lt;element name="Company" type="{http://raido.aviolinx.com/api/}Company" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Pickup", propOrder = {
    "start",
    "lengthInMinutes",
    "type",
    "company"
})
public class Pickup {

    @XmlElementRef(name = "Start", namespace = "http://raido.aviolinx.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> start;
    @XmlElement(name = "LengthInMinutes")
    protected int lengthInMinutes;
    @XmlElement(name = "Type", required = true)
    @XmlSchemaType(name = "string")
    protected PickupType type;
    @XmlElement(name = "Company")
    protected Company company;

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setStart(JAXBElement<XMLGregorianCalendar> value) {
        this.start = value;
    }

    /**
     * Gets the value of the lengthInMinutes property.
     * 
     */
    public int getLengthInMinutes() {
        return lengthInMinutes;
    }

    /**
     * Sets the value of the lengthInMinutes property.
     * 
     */
    public void setLengthInMinutes(int value) {
        this.lengthInMinutes = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link PickupType }
     *     
     */
    public PickupType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link PickupType }
     *     
     */
    public void setType(PickupType value) {
        this.type = value;
    }

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link Company }
     *     
     */
    public Company getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link Company }
     *     
     */
    public void setCompany(Company value) {
        this.company = value;
    }

}
