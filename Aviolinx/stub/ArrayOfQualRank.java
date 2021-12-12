
package com.Aviolinx.stub;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfQualRank complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfQualRank">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QualRank" type="{http://raido.aviolinx.com/api/}QualRank" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfQualRank", propOrder = {
    "qualRank"
})
public class ArrayOfQualRank {

    @XmlElement(name = "QualRank", nillable = true)
    protected List<QualRank> qualRank;

    /**
     * Gets the value of the qualRank property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qualRank property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQualRank().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QualRank }
     * 
     * 
     */
    public List<QualRank> getQualRank() {
        if (qualRank == null) {
            qualRank = new ArrayList<QualRank>();
        }
        return this.qualRank;
    }

}
