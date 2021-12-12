
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
 *         &lt;element name="SetCrewRevisionResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "setCrewRevisionResult"
})
@XmlRootElement(name = "SetCrewRevisionResponse")
public class SetCrewRevisionResponse {

    @XmlElement(name = "SetCrewRevisionResult")
    protected boolean setCrewRevisionResult;

    /**
     * Gets the value of the setCrewRevisionResult property.
     * 
     */
    public boolean isSetCrewRevisionResult() {
        return setCrewRevisionResult;
    }

    /**
     * Sets the value of the setCrewRevisionResult property.
     * 
     */
    public void setSetCrewRevisionResult(boolean value) {
        this.setCrewRevisionResult = value;
    }

}
