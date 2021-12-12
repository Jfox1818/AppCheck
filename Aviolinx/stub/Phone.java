
package com.Aviolinx.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Phone complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Phone">
 *   &lt;complexContent>
 *     &lt;extension base="{http://raido.aviolinx.com/api/}StandardContactField">
 *       &lt;sequence>
 *         &lt;element name="CountryPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegionPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Phone", propOrder = {
    "countryPrefix",
    "regionPrefix",
    "phoneNumber"
})
public class Phone
    extends StandardContactField
{

    @XmlElement(name = "CountryPrefix")
    protected String countryPrefix;
    @XmlElement(name = "RegionPrefix")
    protected String regionPrefix;
    @XmlElement(name = "PhoneNumber")
    protected String phoneNumber;

    /**
     * Gets the value of the countryPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryPrefix() {
        return countryPrefix;
    }

    /**
     * Sets the value of the countryPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryPrefix(String value) {
        this.countryPrefix = value;
    }

    /**
     * Gets the value of the regionPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionPrefix() {
        return regionPrefix;
    }

    /**
     * Sets the value of the regionPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionPrefix(String value) {
        this.regionPrefix = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

}
