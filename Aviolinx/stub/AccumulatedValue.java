
package com.Aviolinx.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccumulatedValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccumulatedValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Crew" type="{http://raido.aviolinx.com/api/}Crew" minOccurs="0"/>
 *         &lt;element name="Aircraft" type="{http://raido.aviolinx.com/api/}Aircraft" minOccurs="0"/>
 *         &lt;element name="Labels" type="{http://raido.aviolinx.com/api/}ArrayOfAccumulatedValueLabel" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccumulatedValue", propOrder = {
    "crew",
    "aircraft",
    "labels"
})
public class AccumulatedValue {

    @XmlElement(name = "Crew")
    protected Crew crew;
    @XmlElement(name = "Aircraft")
    protected Aircraft aircraft;
    @XmlElement(name = "Labels")
    protected ArrayOfAccumulatedValueLabel labels;

    /**
     * Gets the value of the crew property.
     * 
     * @return
     *     possible object is
     *     {@link Crew }
     *     
     */
    public Crew getCrew() {
        return crew;
    }

    /**
     * Sets the value of the crew property.
     * 
     * @param value
     *     allowed object is
     *     {@link Crew }
     *     
     */
    public void setCrew(Crew value) {
        this.crew = value;
    }

    /**
     * Gets the value of the aircraft property.
     * 
     * @return
     *     possible object is
     *     {@link Aircraft }
     *     
     */
    public Aircraft getAircraft() {
        return aircraft;
    }

    /**
     * Sets the value of the aircraft property.
     * 
     * @param value
     *     allowed object is
     *     {@link Aircraft }
     *     
     */
    public void setAircraft(Aircraft value) {
        this.aircraft = value;
    }

    /**
     * Gets the value of the labels property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAccumulatedValueLabel }
     *     
     */
    public ArrayOfAccumulatedValueLabel getLabels() {
        return labels;
    }

    /**
     * Sets the value of the labels property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAccumulatedValueLabel }
     *     
     */
    public void setLabels(ArrayOfAccumulatedValueLabel value) {
        this.labels = value;
    }

}
