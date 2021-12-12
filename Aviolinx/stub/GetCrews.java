
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
 *         &lt;element name="CrewRequestFilter" type="{http://raido.aviolinx.com/api/}CrewRequestFilter"/>
 *         &lt;element name="CrewRequestData" type="{http://raido.aviolinx.com/api/}CrewRequestData"/>
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
    "crewRequestFilter",
    "crewRequestData"
})
@XmlRootElement(name = "GetCrews")
public class GetCrews {

    @XmlElement(name = "Username", required = true, nillable = true)
    protected String username;
    @XmlElement(name = "Password", required = true, nillable = true)
    protected String password;
    @XmlElement(name = "CrewRequestFilter", required = true, nillable = true)
    protected CrewRequestFilter crewRequestFilter;
    @XmlElement(name = "CrewRequestData", required = true, nillable = true)
    protected CrewRequestData crewRequestData;

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
     * Gets the value of the crewRequestFilter property.
     * 
     * @return
     *     possible object is
     *     {@link CrewRequestFilter }
     *     
     */
    public CrewRequestFilter getCrewRequestFilter() {
        return crewRequestFilter;
    }

    /**
     * Sets the value of the crewRequestFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrewRequestFilter }
     *     
     */
    public void setCrewRequestFilter(CrewRequestFilter value) {
        this.crewRequestFilter = value;
    }

    /**
     * Gets the value of the crewRequestData property.
     * 
     * @return
     *     possible object is
     *     {@link CrewRequestData }
     *     
     */
    public CrewRequestData getCrewRequestData() {
        return crewRequestData;
    }

    /**
     * Sets the value of the crewRequestData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrewRequestData }
     *     
     */
    public void setCrewRequestData(CrewRequestData value) {
        this.crewRequestData = value;
    }

}
