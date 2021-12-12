
package com.Aviolinx.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for ComplementDescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComplementDescription">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="Minimum" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="Maximum" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="Supplementary" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="Order" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComplementDescription", propOrder = {
    "value"
})
public class ComplementDescription {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "Minimum", required = true)
    protected int minimum;
    @XmlAttribute(name = "Maximum", required = true)
    protected int maximum;
    @XmlAttribute(name = "Supplementary", required = true)
    protected int supplementary;
    @XmlAttribute(name = "Order", required = true)
    protected int order;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the minimum property.
     * 
     */
    public int getMinimum() {
        return minimum;
    }

    /**
     * Sets the value of the minimum property.
     * 
     */
    public void setMinimum(int value) {
        this.minimum = value;
    }

    /**
     * Gets the value of the maximum property.
     * 
     */
    public int getMaximum() {
        return maximum;
    }

    /**
     * Sets the value of the maximum property.
     * 
     */
    public void setMaximum(int value) {
        this.maximum = value;
    }

    /**
     * Gets the value of the supplementary property.
     * 
     */
    public int getSupplementary() {
        return supplementary;
    }

    /**
     * Sets the value of the supplementary property.
     * 
     */
    public void setSupplementary(int value) {
        this.supplementary = value;
    }

    /**
     * Gets the value of the order property.
     * 
     */
    public int getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     */
    public void setOrder(int value) {
        this.order = value;
    }

}
