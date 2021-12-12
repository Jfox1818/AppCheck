
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
 *         &lt;element name="Username" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ConfigurationRequestData" type="{http://raido.aviolinx.com/api/}ConfigurationRequestData" minOccurs="0"/>
 *         &lt;element name="ConfigurationDataFilter" type="{http://raido.aviolinx.com/api/}ConfigurationDataFilter" minOccurs="0"/>
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
    "username",
    "password",
    "configurationRequestData",
    "configurationDataFilter"
})
@XmlRootElement(name = "GetConfigurationData")
public class GetConfigurationData {

    @XmlElement(name = "Username", required = true, nillable = true)
    protected String username;
    @XmlElement(name = "Password", required = true, nillable = true)
    protected String password;
    @XmlElement(name = "ConfigurationRequestData")
    protected ConfigurationRequestData configurationRequestData;
    @XmlElement(name = "ConfigurationDataFilter")
    protected ConfigurationDataFilter configurationDataFilter;

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the configurationRequestData property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigurationRequestData }
     *     
     */
    public ConfigurationRequestData getConfigurationRequestData() {
        return configurationRequestData;
    }

    /**
     * Sets the value of the configurationRequestData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigurationRequestData }
     *     
     */
    public void setConfigurationRequestData(ConfigurationRequestData value) {
        this.configurationRequestData = value;
    }

    /**
     * Gets the value of the configurationDataFilter property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigurationDataFilter }
     *     
     */
    public ConfigurationDataFilter getConfigurationDataFilter() {
        return configurationDataFilter;
    }

    /**
     * Sets the value of the configurationDataFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigurationDataFilter }
     *     
     */
    public void setConfigurationDataFilter(ConfigurationDataFilter value) {
        this.configurationDataFilter = value;
    }

}
