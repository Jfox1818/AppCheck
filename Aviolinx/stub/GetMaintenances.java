
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
 *         &lt;element name="MaintenanceRequestFilter" type="{http://raido.aviolinx.com/api/}MaintenanceRequestFilter"/>
 *         &lt;element name="MaintenanceRequestData" type="{http://raido.aviolinx.com/api/}MaintenanceRequestData"/>
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
    "maintenanceRequestFilter",
    "maintenanceRequestData"
})
@XmlRootElement(name = "GetMaintenances")
public class GetMaintenances {

    @XmlElement(name = "Username", required = true, nillable = true)
    protected String username;
    @XmlElement(name = "Password", required = true, nillable = true)
    protected String password;
    @XmlElement(name = "MaintenanceRequestFilter", required = true, nillable = true)
    protected MaintenanceRequestFilter maintenanceRequestFilter;
    @XmlElement(name = "MaintenanceRequestData", required = true, nillable = true)
    protected MaintenanceRequestData maintenanceRequestData;

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
     * Gets the value of the maintenanceRequestFilter property.
     * 
     * @return
     *     possible object is
     *     {@link MaintenanceRequestFilter }
     *     
     */
    public MaintenanceRequestFilter getMaintenanceRequestFilter() {
        return maintenanceRequestFilter;
    }

    /**
     * Sets the value of the maintenanceRequestFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaintenanceRequestFilter }
     *     
     */
    public void setMaintenanceRequestFilter(MaintenanceRequestFilter value) {
        this.maintenanceRequestFilter = value;
    }

    /**
     * Gets the value of the maintenanceRequestData property.
     * 
     * @return
     *     possible object is
     *     {@link MaintenanceRequestData }
     *     
     */
    public MaintenanceRequestData getMaintenanceRequestData() {
        return maintenanceRequestData;
    }

    /**
     * Sets the value of the maintenanceRequestData property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaintenanceRequestData }
     *     
     */
    public void setMaintenanceRequestData(MaintenanceRequestData value) {
        this.maintenanceRequestData = value;
    }

}
