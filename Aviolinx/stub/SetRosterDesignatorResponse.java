
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
 *         &lt;element name="SetRosterDesignatorResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "setRosterDesignatorResult"
})
@XmlRootElement(name = "SetRosterDesignatorResponse")
public class SetRosterDesignatorResponse {

    @XmlElement(name = "SetRosterDesignatorResult")
    protected boolean setRosterDesignatorResult;

    /**
     * Gets the value of the setRosterDesignatorResult property.
     * 
     */
    public boolean isSetRosterDesignatorResult() {
        return setRosterDesignatorResult;
    }

    /**
     * Sets the value of the setRosterDesignatorResult property.
     * 
     */
    public void setSetRosterDesignatorResult(boolean value) {
        this.setRosterDesignatorResult = value;
    }

}
