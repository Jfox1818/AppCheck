
package com.Aviolinx.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VoyageReport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VoyageReport">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ArrivalPilot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeparturePilot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Landings" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Delays" type="{http://raido.aviolinx.com/api/}Delays" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VoyageReport", propOrder = {
    "arrivalPilot",
    "departurePilot",
    "landings",
    "delays"
})
public class VoyageReport {

    @XmlElement(name = "ArrivalPilot")
    protected String arrivalPilot;
    @XmlElement(name = "DeparturePilot")
    protected String departurePilot;
    @XmlElement(name = "Landings")
    protected int landings;
    @XmlElement(name = "Delays")
    protected Delays delays;

    /**
     * Gets the value of the arrivalPilot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalPilot() {
        return arrivalPilot;
    }

    /**
     * Sets the value of the arrivalPilot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalPilot(String value) {
        this.arrivalPilot = value;
    }

    /**
     * Gets the value of the departurePilot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeparturePilot() {
        return departurePilot;
    }

    /**
     * Sets the value of the departurePilot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeparturePilot(String value) {
        this.departurePilot = value;
    }

    /**
     * Gets the value of the landings property.
     * 
     */
    public int getLandings() {
        return landings;
    }

    /**
     * Sets the value of the landings property.
     * 
     */
    public void setLandings(int value) {
        this.landings = value;
    }

    /**
     * Gets the value of the delays property.
     * 
     * @return
     *     possible object is
     *     {@link Delays }
     *     
     */
    public Delays getDelays() {
        return delays;
    }

    /**
     * Sets the value of the delays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Delays }
     *     
     */
    public void setDelays(Delays value) {
        this.delays = value;
    }

}
