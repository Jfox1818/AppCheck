
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
 *         &lt;element name="GetCrewRevisionsResult" type="{http://raido.aviolinx.com/api/}ArrayOfCrew" minOccurs="0"/>
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
    "getCrewRevisionsResult"
})
@XmlRootElement(name = "GetCrewRevisionsResponse")
public class GetCrewRevisionsResponse {

    @XmlElement(name = "GetCrewRevisionsResult")
    protected ArrayOfCrew getCrewRevisionsResult;

    /**
     * Gets the value of the getCrewRevisionsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCrew }
     *     
     */
    public ArrayOfCrew getGetCrewRevisionsResult() {
        return getCrewRevisionsResult;
    }

    /**
     * Sets the value of the getCrewRevisionsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCrew }
     *     
     */
    public void setGetCrewRevisionsResult(ArrayOfCrew value) {
        this.getCrewRevisionsResult = value;
    }

}
