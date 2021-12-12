
package com.Aviolinx.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PairingRequestData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PairingRequestData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PairingDetails" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AssignedCrew" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Times" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PairingRequestData", propOrder = {
    "pairingDetails",
    "assignedCrew",
    "times"
})
public class PairingRequestData {

    @XmlElement(name = "PairingDetails")
    protected boolean pairingDetails;
    @XmlElement(name = "AssignedCrew")
    protected boolean assignedCrew;
    @XmlElement(name = "Times")
    protected boolean times;

    /**
     * Gets the value of the pairingDetails property.
     * 
     */
    public boolean isPairingDetails() {
        return pairingDetails;
    }

    /**
     * Sets the value of the pairingDetails property.
     * 
     */
    public void setPairingDetails(boolean value) {
        this.pairingDetails = value;
    }

    /**
     * Gets the value of the assignedCrew property.
     * 
     */
    public boolean isAssignedCrew() {
        return assignedCrew;
    }

    /**
     * Sets the value of the assignedCrew property.
     * 
     */
    public void setAssignedCrew(boolean value) {
        this.assignedCrew = value;
    }

    /**
     * Gets the value of the times property.
     * 
     */
    public boolean isTimes() {
        return times;
    }

    /**
     * Sets the value of the times property.
     * 
     */
    public void setTimes(boolean value) {
        this.times = value;
    }

}
