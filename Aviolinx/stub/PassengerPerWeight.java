
package com.Aviolinx.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PassengerPerWeight complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PassengerPerWeight">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Adults" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Males" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Females" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Children" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Infants" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerPerWeight", propOrder = {
    "adults",
    "males",
    "females",
    "children",
    "infants"
})
public class PassengerPerWeight {

    @XmlElement(name = "Adults", required = true, type = Integer.class, nillable = true)
    protected Integer adults;
    @XmlElement(name = "Males", required = true, type = Integer.class, nillable = true)
    protected Integer males;
    @XmlElement(name = "Females", required = true, type = Integer.class, nillable = true)
    protected Integer females;
    @XmlElement(name = "Children", required = true, type = Integer.class, nillable = true)
    protected Integer children;
    @XmlElement(name = "Infants", required = true, type = Integer.class, nillable = true)
    protected Integer infants;

    /**
     * Gets the value of the adults property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAdults() {
        return adults;
    }

    /**
     * Sets the value of the adults property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAdults(Integer value) {
        this.adults = value;
    }

    /**
     * Gets the value of the males property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMales() {
        return males;
    }

    /**
     * Sets the value of the males property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMales(Integer value) {
        this.males = value;
    }

    /**
     * Gets the value of the females property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFemales() {
        return females;
    }

    /**
     * Sets the value of the females property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFemales(Integer value) {
        this.females = value;
    }

    /**
     * Gets the value of the children property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getChildren() {
        return children;
    }

    /**
     * Sets the value of the children property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setChildren(Integer value) {
        this.children = value;
    }

    /**
     * Gets the value of the infants property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInfants() {
        return infants;
    }

    /**
     * Sets the value of the infants property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInfants(Integer value) {
        this.infants = value;
    }

}
