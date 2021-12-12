
package com.Aviolinx.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CrewComplementDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CrewComplementDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Filter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Minimum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Maximum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Supplementary" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Order" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CrewComplementDetail", propOrder = {
    "filter",
    "minimum",
    "maximum",
    "supplementary",
    "order"
})
public class CrewComplementDetail {

    @XmlElement(name = "Filter")
    protected String filter;
    @XmlElement(name = "Minimum")
    protected int minimum;
    @XmlElement(name = "Maximum")
    protected int maximum;
    @XmlElement(name = "Supplementary")
    protected int supplementary;
    @XmlElement(name = "Order")
    protected int order;

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilter(String value) {
        this.filter = value;
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
