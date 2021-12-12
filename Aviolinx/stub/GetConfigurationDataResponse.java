
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
 *         &lt;element name="GetConfigurationDataResult" type="{http://raido.aviolinx.com/api/}ConfigurationData" minOccurs="0"/>
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
    "getConfigurationDataResult"
})
@XmlRootElement(name = "GetConfigurationDataResponse")
public class GetConfigurationDataResponse {

    @XmlElement(name = "GetConfigurationDataResult")
    protected ConfigurationData getConfigurationDataResult;

    /**
     * Gets the value of the getConfigurationDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigurationData }
     *     
     */
    public ConfigurationData getGetConfigurationDataResult() {
        return getConfigurationDataResult;
    }

    /**
     * Sets the value of the getConfigurationDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigurationData }
     *     
     */
    public void setGetConfigurationDataResult(ConfigurationData value) {
        this.getConfigurationDataResult = value;
    }

}
