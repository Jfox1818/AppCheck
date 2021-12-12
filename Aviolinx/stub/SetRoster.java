
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
 *         &lt;element name="CrewNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RosterActivities" type="{http://raido.aviolinx.com/api/}ArrayOfRosterActivity" minOccurs="0"/>
 *         &lt;element name="Pairings" type="{http://raido.aviolinx.com/api/}ArrayOfPairing" minOccurs="0"/>
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
    "crewNumber",
    "rosterActivities",
    "pairings"
})
@XmlRootElement(name = "SetRoster")
public class SetRoster {

    @XmlElement(name = "Username", required = true, nillable = true)
    protected String username;
    @XmlElement(name = "Password", required = true, nillable = true)
    protected String password;
    @XmlElement(name = "CrewNumber", required = true, nillable = true)
    protected String crewNumber;
    @XmlElement(name = "RosterActivities")
    protected ArrayOfRosterActivity rosterActivities;
    @XmlElement(name = "Pairings")
    protected ArrayOfPairing pairings;

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
     * Gets the value of the crewNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrewNumber() {
        return crewNumber;
    }

    /**
     * Sets the value of the crewNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrewNumber(String value) {
        this.crewNumber = value;
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

}
