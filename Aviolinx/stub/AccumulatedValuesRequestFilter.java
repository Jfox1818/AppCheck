
package com.Aviolinx.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccumulatedValuesRequestFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccumulatedValuesRequestFilter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://raido.aviolinx.com/api/}DateRangeBasicRequestFilter">
 *       &lt;sequence>
 *         &lt;element name="RemoveEmpty" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccumulatedValuesRequestFilter", propOrder = {
    "removeEmpty"
})
public class AccumulatedValuesRequestFilter
    extends DateRangeBasicRequestFilter
{

    @XmlElement(name = "RemoveEmpty")
    protected boolean removeEmpty;

    /**
     * Gets the value of the removeEmpty property.
     * 
     */
    public boolean isRemoveEmpty() {
        return removeEmpty;
    }

    /**
     * Sets the value of the removeEmpty property.
     * 
     */
    public void setRemoveEmpty(boolean value) {
        this.removeEmpty = value;
    }

}
