
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
 *         &lt;element name="RosterRequestFilter" type="{http://raido.aviolinx.com/api/}RosterRequestFilter"/>
 *         &lt;element name="RosterRequestData" type="{http://raido.aviolinx.com/api/}RosterRequestData"/>
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
    "rosterRequestFilter",
    "rosterRequestData"
})
@XmlRootElement(name = "GetRosters")
public class GetRosters {

    @XmlElement(name = "Username", required = true, nillable = true)
    protected String username;
    @XmlElement(name = "Password", required = true, nillable = true)
    protected String password;
    @XmlElement(name = "RosterRequestFilter", required = true, nillable = true)
    protected RosterRequestFilter rosterRequestFilter;
    @XmlElement(name = "RosterRequestData", required = true, nillable = true)
    protected RosterRequestData rosterRequestData;

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
     * Gets the value of the rosterRequestFilter property.
     * 
     * @return
     *     possible object is
     *     {@link RosterRequestFilter }
     *     
     */
    public RosterRequestFilter getRosterRequestFilter() {
        return rosterRequestFilter;
    }

    /**
     * Sets the value of the rosterRequestFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link RosterRequestFilter }
     *     
     */
    public void setRosterRequestFilter(RosterRequestFilter value) {
        this.rosterRequestFilter = value;
    }

    /**
     * Gets the value of the rosterRequestData property.
     * 
     * @return
     *     possible object is
     *     {@link RosterRequestData }
     *     
     */
    public RosterRequestData getRosterRequestData() {
        return rosterRequestData;
    }

    /**
     * Sets the value of the rosterRequestData property.
     * 
     * @param value
     *     allowed object is
     *     {@link RosterRequestData }
     *     
     */
    public void setRosterRequestData(RosterRequestData value) {
        this.rosterRequestData = value;
    }

}
