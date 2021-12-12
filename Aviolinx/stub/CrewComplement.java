
package com.Aviolinx.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CrewComplement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CrewComplement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShortCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Training" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Flight" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Details" type="{http://raido.aviolinx.com/api/}ArrayOfCrewComplementDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CrewComplement", propOrder = {
    "name",
    "shortCode",
    "comment",
    "training",
    "flight",
    "details"
})
public class CrewComplement {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "ShortCode")
    protected String shortCode;
    @XmlElement(name = "Comment")
    protected String comment;
    @XmlElement(name = "Training")
    protected boolean training;
    @XmlElement(name = "Flight")
    protected boolean flight;
    @XmlElement(name = "Details")
    protected ArrayOfCrewComplementDetail details;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the shortCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortCode() {
        return shortCode;
    }

    /**
     * Sets the value of the shortCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortCode(String value) {
        this.shortCode = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the training property.
     * 
     */
    public boolean isTraining() {
        return training;
    }

    /**
     * Sets the value of the training property.
     * 
     */
    public void setTraining(boolean value) {
        this.training = value;
    }

    /**
     * Gets the value of the flight property.
     * 
     */
    public boolean isFlight() {
        return flight;
    }

    /**
     * Sets the value of the flight property.
     * 
     */
    public void setFlight(boolean value) {
        this.flight = value;
    }

    /**
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCrewComplementDetail }
     *     
     */
    public ArrayOfCrewComplementDetail getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCrewComplementDetail }
     *     
     */
    public void setDetails(ArrayOfCrewComplementDetail value) {
        this.details = value;
    }

}
