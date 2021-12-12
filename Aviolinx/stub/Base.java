
package com.Aviolinx.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Base complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Base">
 *   &lt;complexContent>
 *     &lt;extension base="{http://raido.aviolinx.com/api/}Period">
 *       &lt;attribute name="Percentage" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Base")
public class Base
    extends Period
{

    @XmlAttribute(name = "Percentage", required = true)
    protected int percentage;

    /**
     * Gets the value of the percentage property.
     * 
     */
    public int getPercentage() {
        return percentage;
    }

    /**
     * Sets the value of the percentage property.
     * 
     */
    public void setPercentage(int value) {
        this.percentage = value;
    }

}
