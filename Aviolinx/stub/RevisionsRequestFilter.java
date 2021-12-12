
package com.Aviolinx.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RevisionsRequestFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RevisionsRequestFilter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://raido.aviolinx.com/api/}BasicRequestFilter">
 *       &lt;sequence>
 *         &lt;element name="CrewNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RevisionsRequestFilter", propOrder = {
    "crewNumber"
})
public class RevisionsRequestFilter
    extends BasicRequestFilter
{

    @XmlElement(name = "CrewNumber")
    protected String crewNumber;

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

}
