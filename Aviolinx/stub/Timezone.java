
package com.Aviolinx.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Timezone complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Timezone">
 *   &lt;complexContent>
 *     &lt;extension base="{http://raido.aviolinx.com/api/}Period">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Info" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TimeChanges" type="{http://raido.aviolinx.com/api/}ArrayOfTimeChange" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Timezone", propOrder = {
    "name",
    "info",
    "timeChanges"
})
public class Timezone
    extends Period
{

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Info")
    protected String info;
    @XmlElement(name = "TimeChanges")
    protected ArrayOfTimeChange timeChanges;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the info property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfo() {
        return info;
    }

    /**
     * Sets the value of the info property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfo(String value) {
        this.info = value;
    }

    /**
     * Gets the value of the timeChanges property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTimeChange }
     *     
     */
    public ArrayOfTimeChange getTimeChanges() {
        return timeChanges;
    }

    /**
     * Sets the value of the timeChanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTimeChange }
     *     
     */
    public void setTimeChanges(ArrayOfTimeChange value) {
        this.timeChanges = value;
    }

}
