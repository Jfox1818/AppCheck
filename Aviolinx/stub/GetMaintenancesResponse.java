
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
 *         &lt;element name="GetMaintenancesResult" type="{http://raido.aviolinx.com/api/}ArrayOfMaintenance" minOccurs="0"/>
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
    "getMaintenancesResult"
})
@XmlRootElement(name = "GetMaintenancesResponse")
public class GetMaintenancesResponse {

    @XmlElement(name = "GetMaintenancesResult")
    protected ArrayOfMaintenance getMaintenancesResult;

    /**
     * Gets the value of the getMaintenancesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMaintenance }
     *     
     */
    public ArrayOfMaintenance getGetMaintenancesResult() {
        return getMaintenancesResult;
    }

    /**
     * Sets the value of the getMaintenancesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMaintenance }
     *     
     */
    public void setGetMaintenancesResult(ArrayOfMaintenance value) {
        this.getMaintenancesResult = value;
    }

}
