
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
 *         &lt;element name="SetRosterDataResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "setRosterDataResult"
})
@XmlRootElement(name = "SetRosterDataResponse")
public class SetRosterDataResponse {

    @XmlElement(name = "SetRosterDataResult")
    protected boolean setRosterDataResult;

    /**
     * Gets the value of the setRosterDataResult property.
     * 
     */
    public boolean isSetRosterDataResult() {
        return setRosterDataResult;
    }

    /**
     * Sets the value of the setRosterDataResult property.
     * 
     */
    public void setSetRosterDataResult(boolean value) {
        this.setRosterDataResult = value;
    }

}
