
package com.Aviolinx.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Crew complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Crew">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Active" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="UniqueId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Code1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Code2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Firstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Middlename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Lastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nickname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Seniority" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Base" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Rank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Qualification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedAt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ModifiedAt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Addresses" type="{http://raido.aviolinx.com/api/}ArrayOfAddress" minOccurs="0"/>
 *         &lt;element name="Phones" type="{http://raido.aviolinx.com/api/}ArrayOfPhone" minOccurs="0"/>
 *         &lt;element name="Emails" type="{http://raido.aviolinx.com/api/}ArrayOfEmail" minOccurs="0"/>
 *         &lt;element name="Documents" type="{http://raido.aviolinx.com/api/}ArrayOfDocument" minOccurs="0"/>
 *         &lt;element name="Bases" type="{http://raido.aviolinx.com/api/}ArrayOfBase" minOccurs="0"/>
 *         &lt;element name="Ranks" type="{http://raido.aviolinx.com/api/}ArrayOfRank" minOccurs="0"/>
 *         &lt;element name="Qualifications" type="{http://raido.aviolinx.com/api/}ArrayOfQualification" minOccurs="0"/>
 *         &lt;element name="SpecialRoles" type="{http://raido.aviolinx.com/api/}ArrayOfSpecialRole" minOccurs="0"/>
 *         &lt;element name="RosterActivities" type="{http://raido.aviolinx.com/api/}ArrayOfRosterActivity" minOccurs="0"/>
 *         &lt;element name="Pairings" type="{http://raido.aviolinx.com/api/}ArrayOfPairing" minOccurs="0"/>
 *         &lt;element name="Contracts" type="{http://raido.aviolinx.com/api/}ArrayOfContract" minOccurs="0"/>
 *         &lt;element name="CrewType" type="{http://raido.aviolinx.com/api/}CrewType" minOccurs="0"/>
 *         &lt;element name="Revision" type="{http://raido.aviolinx.com/api/}Revision" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Crew", propOrder = {
    "active",
    "uniqueId",
    "number",
    "code1",
    "code2",
    "firstname",
    "middlename",
    "lastname",
    "nickname",
    "gender",
    "seniority",
    "base",
    "rank",
    "qualification",
    "type",
    "createdAt",
    "modifiedAt",
    "addresses",
    "phones",
    "emails",
    "documents",
    "bases",
    "ranks",
    "qualifications",
    "specialRoles",
    "rosterActivities",
    "pairings",
    "contracts",
    "crewType",
    "revision"
})
public class Crew {

    @XmlElement(name = "Active")
    protected boolean active;
    @XmlElement(name = "UniqueId")
    protected int uniqueId;
    @XmlElement(name = "Number")
    protected String number;
    @XmlElement(name = "Code1")
    protected String code1;
    @XmlElement(name = "Code2")
    protected String code2;
    @XmlElement(name = "Firstname")
    protected String firstname;
    @XmlElement(name = "Middlename")
    protected String middlename;
    @XmlElement(name = "Lastname")
    protected String lastname;
    @XmlElement(name = "Nickname")
    protected String nickname;
    @XmlElement(name = "Gender")
    protected String gender;
    @XmlElement(name = "Seniority")
    protected int seniority;
    @XmlElement(name = "Base")
    protected String base;
    @XmlElement(name = "Rank")
    protected String rank;
    @XmlElement(name = "Qualification")
    protected String qualification;
    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "CreatedAt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdAt;
    @XmlElement(name = "ModifiedAt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifiedAt;
    @XmlElement(name = "Addresses")
    protected ArrayOfAddress addresses;
    @XmlElement(name = "Phones")
    protected ArrayOfPhone phones;
    @XmlElement(name = "Emails")
    protected ArrayOfEmail emails;
    @XmlElement(name = "Documents")
    protected ArrayOfDocument documents;
    @XmlElement(name = "Bases")
    protected ArrayOfBase bases;
    @XmlElement(name = "Ranks")
    protected ArrayOfRank ranks;
    @XmlElement(name = "Qualifications")
    protected ArrayOfQualification qualifications;
    @XmlElement(name = "SpecialRoles")
    protected ArrayOfSpecialRole specialRoles;
    @XmlElement(name = "RosterActivities")
    protected ArrayOfRosterActivity rosterActivities;
    @XmlElement(name = "Pairings")
    protected ArrayOfPairing pairings;
    @XmlElement(name = "Contracts")
    protected ArrayOfContract contracts;
    @XmlElement(name = "CrewType")
    protected CrewType crewType;
    @XmlElement(name = "Revision")
    protected Revision revision;

    /**
     * Gets the value of the active property.
     * 
     */
    public boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     */
    public void setActive(boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the uniqueId property.
     * 
     */
    public int getUniqueId() {
        return uniqueId;
    }

    /**
     * Sets the value of the uniqueId property.
     * 
     */
    public void setUniqueId(int value) {
        this.uniqueId = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the code1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode1() {
        return code1;
    }

    /**
     * Sets the value of the code1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode1(String value) {
        this.code1 = value;
    }

    /**
     * Gets the value of the code2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode2() {
        return code2;
    }

    /**
     * Sets the value of the code2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode2(String value) {
        this.code2 = value;
    }

    /**
     * Gets the value of the firstname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Sets the value of the firstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstname(String value) {
        this.firstname = value;
    }

    /**
     * Gets the value of the middlename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddlename() {
        return middlename;
    }

    /**
     * Sets the value of the middlename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddlename(String value) {
        this.middlename = value;
    }

    /**
     * Gets the value of the lastname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Sets the value of the lastname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastname(String value) {
        this.lastname = value;
    }

    /**
     * Gets the value of the nickname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * Sets the value of the nickname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNickname(String value) {
        this.nickname = value;
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
     * Gets the value of the seniority property.
     * 
     */
    public int getSeniority() {
        return seniority;
    }

    /**
     * Sets the value of the seniority property.
     * 
     */
    public void setSeniority(int value) {
        this.seniority = value;
    }

    /**
     * Gets the value of the base property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBase() {
        return base;
    }

    /**
     * Sets the value of the base property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBase(String value) {
        this.base = value;
    }

    /**
     * Gets the value of the rank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRank() {
        return rank;
    }

    /**
     * Sets the value of the rank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRank(String value) {
        this.rank = value;
    }

    /**
     * Gets the value of the qualification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualification() {
        return qualification;
    }

    /**
     * Sets the value of the qualification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualification(String value) {
        this.qualification = value;
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
     * Gets the value of the createdAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets the value of the createdAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedAt(XMLGregorianCalendar value) {
        this.createdAt = value;
    }

    /**
     * Gets the value of the modifiedAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModifiedAt() {
        return modifiedAt;
    }

    /**
     * Sets the value of the modifiedAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModifiedAt(XMLGregorianCalendar value) {
        this.modifiedAt = value;
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
     * Gets the value of the ranks property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRank }
     *     
     */
    public ArrayOfRank getRanks() {
        return ranks;
    }

    /**
     * Sets the value of the ranks property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRank }
     *     
     */
    public void setRanks(ArrayOfRank value) {
        this.ranks = value;
    }

    /**
     * Gets the value of the qualifications property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfQualification }
     *     
     */
    public ArrayOfQualification getQualifications() {
        return qualifications;
    }

    /**
     * Sets the value of the qualifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfQualification }
     *     
     */
    public void setQualifications(ArrayOfQualification value) {
        this.qualifications = value;
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
     * Gets the value of the rosterActivities property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRosterActivity }
     *     
     */
    public ArrayOfRosterActivity getRosterActivities() {
        return rosterActivities;
    }

    /**
     * Sets the value of the rosterActivities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRosterActivity }
     *     
     */
    public void setRosterActivities(ArrayOfRosterActivity value) {
        this.rosterActivities = value;
    }

    /**
     * Gets the value of the pairings property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPairing }
     *     
     */
    public ArrayOfPairing getPairings() {
        return pairings;
    }

    /**
     * Sets the value of the pairings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPairing }
     *     
     */
    public void setPairings(ArrayOfPairing value) {
        this.pairings = value;
    }

    /**
     * Gets the value of the contracts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfContract }
     *     
     */
    public ArrayOfContract getContracts() {
        return contracts;
    }

    /**
     * Sets the value of the contracts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfContract }
     *     
     */
    public void setContracts(ArrayOfContract value) {
        this.contracts = value;
    }

    /**
     * Gets the value of the crewType property.
     * 
     * @return
     *     possible object is
     *     {@link CrewType }
     *     
     */
    public CrewType getCrewType() {
        return crewType;
    }

    /**
     * Sets the value of the crewType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrewType }
     *     
     */
    public void setCrewType(CrewType value) {
        this.crewType = value;
    }

    /**
     * Gets the value of the revision property.
     * 
     * @return
     *     possible object is
     *     {@link Revision }
     *     
     */
    public Revision getRevision() {
        return revision;
    }

    /**
     * Sets the value of the revision property.
     * 
     * @param value
     *     allowed object is
     *     {@link Revision }
     *     
     */
    public void setRevision(Revision value) {
        this.revision = value;
    }

}
