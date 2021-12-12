
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
 *         &lt;element name="SystemUser" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SystemUserPassword" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TypeB" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Mobile" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VOIP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ADUser" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Active" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Groups" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "systemUser",
    "systemUserPassword",
    "firstName",
    "lastName",
    "email",
    "typeB",
    "phone",
    "mobile",
    "voip",
    "adUser",
    "active",
    "groups"
})
@XmlRootElement(name = "SetUser")
public class SetUser {

    @XmlElement(name = "Username", required = true, nillable = true)
    protected String username;
    @XmlElement(name = "Password", required = true, nillable = true)
    protected String password;
    @XmlElement(name = "SystemUser", required = true, nillable = true)
    protected String systemUser;
    @XmlElement(name = "SystemUserPassword", required = true, nillable = true)
    protected String systemUserPassword;
    @XmlElement(name = "FirstName", required = true, nillable = true)
    protected String firstName;
    @XmlElement(name = "LastName", required = true, nillable = true)
    protected String lastName;
    @XmlElement(name = "Email", required = true, nillable = true)
    protected String email;
    @XmlElement(name = "TypeB", required = true, nillable = true)
    protected String typeB;
    @XmlElement(name = "Phone", required = true, nillable = true)
    protected String phone;
    @XmlElement(name = "Mobile", required = true, nillable = true)
    protected String mobile;
    @XmlElement(name = "VOIP", required = true, nillable = true)
    protected String voip;
    @XmlElement(name = "ADUser", required = true, nillable = true)
    protected String adUser;
    @XmlElement(name = "Active", required = true, type = Boolean.class, nillable = true)
    protected Boolean active;
    @XmlElement(name = "Groups", required = true, nillable = true)
    protected String groups;

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
     * Gets the value of the systemUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemUser() {
        return systemUser;
    }

    /**
     * Sets the value of the systemUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemUser(String value) {
        this.systemUser = value;
    }

    /**
     * Gets the value of the systemUserPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemUserPassword() {
        return systemUserPassword;
    }

    /**
     * Sets the value of the systemUserPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemUserPassword(String value) {
        this.systemUserPassword = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the typeB property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeB() {
        return typeB;
    }

    /**
     * Sets the value of the typeB property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeB(String value) {
        this.typeB = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the mobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * Sets the value of the mobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobile(String value) {
        this.mobile = value;
    }

    /**
     * Gets the value of the voip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVOIP() {
        return voip;
    }

    /**
     * Sets the value of the voip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVOIP(String value) {
        this.voip = value;
    }

    /**
     * Gets the value of the adUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADUser() {
        return adUser;
    }

    /**
     * Sets the value of the adUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADUser(String value) {
        this.adUser = value;
    }

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActive(Boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the groups property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroups() {
        return groups;
    }

    /**
     * Sets the value of the groups property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroups(String value) {
        this.groups = value;
    }

}
