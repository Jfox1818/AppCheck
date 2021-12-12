
package com.Aviolinx.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MinimumEquipment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MinimumEquipment">
 *   &lt;complexContent>
 *     &lt;extension base="{http://raido.aviolinx.com/api/}Period">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Condition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValidHours" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ValidCycles" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ExternalReferenceId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Deleted" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MinimumEquipment", propOrder = {
    "name",
    "condition",
    "category",
    "comment",
    "validHours",
    "validCycles",
    "externalReferenceId"
})
public class MinimumEquipment
    extends Period
{

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Condition")
    protected String condition;
    @XmlElement(name = "Category")
    protected String category;
    @XmlElement(name = "Comment")
    protected String comment;
    @XmlElement(name = "ValidHours")
    protected int validHours;
    @XmlElement(name = "ValidCycles")
    protected int validCycles;
    @XmlElement(name = "ExternalReferenceId")
    protected int externalReferenceId;
    @XmlAttribute(name = "Deleted", required = true)
    protected boolean deleted;

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
     * Gets the value of the condition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondition() {
        return condition;
    }

    /**
     * Sets the value of the condition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondition(String value) {
        this.condition = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
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
     * Gets the value of the validHours property.
     * 
     */
    public int getValidHours() {
        return validHours;
    }

    /**
     * Sets the value of the validHours property.
     * 
     */
    public void setValidHours(int value) {
        this.validHours = value;
    }

    /**
     * Gets the value of the validCycles property.
     * 
     */
    public int getValidCycles() {
        return validCycles;
    }

    /**
     * Sets the value of the validCycles property.
     * 
     */
    public void setValidCycles(int value) {
        this.validCycles = value;
    }

    /**
     * Gets the value of the externalReferenceId property.
     * 
     */
    public int getExternalReferenceId() {
        return externalReferenceId;
    }

    /**
     * Sets the value of the externalReferenceId property.
     * 
     */
    public void setExternalReferenceId(int value) {
        this.externalReferenceId = value;
    }

    /**
     * Gets the value of the deleted property.
     * 
     */
    public boolean isDeleted() {
        return deleted;
    }

    /**
     * Sets the value of the deleted property.
     * 
     */
    public void setDeleted(boolean value) {
        this.deleted = value;
    }

}
