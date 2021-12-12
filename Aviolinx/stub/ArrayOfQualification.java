
package com.Aviolinx.stub;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfQualification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfQualification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Qualification" type="{http://raido.aviolinx.com/api/}Qualification" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfQualification", propOrder = {
    "qualification"
})
public class ArrayOfQualification {

    @XmlElement(name = "Qualification", nillable = true)
    protected List<Qualification> qualification;

    /**
     * Gets the value of the qualification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qualification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQualification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Qualification }
     * 
     * 
     */
    public List<Qualification> getQualification() {
        if (qualification == null) {
            qualification = new ArrayList<Qualification>();
        }
        return this.qualification;
    }

}
