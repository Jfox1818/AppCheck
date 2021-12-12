
package com.Aviolinx.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CrewRequestData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CrewRequestData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Addresses" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Phones" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Emails" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Documents" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Bases" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Ranks" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Qualifications" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SpecialRoles" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Contracts" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CrewType" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CrewRequestData", propOrder = {
    "addresses",
    "phones",
    "emails",
    "documents",
    "bases",
    "ranks",
    "qualifications",
    "specialRoles",
    "contracts",
    "crewType"
})
public class CrewRequestData {

    @XmlElement(name = "Addresses")
    protected boolean addresses;
    @XmlElement(name = "Phones")
    protected boolean phones;
    @XmlElement(name = "Emails")
    protected boolean emails;
    @XmlElement(name = "Documents")
    protected boolean documents;
    @XmlElement(name = "Bases")
    protected boolean bases;
    @XmlElement(name = "Ranks")
    protected boolean ranks;
    @XmlElement(name = "Qualifications")
    protected boolean qualifications;
    @XmlElement(name = "SpecialRoles")
    protected boolean specialRoles;
    @XmlElement(name = "Contracts")
    protected boolean contracts;
    @XmlElement(name = "CrewType")
    protected boolean crewType;

    /**
     * Gets the value of the addresses property.
     * 
     */
    public boolean isAddresses() {
        return addresses;
    }

    /**
     * Sets the value of the addresses property.
     * 
     */
    public void setAddresses(boolean value) {
        this.addresses = value;
    }

    /**
     * Gets the value of the phones property.
     * 
     */
    public boolean isPhones() {
        return phones;
    }

    /**
     * Sets the value of the phones property.
     * 
     */
    public void setPhones(boolean value) {
        this.phones = value;
    }

    /**
     * Gets the value of the emails property.
     * 
     */
    public boolean isEmails() {
        return emails;
    }

    /**
     * Sets the value of the emails property.
     * 
     */
    public void setEmails(boolean value) {
        this.emails = value;
    }

    /**
     * Gets the value of the documents property.
     * 
     */
    public boolean isDocuments() {
        return documents;
    }

    /**
     * Sets the value of the documents property.
     * 
     */
    public void setDocuments(boolean value) {
        this.documents = value;
    }

    /**
     * Gets the value of the bases property.
     * 
     */
    public boolean isBases() {
        return bases;
    }

    /**
     * Sets the value of the bases property.
     * 
     */
    public void setBases(boolean value) {
        this.bases = value;
    }

    /**
     * Gets the value of the ranks property.
     * 
     */
    public boolean isRanks() {
        return ranks;
    }

    /**
     * Sets the value of the ranks property.
     * 
     */
    public void setRanks(boolean value) {
        this.ranks = value;
    }

    /**
     * Gets the value of the qualifications property.
     * 
     */
    public boolean isQualifications() {
        return qualifications;
    }

    /**
     * Sets the value of the qualifications property.
     * 
     */
    public void setQualifications(boolean value) {
        this.qualifications = value;
    }

    /**
     * Gets the value of the specialRoles property.
     * 
     */
    public boolean isSpecialRoles() {
        return specialRoles;
    }

    /**
     * Sets the value of the specialRoles property.
     * 
     */
    public void setSpecialRoles(boolean value) {
        this.specialRoles = value;
    }

    /**
     * Gets the value of the contracts property.
     * 
     */
    public boolean isContracts() {
        return contracts;
    }

    /**
     * Sets the value of the contracts property.
     * 
     */
    public void setContracts(boolean value) {
        this.contracts = value;
    }

    /**
     * Gets the value of the crewType property.
     * 
     */
    public boolean isCrewType() {
        return crewType;
    }

    /**
     * Sets the value of the crewType property.
     * 
     */
    public void setCrewType(boolean value) {
        this.crewType = value;
    }

}
