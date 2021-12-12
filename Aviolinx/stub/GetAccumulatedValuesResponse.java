
package com.Aviolinx.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetAccumulatedValuesResult" type="{http://raido.aviolinx.com/api/}ArrayOfAccumulatedValue" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getAccumulatedValuesResult"
})
@XmlRootElement(name = "GetAccumulatedValuesResponse")
public class GetAccumulatedValuesResponse {

    @XmlElement(name = "GetAccumulatedValuesResult")
    protected ArrayOfAccumulatedValue getAccumulatedValuesResult;

    /**
     * Gets the value of the getAccumulatedValuesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAccumulatedValue }
     *     
     */
    public ArrayOfAccumulatedValue getGetAccumulatedValuesResult() {
        return getAccumulatedValuesResult;
    }

    /**
     * Sets the value of the getAccumulatedValuesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAccumulatedValue }
     *     
     */
    public void setGetAccumulatedValuesResult(ArrayOfAccumulatedValue value) {
        this.getAccumulatedValuesResult = value;
    }

}
