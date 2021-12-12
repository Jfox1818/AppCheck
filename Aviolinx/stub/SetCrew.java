
package com.Aviolinx.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="EmployeeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NickName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SocialSecurityNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ShortCode1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ShortCode2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BirthDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Gender" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Active" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Groups" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Bases" type="{http://raido.aviolinx.com/api/}ArrayOfBase" minOccurs="0"/>
 *         &lt;element name="QualRankData" type="{http://raido.aviolinx.com/api/}ArrayOfQualRank" minOccurs="0"/>
 *         &lt;element name="Phones" type="{http://raido.aviolinx.com/api/}ArrayOfPhone" minOccurs="0"/>
 *         &lt;element name="Addresses" type="{http://raido.aviolinx.com/api/}ArrayOfAddress" minOccurs="0"/>
 *         &lt;element name="Emails" type="{http://raido.aviolinx.com/api/}ArrayOfEmail" minOccurs="0"/>
 *         &lt;element name="Documents" type="{http://raido.aviolinx.com/api/}ArrayOfDocument" minOccurs="0"/>
 *         &lt;element name="ContractsData" type="{http://raido.aviolinx.com/api/}ContractsData" minOccurs="0"/>
 *         &lt;element name="SpecialRoles" type="{http://raido.aviolinx.com/api/}ArrayOfSpecialRole" minOccurs="0"/>
 *         &lt;element name="SystemUser" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "employeeNumber",
    "firstName",
    "middleName",
    "lastName",
    "nickName",
    "socialSecurityNumber",
    "shortCode1",
    "shortCode2",
    "birthDate",
    "gender",
    "type",
    "active",
    "groups",
    "bases",
    "qualRankData",
    "phones",
    "addresses",
    "emails",
    "documents",
    "contractsData",
    "specialRoles",
    "systemUser"
})
@XmlRootElement(name = "SetCrew")
public class SetCrew {

    @XmlElement(name = "Username", required = true, nillable = true)
    protected String username;
    @XmlElement(name = "Password", required = true, nillable = true)
    protected String password;
    @XmlElement(name = "EmployeeNumber")
    protected String employeeNumber;
    @XmlElement(name = "FirstName", required = true, nillable = true)
    protected String firstName;
    @XmlElement(name = "MiddleName", required = true, nillable = true)
    protected String middleName;
    @XmlElement(name = "LastName", required = true, nillable = true)
    protected String lastName;
    @XmlElement(name = "NickName", required = true, nillable = true)
    protected String nickName;
    @XmlElement(name = "SocialSecurityNumber", required = true, nillable = true)
    protected String socialSecurityNumber;
    @XmlElement(name = "ShortCode1", required = true, nillable = true)
    protected String shortCode1;
    @XmlElement(name = "ShortCode2", required = true, nillable = true)
    protected String shortCode2;
    @XmlElement(name = "BirthDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar birthDate;
    @XmlElement(name = "Gender", required = true, nillable = true)
    protected String gender;
    @XmlElement(name = "Type", required = true, nillable = true)
    protected String type;
    @XmlElement(name = "Active", required = true, type = Boolean.class, nillable = true)
    protected Boolean active;
    @XmlElement(name = "Groups", required = true, nillable = true)
    protected String groups;
    @XmlElement(name = "Bases")
    protected ArrayOfBase bases;
    @XmlElement(name = "QualRankData")
    protected ArrayOfQualRank qualRankData;
    @XmlElement(name = "Phones")
    protected ArrayOfPhone phones;
    @XmlElement(name = "Addresses")
    protected ArrayOfAddress addresses;
    @XmlElement(name = "Emails")
    protected ArrayOfEmail emails;
    @XmlElement(name = "Documents")
    protected ArrayOfDocument documents;
    @XmlElement(name = "ContractsData")
    protected ContractsData contractsData;
    @XmlElement(name = "SpecialRoles")
    protected ArrayOfSpecialRole specialRoles;
    @XmlElement(name = "SystemUser", required = true, nillable = true)
    protected String systemUser;

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
     * Gets the value of the employeeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeNumber() {
        return employeeNumber;
    }

    /**
     * Sets the value of the employeeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeNumber(String value) {
        this.employeeNumber = value;
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
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
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
     * Gets the value of the nickName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * Sets the value of the nickName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNickName(String value) {
        this.nickName = value;
    }

    /**
     * Gets the value of the socialSecurityNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    /**
     * Sets the value of the socialSecurityNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSocialSecurityNumber(String value) {
        this.socialSecurityNumber = value;
    }

    /**
     * Gets the value of the shortCode1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortCode1() {
        return shortCode1;
    }

    /**
     * Sets the value of the shortCode1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortCode1(String value) {
        this.shortCode1 = value;
    }

    /**
     * Gets the value of the shortCode2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortCode2() {
        return shortCode2;
    }

    /**
     * Sets the value of the shortCode2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortCode2(String value) {
        this.shortCode2 = value;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthDate(XMLGregorianCalendar value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
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

    /**
     * Gets the value of the bases property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBase }
     *     
     */
    public ArrayOfBase getBases() {
        return bases;
    }

    /**
     * Sets the value of the bases property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBase }
     *     
     */
    public void setBases(ArrayOfBase value) {
        this.bases = value;
    }

    /**
     * Gets the value of the qualRankData property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfQualRank }
     *     
     */
    public ArrayOfQualRank getQualRankData() {
        return qualRankData;
    }

    /**
     * Sets the value of the qualRankData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfQualRank }
     *     
     */
    public void setQualRankData(ArrayOfQualRank value) {
        this.qualRankData = value;
    }

    /**
     * Gets the value of the phones property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPhone }
     *     
     */
    public ArrayOfPhone getPhones() {
        return phones;
    }

    /**
     * Sets the value of the phones property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPhone }
     *     
     */
    public void setPhones(ArrayOfPhone value) {
        this.phones = value;
    }

    /**
     * Gets the value of the addresses property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAddress }
     *     
     */
    public ArrayOfAddress getAddresses() {
        return addresses;
    }

    /**
     * Sets the value of the addresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAddress }
     *     
     */
    public void setAddresses(ArrayOfAddress value) {
        this.addresses = value;
    }

    /**
     * Gets the value of the emails property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEmail }
     *     
     */
    public ArrayOfEmail getEmails() {
        return emails;
    }

    /**
     * Sets the value of the emails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEmail }
     *     
     */
    public void setEmails(ArrayOfEmail value) {
        this.emails = value;
    }

    /**
     * Gets the value of the documents property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDocument }
     *     
     */
    public ArrayOfDocument getDocuments() {
        return documents;
    }

    /**
     * Sets the value of the documents property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDocument }
     *     
     */
    public void setDocuments(ArrayOfDocument value) {
        this.documents = value;
    }

    /**
     * Gets the value of the contractsData property.
     * 
     * @return
     *     possible object is
     *     {@link ContractsData }
     *     
     */
    public ContractsData getContractsData() {
        return contractsData;
    }

    /**
     * Sets the value of the contractsData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractsData }
     *     
     */
    public void setContractsData(ContractsData value) {
        this.contractsData = value;
    }

    /**
     * Gets the value of the specialRoles property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSpecialRole }
     *     
     */
    public ArrayOfSpecialRole getSpecialRoles() {
        return specialRoles;
    }

    /**
     * Sets the value of the specialRoles property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSpecialRole }
     *     
     */
    public void setSpecialRoles(ArrayOfSpecialRole value) {
        this.specialRoles = value;
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

}
