
package com.Aviolinx.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QualRank complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QualRank">
 *   &lt;complexContent>
 *     &lt;extension base="{http://raido.aviolinx.com/api/}Period">
 *       &lt;sequence>
 *         &lt;element name="Uprank" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Downrank" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Rank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Qual" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QualRank", propOrder = {
    "uprank",
    "downrank",
    "rank",
    "qual",
    "comment"
})
public class QualRank
    extends Period
{

    @XmlElement(name = "Uprank", required = true, type = Boolean.class, nillable = true)
    protected Boolean uprank;
    @XmlElement(name = "Downrank", required = true, type = Boolean.class, nillable = true)
    protected Boolean downrank;
    @XmlElement(name = "Rank")
    protected String rank;
    @XmlElement(name = "Qual")
    protected String qual;
    @XmlElement(name = "Comment")
    protected String comment;

    /**
     * Gets the value of the uprank property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUprank() {
        return uprank;
    }

    /**
     * Sets the value of the uprank property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUprank(Boolean value) {
        this.uprank = value;
    }

    /**
     * Gets the value of the downrank property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDownrank() {
        return downrank;
    }

    /**
     * Sets the value of the downrank property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDownrank(Boolean value) {
        this.downrank = value;
    }

    /**
     * Gets the value of the rank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRank() {
        return rank;
    }

    /**
     * Sets the value of the rank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRank(String value) {
        this.rank = value;
    }

    /**
     * Gets the value of the qual property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQual() {
        return qual;
    }

    /**
     * Sets the value of the qual property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQual(String value) {
        this.qual = value;
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

}
