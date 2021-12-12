
package com.Aviolinx.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Loads complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Loads">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BookedPassengerPerWeight" type="{http://raido.aviolinx.com/api/}PassengerPerWeight" minOccurs="0"/>
 *         &lt;element name="ActualPassengerPerWeight" type="{http://raido.aviolinx.com/api/}PassengerPerWeight" minOccurs="0"/>
 *         &lt;element name="BookedPassengerPerClass" type="{http://raido.aviolinx.com/api/}ArrayOfPassengerPerClass" minOccurs="0"/>
 *         &lt;element name="ActualPassengerPerClass" type="{http://raido.aviolinx.com/api/}ArrayOfPassengerPerClass" minOccurs="0"/>
 *         &lt;element name="BookedDeadload" type="{http://raido.aviolinx.com/api/}ArrayOfDeadload" minOccurs="0"/>
 *         &lt;element name="ActualDeadload" type="{http://raido.aviolinx.com/api/}ArrayOfDeadload" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Loads", propOrder = {
    "bookedPassengerPerWeight",
    "actualPassengerPerWeight",
    "bookedPassengerPerClass",
    "actualPassengerPerClass",
    "bookedDeadload",
    "actualDeadload"
})
public class Loads {

    @XmlElement(name = "BookedPassengerPerWeight")
    protected PassengerPerWeight bookedPassengerPerWeight;
    @XmlElement(name = "ActualPassengerPerWeight")
    protected PassengerPerWeight actualPassengerPerWeight;
    @XmlElement(name = "BookedPassengerPerClass")
    protected ArrayOfPassengerPerClass bookedPassengerPerClass;
    @XmlElement(name = "ActualPassengerPerClass")
    protected ArrayOfPassengerPerClass actualPassengerPerClass;
    @XmlElement(name = "BookedDeadload")
    protected ArrayOfDeadload bookedDeadload;
    @XmlElement(name = "ActualDeadload")
    protected ArrayOfDeadload actualDeadload;

    /**
     * Gets the value of the bookedPassengerPerWeight property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerPerWeight }
     *     
     */
    public PassengerPerWeight getBookedPassengerPerWeight() {
        return bookedPassengerPerWeight;
    }

    /**
     * Sets the value of the bookedPassengerPerWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerPerWeight }
     *     
     */
    public void setBookedPassengerPerWeight(PassengerPerWeight value) {
        this.bookedPassengerPerWeight = value;
    }

    /**
     * Gets the value of the actualPassengerPerWeight property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerPerWeight }
     *     
     */
    public PassengerPerWeight getActualPassengerPerWeight() {
        return actualPassengerPerWeight;
    }

    /**
     * Sets the value of the actualPassengerPerWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerPerWeight }
     *     
     */
    public void setActualPassengerPerWeight(PassengerPerWeight value) {
        this.actualPassengerPerWeight = value;
    }

    /**
     * Gets the value of the bookedPassengerPerClass property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPassengerPerClass }
     *     
     */
    public ArrayOfPassengerPerClass getBookedPassengerPerClass() {
        return bookedPassengerPerClass;
    }

    /**
     * Sets the value of the bookedPassengerPerClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPassengerPerClass }
     *     
     */
    public void setBookedPassengerPerClass(ArrayOfPassengerPerClass value) {
        this.bookedPassengerPerClass = value;
    }

    /**
     * Gets the value of the actualPassengerPerClass property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPassengerPerClass }
     *     
     */
    public ArrayOfPassengerPerClass getActualPassengerPerClass() {
        return actualPassengerPerClass;
    }

    /**
     * Sets the value of the actualPassengerPerClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPassengerPerClass }
     *     
     */
    public void setActualPassengerPerClass(ArrayOfPassengerPerClass value) {
        this.actualPassengerPerClass = value;
    }

    /**
     * Gets the value of the bookedDeadload property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDeadload }
     *     
     */
    public ArrayOfDeadload getBookedDeadload() {
        return bookedDeadload;
    }

    /**
     * Sets the value of the bookedDeadload property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDeadload }
     *     
     */
    public void setBookedDeadload(ArrayOfDeadload value) {
        this.bookedDeadload = value;
    }

    /**
     * Gets the value of the actualDeadload property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDeadload }
     *     
     */
    public ArrayOfDeadload getActualDeadload() {
        return actualDeadload;
    }

    /**
     * Sets the value of the actualDeadload property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDeadload }
     *     
     */
    public void setActualDeadload(ArrayOfDeadload value) {
        this.actualDeadload = value;
    }

}
