
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
 *         &lt;element name="AccumulatedValuesRequestFilter" type="{http://raido.aviolinx.com/api/}AccumulatedValuesRequestFilter"/>
 *         &lt;element name="AccumulatedValuesRequestData" type="{http://raido.aviolinx.com/api/}AccumulatedValuesRequestData"/>
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
    "accumulatedValuesRequestFilter",
    "accumulatedValuesRequestData"
})
@XmlRootElement(name = "GetAccumulatedValues")
public class GetAccumulatedValues {

    @XmlElement(name = "Username", required = true, nillable = true)
    protected String username;
    @XmlElement(name = "Password", required = true, nillable = true)
    protected String password;
    @XmlElement(name = "AccumulatedValuesRequestFilter", required = true, nillable = true)
    protected AccumulatedValuesRequestFilter accumulatedValuesRequestFilter;
    @XmlElement(name = "AccumulatedValuesRequestData", required = true, nillable = true)
    protected AccumulatedValuesRequestData accumulatedValuesRequestData;

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
     * Gets the value of the accumulatedValuesRequestFilter property.
     * 
     * @return
     *     possible object is
     *     {@link AccumulatedValuesRequestFilter }
     *     
     */
    public AccumulatedValuesRequestFilter getAccumulatedValuesRequestFilter() {
        return accumulatedValuesRequestFilter;
    }

    /**
     * Sets the value of the accumulatedValuesRequestFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccumulatedValuesRequestFilter }
     *     
     */
    public void setAccumulatedValuesRequestFilter(AccumulatedValuesRequestFilter value) {
        this.accumulatedValuesRequestFilter = value;
    }

    /**
     * Gets the value of the accumulatedValuesRequestData property.
     * 
     * @return
     *     possible object is
     *     {@link AccumulatedValuesRequestData }
     *     
     */
    public AccumulatedValuesRequestData getAccumulatedValuesRequestData() {
        return accumulatedValuesRequestData;
    }

    /**
     * Sets the value of the accumulatedValuesRequestData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccumulatedValuesRequestData }
     *     
     */
    public void setAccumulatedValuesRequestData(AccumulatedValuesRequestData value) {
        this.accumulatedValuesRequestData = value;
    }

}
