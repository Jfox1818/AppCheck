
package com.Aviolinx.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Delays complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Delays">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Delay1" type="{http://raido.aviolinx.com/api/}Delay" minOccurs="0"/>
 *         &lt;element name="Delay2" type="{http://raido.aviolinx.com/api/}Delay" minOccurs="0"/>
 *         &lt;element name="Delay3" type="{http://raido.aviolinx.com/api/}Delay" minOccurs="0"/>
 *         &lt;element name="Delay4" type="{http://raido.aviolinx.com/api/}Delay" minOccurs="0"/>
 *         &lt;element name="ArrivalDelay1" type="{http://raido.aviolinx.com/api/}Delay" minOccurs="0"/>
 *         &lt;element name="ArrivalDelay2" type="{http://raido.aviolinx.com/api/}Delay" minOccurs="0"/>
 *         &lt;element name="ReturnToRampDelay1" type="{http://raido.aviolinx.com/api/}Delay" minOccurs="0"/>
 *         &lt;element name="ReturnToRampDelay2" type="{http://raido.aviolinx.com/api/}Delay" minOccurs="0"/>
 *         &lt;element name="ForcedReturnDelay1" type="{http://raido.aviolinx.com/api/}Delay" minOccurs="0"/>
 *         &lt;element name="ForcedReturnDelay2" type="{http://raido.aviolinx.com/api/}Delay" minOccurs="0"/>
 *         &lt;element name="DivertDelay1" type="{http://raido.aviolinx.com/api/}Delay" minOccurs="0"/>
 *         &lt;element name="DivertDelay2" type="{http://raido.aviolinx.com/api/}Delay" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Delays", propOrder = {
    "delay1",
    "delay2",
    "delay3",
    "delay4",
    "arrivalDelay1",
    "arrivalDelay2",
    "returnToRampDelay1",
    "returnToRampDelay2",
    "forcedReturnDelay1",
    "forcedReturnDelay2",
    "divertDelay1",
    "divertDelay2"
})
public class Delays {

    @XmlElement(name = "Delay1")
    protected Delay delay1;
    @XmlElement(name = "Delay2")
    protected Delay delay2;
    @XmlElement(name = "Delay3")
    protected Delay delay3;
    @XmlElement(name = "Delay4")
    protected Delay delay4;
    @XmlElement(name = "ArrivalDelay1")
    protected Delay arrivalDelay1;
    @XmlElement(name = "ArrivalDelay2")
    protected Delay arrivalDelay2;
    @XmlElement(name = "ReturnToRampDelay1")
    protected Delay returnToRampDelay1;
    @XmlElement(name = "ReturnToRampDelay2")
    protected Delay returnToRampDelay2;
    @XmlElement(name = "ForcedReturnDelay1")
    protected Delay forcedReturnDelay1;
    @XmlElement(name = "ForcedReturnDelay2")
    protected Delay forcedReturnDelay2;
    @XmlElement(name = "DivertDelay1")
    protected Delay divertDelay1;
    @XmlElement(name = "DivertDelay2")
    protected Delay divertDelay2;

    /**
     * Gets the value of the delay1 property.
     * 
     * @return
     *     possible object is
     *     {@link Delay }
     *     
     */
    public Delay getDelay1() {
        return delay1;
    }

    /**
     * Sets the value of the delay1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Delay }
     *     
     */
    public void setDelay1(Delay value) {
        this.delay1 = value;
    }

    /**
     * Gets the value of the delay2 property.
     * 
     * @return
     *     possible object is
     *     {@link Delay }
     *     
     */
    public Delay getDelay2() {
        return delay2;
    }

    /**
     * Sets the value of the delay2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Delay }
     *     
     */
    public void setDelay2(Delay value) {
        this.delay2 = value;
    }

    /**
     * Gets the value of the delay3 property.
     * 
     * @return
     *     possible object is
     *     {@link Delay }
     *     
     */
    public Delay getDelay3() {
        return delay3;
    }

    /**
     * Sets the value of the delay3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Delay }
     *     
     */
    public void setDelay3(Delay value) {
        this.delay3 = value;
    }

    /**
     * Gets the value of the delay4 property.
     * 
     * @return
     *     possible object is
     *     {@link Delay }
     *     
     */
    public Delay getDelay4() {
        return delay4;
    }

    /**
     * Sets the value of the delay4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Delay }
     *     
     */
    public void setDelay4(Delay value) {
        this.delay4 = value;
    }

    /**
     * Gets the value of the arrivalDelay1 property.
     * 
     * @return
     *     possible object is
     *     {@link Delay }
     *     
     */
    public Delay getArrivalDelay1() {
        return arrivalDelay1;
    }

    /**
     * Sets the value of the arrivalDelay1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Delay }
     *     
     */
    public void setArrivalDelay1(Delay value) {
        this.arrivalDelay1 = value;
    }

    /**
     * Gets the value of the arrivalDelay2 property.
     * 
     * @return
     *     possible object is
     *     {@link Delay }
     *     
     */
    public Delay getArrivalDelay2() {
        return arrivalDelay2;
    }

    /**
     * Sets the value of the arrivalDelay2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Delay }
     *     
     */
    public void setArrivalDelay2(Delay value) {
        this.arrivalDelay2 = value;
    }

    /**
     * Gets the value of the returnToRampDelay1 property.
     * 
     * @return
     *     possible object is
     *     {@link Delay }
     *     
     */
    public Delay getReturnToRampDelay1() {
        return returnToRampDelay1;
    }

    /**
     * Sets the value of the returnToRampDelay1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Delay }
     *     
     */
    public void setReturnToRampDelay1(Delay value) {
        this.returnToRampDelay1 = value;
    }

    /**
     * Gets the value of the returnToRampDelay2 property.
     * 
     * @return
     *     possible object is
     *     {@link Delay }
     *     
     */
    public Delay getReturnToRampDelay2() {
        return returnToRampDelay2;
    }

    /**
     * Sets the value of the returnToRampDelay2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Delay }
     *     
     */
    public void setReturnToRampDelay2(Delay value) {
        this.returnToRampDelay2 = value;
    }

    /**
     * Gets the value of the forcedReturnDelay1 property.
     * 
     * @return
     *     possible object is
     *     {@link Delay }
     *     
     */
    public Delay getForcedReturnDelay1() {
        return forcedReturnDelay1;
    }

    /**
     * Sets the value of the forcedReturnDelay1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Delay }
     *     
     */
    public void setForcedReturnDelay1(Delay value) {
        this.forcedReturnDelay1 = value;
    }

    /**
     * Gets the value of the forcedReturnDelay2 property.
     * 
     * @return
     *     possible object is
     *     {@link Delay }
     *     
     */
    public Delay getForcedReturnDelay2() {
        return forcedReturnDelay2;
    }

    /**
     * Sets the value of the forcedReturnDelay2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Delay }
     *     
     */
    public void setForcedReturnDelay2(Delay value) {
        this.forcedReturnDelay2 = value;
    }

    /**
     * Gets the value of the divertDelay1 property.
     * 
     * @return
     *     possible object is
     *     {@link Delay }
     *     
     */
    public Delay getDivertDelay1() {
        return divertDelay1;
    }

    /**
     * Sets the value of the divertDelay1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Delay }
     *     
     */
    public void setDivertDelay1(Delay value) {
        this.divertDelay1 = value;
    }

    /**
     * Gets the value of the divertDelay2 property.
     * 
     * @return
     *     possible object is
     *     {@link Delay }
     *     
     */
    public Delay getDivertDelay2() {
        return divertDelay2;
    }

    /**
     * Sets the value of the divertDelay2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Delay }
     *     
     */
    public void setDivertDelay2(Delay value) {
        this.divertDelay2 = value;
    }

}
