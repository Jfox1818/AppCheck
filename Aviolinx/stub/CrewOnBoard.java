
package com.Aviolinx.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CrewOnBoard complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CrewOnBoard">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AssignedRank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RosterDesignator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LegalException" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Crew" type="{http://raido.aviolinx.com/api/}Crew" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CrewOnBoard", propOrder = {
    "assignedRank",
    "rosterDesignator",
    "legalException",
    "crew"
})
public class CrewOnBoard {

    @XmlElement(name = "AssignedRank")
    protected String assignedRank;
    @XmlElement(name = "RosterDesignator")
    protected String rosterDesignator;
    @XmlElement(name = "LegalException")
    protected String legalException;
    @XmlElement(name = "Crew")
    protected Crew crew;

    /**
     * Gets the value of the assignedRank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignedRank() {
        return assignedRank;
    }

    /**
     * Sets the value of the assignedRank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignedRank(String value) {
        this.assignedRank = value;
    }

    /**
     * Gets the value of the rosterDesignator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRosterDesignator() {
        return rosterDesignator;
    }

    /**
     * Sets the value of the rosterDesignator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRosterDesignator(String value) {
        this.rosterDesignator = value;
    }

    /**
     * Gets the value of the legalException property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalException() {
        return legalException;
    }

    /**
     * Sets the value of the legalException property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalException(String value) {
        this.legalException = value;
    }

    /**
     * Gets the value of the crew property.
     * 
     * @return
     *     possible object is
     *     {@link Crew }
     *     
     */
    public Crew getCrew() {
        return crew;
    }

    /**
     * Sets the value of the crew property.
     * 
     * @param value
     *     allowed object is
     *     {@link Crew }
     *     
     */
    public void setCrew(Crew value) {
        this.crew = value;
    }

}
