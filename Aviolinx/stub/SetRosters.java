
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
 *         &lt;element name="SetRostersFilter" type="{http://raido.aviolinx.com/api/}SetRostersFilter"/>
 *         &lt;element name="Crews" type="{http://raido.aviolinx.com/api/}ArrayOfCrew" minOccurs="0"/>
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
    "setRostersFilter",
    "crews"
})
@XmlRootElement(name = "SetRosters")
public class SetRosters {

    @XmlElement(name = "Username", required = true, nillable = true)
    protected String username;
    @XmlElement(name = "Password", required = true, nillable = true)
    protected String password;
    @XmlElement(name = "SetRostersFilter", required = true, nillable = true)
    protected SetRostersFilter setRostersFilter;
    @XmlElement(name = "Crews")
    protected ArrayOfCrew crews;

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
     * Gets the value of the setRostersFilter property.
     * 
     * @return
     *     possible object is
     *     {@link SetRostersFilter }
     *     
     */
    public SetRostersFilter getSetRostersFilter() {
        return setRostersFilter;
    }

    /**
     * Sets the value of the setRostersFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetRostersFilter }
     *     
     */
    public void setSetRostersFilter(SetRostersFilter value) {
        this.setRostersFilter = value;
    }

    /**
     * Gets the value of the crews property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCrew }
     *     
     */
    public ArrayOfCrew getCrews() {
        return crews;
    }

    /**
     * Sets the value of the crews property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCrew }
     *     
     */
    public void setCrews(ArrayOfCrew value) {
        this.crews = value;
    }

}
