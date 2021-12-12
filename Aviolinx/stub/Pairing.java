
package com.Aviolinx.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Pairing complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Pairing">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UniqueId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Start" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="End" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Base" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartBaseTimeDiff" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EndBaseTimeDiff" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Complement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Qualification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PairingClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Credit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PairingActivities" type="{http://raido.aviolinx.com/api/}ArrayOfPairingActivity" minOccurs="0"/>
 *         &lt;element name="AssignedCrews" type="{http://raido.aviolinx.com/api/}ArrayOfAssignedCrew" minOccurs="0"/>
 *         &lt;element name="ComplementDescriptions" type="{http://raido.aviolinx.com/api/}ArrayOfComplementDescription" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Pairing", propOrder = {
    "uniqueId",
    "name",
    "start",
    "end",
    "base",
    "startBaseTimeDiff",
    "endBaseTimeDiff",
    "complement",
    "qualification",
    "pairingClass",
    "credit",
    "pairingActivities",
    "assignedCrews",
    "complementDescriptions"
})
public class Pairing {

    @XmlElement(name = "UniqueId")
    protected int uniqueId;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Start", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar start;
    @XmlElement(name = "End", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar end;
    @XmlElement(name = "Base")
    protected String base;
    @XmlElement(name = "StartBaseTimeDiff")
    protected int startBaseTimeDiff;
    @XmlElement(name = "EndBaseTimeDiff")
    protected int endBaseTimeDiff;
    @XmlElement(name = "Complement")
    protected String complement;
    @XmlElement(name = "Qualification")
    protected String qualification;
    @XmlElement(name = "PairingClass")
    protected String pairingClass;
    @XmlElement(name = "Credit")
    protected int credit;
    @XmlElement(name = "PairingActivities")
    protected ArrayOfPairingActivity pairingActivities;
    @XmlElement(name = "AssignedCrews")
    protected ArrayOfAssignedCrew assignedCrews;
    @XmlElement(name = "ComplementDescriptions")
    protected ArrayOfComplementDescription complementDescriptions;

    /**
     * Gets the value of the uniqueId property.
     * 
     */
    public int getUniqueId() {
        return uniqueId;
    }

    /**
     * Sets the value of the uniqueId property.
     * 
     */
    public void setUniqueId(int value) {
        this.uniqueId = value;
    }

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
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStart(XMLGregorianCalendar value) {
        this.start = value;
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEnd() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEnd(XMLGregorianCalendar value) {
        this.end = value;
    }

    /**
     * Gets the value of the base property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBase() {
        return base;
    }

    /**
     * Sets the value of the base property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBase(String value) {
        this.base = value;
    }

    /**
     * Gets the value of the startBaseTimeDiff property.
     * 
     */
    public int getStartBaseTimeDiff() {
        return startBaseTimeDiff;
    }

    /**
     * Sets the value of the startBaseTimeDiff property.
     * 
     */
    public void setStartBaseTimeDiff(int value) {
        this.startBaseTimeDiff = value;
    }

    /**
     * Gets the value of the endBaseTimeDiff property.
     * 
     */
    public int getEndBaseTimeDiff() {
        return endBaseTimeDiff;
    }

    /**
     * Sets the value of the endBaseTimeDiff property.
     * 
     */
    public void setEndBaseTimeDiff(int value) {
        this.endBaseTimeDiff = value;
    }

    /**
     * Gets the value of the complement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplement() {
        return complement;
    }

    /**
     * Sets the value of the complement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplement(String value) {
        this.complement = value;
    }

    /**
     * Gets the value of the qualification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualification() {
        return qualification;
    }

    /**
     * Sets the value of the qualification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualification(String value) {
        this.qualification = value;
    }

    /**
     * Gets the value of the pairingClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPairingClass() {
        return pairingClass;
    }

    /**
     * Sets the value of the pairingClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPairingClass(String value) {
        this.pairingClass = value;
    }

    /**
     * Gets the value of the credit property.
     * 
     */
    public int getCredit() {
        return credit;
    }

    /**
     * Sets the value of the credit property.
     * 
     */
    public void setCredit(int value) {
        this.credit = value;
    }

    /**
     * Gets the value of the pairingActivities property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPairingActivity }
     *     
     */
    public ArrayOfPairingActivity getPairingActivities() {
        return pairingActivities;
    }

    /**
     * Sets the value of the pairingActivities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPairingActivity }
     *     
     */
    public void setPairingActivities(ArrayOfPairingActivity value) {
        this.pairingActivities = value;
    }

    /**
     * Gets the value of the assignedCrews property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAssignedCrew }
     *     
     */
    public ArrayOfAssignedCrew getAssignedCrews() {
        return assignedCrews;
    }

    /**
     * Sets the value of the assignedCrews property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAssignedCrew }
     *     
     */
    public void setAssignedCrews(ArrayOfAssignedCrew value) {
        this.assignedCrews = value;
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
