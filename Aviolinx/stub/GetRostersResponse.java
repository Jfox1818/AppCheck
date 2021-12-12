
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
 *         &lt;element name="GetRostersResult" type="{http://raido.aviolinx.com/api/}ArrayOfCrew" minOccurs="0"/>
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
    "getRostersResult"
})
@XmlRootElement(name = "GetRostersResponse")
public class GetRostersResponse {

    @XmlElement(name = "GetRostersResult")
    protected ArrayOfCrew getRostersResult;

    /**
     * Gets the value of the getRostersResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCrew }
     *     
     */
    public ArrayOfCrew getGetRostersResult() {
        return getRostersResult;
    }

    /**
     * Sets the value of the getRostersResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCrew }
     *     
     */
    public void setGetRostersResult(ArrayOfCrew value) {
        this.getRostersResult = value;
    }

}
