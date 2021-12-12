
package com.Aviolinx.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccumulatedValuesRequestData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccumulatedValuesRequestData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Labels" type="{http://raido.aviolinx.com/api/}ArrayOfString1" minOccurs="0"/>
 *         &lt;element name="AggregateDays" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Type" type="{http://raido.aviolinx.com/api/}AccumulatedValuesRequestDataType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccumulatedValuesRequestData", propOrder = {
    "labels",
    "aggregateDays",
    "type"
})
public class AccumulatedValuesRequestData {

    @XmlElement(name = "Labels")
    protected ArrayOfString1 labels;
    @XmlElement(name = "AggregateDays", required = true, type = Integer.class, nillable = true)
    protected Integer aggregateDays;
    @XmlElement(name = "Type", required = true)
    @XmlSchemaType(name = "string")
    protected AccumulatedValuesRequestDataType type;

    /**
     * Gets the value of the labels property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString1 }
     *     
     */
    public ArrayOfString1 getLabels() {
        return labels;
    }

    /**
     * Sets the value of the labels property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString1 }
     *     
     */
    public void setLabels(ArrayOfString1 value) {
        this.labels = value;
    }

    /**
     * Gets the value of the aggregateDays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAggregateDays() {
        return aggregateDays;
    }

    /**
     * Sets the value of the aggregateDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAggregateDays(Integer value) {
        this.aggregateDays = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link AccumulatedValuesRequestDataType }
     *     
     */
    public AccumulatedValuesRequestDataType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccumulatedValuesRequestDataType }
     *     
     */
    public void setType(AccumulatedValuesRequestDataType value) {
        this.type = value;
    }

}
