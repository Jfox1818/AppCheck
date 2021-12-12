
package com.Aviolinx.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PairingActivity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PairingActivity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://raido.aviolinx.com/api/}ActivityBase">
 *       &lt;sequence>
 *         &lt;element name="Times" type="{http://raido.aviolinx.com/api/}ArrayOfTime" minOccurs="0"/>
 *         &lt;element name="ComplementDescriptions" type="{http://raido.aviolinx.com/api/}ArrayOfComplementDescription" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PairingActivity", propOrder = {
    "times",
    "complementDescriptions"
})
public class PairingActivity
    extends ActivityBase
{

    @XmlElement(name = "Times")
    protected ArrayOfTime times;
    @XmlElement(name = "ComplementDescriptions")
    protected ArrayOfComplementDescription complementDescriptions;

    /**
     * Gets the value of the times property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTime }
     *     
     */
    public ArrayOfTime getTimes() {
        return times;
    }

    /**
     * Sets the value of the times property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTime }
     *     
     */
    public void setTimes(ArrayOfTime value) {
        this.times = value;
    }

    /**
     * Gets the value of the complementDescriptions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfComplementDescription }
     *     
     */
    public ArrayOfComplementDescription getComplementDescriptions() {
        return complementDescriptions;
    }

    /**
     * Sets the value of the complementDescriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfComplementDescription }
     *     
     */
    public void setComplementDescriptions(ArrayOfComplementDescription value) {
        this.complementDescriptions = value;
    }

}
