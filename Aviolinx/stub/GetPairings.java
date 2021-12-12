
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
 *         &lt;element name="PairingRequestFilter" type="{http://raido.aviolinx.com/api/}PairingRequestFilter"/>
 *         &lt;element name="PairingRequestData" type="{http://raido.aviolinx.com/api/}PairingRequestData"/>
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
    "pairingRequestFilter",
    "pairingRequestData"
})
@XmlRootElement(name = "GetPairings")
public class GetPairings {

    @XmlElement(name = "Username", required = true, nillable = true)
    protected String username;
    @XmlElement(name = "Password", required = true, nillable = true)
    protected String password;
    @XmlElement(name = "PairingRequestFilter", required = true, nillable = true)
    protected PairingRequestFilter pairingRequestFilter;
    @XmlElement(name = "PairingRequestData", required = true, nillable = true)
    protected PairingRequestData pairingRequestData;

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
     * Gets the value of the pairingRequestFilter property.
     * 
     * @return
     *     possible object is
     *     {@link PairingRequestFilter }
     *     
     */
    public PairingRequestFilter getPairingRequestFilter() {
        return pairingRequestFilter;
    }

    /**
     * Sets the value of the pairingRequestFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link PairingRequestFilter }
     *     
     */
    public void setPairingRequestFilter(PairingRequestFilter value) {
        this.pairingRequestFilter = value;
    }

    /**
     * Gets the value of the pairingRequestData property.
     * 
     * @return
     *     possible object is
     *     {@link PairingRequestData }
     *     
     */
    public PairingRequestData getPairingRequestData() {
        return pairingRequestData;
    }

    /**
     * Sets the value of the pairingRequestData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PairingRequestData }
     *     
     */
    public void setPairingRequestData(PairingRequestData value) {
        this.pairingRequestData = value;
    }

}
