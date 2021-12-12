
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
 *         &lt;element name="VehicleRegistration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MinimumEquipmentList" type="{http://raido.aviolinx.com/api/}ArrayOfMinimumEquipment" minOccurs="0"/>
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
    "vehicleRegistration",
    "minimumEquipmentList"
})
@XmlRootElement(name = "SetAircraftData")
public class SetAircraftData {

    @XmlElement(name = "Username", required = true, nillable = true)
    protected String username;
    @XmlElement(name = "Password", required = true, nillable = true)
    protected String password;
    @XmlElement(name = "VehicleRegistration")
    protected String vehicleRegistration;
    @XmlElement(name = "MinimumEquipmentList")
    protected ArrayOfMinimumEquipment minimumEquipmentList;

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
     * Gets the value of the vehicleRegistration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleRegistration() {
        return vehicleRegistration;
    }

    /**
     * Sets the value of the vehicleRegistration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleRegistration(String value) {
        this.vehicleRegistration = value;
    }

    /**
     * Gets the value of the minimumEquipmentList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMinimumEquipment }
     *     
     */
    public ArrayOfMinimumEquipment getMinimumEquipmentList() {
        return minimumEquipmentList;
    }

    /**
     * Sets the value of the minimumEquipmentList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMinimumEquipment }
     *     
     */
    public void setMinimumEquipmentList(ArrayOfMinimumEquipment value) {
        this.minimumEquipmentList = value;
    }

}
