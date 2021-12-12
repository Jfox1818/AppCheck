
package com.Aviolinx.stub;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfReasonCategory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfReasonCategory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReasonCategory" type="{http://raido.aviolinx.com/api/}ReasonCategory" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfReasonCategory", propOrder = {
    "reasonCategory"
})
public class ArrayOfReasonCategory {

    @XmlElement(name = "ReasonCategory", nillable = true)
    protected List<ReasonCategory> reasonCategory;

    /**
     * Gets the value of the reasonCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reasonCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReasonCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReasonCategory }
     * 
     * 
     */
    public List<ReasonCategory> getReasonCategory() {
        if (reasonCategory == null) {
            reasonCategory = new ArrayList<ReasonCategory>();
        }
        return this.reasonCategory;
    }

}
